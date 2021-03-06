package fr.univnantes.iut.controleur;

import java.util.ArrayList;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.univnantes.iut.beans.Adherent;
import fr.univnantes.iut.beans.Commande;
import fr.univnantes.iut.service.ArticleService;
import fr.univnantes.iut.service.CommandeService;

/**
 * Servlet implementation class Controleur
 */
public class Controleur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Controleur() {
		super();
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processus(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processus(request, response);
	}

	private void processus(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("message");
		String dispatcher = "";
		
		if(request.getSession().getAttribute("commande") == null){
			request.getSession().setAttribute("commande", new ArrayList<Commande>());
		}
		
		if ("/css/style.css".equals(request.getPathInfo())) {
			request.getRequestDispatcher("/css/style.css").forward(request,
					response);
		} else if ("/nouveauadherent".equals(request.getPathInfo())) {
			dispatcher = "nouveauadherentcontroleur";
		} else if (request.getSession().getAttribute("login") == null) {
			if (request.getParameter("login") != null) {
				dispatcher = "loginControleur";
			} else {
				dispatcher = "login";
			}
		} else if (request.getParameter("logout") != null) {
			request.getSession().removeAttribute("login");
			dispatcher = "login";
		} else if (request.getParameter("commander") != null) {
			dispatcher = "commander";
		} else if ("/annulerCommande".equals(request.getPathInfo()) || "/validerCommande".equals(request.getPathInfo())) {
			dispatcher = "commander";
		} else {
			if (request.getPathInfo() != null) {
				
				request.setAttribute("page",
						request.getPathInfo().replace("/", ""));
				
				if ("/articles".equals(request.getPathInfo())) {
					ArticleService artServ = new ArticleService();
					request.getSession().setAttribute("articles",
							artServ.listAll());
				}
				
			} else {
				request.setAttribute("page", "accueil");
			}
			dispatcher = "template";
		}
		
		getServletContext().getNamedDispatcher(dispatcher).forward(request,
				response);
	}

}
