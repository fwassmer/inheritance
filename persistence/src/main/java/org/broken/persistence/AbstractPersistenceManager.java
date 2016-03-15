package org.broken.persistence;

import org.broken.persistence.api.PersistenceManager;
import org.broken.persistence.dao.AbstractJpaDao;
import org.broken.persistence.model.AbstractEntity;

import javax.transaction.Transactional;

public abstract class AbstractPersistenceManager<ENTITY extends AbstractEntity, DAO extends AbstractJpaDao<ENTITY>> implements
		PersistenceManager<ENTITY> {

	protected DAO dao;

	@Override
	@Transactional(Transactional.TxType.MANDATORY)
	public ENTITY create(ENTITY bo) {
		return dao.create(bo);
	}

	@Override
	@Transactional(Transactional.TxType.MANDATORY)
	public ENTITY update(ENTITY bo) {
		return dao.update(bo);
	}

	@Override
	@Transactional(Transactional.TxType.MANDATORY)
	public void delete(String id) {
		dao.delete(id);
	}

	@Override
	@Transactional(Transactional.TxType.MANDATORY)
	public ENTITY get(String id) {
		return dao.find(id);
	}

	public void setDao(DAO dao) {
		System.out.println("setting dao: " + dao.getClass().getSimpleName());
		this.dao = dao;
	}
}