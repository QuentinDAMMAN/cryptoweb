package com.cda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cda.doa.Imp.CryptoPortefeuilleDaoImpl;

/**
 * Servlet implementation class ServVendre
 */

@WebServlet("/vendre")
public class ServVendre extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String label = request.getParameter("label").toUpperCase();
			String quantiteVendu = request.getParameter("prix");
			float quantite = Float.parseFloat(quantiteVendu);
			CryptoPortefeuilleDaoImpl update = new CryptoPortefeuilleDaoImpl();
			update.update(quantite, label);
			request.getRequestDispatcher("/portefeuille").forward(request, response);
			
		} catch (NumberFormatException e) {
			String message = "Veuillez remplir tous les champs";
			request.setAttribute("message", message);
			request.getRequestDispatcher("WEB-INF/erreur.jsp").forward(request, response);
		} catch (Exception e) {
			String message = "Veuillez remplir tous les champs";
			request.setAttribute("message", message);
			request.getRequestDispatcher("WEB-INF/erreur.jsp").forward(request, response);
		}
	}
}
