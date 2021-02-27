package com.cda.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cryptomonnaie {

	private int id;
	private String nom;
	private String label;
	private float prixActuel;

	public Cryptomonnaie(String nom, String label, float prixActuel) {
		super();
		this.nom = nom;
		this.label = label;
		this.prixActuel = prixActuel;
	}

}
