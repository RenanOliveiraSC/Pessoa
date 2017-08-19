package br.com.renan.pessoal.model;

import java.sql.Date;

public class CadastroM {

	private Integer codigo;
	private String nome;
	private Date datanasc;
	private int signo;

	public CadastroM(Integer codigo, String nome, Date datanasc, int signo) {
		this.codigo = codigo;
		this.nome = nome;
		this.datanasc = datanasc;
		this.signo = signo;
	
	}
	
	public CadastroM(String nome, Date datanasc, int signo) {
		this.nome = nome;
		this.datanasc = datanasc;
		this.signo = signo;

	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(Date datanasc) {
		this.datanasc = datanasc;
	}
	
	public int getSigno() {
		return signo;
	}

	public void setSigno(int signo) {
		this.signo = signo;
	}

}
