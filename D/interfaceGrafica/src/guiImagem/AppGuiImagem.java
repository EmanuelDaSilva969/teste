package guiImagem;

public class AppGuiImagem {

	public static String DIRETORIO = 
			AppGuiImagem.class.getResource(".").getPath();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JanelaImagem(DIRETORIO + "dino.png" );
		
	}
}
