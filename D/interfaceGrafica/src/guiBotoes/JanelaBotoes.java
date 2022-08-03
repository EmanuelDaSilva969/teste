package guiBotoes;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;

public class JanelaBotoes extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public JanelaBotoes(){
	super();
	
	setSize(500, 500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	Container contentPane = getContentPane();
	contentPane.setLayout(new BorderLayout());
	
	JButton botao1 = new JButton("Esquerda");
	contentPane.add(botao1, BorderLayout.WEST);
	
	JButton botao2 = new JButton("Centro");
	contentPane.add(botao2, BorderLayout.CENTER);
	
	JButton botao3 = new JButton("Direita");
	contentPane.add(botao3, BorderLayout.EAST);
	
	setVisible(true);
	}
}
