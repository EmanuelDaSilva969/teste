package guiImagem2;

public class AppGuiImagensLayout {

	public static String DIRETORIO = AppGuiImagensLayout.class.getResource(".").getPath();	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JanelaImagem janela = new JanelaImagem();
		
		janela.adcionaImagem(new Imagem(DIRETORIO + "dino.png"));
		janela.adcionaImagem(new Imagem(DIRETORIO + "dino.png"));
		
	}

}
