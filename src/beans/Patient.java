package beans;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


import DAO.PatientImpl;




public class Patient implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nom;
	private String prenom;
	private String password;
	private int age;
	private String email;
	private String sexe;
	private String etat;
	private String blood;
	private Timestamp date_entree;
	private Timestamp date_sortie;
	private int id_infermier;
	private int poid;
	private int id_chambre;
	
	
	
	
	


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}


	public String getBlood() {
		return blood;
	}


	public void setBlood(String blood) {
		this.blood = blood;
	}


	public Timestamp getDate_entree() {
		return date_entree;
	}


	public void setDate_entree(Timestamp date_entree) {
		this.date_entree = date_entree;
	}


	public Timestamp getDate_sortie() {
		return date_sortie;
	}


	public void setDate_sortie(Timestamp date_sortie) {
		this.date_sortie = date_sortie;
	}


	public int getId_infermier() {
		return id_infermier;
	}


	public void setId_infermier(int id_infermier) {
		this.id_infermier= id_infermier;
	}


	public int getPoid() {
		return poid;
	}


	public void setPoid(int poid) {
		this.poid = poid;
	}


	public int getId_chambre() {
		return id_chambre;
	}


	public void setId_chambre(int id_chambre) {
		this.id_chambre = id_chambre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	

	public String getPassword() {
		return password;
	}
	public void setPassword(String pass) {
		this.password = pass;
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


		public Patient(){
		super();
	}


	public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getSexe() {
			return sexe;
		}


		public void setSexe(String sexe) {
			this.sexe = sexe;
		}


		
		
		
		//constructeur pour sign up
		
	

	public Patient(String nom, String prenom, String password, int age, String email, String sexe) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.password = password;
			this.age = age;
			this.email = email;
			this.sexe = sexe;
		}

	
	//constructeur utilisé pour l'infermiere 

	public Patient(String nom, String prenom, String password, int age, String email, String sexe, String etat,
			String blood, Timestamp date_entree, Timestamp date_sortie, int id_infermier, int poid, int id_chambre) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.password = password;
		this.age = age;
		this.email = email;
		this.sexe = sexe;
		this.etat = etat;
		this.blood = blood;
		this.date_entree = date_entree;
		this.date_sortie = date_sortie;
		this.id_infermier = id_infermier;
		this.poid = poid;
		this.id_chambre = id_chambre;
	}


	public String action(){
		String s = null;
		PatientImpl patient=new PatientImpl();
		Long count=patient.getPatient(this.email, this.password);
		if(count==0){
			s="erreur";
		}
	
		
		else{s="acceuil";}
		
		s="acceuil";
		return s;
	}
	
	public String actionSignUp(){
		String s=null;
		Patient p = new Patient(this.nom, this.prenom, this.password, this.age, this.email, this.sexe);
		PatientImpl e=new PatientImpl();
		e.register(p);
		s="acceuil";
		
		return s;
		
		
		
	}
	

}