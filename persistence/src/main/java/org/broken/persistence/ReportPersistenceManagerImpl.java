package org.broken.persistence;

import org.broken.persistence.api.ReportPersistenceManager;
import org.broken.persistence.dao.ReportDao;
import org.broken.persistence.model.ReportEntity;

import javax.transaction.Transactional;
import java.util.Collection;

public class ReportPersistenceManagerImpl extends AbstractMessagePersistenceManager<ReportEntity, ReportDao> implements
		ReportPersistenceManager {

	@Override
	@Transactional(Transactional.TxType.REQUIRED)
	public Collection<ReportEntity> getAccountReports() {
		return dao.findReports();
	}

}