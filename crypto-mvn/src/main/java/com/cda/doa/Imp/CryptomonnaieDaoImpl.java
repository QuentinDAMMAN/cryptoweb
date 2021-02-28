package com.cda.doa.Imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;

import com.cda.dao.IDao;
import com.cda.model.Cryptomonnaie;
import com.cda.sql.MyConnection;

public class CryptomonnaieDaoImpl implements IDao<Cryptomonnaie> {

	@Override
	public Cryptomonnaie create(Cryptomonnaie crypto) {

		String request = "insert into crypto_monnaies (nom,label,prix_actuel) values (?,?,?)";

		ResultSet results;
		try {
			PreparedStatement stmt = MyConnection.getConnection().prepareStatement(request,
					PreparedStatement.RETURN_GENERATED_KEYS);
			stmt.setString(1, crypto.getNom());
			stmt.setString(2, crypto.getLabel());
			stmt.setFloat(3, crypto.getPrixActuel());
			stmt.executeUpdate();
			results = stmt.getGeneratedKeys();
			if (results.next()) {
				crypto.setId(results.getInt(1));
				return crypto;
			}
		} catch (SQLIntegrityConstraintViolationException e) {

		} catch (SQLException e) {

		}
		return null;
	}

	@Override
	public Cryptomonnaie getById(int id) {
		String request = "select * from crypto_monnaies where Id_crypto_monnaies =?";
		ResultSet results = null;
		Cryptomonnaie crypto = null;
		try {
			PreparedStatement stmt = MyConnection.getConnection().prepareStatement(request);
			stmt.setInt(1, id);
			results = stmt.executeQuery();
			if (results.next()) {
				crypto = new Cryptomonnaie(results.getInt(1), results.getString(2), results.getString(3),
						results.getFloat(4));
			}
		} catch (SQLIntegrityConstraintViolationException e) {

		} catch (SQLException e) {
		}
		if (results != null) {
			return crypto;
		}
		return null;
	}

	@Override
	public String getByName(String name) {
		String request = "select * from crypto_monnaies where nom =?";
		ResultSet results = null;
		Cryptomonnaie crypto = null;
		try {
			PreparedStatement stmt = MyConnection.getConnection().prepareStatement(request);
			stmt.setString(1, name);
			results = stmt.executeQuery();
			if (results.next()) {
				crypto = new Cryptomonnaie(results.getInt(1), results.getString(2), results.getString(3),
						results.getFloat(4));
			}
		} catch (SQLIntegrityConstraintViolationException e) {

		} catch (SQLException e) {
		}
		if (results != null) {
			return crypto.getNom();
		}
		return null;
	}

	@Override
	public Cryptomonnaie getByLabel(String label) {
		String request = "select * from crypto_monnaies where label =?";
		ResultSet results = null;
		Cryptomonnaie crypto = null;
		try {
			PreparedStatement stmt = MyConnection.getConnection().prepareStatement(request);
			stmt.setString(1, label);
			results = stmt.executeQuery();
			if (results.next()) {
				crypto = new Cryptomonnaie(results.getInt(1), results.getString(2), results.getString(3),
						results.getFloat(4));
			}
		} catch (SQLIntegrityConstraintViolationException e) {

		} catch (SQLException e) {
		}
		if (results != null) {
			return crypto;
		}
		return null;
	}

	@Override
	public ArrayList<Cryptomonnaie> getAll() {
		String request = "select * from crypto_monnaies order by Id_crypto_monnaies";
		ResultSet results = null;
		ArrayList<Cryptomonnaie> listCrytomonnaie = new ArrayList<Cryptomonnaie>();
		try {
			PreparedStatement stmt = MyConnection.getConnection().prepareStatement(request);
			results = stmt.executeQuery();
			while (results.next()) {
				Cryptomonnaie crypto = new Cryptomonnaie(results.getInt(1), results.getString(2), results.getString(3),
						results.getFloat(4));
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
		String request = "update crypto_monnaies set prix_actuel =? where label =?";
		int results = 0;
		try {
			PreparedStatement stmt = MyConnection.getConnection().prepareStatement(request);

			stmt.setDouble(1, value);

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
		String request = "delete from crypto_monnaies where label =?";
		int results = 0;
		try {
			PreparedStatement stmt = MyConnection.getConnection().prepareStatement(request);
			stmt.setString(1, label);
			results = stmt.executeUpdate();
		} catch (SQLIntegrityConstraintViolationException e) {

		} catch (SQLException e) {
		}
		if (results == 1) {
			return true;
		}
		return false;
	}
}
