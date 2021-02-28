package com.cda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cda.doa.Imp.CryptomonnaieDaoImpl;
import com.cda.methods.ToUpperCaseFirst;
import com.cda.model.Cryptomonnaie;

@WebServlet("/ajout")
public class ServAjout extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nom = ToUpperCaseFirst.upperCaseFirst(req.getParameter("nom"));
		String label = req.getParameter("label").toUpperCase();
		String prixStr = req.getParameter("prix");
		float prix = Float.parseFloat(prixStr);
		CryptomonnaieDaoImpl create = new CryptomonnaieDaoImpl();
		create.create(new Cryptomonnaie(nom, label, prix));
		req.getRequestDispatcher("/index").forward(req, resp);
	}
}
