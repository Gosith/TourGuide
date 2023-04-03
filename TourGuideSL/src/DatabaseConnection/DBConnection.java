package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class DBConnection {
    
    public static Connection con = null;
    private final String username = "root";
    private final String password = "";
    private final String DB_URL = "jdbc:mysql://localhost:3306/tourguide?zeroDateTimeBehavior=CONVERT_TO_NULL";
    JFrame dialogBox;
    
    public DBConnection() throws ClassNotFoundException, SQLException {
        
        try {
            if(con==null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, username, password);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(dialogBox, "Database is not successfuly connected");
        }
    }
    
    public Connection getConnection(){
        return con;
    } 
    
    public ResultSet GetQuery(String query) throws SQLException{
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery(query);
        return rs;
    }
          
    public void CloseConnection() throws SQLException{
       con.close();
    }
    
    public void ExecuteQuery(String query) throws SQLException{
        PreparedStatement stm = con.prepareStatement(query);
        stm.execute();
    }
    
            
}
