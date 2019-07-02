package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OiMundoServlet
 */
@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public OiMundoServlet() {
		System.out.println("Criando Oi Mundo Servlet");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("Bem vindo ao Primeiro Servlet");
		out.println("</body></html>");

		System.out.println("O Servlet foi chamado.");
	}

}
