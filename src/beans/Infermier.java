package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import DAO.InfermierImpl;
import DAO.PatientImpl;


public class Infermier implements Serializable {
	private int id_infermier;
	private String nom;
	private String prenom;
	private String cin;
	private int age;
	private String sexe;
	public int getId_infermier() {
		return id_infermier;
	}
	public void setId_infermier(int id_infermier) {
		this.id_infermier = id_infermier;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Infermier(String nom, String prenom, String cin, int age, String sexe) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.age = age;
		this.sexe = sexe;
	}

	
	
	

	public Infermier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String actionInfermier(){
		String s = null;
		InfermierImpl patient=new InfermierImpl();
		List<Patient> patients=new ArrayList<Patient>();
		patients=patient.getAllPatientsByInfermier(1);
		
		s="infermierAcceuil";		
		return s;
	}
}
