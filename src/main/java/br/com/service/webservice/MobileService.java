package br.com.service.webservice;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.service.entity.Device;
import br.com.service.entity.OrdemServico;
import br.com.service.entity.TipoAtividade;

@Path("/mobileservice")
public class MobileService implements Serializable {

	/**  
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GET 
	@Path("/teste")
	@Produces(MediaType.APPLICATION_JSON) 
	public String teste() {
		return "teste 1234";
	}
	
	@POST
	@Path("/email")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public Device enviarEmail(String email) {
		
		Device dv = new Device();
		dv.setDeviceGCMId(email);
		return dv;
	}
	
	@GET
	@Path("/atividades")
	@Produces(MediaType.APPLICATION_JSON +  ";charset=utf-8")
	public List<TipoAtividade> consultarTodasAtividades() {
		
		List<TipoAtividade> listaAtividade = new ArrayList<TipoAtividade>();
		
		listaAtividade.add(new TipoAtividade(1L, "Implementação"));
		listaAtividade.add(new TipoAtividade(2L, "Reunião com o cliente"));
		
		return listaAtividade;
		
	}
	
	@GET
	@Path("/ordemservico")
	@Produces(MediaType.APPLICATION_JSON +  ";charset=utf-8")
	public List<OrdemServico> consultarTodosOrdemServico() {
		
		List<OrdemServico> listaOs = new ArrayList<OrdemServico>();
		
		listaOs.add(new OrdemServico(1L, new Integer(998877), "SIGLA"));
		listaOs.add(new OrdemServico(1L, new Integer(998877), "SISZARC"));
		
		return listaOs;
	}
	
	
	
	
}
