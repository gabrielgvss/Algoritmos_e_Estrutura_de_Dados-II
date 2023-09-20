/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;
/**
 *
 * @author dpf
 * @param <T>
 */
public class No <T> {
    private T elemento;
    private No<T> anterior;
    private No<T> proximo;
    
    public No(T elemento){
        this.elemento = elemento;
        this.anterior = null;
        this.proximo = null;
        
    }
    
    public T getElemento(){
        return this.elemento;
        
    }
    
    public void setElemento(T elemento){
        this.elemento = elemento;
        
    }
    
    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    
    
}
