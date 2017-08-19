package br.com.renan.pessoal.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;

import br.com.renan.pessoa.dao.CadastroD;
import br.com.renan.pessoa.jdbc.oracle.ConnectionPoolOracle;
import br.com.renan.pessoal.model.CadastroM;

public class CadastroS {

	public void inserir(CadastroM cadastro) throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
			new CadastroD(con).inserir(cadastro);
		}
	}

	public static boolean vairificaSigno(CadastroM cadastro) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(cadastro.getDatanasc());

		int dia = calendar.get(Calendar.DAY_OF_MONTH);
		int mes = calendar.get(Calendar.MONTH) + 1;

		if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
			System.out.println("seu signo é aquário");
			cadastro.setSigno(1);
		} else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
			System.out.println("seu signo é peixes");
			cadastro.setSigno(2);
		} else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
			System.out.println("seu signo é áries");
			cadastro.setSigno(3);
		} else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
			System.out.println("seu signo é touro");
			cadastro.setSigno(4);
		} else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
			System.out.println("seu signo é gêmeos");
			cadastro.setSigno(5);
		} else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
			System.out.println("seu signo é câncer");
			cadastro.setSigno(6);
		} else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
			System.out.println("seu signo é leão");
			cadastro.setSigno(7);
		} else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
			System.out.println("seu signo é virgem");
			cadastro.setSigno(8);
		} else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
			System.out.println("seu signo é libra");
			cadastro.setSigno(9);
		} else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
			System.out.println("seu signo é escorpião");
			cadastro.setSigno(10);
		} else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
			System.out.println("seu signo é sargitário");
			cadastro.setSigno(11);
		} else if ((mes == 12 && dia >= 22) || (mes == 01 && dia <= 19)) {
			System.out.println("seu signo é capricórnio");
			cadastro.setSigno(12);
		}
		return false;
	}

	public List<CadastroM> listarCadastro()  throws SQLException {
		try (Connection con = new ConnectionPoolOracle().getConnection()) {
            return new CadastroD(con).lista();
		}
	}
}
