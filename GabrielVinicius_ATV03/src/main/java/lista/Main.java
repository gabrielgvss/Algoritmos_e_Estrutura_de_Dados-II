package lista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\entradas\\Questao01.txt"));
            String linha = br.readLine();
            StringTokenizer st = new StringTokenizer(linha, ">");

            while (st.hasMoreTokens()) {
                int numero = Integer.parseInt(st.nextToken());
                lista.inserir(lista.getTamanho() + 1, numero);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        lista.imprimir();

        int quantidade_de_1 = conta1(lista.getInicio(), lista.getFim());
        System.out.println("\nQUANTIDADE DE 1: " + quantidade_de_1);
    }
    
    public static int conta1(No<Integer> inicio, No<Integer> fim) {
         int contador = 0;

        if (inicio == fim) {//Se o início = fim (quantidade de elementos ímpares)
            if (inicio.getElemento().equals(1)) {
                contador++;
            }
            return contador;
            
        }else if (inicio.getProximo() == fim) {//Se o próximo do início = fim (quantidade de elementos pares)
            if (inicio.getElemento().equals(1)) {
                contador++;
            }
            if (fim.getElemento().equals(1)) {
                contador++;
            }
            return contador;
        }

        if (inicio.getElemento().equals(1)) {
            contador++;
        }
        
        if (fim.getElemento().equals(1)){
            contador++;
        }

        return contador + conta1(inicio.getProximo(), fim.getAnterior());
    }
}
