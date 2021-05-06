
package model;

/**
 *
 * @author henriquegoebel
 */
public class Mouse extends Periferico{
    
    private String tipoConexao;
    
    public Mouse(){
        
    }
  
    public String getInformacoes(){
        return "\nMarca: " + marca + "\nCor: " + cor + "\nPreço: " + preco + "\nTipo de Conexão: " + tipoConexao + "\n";
    }

    @Override
    public void cadastrar() {
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }
    
    
    
}
