package org.techhub.repository;

import java.util.Vector;

import org.techhub.model.BatchMasterModel;

public interface BatchMasterrepository 
{
	public boolean isBatchAdded(BatchMasterModel bm);
	public Vector<BatchMasterModel> getbtchdetails();
}
