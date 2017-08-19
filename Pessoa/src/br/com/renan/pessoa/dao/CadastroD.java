package br.com.renan.pessoa.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.renan.pessoal.model.CadastroM;
import br.com.renan.pessoal.service.CadastroS;

public class CadastroD {

	public final Connection con;

	public CadastroD(Connection con) {
		this.con = con;
	}

	public boolean inserir(CadastroM cadastro) throws SQLException {
		String sql = "INSERT INTO PESSOA (PE_CODIGO, PE_NOME, PE_DATANASC, PE_SIGNO) VALUES (SEQ_PESSOA.nextval,?,?,?)";

		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1, cadastro.getNome());
		statement.setDate(2, (Date) cadastro.getDatanasc());
		statement.setInt(3, cadastro.getSigno());
		return statement.executeUpdate() > 0;

	}

	public List<CadastroM> lista() throws SQLException {
		List<CadastroM> lCadastro = new ArrayList<>();
		String sql = "SELECT * FROM PESSOA";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.execute();
			try (ResultSet rs = stmt.getResultSet()) {
				while (rs.next()) {
					int codigo = rs.getInt("PE_CODIGO");
					String nome = rs.getString("PE_NOME");
					Date datanasc = rs.getDate("PE_datanasc");
					int signo = rs.getInt("PE_SIGNO");
					lCadastro.add(new CadastroM("Renan", "09/07/1990", CadastroS.vairificaSigno());
				}
			}
		}
		return lCadastro;
	}

}
