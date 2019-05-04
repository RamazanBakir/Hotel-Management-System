package hotelmanagement;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyConnection {
   
    public static Connection getConnection(){
        try{
            Class.forName("java.sql.Driver");
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"Error!" );
        }
        Connection con=null;
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306"+"/java_login_register?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "root");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    public static Connection getConnection2(){
        try{
            Class.forName("java.sql.Driver");
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"Error!" );
        }
        Connection con=null;
        try{
            JOptionPane.showMessageDialog(null,"The database is connected.","Information",JOptionPane.WARNING_MESSAGE);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306"+"/rooms?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey", "root", "root");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}
