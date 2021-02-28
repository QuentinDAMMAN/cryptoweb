package com.cda.servlet;

import java.io.IOException;
import java.util.IllegalFormatException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cda.doa.Imp.CryptomonnaieDaoImpl;

@WebServlet("/supp")
public class ServSupprimer extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String label = req.getParameter("label").toUpperCase();
			CryptomonnaieDaoImpl delete = new CryptomonnaieDaoImpl();
			delete.delete(label);
			req.getRequestDispatcher("/index").forward(req, resp);
		} 
		catch (NumberFormatException e) {
			String message = "Veuillez remplir tous les champs";
			req.setAttribute("message", message);
			req.getRequestDispatcher("WEB-INF/erreur.jsp").forward(req, resp);
		} catch (IllegalFormatException e) {
			String message = "Veuillez remplir tous les champs";
			req.setAttribute("message", message);
			req.getRequestDispatcher("WEB-INF/erreur.jsp").forward(req, resp);
		} 
		catch (Exception e) {
			String message = "Veuillez remplir tous les champs";
			req.setAttribute("message", message);
			req.getRequestDispatcher("WEB-INF/erreur.jsp").forward(req, resp);
		}
	}
}
