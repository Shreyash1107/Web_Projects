package org.techhub.service;

import java.util.Vector;

import org.techhub.model.AlumniMasterModel;
import org.techhub.repository.AlumniMasterModelrepositoryImpl;
import org.techhub.repository.Alumnirepository;

public class AlumniMasterServiceImpl implements Alumnimasterservice 
{
	Alumnirepository amrepo = new AlumniMasterModelrepositoryImpl();
	public boolean isAlumniAdded(AlumniMasterModel am)
	{
		return amrepo.isAlumniAdded(am);
	}
	public Vector<AlumniMasterModel> getalumni()
	{
		Vector v = amrepo.getalumni();
		return v;
	}
	public boolean isAlumniUpdated(AlumniMasterModel am)
	{
		return amrepo.isAlumniUpdated(am);
	}
	public boolean isAlumnidelete(AlumniMasterModel am)
	{
		return amrepo.isAlumnidelete(am);
	}
}