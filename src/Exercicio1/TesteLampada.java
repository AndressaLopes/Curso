package Exercicio1;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		Lampada lampada2 = new Lampada("Amarela");
		Lampada lampada3 = new Lampada("Branca", true);
		
		
		/*lampada.setCor("Branca");
		lampada.setLigada(true);*/
		
		System.out.println("Cor: " + lampada.getCor() + "\nEstado: " + lampada.getLigada());
		System.out.println("Cor: " + lampada2.getCor());
		System.out.println("Cor: " + lampada3.getCor() + "\nEstado:" + lampada3.getLigada());
		
	}

}
