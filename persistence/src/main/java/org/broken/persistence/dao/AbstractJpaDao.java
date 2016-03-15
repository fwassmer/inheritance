package org.broken.persistence.dao;

import org.broken.persistence.model.AbstractEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractJpaDao<ENTITY extends AbstractEntity> {

	protected Class<ENTITY> clazz;

	@PersistenceContext(unitName = "broken")
	protected EntityManager entityManager;

	public Class<ENTITY> getClazz() {
		return clazz;
	}

	public void setClazz(Class<ENTITY> clazz) {
		this.clazz = clazz;
	}

	public ENTITY create(ENTITY entity) {
		entityManager.persist(entity);
		return entity;
	}

	public ENTITY update(ENTITY entity) {
		entity = entityManager.merge(entity);
		return entity;
	}

	public void delete(String id) {
		ENTITY entity = find(id);
		if (entity != null) {
			entityManager.remove(entity);
		}
	}

	public ENTITY find(String id) {
		return entityManager.find(clazz, id);
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}