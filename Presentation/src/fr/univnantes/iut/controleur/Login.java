package fr.univnantes.iut.controleur;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
<<<<<<< HEAD
		redirect(request, response);
=======
		getServletContext().getNamedDispatcher("login").forward(request,
				response);
>>>>>>> 41ff946a69520d6fb79c9e9e7370c164a4ceae0d
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		//chercher dans la BdD si les donnes sont corrects.
		request.getSession().setAttribute("login", "UserTest");
		redirect(request, response);
	}

	protected void redirect(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("page", "accueil");
		getServletContext().getNamedDispatcher("template").forward(
				request, response);
=======
		// chercher dans la BdD si les donnes sont corrects.
		request.getSession().setAttribute("login", "UserTest");
		request.setAttribute("page", "accueil");
		response.sendRedirect(request.getContextPath() + "/association/");

>>>>>>> 41ff946a69520d6fb79c9e9e7370c164a4ceae0d
	}

}
