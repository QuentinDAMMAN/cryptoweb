package com.cda.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cda.dao.IDao2;
import com.cda.doa.Imp.CryptoPortefeuilleDaoImpl;
import com.cda.model.CryptoPortefeuille;

@WebServlet("/portefeuille")
public class ServPortefeuille extends HttpServlet {
	public IDao2 cryptodao;

	private static final long serialVersionUID = 1L;

	public ServPortefeuille() {

		this.cryptodao = new CryptoPortefeuilleDaoImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<CryptoPortefeuille> cryptoportefeuille = this.cryptodao.getAll();

		request.setAttribute("cryptoportefeuille", cryptoportefeuille);

		request.getRequestDispatcher("WEB-INF/portefeuille.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
