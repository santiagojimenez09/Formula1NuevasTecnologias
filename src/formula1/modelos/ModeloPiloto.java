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
    private String fechaIn;
    private String fechaOut;

    public ModeloPiloto() {
    }

    public ModeloPiloto(int id, String nombres, String apellidos, int salario, String idEscuderia, String fechain, String fechaout) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.salario = salario;
        this.idEscuderia = idEscuderia;
        this.fechaIn = fechain;
        this.fechaOut = fechaout;
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

    public String getFechain() {
        return fechaIn;
    }

    public void setFechain(String fechain) {
        this.fechaIn = fechain;
    }

    public String getFechaout() {
        return fechaOut;
    }

    public void setFechaout(String fechaout) {
        this.fechaOut = fechaout;
    }
    
    
    
    
    
    
    
}
