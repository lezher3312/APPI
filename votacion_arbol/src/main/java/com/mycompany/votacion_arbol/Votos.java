/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.votacion_arbol;

/**
 *
 * @author josh
 */
public class Votos {
    int id;
    String candidato,departamento,municipio;
    int mesa, voto; 
    public static int tam;
    int clave;

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    public Votos(){
        
    }

    public Votos(int id, String candidato, String departamento, String municipio, int mesa, int voto) {
        this.id = id;
        this.candidato = candidato;
        this.departamento = departamento;
        this.municipio = municipio;
        this.mesa = mesa;
        this.voto = voto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    @Override
    public int hashCode() {
        long hash = candidato.hashCode()+ municipio.hashCode();
        
        if(hash<0){
            hash= hash*-1;
        }
           
        
        
        return (int) hash % tam; 
    }
    
    
    
    
    
}
