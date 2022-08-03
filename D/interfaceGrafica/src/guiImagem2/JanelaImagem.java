package guiImagem2;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Container;

public class JanelaImagem extends JFrame{

	private static final long serialVersionUID = 1L;
	private Container painel; 

	public JanelaImagem(){
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		visual();
	}
	
	public void visual() {
		setSize(500, 500);
		
		painel = getContentPane();
		painel.setLayout(new FlowLayout());
		
		setVisible(true);
	}
	
	public void adcionaImagem(Imagem img) {
		painel.add(img);
		SwingUtilities.updateComponentTreeUI(this);
		
		
	}
	
	
}
