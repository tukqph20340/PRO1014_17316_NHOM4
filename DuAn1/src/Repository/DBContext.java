/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DBContext {
    private static String hostName = "TUANCACA\\SQLEXPRESS01";
    private static String account = "sa";
    private static String pass = "123456";
    private static String dbName = "QuanLyBanDienThoai";
    private static String connectionSQL = "jdbc:sqlserver://" + hostName + ":1433;databaseName=" + dbName;
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static Connection cnn;

    static {

      
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

    static Connection openDBConnection() {

        try {
            return DriverManager.getConnection(connectionSQL, account, pass);
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            
        }
     return null;
    }
    public static void main(String[] args) {
         openDBConnection().toString();
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
    
    
}