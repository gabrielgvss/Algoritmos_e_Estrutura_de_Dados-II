/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao02;
import lista.*;
/**
 *
 * @author dpf
 */
public class Main {
    public static void main(String[] args) {
         ListaEncadeada<Produto> lista = new ListaEncadeada<>();
         
         Produto p1 = new Produto("B",10);
         Produto p2 = new Produto("Z",980.98);
         Produto p3 = new Produto("M",3213);
         Produto p4 = new Produto("A",233);
         Produto p5 = new Produto("G",0.87);
         
         lista.inserir(lista.getTamanho()+1, p1);
         lista.inserir(lista.getTamanho()+1, p2);
         lista.inserir(lista.getTamanho()+1, p3);
         lista.inserir(lista.getTamanho()+1, p4);
         lista.inserir(lista.getTamanho()+1, p5);
         
         BubbleSortCrescente(lista,"valor decrescente");
         imprimeProduto(lista);
         
            
    }
         
     public static void imprimeProduto(ListaEncadeada<Produto> lista){
        for (int i = 0; i<lista.getTamanho(); i++){
            System.out.println(lista.get(i).getDescricao());
            System.out.println(lista.get(i).getId());
            System.out.println(lista.get(i).getValor());
            System.out.println();
        }
    }
     
    public static void BubbleSortCrescente(ListaEncadeada<Produto> lista, String comando){
        comando = comando.toUpperCase();
        
        if ("VALOR CRESCENTE".equals(comando)){
           int tamanho = lista.getTamanho();
        
            for (int j = 0; j<tamanho-1; j++){
                for (int i = 0; i<tamanho-1; i++){
                    if (lista.get(i).getValor() > lista.get(i+1).getValor()){
                        Produto aux = lista.get(i);
                        lista.set(i, lista.get(i+1));
                        lista.set(i+1, aux);
                    }
                }
            }
            
        }else if ("VALOR DECRESCENTE".equals(comando)){
            int tamanho = lista.getTamanho();
        
            for (int j = 0; j<tamanho-1; j++){
                for (int i = 0; i<tamanho-1; i++){
                    if (lista.get(i).getValor() < lista.get(i+1).getValor()){
                        Produto aux = lista.get(i);
                        lista.set(i, lista.get(i+1));
                        lista.set(i+1, aux);
                    }
                }
            }
            
        }else if ("ALFABETICA".equals(comando)){
           int tamanho = lista.getTamanho();

            for (int j = 0; j < tamanho - 1; j++) {
                for (int i = 0; i < tamanho - 1; i++) {
                    String descricao1 = lista.get(i).getDescricao();
                    String descricao2 = lista.get(i + 1).getDescricao();

                    // Compare as descrições alfabeticamente
                    if (descricao1.compareTo(descricao2) > 0) {
                        Produto aux = lista.get(i);
                        lista.set(i, lista.get(i + 1));
                        lista.set(i + 1, aux);
                    }
                }
            }

        }else{
            System.err.println("COMANDO DESCONHECIDO, TENTE NOVAMENTE COM 'ALFABETICA', 'VALOR DECRESCENTE' OU 'VALOR CRESCENTE'");
        }
        
    }
        
        
        
}
    

