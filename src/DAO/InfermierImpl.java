package DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import beans.Patient;
import util.HibernateUtil;

public class InfermierImpl {
	public List<Patient> getAllPatientsByInfermier(int id){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();		
		Query query = session.createQuery(
		        "from Patient where id_infermier=:id ");
		query.setInteger("id", id);
		return query.list();
	}
}
