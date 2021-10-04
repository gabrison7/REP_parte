package servlets;

import java.io.IOException;

import dao.ParteDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vo.ParteVO;


/**
 * Servlet implementation class RegistroParte
 */
@WebServlet("/Registro")
public class RegistroParte extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroParte() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String senor = request.getParameter("senor");
		String direccion = request.getParameter("direccionInicio");
		String cp = request.getParameter("cp");
		String ciudad = request.getParameter("ciudad");
		String nombreHijo = request.getParameter("hijo");
		String curso = request.getParameter("curso");
		String fecha = request.getParameter("fecha");
		String motivos = request.getParameter("motivos");
		String diaCita = request.getParameter("diaCita");
		String horaCita = request.getParameter("horaCita");
		String persona = request.getParameter("persona");
		String fechaFirma = request.getParameter("fechaFirma");
		String firmaProf = request.getParameter("firmaProf");
		
			/*
			response.setContentType("text/html");
			PrintWriter salida = response.getWriter();
			salida.println(senor);
			salida.println(direccion);
			salida.println(cp);
			salida.println(ciudad);
			*/
		
			ParteVO parte = new ParteVO(0, senor, direccion, cp, ciudad, nombreHijo, curso, fecha, motivos, diaCita, horaCita, persona, fechaFirma, firmaProf);
			ParteDAO.guardarAmonestacion(parte);
			
			/*
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request, response);
			*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
