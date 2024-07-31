package org.techhub.service;

import java.util.Vector;

import org.techhub.model.BatchMasterModel;

public interface BatchMasterService 
{
	public boolean isBatchAdded(BatchMasterModel bm);
	public Vector<BatchMasterModel> getbtchdetails();
}
