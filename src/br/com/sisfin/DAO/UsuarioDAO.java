package br.com.sisfin.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.sisfin.model.Usuario;


@Repository
public class UsuarioDAO {
	private final Connection connection;
	
	@Autowired
	public UsuarioDAO(DataSource datasource) {
		try {
		this.connection =  datasource.getConnection();
		
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void cadastrar(Usuario usuario) throws SQLException {
		try {
		String sql = "insert into usuario( nome, email, idade, endereco, cpf) values(?,?,?,?,?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail());
		stmt.setInt(3, usuario.getIdade());
		stmt.setString(4, usuario.getEndereco());
		stmt.setString(5, usuario.getCpf());
		
		stmt.execute();
		stmt.close();
		
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
	
	
	
}
