package org.techhub.repository;

import java.util.Vector;

import org.techhub.model.AlumniMasterModel;

public interface Alumnirepository 
{
	public boolean isAlumniAdded(AlumniMasterModel am);
	public Vector<AlumniMasterModel> getalumni();
}