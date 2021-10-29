/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 505
 */
public class ConsultasPiloto extends ModeloBD {
    
    PreparedStatement consultaSQL;
    ResultSet resultadoSQL;
    
    public boolean registrarPiloto(ModeloPiloto piloto){
        
        Connection conexion=conectarBD();
        String query="INSERT INTO pilotos(nombres,apellidos,salario,fecha_inicio,fecha_salida,id_escuderia)"
                + "VALUES (?,?,?,?,?,?)";
        
        try{
            //Peparate que voy con toa
            consultaSQL=conexion.prepareStatement(query);
            
            //Ajusto la consulta
            consultaSQL.setString(1,piloto.getNombres());
            consultaSQL.setString(2,piloto.getApellidos());
            consultaSQL.setInt(3,piloto.getSalario());
            consultaSQL.setString(4,piloto.getFechain());
            consultaSQL.setString(5,piloto.getFechaout());
            consultaSQL.setString(6,piloto.getIdEscuderia());
            
            //Ejecuto la consulta
            int resultado=consultaSQL.executeUpdate();
            
            //validando el resultado
            if(resultado>0){
              return true;  
            }else{
               return false; 
            }
            
        }catch(SQLException error){
            System.out.println("upsss... "+error);
            return false;
        }
        
    }
    
    public ModeloPiloto buscarPiloto(int id){
       
        Connection conexion=conectarBD();
        String query="SELECT * from pilotos where id=?";
        
        try{
            
            //Peparate que voy con toa
            consultaSQL=conexion.prepareStatement(query);
            
            //Ajusto la consulta
            consultaSQL.setInt(1, id);
            
            //Ejecuto la consulta
            resultadoSQL=consultaSQL.executeQuery();
            
            //Orgaizo el resultado
            ModeloPiloto piloto= new ModeloPiloto();
            if(resultadoSQL.next()){
                
                piloto.setId(resultadoSQL.getInt("id"));
                piloto.setNombres(resultadoSQL.getString("nombres"));
                piloto.setApellidos(resultadoSQL.getString("apellidos"));
                piloto.setSalario(resultadoSQL.getInt("salario"));
                piloto.setFechain(resultadoSQL.getString("fecha_inicio"));
                piloto.setFechaout(resultadoSQL.getString("fecha_salida"));
                piloto.setIdEscuderia(resultadoSQL.getString("id_escuderia"));
                
                return piloto;
                
                
            }else{
                return null;
            }
            
         
            
        }catch(SQLException error){
            System.out.println("upsss... "+error);
            return null;
        }
        
       
   }
    
}
