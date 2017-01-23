package escola.musica.dao;
import javax.persistence.EntityManager;

import escola.musica.model.Curso;

public class CursoDAO {

public void salvar(Curso curso){
	   
	  	        
	   EntityManager entitymanager = JPAUtil.getEntityManager();

		entitymanager.getTransaction().begin();
		
		entitymanager.getTransaction().begin();
		
		entitymanager.merge(curso);
		
		entitymanager.getTransaction().commit();
		
		entitymanager.close();
		
		

		
}
	
}
