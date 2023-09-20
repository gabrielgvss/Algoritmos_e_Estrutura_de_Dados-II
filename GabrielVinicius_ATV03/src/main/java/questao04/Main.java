/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dpf
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(5);
        lista1.add(4);
        lista1.add(7);
        lista1.add(10);

        List<Integer> lista2 = new ArrayList<>();
        lista2.add(0);
        lista2.add(4);
        lista2.add(5);
        lista2.add(3);
        lista2.add(7);
        lista2.add(2);
        lista2.add(1);

        ordenacao(lista1);
        ordenacao(lista2);

        System.out.println(lista1);
        System.out.println(lista2);
    }
    
    public static void ordenacao(List<Integer> lista) {
        List<Integer> impares = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();

        for (Integer num : lista) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }

       
        for (int i = 0; i < impares.size() - 1; i++) {
            for (int j = 0; j < impares.size() - i - 1; j++) {
                if (impares.get(j) < impares.get(j + 1)) {
                    int temp = impares.get(j);
                    impares.set(j, impares.get(j + 1));
                    impares.set(j + 1, temp);
                }
            }
        }

        for (int i = 0; i < pares.size() - 1; i++) {
            for (int j = 0; j < pares.size() - i - 1; j++) {
                if (pares.get(j) > pares.get(j + 1)) {
                    int temp = pares.get(j);
                    pares.set(j, pares.get(j + 1));
                    pares.set(j + 1, temp);
                }
            }
        }
        
        lista.clear();
        lista.addAll(impares);
        lista.addAll(pares);
    }
    
}
