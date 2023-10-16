/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao01;
import estruturas.*;

/**
 
 * @author dpf
 */
public class Main {
    public static void main(String[] args) {
        TabelaHash<String> tabelahash = new TabelaHash<>();
        tabelahash.inserir("A");
        tabelahash.inserir("B");
        tabelahash.inserir("C");
        tabelahash.inserir("D");
        tabelahash.inserir("1");
        tabelahash.inserir("2");
        tabelahash.inserir("3");
        
        tabelahash.imprimir();
        
    }
    
}
