package org.techhub.service;

import java.util.Vector;

import org.techhub.model.EventMasterModel;
import org.techhub.repository.EventMasterrepository;
import org.techhub.repository.EventMasterrepositoryImpl;

public class EventMasterServiceImpl implements EventMasterservice
{
	EventMasterrepository evrepo = new EventMasterrepositoryImpl();
	public boolean isEventAdded(EventMasterModel emodel)
	{
		return evrepo.isEventAdded(emodel);
	}
	public Vector<EventMasterModel> getevents()
	{
		Vector<EventMasterModel> v = evrepo.getevents();
		return v;
	}
	public boolean isEventupdate(EventMasterModel emodel)
	{
		return evrepo.isEventupdate(emodel);
	}
}