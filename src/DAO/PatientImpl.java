package DAO;

import org.hibernate.Query;
import org.hibernate.Session;

import beans.Patient;
import util.HibernateUtil;

public class PatientImpl {

	public Long getPatient(String email,String password){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query query = session.createQuery(
		        "select count(*) from Patient login where email=:email and password=:password");
		query.setString("email", email);
		query.setString("password", password);
		Long count = (Long) query.uniqueResult();
		return count;
	}
	
	public void register(Patient e){
		Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(e);
		session.getTransaction().commit();

	}
}
