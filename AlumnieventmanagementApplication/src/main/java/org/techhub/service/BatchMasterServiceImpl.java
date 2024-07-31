package org.techhub.service;

import java.util.Vector;

import org.techhub.model.BatchMasterModel;
import org.techhub.repository.BatchMasterrepository;
import org.techhub.repository.BatchMasterrepositoryImpl;
import org.techhub.repository.DB;

public class BatchMasterServiceImpl extends DB implements BatchMasterService 
{
	BatchMasterrepository bmrepo = new BatchMasterrepositoryImpl();
	public boolean isBatchAdded(BatchMasterModel bm)
	{
		boolean b = bmrepo.isBatchAdded(bm);
		return b;
	}
	public Vector<BatchMasterModel> getbtchdetails()
	{
		Vector<BatchMasterModel> v = bmrepo.getbtchdetails();
		return v;
	}
}
