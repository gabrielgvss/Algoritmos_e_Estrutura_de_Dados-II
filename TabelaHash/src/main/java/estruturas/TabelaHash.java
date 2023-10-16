/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturas;

/**
 *
 * @author dpf
 * @param <T>
 */
public class TabelaHash <T>{
    private final ListaEncadeada<T>[] vetorHash;
    private final int capacidade = 19;
    
    public TabelaHash() {
        this.vetorHash = new ListaEncadeada[this.capacidade];
        for (int i = 0; i < this.capacidade; i++) {
            this.vetorHash[i] = new ListaEncadeada<>();
        }
        
    }

    
    private int codigoASCII(char caracter){
        return (int) caracter;
    } 
    
    private int funcaoHash(T chave){
        int a = 7;
        String chave_str = chave.toString();
        int somaHash = 0;
        
        //codHash = (c0*a^(k-1) + c1*a^(k-2) + c2*a^(k-3)...) 
        for (int i = 0; i<chave_str.length(); i++){
            int codASCII = codigoASCII(chave_str.charAt(i));
            somaHash+=codASCII * Math.pow(a, chave_str.length()-(i+1));
        }
        
        int valor = somaHash % this.capacidade;  
        return valor;
    }
    
    private boolean buscaChave(T chave, int valor){
        for (int i = 0; i<vetorHash[valor].getTamanho(); i++){
            if (vetorHash[valor].get(i).equals(chave)){
                return true;
            }
        }
        return false;
    }
    
    public void inserir(T chave){
        int valor = funcaoHash(chave);
        
        if (!buscaChave(chave, valor)){
            vetorHash[valor].inserirFim(chave);
            
        }else{
            System.out.println("CHAVE JÁ PRESENTE NA TABELA HASHING");
            
        }
    }
    
    public void buscar(T chave){
        if (buscaChave(chave, funcaoHash(chave))){
            System.out.println("CHAVE EXISTENTE NA TABELA HASHING");
            
        }else{
            System.err.println("CHAVE NÃO ENCONTRADA NA TABELA HASHING");
        }
    }
    
    public void remover (T chave){
        int valor = funcaoHash(chave);
        
        if (!buscaChave(chave, valor)){
            System.out.println("CHAVE A EXCLUIR INEXISTENTE NA TABELA HASHING");
                 
        }else{
            for (int i = 0; i < vetorHash[valor].getTamanho(); i++) {
                if (vetorHash[valor].get(i).equals(chave)) {
                    vetorHash[valor].excluir(i);
                    System.out.println("CHAVE REMOVIDA COM SUCESSO");
                    
                }
            }
        }
    }
    
    public void imprimir(){
        for (int i = 0; i<this.capacidade; i++){
            if(vetorHash[i] == null){
                System.out.println("Bucket "+i+": null");
                
            }else{
                System.out.print("Bucket"+i+": ");
                for (int j = 0; j<vetorHash[i].getTamanho(); j++){
                    System.out.print(vetorHash[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
    
    
    
    
}
