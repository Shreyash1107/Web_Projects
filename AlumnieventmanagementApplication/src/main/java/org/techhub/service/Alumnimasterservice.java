package org.techhub.service;

import java.util.Vector;

import org.techhub.model.AlumniMasterModel;

public interface Alumnimasterservice 
{
	public boolean isAlumniAdded(AlumniMasterModel am);
	public Vector<AlumniMasterModel> getalumni();
}
