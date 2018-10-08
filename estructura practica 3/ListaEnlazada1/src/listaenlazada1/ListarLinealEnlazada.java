/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada1;

import java.util.ArrayList;
//import javax.swing.JOptionPane;


/**
 *
 * @author Administrador
 */
public class ListarLinealEnlazada {

    public int start;

    private int nCantidadElementos = 0;

    ArrayList<Nodo> ListaLinealEnlazada;

    public void AumentarCantidadElementos() {
        this.nCantidadElementos++;
    }
    
    
    
    public static ArrayList<Nodo> DevuelveListaEnlazada(
            int nCantidadElementosIniciales,
            int nValorInicialDato,
            int nValorFinalDato,
            int nValorInicialEnlace,
            int nValorFinalEnlace) {
        ArrayList<Nodo> oLista = new ArrayList<Nodo>();

        //this.nCantidadElementos = nCantidadElementosIniciales;
        
        int enlace=0;
        int dato = 0;
        int aux =0;
        for (int i = 1; i <= nCantidadElementosIniciales; i++) {
            
            
            if (i == nCantidadElementosIniciales) {
                enlace = 0;
            } else
            {
                enlace=DevuleveNumeroAleatorio(nValorInicialEnlace, nValorFinalEnlace);
            
            }

            dato = DevuleveNumeroAleatorio(nValorInicialDato, nValorFinalDato);
            
            Nodo onodo = new Nodo(dato, enlace);
            
            
            if(i == 1)   {
                onodo.setPosicion(1);
                onodo.setStart(true);
            } else {
                onodo.setPosicion(aux);
                onodo.setStart(false);
            }
            
            aux=enlace;
            oLista.add(onodo);
            onodo = null;
              
        }
        return oLista;
    }

    public static int DevuleveNumeroAleatorio(int p_al_vmin, int p_al_vmax) {
        int nNumeroAleatorio = 0;

        nNumeroAleatorio = (int) (Math.random() * (p_al_vmax - p_al_vmin));

        return nNumeroAleatorio;
    }

    public ListarLinealEnlazada(ArrayList<Nodo> oLista, int p_inicio,
            int p_nCantidadElementos) {
        this.ListaLinealEnlazada = oLista;
        this.start = p_inicio;
        this.nCantidadElementos = p_nCantidadElementos;
    }
    
    public void ImprimirListaLinealEnlazadaOrdenada(ArrayList<Nodo> Lista)
    {
        
        
    }
    public void ImprimirLlistaLinealEnlazada() {
         int [] dato1 = new int [15];
         int [] pos1 = new int [15];
         int [] en1ace1 = new int [15];
         int x;
         int y;
         int aux1;
         int a = 0;
       // JOptionPane.showMessageDialog(null, Lista);
        int ptr = this.start;
        int i=1;
        
        while (ptr != 0) {
            pos1[a]= ptr;
            int aux = LeerEnlacePuntero(ptr);
            en1ace1[a]= aux;
            dato1[a] = LeerDatoPuntero(ptr); 
            ptr = aux;
            
            a++;
        }
        //ordenamiento burbuja
        for (x = 0; x < 15 -1; x++) {
            for (y = 0; y < 15-1 ; y++) {
                if (dato1[y ] > dato1[y+1]) {
                    aux1 = dato1[y ];
                    dato1[y ] = dato1[y+1];
                    dato1[y+1] = aux1;
                }
            }
        }
       
        for (a = 0; a < 15 ; a++) {
            
          System.out.println("( " + i +" ) ---- > " + "[ Posición : " + en1ace1[a]+ "" + " Dato : " +dato1[a] + " Enlace : " + pos1[a] + " ]" ); 
       i++;
        }
        System.out.println("Numero de Elementos Lista Lineal Enlazada : " + this.nCantidadElementos );
        
        
        //JOptionPane.showMessageDialog(null, Lista2);
    }
    
    
       public int DevolverDatoListaEnlazada( int n_correlativo)
    {
        // n_correlativo : es el orden donde se encuentra el dato.
        int dato = 0;
        
        int ptr = 0;
        ptr = start;
        int i = 1;
        boolean bevaluacion = true;
        
        while(ptr != 0 && bevaluacion == true)
        {
            if (i == n_correlativo) {
                dato = LeerDatoPuntero(ptr);
                bevaluacion = false;
            }
            ptr = LeerEnlacePuntero(ptr);
            i++;
        } 
        
        return dato;
    }

    public int LeerDatoPuntero(int ptr) {
        int dato = 0;
        for (Nodo onodo : ListaLinealEnlazada) {

            if (onodo.getPosicion() == ptr) {
                dato = onodo.getDato();
            }
        }
        return dato;
    }

    public int LeerEnlacePuntero(int ptr) {
        int enlace = 0;
        for (Nodo onodo : ListaLinealEnlazada) {

            if (onodo.getPosicion() == ptr) {
                enlace = onodo.getEnlace();
            }
        }
        return enlace;
    }
}
