package escola.musica.bean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import escola.musica.dao.CursoDAO;
import escola.musica.model.Curso;
import escola.musica.model.TipoCurso;


@ManagedBean
@SessionScoped
public class CursoBean {
	
	private Curso curso = new Curso();
    private List<TipoCurso> tipos = Arrays.asList(TipoCurso.values());
	private List<Curso> cursos = new ArrayList<Curso>();
	
	public String getDataAtual(){
		return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		
	}
	public String salvar(){
		
	   CursoDAO cursodao = new CursoDAO();
	   cursodao.salvar(curso);
					
		cursos.add(curso);
		curso = new Curso(); 
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Curso Salvo Com Sucesso!"));
		
		return "cursos_lista?faces-redirect=true";
	}
	
	
	public List<Curso> getCursos() {
		return cursos;
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


	public List<TipoCurso> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoCurso> tipos) {
		this.tipos = tipos;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	} 
	

	
}
