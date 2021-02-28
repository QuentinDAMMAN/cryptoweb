package com.cda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cda.doa.Imp.CryptoPortefeuilleDaoImpl;
import com.cda.model.CryptoPortefeuille;

@WebServlet("/achat")
public class ServAchat extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String label = request.getParameter("label").toUpperCase();
			String prixStr = request.getParameter("prix");
			float prix = Float.parseFloat(prixStr);
			CryptoPortefeuilleDaoImpl create = new CryptoPortefeuilleDaoImpl();
			create.create(new CryptoPortefeuille().setLabel(label).setValeurAchat(prix));
			request.getRequestDispatcher("/index").forward(request, response);

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
