package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	// Variavel estática para simular um id do Banco
	private static Integer chaveSequencial = 1;
	// Variavel estática para criar uma lista de Empresas
	private static List<Empresa> lista = new ArrayList<Empresa>();

	static {
		Empresa empresa = new Empresa();
		empresa.setId(Banco.chaveSequencial++);
		empresa.setNome("Google");
		lista.add(empresa);

		Empresa empresa2 = new Empresa();
		empresa2.setId(Banco.chaveSequencial++);
		empresa2.setNome("Microsoft");
		lista.add(empresa2);
	}

	// Método para adicionar uma empresa a lista
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}

	// Método para retornar lista de empresas
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	// Método para remover uma empresa
	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = Banco.lista.iterator();
		while (it.hasNext()) {
			Empresa emp = it.next();

			if (emp.getId() == id) {
				// removendo a empresa da lista
				it.remove();
			}

		}
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}
}
