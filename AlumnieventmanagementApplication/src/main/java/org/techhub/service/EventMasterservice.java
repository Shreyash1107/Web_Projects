package org.techhub.service;

import java.util.Vector;

import org.techhub.model.EventMasterModel;

public interface EventMasterservice 
{
	public boolean isEventAdded(EventMasterModel emodel);
	public Vector<EventMasterModel> getevents();
	public boolean isEventupdate(EventMasterModel emodel);
}
