package org.techhub.repository;
import static java.lang.System.*;

import java.util.Vector;

import org.techhub.model.BatchMasterModel;

public class BatchMasterrepositoryImpl extends DB  implements BatchMasterrepository  
{
	Vector<BatchMasterModel> v = null;
	public boolean isBatchAdded(BatchMasterModel bm)
	{
		int val;
		try
		{
			pstmt = conn.prepareStatement("insert into Batchmaster values('0',?)");
			pstmt.setString(1, bm.getBatch_name());
			val = pstmt.executeUpdate();
			return val>0?true:false;
		}
		catch(Exception ex)
		{
			out.println("Error is " + ex);
			ex.printStackTrace();
			return false;
		}
	}
	public Vector<BatchMasterModel> getbtchdetails()
	{
		v = new Vector<BatchMasterModel>();
		try
		{
			pstmt = conn.prepareStatement("select *from Batchmaster");
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				BatchMasterModel bm = new BatchMasterModel();
				bm.setBid(rs.getInt(1));
				bm.setname(rs.getString(2));
				v.add(bm);
			}
			return v.size()>0?v:null;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
}
