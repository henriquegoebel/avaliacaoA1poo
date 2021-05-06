
package model;

/**
 *
 * @author henriquegoebel
 */
public abstract class Periferico {
    
    public String marca;
    public String cor;
    public double preco;
   
    public Periferico(){
        
    }
    public abstract void cadastrar();
    
    public String getInformacoes(){
        return "\nMarca: " + marca + "\nCor: " + cor + "\nPreço: " + preco + "\n";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
