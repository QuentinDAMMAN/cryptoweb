package com.cda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cda.doa.Imp.CryptomonnaieDaoImpl;

@WebServlet("/prix")
public class ServPrix extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String label = req.getParameter("label").toUpperCase();
		String prixStr = req.getParameter("prix");
		float prix = Float.parseFloat(prixStr);
		CryptomonnaieDaoImpl update = new CryptomonnaieDaoImpl();
		update.update(prix, label);
		req.getRequestDispatcher("/index").forward(req, resp);
	}
}
