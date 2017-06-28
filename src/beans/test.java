package beans;

import java.util.ArrayList;
import java.util.List;

import DAO.InfermierImpl;
import DAO.PatientImpl;

public class test {
	public static void main(String[] args) {
		// load sevices
	InfermierImpl inf=new InfermierImpl();
	List<Patient> patients=new ArrayList<Patient>();
		patients=	inf.getAllPatientsByInfermier(1);
for(Patient p : patients){
	System.out.println(p.getNom());
}
	}

}
