package org.broken.persistence;

import org.broken.persistence.api.MessagePersistenceManager;
import org.broken.persistence.dao.AbstractJpaDao;
import org.broken.persistence.model.AbstractEntity;

public abstract class AbstractMessagePersistenceManager<ENTITY extends AbstractEntity, DAO extends AbstractJpaDao<ENTITY>> extends
		AbstractPersistenceManager<ENTITY, DAO> implements MessagePersistenceManager<ENTITY> {

}