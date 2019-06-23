package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static Integer chaveSequencial = 1;
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

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = Banco.lista.iterator();
		while (it.hasNext()) {
			Empresa emp = it.next();
			
			if (emp.getId() == id) {
				it.remove();
			}
			
		}
	}
}
