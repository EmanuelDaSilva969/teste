package teste;

public class AppJanelaImagem {
	public static String DIRETORIO = AppJanelaImagem.class.getResource(".").getPath();
	
	public static void main(String[] args) {
		new JanelaImagem(DIRETORIO + "dino.png");
	}
}
