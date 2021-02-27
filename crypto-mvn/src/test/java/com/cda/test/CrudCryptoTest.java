package com.cda.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.cda.doa.Imp.CryptomonnaieDaoImpl;
import com.cda.model.Cryptomonnaie;
import com.cda.sql.MyConnection;

public class CrudCryptoTest {

	@Test
	public void testConnection() {
		assertNotEquals(MyConnection.getConnection(), null);
	}

	@Test
	public void testCreateCryptoWithoutDB() {
		assertNotEquals(new Cryptomonnaie("DirectRacingCx", "DRC", 200.00), null);
	}

	@Test
	public void testCreateCryptoWithDB() {
		CryptomonnaieDaoImpl test = new CryptomonnaieDaoImpl();
		assertNotEquals(test.create(new Cryptomonnaie("RogerFederCompany", "RFC", 1000.00)), null);
	}

	@Test
	public void testGetAllCrytoOnDB() {
		CryptomonnaieDaoImpl test = new CryptomonnaieDaoImpl();
		test.create(new Cryptomonnaie("RafaelNadalCompany", "RNC", 620.00));
		test.create(new Cryptomonnaie("NovakDjokovicCompany", "NDC", 281.00));
		test.create(new Cryptomonnaie("AndyMurrayCompany", "AMC", 992.00));
		test.create(new Cryptomonnaie("GaelMonFilsCompany", "GMC", 190.00));
		ArrayList<Cryptomonnaie> list = new ArrayList<>();
		list = test.getAll();
		assertNotEquals(list, null);
		assertEquals(list.size(), 4);
	}
	
	@Test
	public void TestGetById() {
		CryptomonnaieDaoImpl test = new CryptomonnaieDaoImpl();
		Cryptomonnaie crypto = test.create(new Cryptomonnaie("AndyRodick", "ARC", 791.00));
		assertEquals(crypto, test.getById(crypto.getId()));
	}
	
	@Test
	public void TestGetByName() {
		CryptomonnaieDaoImpl test = new CryptomonnaieDaoImpl();
		Cryptomonnaie crypto = test.create(new Cryptomonnaie("QuentinDamman", "QDC", 333.00));
		assertEquals(crypto, test.getByName(crypto.getNom()));
	}
	
	@Test
	public void TestGetByLabel() {
		CryptomonnaieDaoImpl test = new CryptomonnaieDaoImpl();
		Cryptomonnaie crypto = test.create(new Cryptomonnaie("MateoSaba", "MSC", 89.00));
		assertEquals(crypto, test.getByLabel(crypto.getLabel()));
	}
	
	
	


//
//	/*
//	 * Test Update Crypto
//	 */
////	String champs = "nom";
////	String value = "Guikolp";
////	boolean update = test.update(champs, value, 11);
////
////	if (update) {
////		System.out.println("modif , ok !");
////	} else {
////		System.out.println("modif , erreur !");
////	}
//	
//	/*
//	 * Test Delete Crypto
//	 */
////	boolean delete = test.delete(11);
////
////	if (delete) {
////		System.out.println("delete , ok !");
////	} else {
////		System.out.println("delete , erreur !");
////	}
//	
//	/*


}
