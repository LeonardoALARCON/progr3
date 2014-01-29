package fr.univnantes.iut.controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * Method pour gerer le processus d'acces
	 * 
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void process(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getPathInfo());
		System.out.println(request.getParameter("login"));
		String dispatcher = "";
		if("/nouveauadherent".equals(request.getPathInfo())){
			dispatcher = "nouveauadherent";
		}else if (request.getSession().getAttribute("user") == null) {
			if(request.getParameter("login") != null){
				dispatcher = "loginControleur";
			}else{
				dispatcher = "login";
			}
		} else {
			if (request.getPathInfo() != null) {

				request.setAttribute("page",
						request.getPathInfo().replace("/", ""));
			} else {
				request.setAttribute("page", "accueil");
			}
			dispatcher = "template";
		}
		getServletContext().getNamedDispatcher(dispatcher).forward(request,
				response);
	}

}
