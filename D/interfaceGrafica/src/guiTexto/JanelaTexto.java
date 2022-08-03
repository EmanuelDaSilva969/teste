package guiTexto;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;

public class JanelaTexto extends JFrame{

	private static final long serialVersionUID = 2L;

	private JTextArea texto;	
	
	public JanelaTexto() {
		super();
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		texto = new JTextArea();
		contentPane.add(texto, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public void insereLinha(String linha) {
		texto.append(linha +"\n");
	}
}

