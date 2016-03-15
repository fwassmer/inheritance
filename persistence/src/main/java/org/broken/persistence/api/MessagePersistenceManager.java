package org.broken.persistence.api;

import org.broken.persistence.model.AbstractEntity;

public interface MessagePersistenceManager<ENTITY extends AbstractEntity> extends PersistenceManager<ENTITY> {

}