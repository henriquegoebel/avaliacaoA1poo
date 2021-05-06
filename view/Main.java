
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Mouse;
import model.Teclado;

/**
 *
 * @author henriquegoebel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String opcao = "s";
        
        List<Teclado> listaTeclado = new ArrayList<>();
        List<Mouse> listaMouse = new ArrayList<>();
        
        while(!opcao.equalsIgnoreCase("n")){
            String texto;
            texto = "Digite sue opção: \n" +
                    "1 - Adicionar Teclado \n" +
                    "2 - Remover Teclado \n" + 
                    "3 - Listar Teclados \n" +
                    "\n" +
                    "4 - Adicionar Mouse \n" +
                    "5 - Remover Mouse \n" + 
                    "6 - Listar Mouse \n" +
                    "\n" +
                    "n - Sair ";
            opcao = JOptionPane.showInputDialog(texto);
            
            switch (opcao){
                case "1": 
                    Teclado t = new Teclado();
                    String marcaT = JOptionPane.showInputDialog("Marca do Teclado:");
                    t.setMarca(marcaT);
                    
                    String corT = JOptionPane.showInputDialog("Cor do Teclado:");
                    t.setCor(corT);
                    
                    String precoT = JOptionPane.showInputDialog("Preço do Teclado:");
                    precoT = precoT.replace(",",".");
                    t.setPreco(Double.valueOf(precoT));
                    
                    String layoutT = JOptionPane.showInputDialog("Layout do Teclado: ");
                    t.setLayout(layoutT);
                    
                    listaTeclado.add(t);
                    
                    break;
                    
                case "2": 
                    int posicaoT = Integer.valueOf(JOptionPane.showInputDialog("Informe a posição que deseja remover:"));
                    listaTeclado.remove(posicaoT);
                    break;
                    
                case "3":
                    String conteudoT = "";
                    for (Teclado teclado : listaTeclado) {
                        conteudoT += teclado.getInformacoes() + "\n";
                       
                    }
                    JOptionPane.showConfirmDialog(null, conteudoT);
                    break;
                    
                case "4": 
                    Mouse m = new Mouse();
                    String marcaM = JOptionPane.showInputDialog("Marca do Mouse:");
                    m.setMarca(marcaM);
                    
                    String corM = JOptionPane.showInputDialog("Cor do Mouse:");
                    m.setCor(corM);
                    
                    String precoM = JOptionPane.showInputDialog("Preço do Mouse:");
                    precoT = precoM.replace(",",".");
                    m.setPreco(Double.valueOf(precoT));
                    
                    String tipoConexaoM = JOptionPane.showInputDialog("Tipo de Conexão do Mouse: ");
                    m.setTipoConexao(tipoConexaoM);
                    
                    listaMouse.add(m);
                    
                    break;
                    
                case "5": 
                    int posicaoM = Integer.valueOf(JOptionPane.showInputDialog("Informe a posição que deseja remover:"));
                    listaMouse.remove(posicaoM);
                    break;
                    
                case "6":
                    String conteudoM = "";
                    for (Mouse mouse : listaMouse) {
                        conteudoM += mouse.getInformacoes() + "\n";
                       
                    }
                    JOptionPane.showConfirmDialog(null, conteudoM);
                    break;
                    
                case "n":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Incorreta");
            }           
    
        }
    }
    
}
