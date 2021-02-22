package Tarea_5;

import java.util.Collection;
import java.util.List;

public class listaDoble {

	private Nodo primero;
	private Nodo ultimo;
	private int numElementos;
	

	public listaDoble() {
		primero = null;
		ultimo = null;
		numElementos = 0;
	}
	
	public void add(int elemento) {  
 
		Nodo nuevo = new Nodo((Integer) null, elemento, null,null);
  
		 if (primero == null){
		        primero=nuevo;
		        ultimo=nuevo;
		 }else {  
       
			ultimo.siguiente = nuevo;    
			nuevo.anterior = ultimo;  
           
            ultimo = nuevo;  
           
            ultimo.siguiente = null;  
        }  
    }  
	
	public void add(int indice,int elemento){
	     Nodo nuevo = new Nodo(indice,elemento, null,null);
	
	    if (primero == null){
	        primero=nuevo;
	        ultimo=nuevo;
	    }
	   
	    else if (primero.getSiguiente()==null){
	         
	        if (primero.getElemento1()<indice){
	            primero.setSiguiente(nuevo);
	        }else{
	            nuevo.setSiguiente(primero);
	            primero=nuevo;
	        }
	       
	        if ( ultimo.getElemento2()>elemento){
	            ultimo.setAnterior(nuevo);
	            
	        }else{
	            nuevo.setAnterior(ultimo);
	            ultimo=nuevo;
	        }
	    }
	   
	    else{
	        
	             Nodo actual = primero;
	            
	            if (primero.getElemento1()>indice){
	            nuevo.setSiguiente(primero);
	            primero=nuevo;
	            }
	            else{
	                while (actual.getSiguiente()!=null ){

	                if(actual.getSiguiente().getElemento1() > indice)
	                {
	                    nuevo.setSiguiente(actual.getSiguiente());
	                   
	                    actual.setSiguiente(nuevo);
	                   
	                    actual=nuevo.getSiguiente();
	                    
	                }else{
	                actual = actual.getSiguiente();
	            }
	                }
	                
	            if (actual.getSiguiente()==null && actual.getElemento1()<indice){
	            actual.setSiguiente(nuevo);
	            }
	            }
	            actual=ultimo;
	            
	            if (ultimo.getElemento2()<elemento){
	                nuevo.setAnterior(ultimo);
	                ultimo=nuevo;
	            }else{
	                while (actual.getAnterior()!=null ){
	                
	                
	                if(actual.getAnterior().getElemento2() < elemento)
	                {
	                    nuevo.setAnterior(actual.getAnterior());
	                    actual.setAnterior(nuevo);
	                    actual=nuevo.getAnterior();
	                    
	                }else{
	                actual = actual.getAnterior();
	                }
	                }
	                
	            if (actual.getAnterior()==null && actual.getElemento2()>elemento){
	                actual.setAnterior(nuevo);
	            
	            }
	        }
	        }
	    }
	
	public void clear() {
	    Nodo e = primero.siguiente;
	    while (e != primero) {
	    	Nodo siguiente = e.siguiente;
	        e.siguiente = e.anterior = null;
	        e.elemento2 = (Integer) null;
	        e = siguiente;
	    }
	    primero.siguiente = primero.anterior = primero;
	}
	
	public void listar(){
	     Nodo actual = primero;
	   
	    System.out.println("Listar desde primero");
	     while (actual.getSiguiente()!= null){
	        System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
	        actual = actual.getSiguiente();
	    
	    }
	    System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
	    
	    actual = ultimo;
	   System.out.println("Listar desde ultimo");
	    
	     while (actual.getAnterior()!= null){
	        System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
	        actual = actual.getAnterior();
	    
	    }
	    System.out.println(actual.getElemento1()+"--"+actual.getElemento2());
	    
	   
	}
	

}
