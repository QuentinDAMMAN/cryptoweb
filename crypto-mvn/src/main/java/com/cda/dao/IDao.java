package com.cda.dao;

import java.util.ArrayList;

public interface IDao<T> {

	T create(T t);

	T getById(int id);
	
	T getByName(String name);
	
	T getByLabel(String label);

	ArrayList <T> getAll();

	Boolean update(String champ, String value, int id);

	Boolean delete(int id);

}
