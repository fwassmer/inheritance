package org.broken.persistence.api;

import org.broken.persistence.model.AbstractEntity;

public interface PersistenceManager<ENTITY extends AbstractEntity> {

	ENTITY create(ENTITY bo);

	ENTITY update(ENTITY bo);

	void delete(String id);

	ENTITY get(String id);
}