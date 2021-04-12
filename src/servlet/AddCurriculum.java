package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
/**
 * Servlet implementation class AddCurriculum
 */
@WebServlet(description = "receive curriculum data from index form", urlPatterns = { "/AddCurriculum" })
public class AddCurriculum extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCurriculum() {
        super();
        // TODO Auto-generated constructor stub
    }
    String [] Lingue= new String[5];
    String [] Competenze= new String[3];
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//--------------------Dati personali----------------------//
		String Nome = request.getParameter("nome");
		String Cognome = request.getParameter("cognome");
		String Indirizzo = request.getParameter("indirizzo");
		String Lavoro = request.getParameter("lavoro");
		//--------------------------------------------------------//
		//---------------Competenze informatiche------------------//
		String [] Competenze=request.getParameterValues("linguaggio");
		String CompetenzeAggiuntive = request.getParameter("AltreCompetenze");
		//--------------------------------------------------------//
		//---------------Competenze Linguistiche------------------//
		String [] Lingue=request.getParameterValues("lingua");
		String CompetenzaLingua = request.getParameter("livello");
		//----------------------------------------------------------//
		//------------------------HTML------------------------------//
		
		out.println("<html><body>");
		out.println("<fieldset>"
				+ "<legend><b>Dati Personali</b></legend>"
				+ "<b>Nome: </b>");
		out.println(Nome);
		out.println("<br>");
		out.println("<b>Cognome: </b>");
		out.println(Cognome);
		out.println("<br>");
		out.println("<b>Indirizzo: </b>");
		out.println(Indirizzo);
		out.println("<br>");
		out.println("<b> Attività Lavorativa:</b>");
		out.println(Lavoro);
		out.println("</fieldset>");
		//----------------------------------------------------------//
		out.println("<fieldset>"
				+ "<legend><b>Competenze Informatiche</b></legend>");
		out.println("<ul>");
		for(int i=0;i<Competenze.length;i++) {
			out.println("<li>");
			out.println(Competenze[i]);
			out.println("</li>");
		}
		out.println("<br>");
		out.println("<b>Altre Competenze: </b>");
		out.println(CompetenzeAggiuntive);
		out.println("<br>");
		out.println("</fieldset>");
		//----------------------------------------------------------//
		out.println("<fieldset>"
				+ "<legend><b>Lingue Conosciute</b></legend>");
		out.println("<ul>");
		for(int i=0;i<Lingue.length;i++) {
			out.println("<li>");
			out.println(Lingue[i]);
			out.println("</li>");
		}
		out.println("<br>");
		out.println("<b>Competenza nelle lingue sopracitate pari a: </b>");
		out.println(CompetenzaLingua);
		out.println("<br>");
		out.println("</fieldset>");
		/*
		for(int i=0;i<Lingue.length;i++) {
			out.println(Lingue[i]);
		}
		
		for(int i=0;i<Competenze.length;i++) {
			out.println(Competenze[i]);
		}*/
		out.println("</body></html>");
	}

}
