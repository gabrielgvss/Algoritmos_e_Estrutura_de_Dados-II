/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao03;
import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList();
        
        preencherAleatorio(lista, 9);
        printa_lista(lista);
        System.out.println("ORDENADA? "+isOrdenada(lista));
        selection_sort(lista);
        printa_lista(lista);
        System.out.println("ORDENADA? "+isOrdenada(lista));
        
        System.out.println(calcular_mediana(lista));
        
    }
    
    public static boolean isOrdenada(ArrayList<Double> lista){
        for (int i = 0; i<lista.size()-1; i++){
            if (lista.get(i) > lista.get(i+1)){
                return false;
            }
        }
        return true;
    }
    
    public static void selection_sort(ArrayList<Double> lista){
        int tamanho = lista.size();
        
        for (int j = 0; j<tamanho-1; j++){//LAÇO QUE PERCORRE A LISTA
            int indice_do_minimo = j;
            
            for (int i = j; i<tamanho; i++){//ENCONTRANDO ÍNDICE DO MENOR ELEMENTO
                if (lista.get(i) < lista.get(indice_do_minimo)){
                    indice_do_minimo = i;
                }
            }
            
            if (lista.get(j) > lista.get(indice_do_minimo)){//TROCA DE POSIÇÕES ENTRE MENOR E MAIOR VALOR
                double aux = lista.get(j); 
                lista.set(j, lista.get(indice_do_minimo));
                lista.set(indice_do_minimo, aux);
            }
        }
    }
    
    public static void printa_lista(ArrayList<Double> lista){
        for (int i = 0; i<lista.size(); i++){
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
    
    public static double calcular_mediana(ArrayList<Double> lista){
        if (!isOrdenada(lista)){//CASO NÃO ESTEJA ORDENADA
            selection_sort(lista);
        }
        int indice_do_meio = lista.size()/2;
        double mediana;
        
        if (lista.size() % 2 == 0){//CASO O TAMANHO DE ELEMENTOS SEJA PAR
            mediana = (lista.get(indice_do_meio) + lista.get(indice_do_meio - 1) / 2);
            return mediana;
            
        }else{
            mediana = (lista.get(indice_do_meio));
            return mediana;
            
        }
    }
    
    public static void preencherAleatorio(ArrayList<Double> lista, int qtd_elem){
       Random random = new Random();
       
       for (int i = 0; i<qtd_elem; i++){
           int numero_aleatorio = random.nextInt(100);
           lista.add((double) numero_aleatorio);
       }
       
    }
}
    