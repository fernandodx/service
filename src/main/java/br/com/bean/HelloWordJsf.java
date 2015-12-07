package br.com.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.util.RelatorioUtil;

@SessionScoped
@ManagedBean(name="helloWordJsf")
public class HelloWordJsf implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private static final String TELA_CONSULTA = "hello";

	
	private String nome;

	
	public String abrirTela() throws Exception {
		return TELA_CONSULTA;
	}
	
	public String gerarXls() throws Exception {
		
		RelatorioUtil util = new RelatorioUtil();
		util.gerarExcel("teste.xls");
		
		return TELA_CONSULTA;
	}
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
