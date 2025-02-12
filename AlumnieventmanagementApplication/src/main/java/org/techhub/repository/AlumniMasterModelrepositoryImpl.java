package org.techhub.repository;

import java.util.Vector;

import org.techhub.model.AlumniMasterModel;

public class AlumniMasterModelrepositoryImpl extends DB implements Alumnirepository
{
	Vector<AlumniMasterModel> vect = null;
	public boolean isAlumniAdded(AlumniMasterModel am)
	{
		int val;
		try
		{
			pstmt = conn.prepareStatement("insert into alumnimaster values('0',?,?,?,?,?,?)");
			pstmt.setString(1, am.getname());
			pstmt.setString(2, am.getEmail());
			pstmt.setString(3, am.getContact());
			pstmt.setInt(4, am.getAge());
			pstmt.setString(5, am.getCompany());
			pstmt.setInt(6, am.getBid());
			val = pstmt.executeUpdate();
			return val>0?true:false;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	public Vector<AlumniMasterModel> getalumni()
	{
		vect = new Vector<AlumniMasterModel>();
		try
		{
			pstmt = conn.prepareStatement("select *from Alumnimaster");
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				AlumniMasterModel amodel = new AlumniMasterModel();
				amodel.setAid(rs.getInt(1));
				amodel.setname(rs.getString(2));
				amodel.setEmail(rs.getString(3));
				amodel.setContact(rs.getString(4));
				amodel.setAge(rs.getInt(5));
				amodel.setCompany(rs.getString(6));
				amodel.setBid(rs.getInt(7));
				vect.add(amodel);
			}
			return vect.size()>0?vect:null;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	public boolean isAlumniUpdated(AlumniMasterModel am)
	{
		int val;
		try
		{
			pstmt = conn.prepareStatement("update Alumnimaster set Name = ?,Email = ?,Contact=?,Age = ?, Company = ?, Bid = ? where Aid = ?");
			pstmt.setString(1, am.getname());
			pstmt.setString(2, am.getEmail());
			pstmt.setString(3, am.getContact());
			pstmt.setInt(4, am.getAge());
			pstmt.setString(5, am.getCompany());
			pstmt.setInt(6, am.getBid());
			pstmt.setInt(7, am.getid());
			val = pstmt.executeUpdate();
			return val>0?true:false;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
	public boolean isAlumnidelete(AlumniMasterModel am)
	{
		int val;
		try
		{
			pstmt = conn.prepareStatement("delete from Alumnimaster where Aid = ?");
			pstmt.setInt(1, am.getid());
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
