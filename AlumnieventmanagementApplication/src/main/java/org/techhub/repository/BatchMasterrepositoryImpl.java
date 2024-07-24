package org.techhub.repository;
import static java.lang.System.*;
import org.techhub.model.BatchMasterModel;

public class BatchMasterrepositoryImpl extends DB  implements BatchMasterrepository  
{
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
}
