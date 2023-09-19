/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao02;
import java.util.Random;

/**
 *
 * @author dpf
 */
public class Produto {
    private int id;
    private String descricao;
    private double valor;
    
    public void geraID(){
        Random random = new Random();
        this.setId(random.nextInt());
        
    }

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
        geraID();
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
