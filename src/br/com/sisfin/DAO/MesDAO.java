package br.com.sisfin.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.sisfin.model.Mes;
	
@Repository
public class MesDAO {

	public final Connection connection;
	
	@Autowired
	public MesDAO(DataSource datasource) {
		try {
			this.connection = datasource.getConnection();
		
		} catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Mes selecionaMes(Mes mes) {
		
		//List<Mes> meses = new ArrayList<>();
		if(mes.getQualMes().equals("janeiro") && mes.getAno() == 2018){
			try {
				PreparedStatement stmt = this.connection.prepareStatement("select * from gastoUsuario where data between '2018-08-01' and '2018-08-31'  ");
				
				ResultSet rs = stmt.executeQuery();
				
				while (rs.next()) {
					mes.setQualMes(rs.getString("qualMes"));
					
				}
				
				stmt.execute();
				stmt.close();
				
			} catch (SQLException e) {
				throw new RuntimeException(e); 
			}
		}
		
		
		
		return mes;
		
		if(!mes.getQualMes().equals("janeiro")){
			
		}
	}
	
}
