package cursojava.iniciando;

public class PrimeiraClasseJava {

	/*main é um metodo auto executavel em Java*/ 
	
	public static void main(String[] args) {

		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 50;
		double nota4 = 88;
		
		/*o INT foi subtituído pelo DOUBLE para apresentar números quebrados*/ 
	  /*também foi incluso a linha abaixo.*/
		
		double mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("Média das notas = " + (nota1 + nota2 + nota3 + nota4) /4 );
	}
}
