package fr.univnantes.iut.controleur;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.univnantes.iut.beans.Adherent;
import fr.univnantes.iut.beans.Commande;
import fr.univnantes.iut.service.ArticleService;
import fr.univnantes.iut.service.CommandeService;

/**
 * Servlet implementation class Commander
 */
public class Commander extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CommandeService commServ;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Commander() {
        super();
        commServ = new CommandeService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Adherent user = (Adherent) request.getSession().getAttribute("login");
		if ("/annulerCommande".equals(request.getPathInfo())){ 
			request.getSession().removeAttribute("commande");
		}
		else if("/validerCommande".equals(request.getPathInfo())){
			for(Commande co : (ArrayList<Commande>)request.getSession().getAttribute("commande")){
				commServ.create(co);
			}
			request.getSession().removeAttribute("commande");
		}
		request.setAttribute("page", "accueil");
		getServletContext().getNamedDispatcher("template").forward(request,
				response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Commande comm = new Commande();
		Adherent user = (Adherent) request.getSession().getAttribute("login");
		comm.setAdherent(user);
		ArticleService artServ = new ArticleService();
		comm.setArticle(artServ.find(Integer.parseInt(request.getParameter("codeArticle"))));
		comm.setDateCommande(new Date());
		comm.setQuantite(Integer.parseInt(request.getParameter("quantite")));
		((ArrayList<Commande>)request.getSession().getAttribute("commande")).add(comm);
		request.setAttribute("page", "commande");

		request.getSession().setAttribute("commandes", commServ.listAll());
		System.out.println( commServ.listAll());
		getServletContext().getNamedDispatcher("template").forward(request,
				response);
	}


}
