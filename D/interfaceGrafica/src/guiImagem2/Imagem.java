package guiImagem2;

import javax.swing.*;

public class Imagem extends JLabel{

	private static final long serialVersionUID = 1L;

	public Imagem(String arquivoImagem) {
		super(new ImageIcon(arquivoImagem));
	}
}
