package dao;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;

import entity.Despesa;
import jdbc.Conexao;

public class DaoDespesa {
	
	//inserir
	public void inserir(Despesa despesa) {
		String sql = "INSERT INTO despesa(id, nome, valor, dia)  VALUES (?,?,?,?)";
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.getConexao().prepareStatement(sql);
			
			ps.setInt(1, despesa.getId());
			ps.setString(2, despesa.getNome());
			ps.setFloat(3, despesa.getValor());
			ps.setDate(4, despesa.getDia());
			
			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	//excluir
	public void excluir(int id) {
			String sql = "DELETE FROM despesa WHERE id=?";
			
			PreparedStatement ps = null;
			
			try {
				ps = Conexao.getConexao().prepareStatement(sql);
				ps.setInt(1, id);
				
				ps.execute();
				ps.close();
				
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	//editar
	public void editar(Despesa despesa) {
		String sql = "UPDATE despesa SET nome=?, valor=?, dia=? WHERE id=?";
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.getConexao().prepareStatement(sql);
			ps.setString(1,despesa.getNome());
			ps.setFloat(2,despesa.getValor());
			ps.setDate(3,despesa.getDia());
			
			ps.setInt(4, despesa.getId());
			
			ps.execute();
			ps.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
		
	
	//mostrar
	public void mostrar() {
		String sql = "SELECT id,nome,valor,dia FROM despesa";
		
		try (
			Statement stmt = Conexao.getConexao().createStatement();
			ResultSet rs = stmt.executeQuery(sql);){
			while(rs.next()) {
				System.out.println("id : " + rs.getInt("id"));
				System.out.println("nome: " + rs.getString("nome"));
				System.out.println("valor: "+ rs.getFloat("valor"));
				System.out.println("dia: "+ rs.getDate("dia"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
}
