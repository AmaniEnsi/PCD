package org.opendevup.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Etudiant implements Serializable {
	@Id
	private Long id;
	@Column(name="NOM",length=30)
	private String nom;
	@Column(name="PRENOM",length=30)
	private String prenom;
	
	private Date dateNaissance;
	private String email;
	private String photo;
	
	// Pour JPA et pour moi
	public Etudiant() {
		super();
	}
	
	// Pour moi
	public Etudiant(long i ,String nom,String prenom, Date dateNaissance, String email, String photo) {
		super();
		this.id=i;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.photo = photo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	

}
