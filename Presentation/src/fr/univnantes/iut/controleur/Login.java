package fr.univnantes.iut.controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.univnantes.iut.beans.Adherent;
import fr.univnantes.iut.service.AdherentService;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getNamedDispatcher("login").forward(request,
				response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		AdherentService adSer = new AdherentService();
		Adherent ad = adSer.find(request.getParameter("login"));
		if(ad != null){
			request.getSession().setAttribute("login", ad);
		}
		else{
			request.getSession().setAttribute("message", "Login ou mot de passe incorrects.");
		}
		request.setAttribute("page", "accueil");
		getServletContext().getNamedDispatcher("template").forward(request,
				response);
	}


}
