/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion02;

/**
 *
 * @author Marco
 */
public class Ordenamiento {
    
    // Burbuja
    // Seleccion
    // Shell
    // QuickSort
    
    public int[] DevuelveArreglo(int nValores,int nMinimo, int nMaximo){
        
        int[] numeros = new int[nValores];
        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = DevuelveNumeroAleatorio(nMinimo,nMaximo);
        }
        
        return numeros; 
    }
    
    private int DevuelveNumeroAleatorio(int nMinimo, int nMaximo)
    {
        int nValorDevuelto = 0;
        
        nValorDevuelto = (int) (Math.random()*(nMaximo - nMinimo));
        
        return nValorDevuelto;
    }
    
    public static void QuickSort(int[] vector, int izquierda,int derecha)
    {
        int pivote,i,j,auxintercambio =0;
        
        pivote= vector[izquierda];
        i = izquierda;
        j = derecha;
        auxintercambio =  0;
        
        while (i < j) {            
            
            while ( vector[i] <= pivote && i < j ) {
                i++;
            }
            while ( vector[j] > pivote  ) {
                j--;
            }
            if ( i < j ) {
                auxintercambio = vector[i];
                vector[i] = vector[j];
                vector[j] =  auxintercambio;
            } 
        }
        
        vector[izquierda] = vector[j];
        vector[j] = pivote;
        
        if ( izquierda < j - 1 ) {
                QuickSort(vector, izquierda, j-1);
            }
        if ( j +1  < derecha ) {
                QuickSort(vector, j+1, derecha);
            }
    }
    public static void burbuja(int[] vector) {
        int i, j, aux;
        for (i = 0; i < vector.length - 1; i++) {
            for (j = 0; j < vector.length - i - 1; j++) {
                if (vector[j + 1] < vector[j]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
}
    public static void insercionDirecta(int[] vector){
    int p, j;
    int aux;
    for (p = 1; p < vector.length; p++){ 
              aux = vector[p]; 
              j = p - 1; 
              while ((j >= 0) && (aux < vector[j])){                                                  
              vector[j + 1] = vector[j];      
              j--;                   
              }
              vector[j + 1] = aux; 
    }
}
    public static void shell(int[] vector){
   int salto, aux, i;
   boolean cambios;
   for(salto=vector.length/2; salto!=0; salto/=2){
           cambios=true;
           while(cambios){ 
                cambios=false;
                 for(i=salto; i< vector.length; i++) 
                     if(vector[i-salto]>vector[i]){ 
                      aux=vector[i]; 
                      vector[i]=vector[i-salto];
                      vector[i-salto]=aux;
                      cambios=true; 
                       }
                 }
            }
}
}
