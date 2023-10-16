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
public class ListaEncadeada<T> {//CLASSE DA LISTA ENCADEADA
    private int tamanho;//Diz o tamanho da lista
    private No<T> inicio;//Aponta para o início
    private No<T> fim;//Aponta para o fim
    
    public ListaEncadeada(){//Inicializa/Construtor
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
        
    }

    public No<T> getInicio() {
        return this.inicio;
    }
  
    public void setInicio(No<T> inicio) {
        this.inicio = inicio;
    }

    public No<T> getFim() {
        return this.fim;
    }

    public void setFim(No<T> fim) {
        this.fim = fim;
    }
    
    public int getTamanho(){
        return this.tamanho;
               
    }
    
    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
        
    }
    
    public void inserir(int posicao, T elemento){
        No<T> novo_no = new No<>(elemento);
        
        if (posicao <= 0 || posicao > this.getTamanho()+1){
            throw new IllegalArgumentException("Posição inválida");
            
        }else{
            if (this.getFim() == null){//Lista Vazia
                this.setInicio(novo_no);
                this.setFim(novo_no);
            
            }else if (posicao == 1){//Primeiro da lista
                novo_no.setProximo(inicio);//Novo nó tem como próximo item o ex primeiro nó
                this.getInicio().setAnterior(novo_no);//Ex primeiro nó tem como item anterior o novo nó
                this.setInicio(novo_no);//Primeiro nó agora passa a ser oficialmente o novo nó
            
            
            }else if (posicao == this.getTamanho()+1){//Último da lista
                this.getFim().setProximo(novo_no);
                novo_no.setAnterior(this.getFim());
                this.setFim(novo_no);
            
            }else{
                No<T> anterior = this.getInicio(); //Criação de um nó genérico para percorrer a lista e ser o anterior ao nó que será inserido
                
                for (int i = 1; i<posicao; i++){
                    anterior = anterior.getProximo(); //Atual percorre a lista com base no elemento posterior a ele até chegar na posiçã desejada    
                }
            
                No<T> proximo = anterior.getProximo(); //Criação de um nó para ser o posterior ao nó que será inserido;
            
                novo_no.setAnterior(anterior);
                novo_no.setProximo(proximo);
            
                //Nós genéricos criados serão ajustados conforme a inserção completa do novo nó
                proximo.setAnterior(novo_no);
                anterior.setProximo(novo_no);
            }
            this.setTamanho(this.getTamanho() + 1);
        }
        
    }
    
    public void inserirFim(T elemento){
        this.inserir(getTamanho()+1, elemento);
    }
    
    public String buscar(T elemento){
        No<T> atual = this.getInicio();
        int posicao = 0;
        
        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return elemento.toString();
                
            }
        
            atual = atual.getProximo();
            posicao++;
        }
    
    return "NÃO ENCONTRADO";
    }
    
    public T get(int posicao) {
        if (posicao < 0 || posicao >= this.getTamanho()) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        No<T> noAtual = this.getInicio();
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual.getElemento();
    }
    
    /**
     *
     * @param posicao
     * @param elemento
     */
    public void set(int posicao, T elemento){
        if (posicao < 0 || posicao >= this.getTamanho()){
            throw new IndexOutOfBoundsException("Posição Inválida");
        }
        
        No<T> atual = this.getInicio();
        for (int i = 0; i < posicao; i++){
            atual = atual.getProximo();
        }
        
        atual.setElemento(elemento);
    }
    
    public void excluir(int posicao){
        if (posicao < 0 || posicao > this.getTamanho()){
            throw new IllegalArgumentException("Posição Inválida");
            
        }else{
            No<T> atual = this.getInicio();
            
            for (int i = 1; i < posicao; i++){
                atual = atual.getProximo();
            }
            
            No<T> anterior = atual.getAnterior();
            No<T> proximo = atual.getProximo();
            
            if (anterior != null){
                anterior.setProximo(proximo);
                
            }else{
                this.setInicio(proximo);
                
            }
            
            if (proximo != null){
                proximo.setProximo(proximo);
                
            }else{
                this.setFim(anterior);
                
            }
            this.setTamanho(this.getTamanho() - 1);
            
        }
    }
        
    public void imprimir(){
        No<T> atual = this.getInicio();
        
        for (int i = 1; i <= this.getTamanho(); i++){
            System.out.print(atual.getElemento() + " ");
            atual = atual.getProximo();
            
        }
    }
        
        
            
 }
        
     

