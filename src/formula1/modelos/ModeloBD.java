/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1.modelos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 505
 */
public class ModeloBD {
    
    private final String servidor="jdbc:mysql://localhost/formula1";
    private final String usuario="root";
    private final String password="";

    public ModeloBD() {
    }
    
    
     public Connection conectarBD(){
        
        Connection conexion=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(servidor,usuario,password);
            System.out.println("Exito conectadose a la BD");
            return conexion;
        
        }catch(Exception error){
            
            System.out.println("UPSS.."+error);
            return null;
        
        }
    }
    
}
