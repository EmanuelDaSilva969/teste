package guiImagem;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;

public class JanelaImagem extends JFrame{

	private static final long serialVersionUID = 3L;
	
	public JanelaImagem(String arquivoImagem) {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		visual(arquivoImagem);
	}
	
	public void visual(String arquivoImagem) {
		setSize(250, 250);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		ImageIcon imagem = new ImageIcon(arquivoImagem);
		JLabel campoImagem = new JLabel(imagem);
		contentPane.add(campoImagem, BorderLayout.CENTER);
		
		setVisible(true);
	}
}
