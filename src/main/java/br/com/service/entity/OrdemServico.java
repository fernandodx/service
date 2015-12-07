package br.com.service.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="listaOrdemServico")
@Entity
public class OrdemServico implements Serializable {
	private static final long serialVersionUID = 652341691069876283L;

	public static final String ID_ORDEM_SERVICO_BD = "ID_ORDEM_SERVICO";
	public static final String NM_ORDEM_SERVICO_BD = "NM_ORDEM_SERVICO";
	public static final String NR_ORDEM_SERVICO_BD = "NR_ORDEM_SERVICO";
	
	public static final String NOME_TABELA = "TB_ORDEM_SERVICO";
	
	@Id
	@GeneratedValue
	@Column(name=ID_ORDEM_SERVICO_BD)
	private Long idOrdemServico;
	
	@Column(name=NR_ORDEM_SERVICO_BD)
	private Integer nrOrdemServico;
	
	@Column(name=NM_ORDEM_SERVICO_BD)
	private String nmOrdemServico;
	
	public static String[] getColunasBanco() {
		return new String[]{ID_ORDEM_SERVICO_BD, NM_ORDEM_SERVICO_BD, NR_ORDEM_SERVICO_BD};
	}
	
	
	public OrdemServico() {
		super();
	}
	
	
	
	public OrdemServico(Long idOrdemServico) {
		super();
		this.idOrdemServico = idOrdemServico;
	}



	public OrdemServico(Long idOrdemServico, Integer nrOrdemServico,
			String nmOrdemServico) {
		super();
		this.idOrdemServico = idOrdemServico;
		this.nrOrdemServico = nrOrdemServico;
		this.nmOrdemServico = nmOrdemServico;
	}



	public static String[] colunasBanco() {
		return new String[]{ID_ORDEM_SERVICO_BD, NM_ORDEM_SERVICO_BD, NR_ORDEM_SERVICO_BD};
	}
	
	public Long getIdOrdemServico() {
		return idOrdemServico;
	}
	public void setIdOrdemServico(Long idOrdemServico) {
		this.idOrdemServico = idOrdemServico;
	}
	public Integer getNrOrdemServico() {
		return nrOrdemServico;
	}
	public void setNrOrdemServico(Integer nrOrdemServico) {
		this.nrOrdemServico = nrOrdemServico;
	}

	public String getNmOrdemServico() {
		return nmOrdemServico;
	}

	public void setNmOrdemServico(String nmOrdemServico) {
		this.nmOrdemServico = nmOrdemServico;
	}
	
	
	
	
}
