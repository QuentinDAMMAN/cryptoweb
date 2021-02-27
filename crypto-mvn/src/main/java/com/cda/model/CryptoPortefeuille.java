package com.cda.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CryptoPortefeuille {

	private int id;
	private String nom;
	private String label;
	private float prixAchat;
	private float prixActuel;
	private float valeurAchat;
	private float nombreUnite;
	private float delta;
	private Date dateAchat;

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getLabel() {
		return label;
	}

	public float getPrixAchat() {
		return prixAchat;
	}

	public float getPrixActuel() {
		return prixActuel;
	}

	public float getNombreUnite() {
		return nombreUnite;
	}

	public float getDelta() {
		return delta;
	}

	public Date getDateAchat() {
		return dateAchat;
	}

	public CryptoPortefeuille setId(int id) {
		this.id = id;
		return this;
	}

	public CryptoPortefeuille setNom(String nom) {
		this.nom = nom;
		return this;
	}

	public CryptoPortefeuille setLabel(String label) {
		this.label = label;
		return this;
	}

	public CryptoPortefeuille setPrixAchat(float prixAchat) {
		this.prixAchat = prixAchat;
		return this;
	}

	public CryptoPortefeuille setPrixActuel(float prixActuel) {
		this.prixActuel = prixActuel;
		return this;
	}

	public CryptoPortefeuille setNombreUnite(float nombreUnite) {
		this.nombreUnite = nombreUnite;
		return this;
	}

	public CryptoPortefeuille setDelta(float delta) {
		this.delta = delta;
		return this;
	}

	public CryptoPortefeuille setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
		return this;
	}

	public float getValeurAchat() {
		return valeurAchat;
	}

	public CryptoPortefeuille setValeurAchat(float valeurAchat) {
		this.valeurAchat = valeurAchat;
		return this;
	}

}
