package com.cda.doa.Imp;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import com.cda.dao.IDao2;
import com.cda.model.CryptoPortefeuille;
import com.cda.model.Cryptomonnaie;
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
		String request = "select\r\n" + "	contenu.date_achat as dateAchat,\r\n"
				+ "	crypto_monnaies.label as label,\r\n" + "	contenu.nombre_unite as nombreUnite,\r\n"
				+ "	(contenu.nombre_unite * crypto_monnaies.prix_actuel) as valeur,\r\n"
				+ "	contenu.prix_achat as prixAchat,\r\n" + "	crypto_monnaies.prix_actuel as prixActuel,\r\n"
				+ "	(contenu.nombre_unite * crypto_monnaies.prix_actuel) - (contenu.nombre_unite * contenu.prix_achat) as delta\r\n"
				+ "from\r\n" + "	contenu\r\n" + "join crypto_monnaies on\r\n"
				+ "	contenu.Id_crypto_monnaies = crypto_monnaies.Id_crypto_monnaies\r\n" + "order by\r\n"
				+ "	crypto_monnaies.Id_crypto_monnaies;";
		ResultSet results = null;
		ArrayList<CryptoPortefeuille> listCrytomonnaie = new ArrayList<CryptoPortefeuille>();
		try {
			PreparedStatement stmt = MyConnection.getConnection().prepareStatement(request);
			results = stmt.executeQuery();
			while (results.next()) {
				CryptoPortefeuille crypto = new CryptoPortefeuille().setDateAchat(results.getDate(1))
						.setLabel(results.getString(2)).setNombreUnite(results.getFloat(3))
						.setValeurAchat(results.getFloat(4)).setPrixAchat(results.getFloat(5))
						.setPrixActuel(results.getFloat(6)).setDelta(results.getFloat(7));
				listCrytomonnaie.add(crypto);
			}
		} catch (SQLIntegrityConstraintViolationException e) {

		} catch (SQLException e) {
		}
		if (results != null) {
			return listCrytomonnaie;
		}
		return null;
	}

	@Override
	public Boolean update(float value, String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean delete(String label) {
		// TODO Auto-generated method stub
		return null;
	}

}
