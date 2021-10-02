/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julio
 */
public class PilaArray implements IPila {
   
    private static final int TOP = -1;
    private Object s[];
    private int capacidad = 0;

    public PilaArray() {
        this(1000);
    }

    public PilaArray(int cap) {
        capacidad = cap;
        s = new Object[capacidad];
    }
    public int Longitud(){
        return(TOP+1);
    }
    @Override
    public boolean esVacia(){
        return(TOP<0);
    }
    @Override
    public void push(Object o){
        
    }
    @Override
    public Object pop(){
        return null;
    }
    @Override
    public Object primero(){
        return null;
    }
}

