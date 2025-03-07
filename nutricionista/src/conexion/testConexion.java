package conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testConexion {
    public static void main(String[] args) {
      Connection con = Conexion.getConnection();
      
      if ((con != null)){
          System.out.println("Funca");
      }
    }
}
