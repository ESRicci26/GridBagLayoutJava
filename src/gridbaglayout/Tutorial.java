package gridbaglayout;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tutorial extends JPanel {

private final GridBagLayout layout; // LAYOUT desse frame
private final GridBagConstraints constraints; // restrições de layout

    
     public  Tutorial(){
         
        //TESTANDO GITHUB ALTERAÇÃO CÓDIGO 16/06/2021
        
        layout = new GridBagLayout();
        //setLayout(layout); // configura o layout de frame
        constraints = new GridBagConstraints(); // instancia restrições  
         
        
        
        JLabel JLabel001Nome = new JLabel("Nome"); //Instancia o botão JLabel
        constraints.fill = GridBagConstraints.BOTH;
        addComponent(JLabel001Nome, 0, 1, 1, 1); //Na LINHA 0 COLUNA 0  WIDTH (LARGURA) 1 HEIGHT(ALTURA) 3 fica o botão no layout GridBagLayout

        JTextField JTF1Nome = new JTextField(20);
        addComponent(JTF1Nome, 0, 2, 1, 1); //Na LINHA 3 COLUNA 0  WIDTH (LARGURA) 2 HEIGHT(ALTURA) 1 fica o botão no layout GridBagLayout

        
        JLabel JLabel002Fone = new JLabel("Telefone"); //Instancia o botão JLabel
        constraints.fill = GridBagConstraints.BOTH;
        addComponent(JLabel002Fone, 1, 1, 1, 1); //Na LINHA 0 COLUNA 0  WIDTH (LARGURA) 1 HEIGHT(ALTURA) 3 fica o botão no layout GridBagLayout

        JTextField JTF1Fone = new JTextField(20);
        addComponent(JTF1Fone, 1, 2, 1, 1); //Na LINHA 3 COLUNA 0  WIDTH (LARGURA) 2 HEIGHT(ALTURA) 1 fica o botão no layout GridBagLayout

        JButton JB001Entrar = new JButton("ENTRAR");
        // weightx e weighty para button1 são 0: o padrão
        constraints.fill = GridBagConstraints.HORIZONTAL;
        addComponent(JB001Entrar, 3, 1, 1, 1); //Na LINHA 0 COLUNA 1  WIDTH (LARGURA) 2 HEIGHT(ALTURA) 1 fica o botão no layout GridBagLayout

         JButton JB002Excluir = new JButton("EXCLUIR");
        // weightx e weighty para button1 são 0: o padrão
        constraints.fill = GridBagConstraints.HORIZONTAL;
        addComponent(JB002Excluir, 3, 2, 1, 1); //Na LINHA 0 COLUNA 1  WIDTH (LARGURA) 2 HEIGHT(ALTURA) 1 fica o botão no layout GridBagLayout

        
        
        
}

     
     private void addComponent(Component component, int row, int column, int width, int height) {

        constraints.gridx = column;  //COLUNA
        constraints.gridy = row; //LINHA
        constraints.gridwidth = width; //LARGURA
        constraints.gridheight = height; //ALTURA
        layout.setConstraints(component, constraints); // configura constraints
        add(component); // adiciona componente
    }

    
public static void main(String[] args){

    
Tutorial t = new Tutorial();
JFrame jf = new JFrame();
jf.setTitle("Tutorial");
jf.setSize(500,150);//Largura/Altura
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setVisible(true);
jf.add(t);


    

    }

    
}

