package escola.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import dao.Dao;
import escola.model.Usuario;

@Named
@ViewScoped
public class SignInController implements Serializable{
	private static final long serialVersionUID = -2816096897119856522L;
	
	private Usuario usuario = new Usuario();
	private Dao<Usuario> dao = new Dao<Usuario>();
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Dao<Usuario> getDao() {
		return dao;
	}

	public void setDao(Dao<Usuario> dao) {
		this.dao = dao;
	}

	
	
	public void salvar() {
		dao.save(usuario);
	}
		
	}
