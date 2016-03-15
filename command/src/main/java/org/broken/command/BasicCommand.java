package org.broken.command;

import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.broken.persistence.api.ReportPersistenceManager;
import org.broken.persistence.model.ReportEntity;

import java.util.Collection;

@Command(scope = "break", name = "me", description = "calling service to demonstrate jpa issue")
@Service
public class BasicCommand implements Action {

	@Reference
	ReportPersistenceManager reportPersistenceManager;

	@Override
	public Object execute() throws Exception {
		Collection<ReportEntity> reports = reportPersistenceManager.getAccountReports();
		System.out.println("found: " + reports);
		return null;
	}

}