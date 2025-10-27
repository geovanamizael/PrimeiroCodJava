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
		System.out.println("Aluno em recupera��o = " + media);
	}else {
		System.out.println("Aluno reprovado = " + media);
	}
/* PROBLEMA: M�ltiplos blocos 'if' independentes permitiam a
 *  impress�o de dois status (Aprovado e Reprovado). */
	
/* SOLU��O: Estruturei as condi��es com:  if - else if - else
 *  para garantir um �nico status final para a m�dia.*/
	}
}
