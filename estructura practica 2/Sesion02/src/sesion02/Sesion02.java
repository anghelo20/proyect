/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion02;

import javax.swing.JOptionPane;  

/**
 *
 * @author Marco
 */
public class Sesion02 { 

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 
        int op;
        int nCantidadDatos = 0;
        
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog("elige una opcion\n1.1000\n2.25000\n3.50000\n4.100000\n5.250000\n6.500000\n7.750000\n8.1000000" +" "));
                if(op < 1 || op > 8){
                   System.out.println("la opcion elegida es incorecta,elgia de nuevo"); 
                }
               
            } while (op < 1 || op > 8);

            switch (op) {
                   case 1: 
                 nCantidadDatos = 1000;
                    break;
                    case 2: 
                 nCantidadDatos = 25000;
                    break;
                    case 3: 
                 nCantidadDatos = 50000;
                    break;
                    case 4: 
                 nCantidadDatos = 100000;
                    break;
                    case 5: 
                 nCantidadDatos = 250000;
                    break;
                    case 6: 
                 nCantidadDatos = 500000;
                    break;
                    case 7: 
                 nCantidadDatos = 750000;
                    break;
                    case 8: 
                 nCantidadDatos = 1000000;
                    break;
              default:  
            }
      
        
       
        int nValorMinimo =  Integer.parseInt(JOptionPane.showInputDialog(null, "digite el valor minimo "));;
        int nValorMaximo =  Integer.parseInt(JOptionPane.showInputDialog(null, "digite el valor maximo "));;
        String lista ="";

        int[] oArreglo = new int[nCantidadDatos];
        
        Ordenamiento oClsOrdenamiento = new Ordenamiento();
        
        System.out.println("Ejemplo Ordenamiento\n");
        
        oArreglo = oClsOrdenamiento.DevuelveArreglo(nCantidadDatos, nValorMinimo, nValorMaximo);
        
       // Impresion de Arreglo
       System.out.println("\n");
       System.out.print("Arreglo Aleatorio\n");
        for (int n : oArreglo) {
            System.out.print( " " + n);
        }
        //
        
        long nInicioTiempo = System.currentTimeMillis();
        
        Ordenamiento.QuickSort(oArreglo, 0, oArreglo.length - 1);
        
        long nRetardoTiempo = System.currentTimeMillis() - nInicioTiempo ;
        System.out.println("\n");
        // Ordenamiento por QuickSort
        System.out.println("Arreglo Ordenado por quicksort\n");
          for (int n : oArreglo) {
            System.out.print( " " + n);
        }
       
        System.out.println("\n");
        System.out.println("tiempo transcurrido antes del ordenamiento: 0 milisegundos ");
        System.out.println("tiempo transcurrido despues del ordenamiento: "+nRetardoTiempo+" milisegundos");
        
        
        
        
          
       long nInicioTiempo1 = System.currentTimeMillis();
        
        Ordenamiento.burbuja(oArreglo);
        
        long nRetardoTiempo1 = System.currentTimeMillis() - nInicioTiempo1 ;
        System.out.println("\n");
        // Ordenamiento por BURBUJA
        System.out.println("Arreglo Ordenado por burbuja\n");
          for (int n : oArreglo) {
            System.out.print( " " + n);
        }
        System.out.println("\n");
        System.out.println("tiempo transcurrido antes del ordenamiento: 0 milisegundos ");
        System.out.println("tiempo transcurrido despues del ordenamiento: "+nRetardoTiempo1+" milisegundos");
        
        
          
          
          long nInicioTiempo2 = System.currentTimeMillis();
        
        Ordenamiento.insercionDirecta(oArreglo);
        
        long nRetardoTiempo2 = System.currentTimeMillis() - nInicioTiempo2 ;
        System.out.println("\n");
        // Ordenamiento por BURBUJA
        System.out.println("Arreglo Ordenado por insercion Directa");
          for (int n : oArreglo) {
            System.out.print( " " + n);
        }
    
        System.out.println("\n");
        System.out.println("tiempo transcurrido antes del ordenamiento: 0 milisegundos ");
        System.out.println("tiempo transcurrido despues del ordenamiento: "+nRetardoTiempo2+" milisegundos");
        
        
          
          
          
           long nInicioTiempo3 = System.currentTimeMillis();
        
        Ordenamiento.shell(oArreglo);
        
        long nRetardoTiempo3 = System.currentTimeMillis() - nInicioTiempo3 ;
         System.out.println("\n");
        // Ordenamiento por BURBUJA
        System.out.println("Arreglo Ordenado por shell ");
          for (int n : oArreglo) {
            System.out.print( " " + n);
        }
 
        System.out.println("\n");
        System.out.println("tiempo transcurrido antes del ordenamiento : 0 milisegundos ");
        System.out.println("tiempo transcurrido despues del ordenamiento : "+nRetardoTiempo3+" milisegundos");
        
        lista = lista + "┌──────────────── ┐\n" ;
        lista = lista + "│ Cantidad de registros:  "+nCantidadDatos+"                   │\n" ;
        lista = lista + "│──────────────── │\n" ;
        lista = lista + "│  Quicksort  │    "+nRetardoTiempo+" milisegundos        │\n" ; 
        lista = lista + "│                      │                                            │\n" ; 
        lista = lista + "│  Burbuja      │    "+nRetardoTiempo1+" milisegundos    │\n" ; 
        lista = lista + "│                      │                                            │\n" ; 
        lista = lista + "│  Insercion  │    "+nRetardoTiempo2+" milisegundos            │\n" ; 
        lista = lista + "│                      │                                            │\n" ; 
        lista = lista + "│  Shell           │    "+nRetardoTiempo3+" milisegundos           │*\n" ; 
        lista = lista + "└──────────────── ┘ \n" ;
        
         JOptionPane.showMessageDialog(null,lista);
    }
    
}
