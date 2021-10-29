/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 505
 */
public class ConsultasEscuderia extends ModeloBD {
    
    PreparedStatement consultaSQL;
    ResultSet resultadoSQL;
    
    public boolean registrarEsuderia(ModeloEscuderia escuderia){
       
        Connection conexion=conectarBD();
        String query="INSERT INTO escuderias(id,escuderias,presupuesto,motor) "
                + "VALUES (?,?,?,?)";
        
        try{
            
            consultaSQL=conexion.prepareStatement(query);
            
            consultaSQL.setString(1,escuderia.getId());
            consultaSQL.setString(2,escuderia.getNombre());
            consultaSQL.setInt(3,escuderia.getPresupuesto());
            consultaSQL.setString(4,escuderia.getTipoMotor());
            
            int resultado=consultaSQL.executeUpdate();
            
            if(resultado>0){     
                return true;
            }else{
                return false;
            }
        
        }catch(Exception error){
            System.out.println("UPPSS..."+error);
            return false;
        
        }
        
    }
    
    public ModeloEscuderia buscarEscuderia(String id){
        
        Connection conexion=conectarBD();
        String query="SELECT * from escuderias where id=?";
        
        try{
            
            consultaSQL=conexion.prepareStatement(query);
            
            consultaSQL.setString(1,id);
            
            resultadoSQL=consultaSQL.executeQuery();
            
            ModeloEscuderia escuderia = new ModeloEscuderia();
            if(resultadoSQL.next()){
                
                escuderia.setId(resultadoSQL.getString("id"));
                escuderia.setNombre(resultadoSQL.getString("escuderia"));
                escuderia.setPresupuesto(resultadoSQL.getInt("presupuesto"));
                escuderia.setTipoMotor(resultadoSQL.getString("motor"));
                
                return escuderia;
            
            }else{
                return null;
            }
        
        }catch(Exception error){
            System.out.println("UPPSS..."+error);
            return null;
        
        }
        
        
        
    }
    
}
