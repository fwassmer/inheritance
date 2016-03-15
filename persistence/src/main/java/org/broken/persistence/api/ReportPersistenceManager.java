package org.broken.persistence.api;

import org.broken.persistence.model.ReportEntity;

import java.util.Collection;

public interface ReportPersistenceManager extends MessagePersistenceManager<ReportEntity> {

	Collection<ReportEntity> getAccountReports();

}