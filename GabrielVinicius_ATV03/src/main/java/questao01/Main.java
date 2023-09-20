/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao01;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dpf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void mergeSort(List<Integer> lista){
        int tamanho = lista.size();
        if (tamanho > 1){
            int meio = tamanho/2;
            List<Integer> esquerda = lista.subList(0, meio);
            List<Integer> direita = lista.subList(meio, tamanho);
            
            mergeSort(esquerda);
            mergeSort(direita);
            
            merge(lista, esquerda, direita);
            
        }
    }
    
    public static void merge(List<Integer> lista, List<Integer> sublistaEsq, List<Integer> sublistaDir){
        int tamanhoEsq = sublistaEsq.size();
        int tamanhoDir = sublistaDir.size();
        int i = 0, j = 0, k = 0;
        
        while (i < tamanhoEsq && j < tamanhoDir) {
            if (sublistaEsq.get(i) <= sublistaDir.get(j)) {
                lista.set(k, sublistaEsq.get(i));
                i++;
            } else {
                lista.set(k, sublistaDir.get(j));
                j++;
            }
            k++;
        }

        while (i < tamanhoEsq) {
            lista.set(k, sublistaEsq.get(i));
            i++;
            k++;
        }

        while (j < tamanhoDir) {
            lista.set(k, sublistaDir.get(j));
            j++;
            k++;
        }
    }
     
    
    public static void quickSort(ArrayList<Integer> lista, int inicio, int fim){
        if (inicio < fim){
            int indice_pivo = particionar(lista, inicio, fim);
            quickSort(lista, inicio, indice_pivo - 1);
            quickSort(lista, indice_pivo + 1, fim);
                     
        }
    }
    
    public static int particionar(ArrayList<Integer> lista, int inicio, int fim){
        int pivo = lista.get(fim); //Convenção de utilizar último elem como pivo
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++){
            if (lista.get(j) <= pivo){
                i++;
                int auxiliar = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, auxiliar);
                
            }
        }
        int auxiliar = lista.get(i+1);
        lista.set(i+1, lista.get(fim));
        lista.set(fim, auxiliar);
        
        return i+1;
       
    }
    
        
    
}
