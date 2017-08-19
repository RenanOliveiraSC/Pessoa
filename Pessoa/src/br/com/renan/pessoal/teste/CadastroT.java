package br.com.renan.pessoal.teste;

import java.awt.List;

import br.com.renan.pessoal.model.CadastroM;
import br.com.renan.pessoal.service.CadastroS;

public class CadastroT {

	public static void main(String[] args) {
		
		CadastroS cadastroService = new CadastroS();
		
		List<CadastroM> lCadastro = cadastroService.listarCadastro();
	}
}
