package org.techhub.repository;

import java.util.Vector;

import org.techhub.model.EventMasterModel;

public class EventMasterrepositoryImpl extends DB implements EventMasterrepository
{
	Vector<EventMasterModel> v = null;
	public boolean isEventAdded(EventMasterModel emodel)
	{
		int val;
		try
		{
			pstmt = conn.prepareStatement("insert into eventmaster values('0',?,?,?,?,?,?)");
			pstmt.setString(1, emodel.getname());
			pstmt.setString(2, emodel.getdate());
			pstmt.setString(3, emodel.gttime());
			pstmt.setString(4, emodel.getvenue());
			pstmt.setInt(5, emodel.getbid());
			pstmt.setString(6, emodel.getsubject());
			val = pstmt.executeUpdate();
			return val>0?true:false;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	public Vector<EventMasterModel> getevents()
	{
		v = new Vector<EventMasterModel>();
		try
		{
			pstmt = conn.prepareStatement("select *from Eventmaster");
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				EventMasterModel emodel = new EventMasterModel();
				emodel.seteid(rs.getInt(1));
				emodel.setname(rs.getString(2));
				emodel.setdate(rs.getString(3));
				emodel.settime(rs.getString(4));
				emodel.setvenue(rs.getString(5));
				emodel.setid(rs.getInt(6));
				emodel.setsubject(rs.getString(7));
				v.add(emodel);
			}
			return v.size()>0?v:null;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	public boolean isEventupdate(EventMasterModel emodel)
	{
		int val;
		try
		{
			pstmt = conn.prepareStatement("update EventMaster set Name = ?,date = ?, time = ?, Venue = ?, Bid = ?, Subject = ? where Eid = ?");
			pstmt.setString(1, emodel.getname());
			pstmt.setString(2, emodel.getdate());
			pstmt.setString(3, emodel.gttime());
			pstmt.setString(4, emodel.getvenue());
			pstmt.setInt(5, emodel.getbid());
			pstmt.setString(6, emodel.getsubject());
			pstmt.setInt(7, emodel.geteid());
			val = pstmt.executeUpdate();
			return val>0?true:false;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
}
