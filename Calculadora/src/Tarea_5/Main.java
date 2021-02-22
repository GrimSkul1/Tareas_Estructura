package Tarea_5;

public class Main {

	public static void main(String args[]) {
        System.out.println("Comenzamos");
          listaDoble n1=new listaDoble();
          
          System.out.println("insertar  2-20");
          n1.add(2,20);
          n1.listar();
          
          System.out.println("insertar 1-10");
          n1.add(1,10);
          n1.listar();
          System.out.println("insertar  3-15");
          n1.add(30,150);
        n1.listar();
       System.out.println("insertar  0-40");
       n1.add(0,40);
      n1.listar();
      
    }
}
