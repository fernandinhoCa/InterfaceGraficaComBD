package br.senac.conexaoBD;
import java.sql.*;
/**
 *
 * @author fernando.capeletti
 */
public class Conexao {
    public static Connection Conector(){
        Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/senac";
        String user = "root";
        String password = "123qwe@";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }        
}
