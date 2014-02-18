package fr.univnantes.iut.controleur;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.univnantes.iut.beans.Adherent;
import fr.univnantes.iut.service.AdherentService;

/**
 * Servlet implementation class NouveauAdherentControleur
 */
public class NouveauAdherentControleur extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NouveauAdherentControleur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getNamedDispatcher("nouveauadherentJSP").forward(request,
				response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Adherent ad = new Adherent();
		AdherentService adSer = new AdherentService();
		ad.setId(request.getParameter("login"));
		ad.setMotPase(request.getParameter("psswd"));
		ad.setNom(request.getParameter("nom"));
		ad.setPrenom(request.getParameter("prenom"));
		ad.setAdresse(request.getParameter("adresse"));
		ad.setCodePostal(request.getParameter("codepostal"));
		ad.setVille(request.getParameter("ville"));
		ad.setPays(request.getParameter("pays"));
		if(adSer.find(ad.getId()) !=null ){
			request.getSession().setAttribute("message", "Le login est deja occupé");
			request.getSession().setAttribute("adherent", ad);
			getServletContext().getNamedDispatcher("nouveauadherentJSP").forward(request,
					response);
		}
		else if(request.getParameter("psswd").equals(request.getParameter("psswdConf"))){
			request.getSession().setAttribute("message", "Les mot de passe ne sont pas egals");
			request.getSession().setAttribute("adherent", ad);
			getServletContext().getNamedDispatcher("nouveauadherentJSP").forward(request,
					response);
		}
		else{
			adSer.create(ad);
			getServletContext().getNamedDispatcher("loginControleur").forward(request,
					response);
		}
	}

}
