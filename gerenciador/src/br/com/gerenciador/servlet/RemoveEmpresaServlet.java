package br.com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveEmpresaServlet
 */
@WebServlet("/removeEmpresa")
public class RemoveEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		//Recuperando o id da empresa escolhida para remover
		String paramId = request.getParameter("id");
		//Convertendo o String para Integer
		Integer id = Integer.valueOf(paramId);

		System.out.println(id);

		Banco banco = new Banco();
		//Removendo a empresa ,atraves do m�todo removeEmpresa
		banco.removeEmpresa(id);
		
		//Direcionando para o jsp listaEmpresas
		response.sendRedirect("listaEmpresas");
	}

}
