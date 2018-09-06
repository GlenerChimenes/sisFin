package br.com.sisfin.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sisfin.DAO.MesDAO;
import br.com.sisfin.DAO.UsuarioDAO;
import br.com.sisfin.model.Mes;
import br.com.sisfin.model.Usuario;

@Controller
public class UsuarioControle {
	
	public final MesDAO mesDAO;
	public final UsuarioDAO usuarioDAO;
	
	@Autowired
	public UsuarioControle(UsuarioDAO usuarioDAO, MesDAO mesDAO) {
		this.usuarioDAO = usuarioDAO;
		this.mesDAO = mesDAO;
	}
	
	@RequestMapping("cadastroUsuario")
	public String login()  {
		
		
		return"cadastroUsuario";
	}
	
	@RequestMapping("adiciona")
	public String adiciona(Usuario usuario) throws SQLException {
		usuarioDAO.cadastrar(usuario);
		
		return"usuarioAdiconado";
	}
	
	@RequestMapping("bemVindo")
	public String BemVindo() {
		
		return "BemVindo";
		
	}
	
	@RequestMapping("escolhaMes")
	public String EscolhaMes() {
		
		return "escolhaMes";
		
	}
	
	@RequestMapping("mostraMes")
	public String mesEscolhido(Mes mes) {
		 
		
		mesDAO.selecionaMes(mes);
			
		return "mostraMesEscolhido";
		
	}
	
	
	
		
}
