package hotelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MyConnection {
   
    public static Connection getConnection(){
        try{
            Class.forName("java.sql.Driver");
        }
        catch(ClassNotFoundException e)
        {
            JOptionPane.showMessageDialog(null,"hata tyr 1 " );
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
    
}
