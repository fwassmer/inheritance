package org.broken.persistence.dao;

import org.broken.persistence.model.ReportEntity;

import javax.persistence.TypedQuery;
import java.util.Collection;

public class ReportDao extends AbstractJpaDao<ReportEntity> {

	public ReportDao() {
		setClazz(ReportEntity.class);
	}

	public Collection<ReportEntity> findReports() {
		String query = "SELECT s FROM " + ReportEntity.class.getSimpleName();
		TypedQuery<ReportEntity> typedQuery = entityManager.createQuery(query, ReportEntity.class);
		return typedQuery.getResultList();
	}

}