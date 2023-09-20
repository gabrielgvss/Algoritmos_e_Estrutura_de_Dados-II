/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dpf
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(0);
        lista1.add(2);
        lista1.add(0);
        lista1.add(3);
        lista1.add(0);
        lista1.add(5);
        lista1.add(6);
        lista1.add(0);
        lista1.add(0);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(8);
        lista2.add(9);
        lista2.add(10);
        lista2.add(15);

        juntarArrays(lista1, lista2);

        System.out.println(lista1);
    }
    
    public static void juntarArrays(List<Integer> lista1, List<Integer> lista2){
        int tamanho_l1 = 0;
        
        for (int i = 0; i < lista1.size(); i++){
            if (lista1.get(i) != 0){
                lista1.set(tamanho_l1++, lista1.get(i));
                
            }
        }
        
        int[] vetor = new int[tamanho_l1 + lista2.size()];
        int i = 0, j = 0, k = 0;
        
        while (i<tamanho_l1 && j <lista2.size()){
            if (lista1.get(i) < lista2.get(j)){
                vetor[k++] = lista1.get(i++);
                
            }else{
                vetor[k++] = lista2.get(j++);
                
            }
        }
        
        while (i < tamanho_l1){
            vetor[k++] = lista1.get(i++);
            
        }
        while (j < lista2.size()){
            vetor[k++] = lista2.get(j++);
            
        }
        for (i = 0; i < tamanho_l1 + lista2.size(); i++){
            lista1.set(i, vetor[i]);
        }
    }
    
}
