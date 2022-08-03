package teste;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;;

public class JanelaImagem extends JFrame{

	private static final long serialVersionUID = 1L;
	
	public JanelaImagem(String arquivoImagem){
		super();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		visivel(arquivoImagem);
	}
	
	public void visivel(String arquivoImagem) {
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		JButton botao1 = new JButton("fasfasfas");
		contentPane.add(botao1, BorderLayout.EAST);
	}

	
	
	
	
}
