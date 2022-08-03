package guiJanela;

import javax.swing.*;

public class JanelaBasica extends JFrame{

	private static final long serialVersionUID = 1L;

	//construtor
	public JanelaBasica() {
		super();
		
	//janela
	JFrame janela = new JFrame();
	
	janela.setSize(300,300);
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	janela.setVisible(true);
	}
}
