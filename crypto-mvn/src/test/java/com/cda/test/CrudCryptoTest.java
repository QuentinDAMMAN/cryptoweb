//package com.cda.test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//import java.sql.SQLException;
//import java.sql.SQLIntegrityConstraintViolationException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//
//import com.cda.doa.Imp.CryptomonnaieDaoImpl;
//import com.cda.model.Cryptomonnaie;
//import com.cda.sql.MyConnection;
//
//@TestMethodOrder(OrderAnnotation.class)
//public class CrudCryptoTest {
//
//	private static Cryptomonnaie cryp;
//	private static Cryptomonnaie crypT;
//	private static CryptomonnaieDaoImpl test;
//	private static ArrayList<Cryptomonnaie> list;
//
//	@BeforeEach
//	public void before() {
//		resetValue();
//	}
//
//	/*
//	 * TEST CONNECTION
//	 */
//	@Test
//	@Order(1)
//	public void testConnection() {
//		assertNotEquals(MyConnection.getConnection(), null);
//	}
//
//	/*
//	 * TEST CREATE
//	 */
//
//	@Test
//	@Order(2)
//	public void testCreateCryptoWithoutDB() {
//		assertNotEquals(cryp = new Cryptomonnaie("DirectRacingCx", "DRC", (float) 200.00), null);
//	}
//
//	@Test
//	@Order(3)
//	public void testCreateCryptoWithDB() {
//		test = new CryptomonnaieDaoImpl();
//		assertNotEquals(test.create(cryp = new Cryptomonnaie("RogerFederCompany", "RFC", (float) 1000.00)), null);
//	}
//
//	/*
//	 * TEST READ
//	 */
//
//	@Test
//	@Order(4)
//	public void TestGetById() {
//		test = new CryptomonnaieDaoImpl();
//		crypT = test.create(cryp = new Cryptomonnaie("AndyRodick", "ARC", (float) 791.00));
//		assertEquals(crypT, test.getById(crypT.getId()));
//	}
//
//	@Test
//	@Order(5)
//	public void TestGetByName() {
//		test = new CryptomonnaieDaoImpl();
//		crypT = test.create(new Cryptomonnaie("QuentinDamman", "QDC", (float) 333.00));
//		assertEquals(crypT, test.getByName(crypT.getNom()));
//	}
//
//	@Test
//	@Order(6)
//	public void TestGetByLabel() {
//		test = new CryptomonnaieDaoImpl();
//		crypT = test.create(new Cryptomonnaie("MateoSaba", "MSC", (float) 89.00));
//		assertEquals(crypT, test.getByLabel(crypT.getLabel()));
//	}
//
//	@Test
//	@Order(7)
//	public void testGetAllCrytoOnDB() {
//		test = new CryptomonnaieDaoImpl();
//		test.create(cryp = new Cryptomonnaie("RafaelNadalCompany", "RNC", (float) 620.00));
//		test.create(cryp = new Cryptomonnaie("NovakDjokovicCompany", "NDC", (float) 281.00));
//		test.create(cryp = new Cryptomonnaie("AndyMurrayCompany", "AMC", (float) 992.00));
//		test.create(cryp = new Cryptomonnaie("GaelMonFilsCompany", "GMC", (float) 190.00));
//		list = new ArrayList<>();
//		list = test.getAll();
//		int nombre = 0;
//		for (Cryptomonnaie cryptomonnaie : list) {
//			nombre++;
//		}
//		assertNotEquals(list, null);
//		assertEquals(list.size(), nombre);
//	}
//
//	/*
//	 * TEST UPDATE
//	 */
//
//	@Test
//	@Order(8)
//	public void TestUpdate() {
//		test = new CryptomonnaieDaoImpl();
//		crypT = test.create(cryp = new Cryptomonnaie("PaulSackeband", "PSC", (float) 291.00));
//		assertNotEquals(crypT, null);
//		assertEquals(test.update(500, crypT.getLabel()), true);
//	}
//
//	/*
//	 * TEST DELETE
//	 */
//
//	@Test
//	@Order(9)
//	public void TestDelete() {
//		test = new CryptomonnaieDaoImpl();
//		cryp = test.create(new Cryptomonnaie("HugoBogrand", "HBC", (float) 928.00));
//		assertNotEquals(cryp, null);
//		assertEquals(test.delete(cryp.getLabel()), true);
//	}
//	
//	private static void resetValue() {
//		cryp = null;
//		crypT = null;
//		test = null;
//		list = null;
//	}
//}
