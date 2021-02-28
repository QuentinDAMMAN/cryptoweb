package com.cda.doa.Imp;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import com.cda.dao.IDao2;
import com.cda.model.CryptoPortefeuille;
import com.cda.sql.MyConnection;

public class CryptoPortefeuilleDaoImpl implements IDao2 {

	@Override
	public CryptoPortefeuille create(CryptoPortefeuille crypto) {
		String request = "insert into contenu (Id_crypto_monnaies,Id_porte_monnaies,nombre_unite,date_achat,delta,prix_achat) "
				+ "values ((select Id_crypto_monnaies from crypto_monnaies where label = ?), " + "1,"
				+ "(? / (select prix_actuel from crypto_monnaies where label = ?))," + "?,"
				+ "((select prix_actuel from crypto_monnaies where label = ?) - (select prix_actuel from crypto_monnaies where label = ?)),"
				+ "(select prix_actuel from crypto_monnaies where label = ?))"
				+ "ON DUPLICATE KEY UPDATE nombre_unite = nombre_unite + (? / (select prix_actuel from crypto_monnaies where label = ?)), "
				+ "delta = delta + ((select prix_actuel from crypto_monnaies where label = ?) - (select prix_actuel from crypto_monnaies where label = ?))";

		ResultSet results;
		try {
			PreparedStatement stmt = MyConnection.getConnection().prepareStatement(request,
					PreparedStatement.RETURN_GENERATED_KEYS);
			Date d = new Date(System.currentTimeMillis());
			stmt.setString(1, crypto.getLabel());
			stmt.setFloat(2, crypto.getValeurAchat());
			stmt.setString(3, crypto.getLabel());
			stmt.setDate(4, d);
			stmt.setString(5, crypto.getLabel());
			stmt.setString(6, crypto.getLabel());
			stmt.setString(7, crypto.getLabel());
			stmt.setFloat(8, crypto.getValeurAchat());
			stmt.setString(9, crypto.getLabel());
			stmt.setString(10, crypto.getLabel());
			stmt.setString(11, crypto.getLabel());

			stmt.executeUpdate();

			results = stmt.getGeneratedKeys();
			if (results.next()) {

				return crypto;
			}
		} catch (SQLIntegrityConstraintViolationException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CryptoPortefeuille getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CryptoPortefeuille getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CryptoPortefeuille getByLabel(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CryptoPortefeuille> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(float value, String label) {
		String request = "update\r\n"
				+ "	contenu\r\n"
				+ "set\r\n"
				+ "	contenu.nombre_unite =(contenu.nombre_unite-?)\r\n"
				+ "where\r\n"
				+ "contenu.Id_crypto_monnaies = 	\r\n"
				+ "(\r\n"
				+ "	select\r\n"
				+ "		crypto_monnaies.Id_crypto_monnaies\r\n"
				+ "	from\r\n"
				+ "		crypto_monnaies\r\n"
				+ "	where\r\n"
				+ "		label = ?);";
		int results = 0;
		try {
			PreparedStatement stmt = MyConnection.getConnection().prepareStatement(request);

			stmt.setFloat(1, value);

			stmt.setString(2, label);
			results = stmt.executeUpdate();
		} catch (SQLIntegrityConstraintViolationException e) {

		} catch (SQLException e) {
		}
		if (results == 1) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean delete(String label) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
