/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1.modelos;

/**
 *
 * @author 505
 */
public class ModeloPiloto {
    
    private int id;
    private String nombres;
    private String apellidos;
    private int salario;
    private String idEscuderia;

    public ModeloPiloto() {
    }

    public ModeloPiloto(int id, String nombres, String apellidos, int salario, String idEscuderia) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.salario = salario;
        this.idEscuderia = idEscuderia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getIdEscuderia() {
        return idEscuderia;
    }

    public void setIdEscuderia(String idEscuderia) {
        this.idEscuderia = idEscuderia;
    }
    
    
    
    
    
}
