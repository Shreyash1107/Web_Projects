package org.techhub.repository;

import java.util.Vector;

import org.techhub.model.EventMasterModel;

public interface EventMasterrepository 
{
	public boolean isEventAdded(EventMasterModel emodel);
	public Vector<EventMasterModel> getevents();
	public boolean isEventupdate(EventMasterModel emodel);
}
