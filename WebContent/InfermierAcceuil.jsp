<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="beans.Patient"%> <%@page import="DAO.InfermierImpl"%><%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
  <thead>
    <tr>
      <th>modifier l'état</th>
    <th data-th="Driver details"><span>Nom</span></th>
    <th>Prénom</th>
    <th>Age</th>
    <th>Sexe</th>
    <th>Poid</th>
    <th>Etat de santé</th>
    <th>Numéro de chambre</th>
    <th>Type sanguin</th>
    <th>Date d'hospitalisation</th>
    <th>Date de sortie</th>
    </tr>
  </thead>
  <tbody>
  <%
  InfermierImpl patient=new InfermierImpl();
	List<Patient> patients=new ArrayList<Patient>();
	patients=patient.getAllPatientsByInfermier(1);
	for(Patient p: patients){
		  %>	
		    <td><input type="radio"/></td>
		    <td><%= p.getNom() %></td>
			<td><%= p.getPrenom() %></td>
			<td><%= p.getAge() %></td>
			<td><%= p.getSexe() %></td>
			<td><%= p.getPoid() %></td>
			<td><%= p.getEtat() %></td>
			<td><%= p.getId_chambre() %></td>
			<td><%= p.getBlood() %></td>
			<td><%= p.getDate_entree() %></td>
			<td><%= p.getDate_sortie() %></td>

		<%}
  %>
  </tbody>
</table>
</body>
</html>