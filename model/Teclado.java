
package model;

/**
 *
 * @author henriquegoebel
 */
public class Teclado extends Periferico{
    
    protected String layout;
    
    public Teclado(){
        
    }
   
    @Override
    public String getInformacoes(){
        return "\nMarca: " + marca + "\nCor: " + cor + "\nPreço: " + preco + "\nLayout:" + layout + "\n";
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    @Override
    public void cadastrar() {
    }
    
}
