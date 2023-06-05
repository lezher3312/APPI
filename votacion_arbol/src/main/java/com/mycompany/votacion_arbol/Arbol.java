/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.votacion_arbol;

/**
 *
 * @author josh
 */
public class Arbol {
    
    Nodo raiz;
    
    public Arbol(){
        raiz=null;
    }
    
    public void insert(int val, String contenido){
        Nodo nuevo= new Nodo(val);
        nuevo.contenido=contenido;
        
        if(raiz==null){
            raiz =nuevo;
        }
        else{
            Nodo auxiliar = raiz;
            while(auxiliar!=null){
                nuevo.raiz= auxiliar;
                if(nuevo.llave>=auxiliar.llave){
                    auxiliar=auxiliar.derecha;
                }
                else{
                    auxiliar=auxiliar.izquierda;
                }
            }
            
            if(nuevo.llave<nuevo.raiz.llave){
                nuevo.raiz.izquierda=nuevo;
            }
            else{
                nuevo.raiz.derecha= nuevo;
            }
            
        }
    }
    
    public void recorrido(Nodo nodo){
        if(nodo!=null){
            recorrido(nodo.izquierda);
            System.out.println("Key:"+nodo.llave+" Contenido:"+nodo.contenido);
            recorrido(nodo.derecha);
        }
    }
    
    
    private class Nodo{
        public Nodo raiz;
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;
        public String contenido;
        
        public Nodo(int key){
            llave=key;
            derecha=null;
            izquierda=null;
            raiz=null;
            contenido="";
            
            
            
        }
        
        
        
        
    }
    
}
