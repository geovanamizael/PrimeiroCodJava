package cursojava.iniciando;

public class OperacoesLogicas {

	public static void main(String[] args) {

		int nota1 = 80; 
		int nota2 = 80;
		int nota3 = 80;
		int nota4 = 50;
		int media = 0;
		
	media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	if (media >= 70) {
		System.out.println("Aluno aprovado = " + media);
	} 
	else if (media >= 45 && media <= 69) {
		System.out.println("Aluno em recuperação = " + media);
	}else {
		System.out.println("Aluno reprovado = " + media);
	}
/* PROBLEMA: Múltiplos blocos 'if' independentes permitiam a
 *  impressão de dois status (Aprovado e Reprovado). */
	
/* SOLUÇÃO: Estruturei as condições com:  if - else if - else
 *  para garantir um único status final para a média.*/
	}
}
