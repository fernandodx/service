package br.com.filters;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.faces.el.ChainAwareVariableResolver;

public class JPAFilter implements Filter {
	
	private EntityManagerFactory factory;

	public void init(FilterConfig arg0) throws ServletException {
		this.factory = Persistence.createEntityManagerFactory("ESFORCO-DIARIO-PERSISTE");
	}
	
	
	public void destroy() {
		this.factory.close();
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filter) throws IOException, ServletException {
		
		//CHEGADA
		EntityManager manager = this.factory.createEntityManager();
		request.setAttribute("EntityManager", manager);
		manager.getTransaction().begin();

		// FACES SERVLET
		filter.doFilter(request, response);
		
		//SAIDA
		try{
			
		}catch(Exception e) {
			manager.getTransaction().rollback();
		}finally {
			manager.close();
		}
		
	}

	

}
