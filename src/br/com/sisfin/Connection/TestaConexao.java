package br.com.sisfin.Connection;

import java.sql.Connection;

public class TestaConexao {

	public static void main(String[] args) {
		
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexao aberta");
		
	}
	
}
