package com.cda.dao;

import java.util.ArrayList;

import com.cda.model.CryptoPortefeuille;

public interface IDao2<T> {

	CryptoPortefeuille create(CryptoPortefeuille crypto);

	Boolean delete(String label);

	Boolean update(float value, String label);

	ArrayList<CryptoPortefeuille> getAll();

	CryptoPortefeuille getByLabel(String label);

	CryptoPortefeuille getByName(String name);

	CryptoPortefeuille getById(int id);

	float getDeltaTotal();
	

}
