package cursojava.iniciando;

public class OperadoresTernarios {

	public static void main(String[] args) {
		
		/*OPERADORES TERNARIOS*/
		/*s�o utilizados para micro-valida��es*/
		
		int nota1 = 50;
		int nota2 = 80;
		int nota3 = 80;
		int nota4 = 10;
		int media = 0; /*n�o esquecer desse!!!! */
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		String saidaResultado;
		
		/*saidaResultado = media >= 70? "Aluno Aprovado" : "Aluno Reprovado";
		System.out.println(saidaResultado);*/
		
		/*voc� ainda pode diminuir:
		 *  String saidaResultado = media >= 70? "Aluno Aprovado" : "Aluno Reprovado";
		System.out.println(saidaResultado); **/
		
		/* : significa o else.   e o ? sempre vai ser a pergunta da condi��o.*/
		
		saidaResultado = media >= 70? "Aluno Aprovado" : (media >=40 && media <=69)? "Aluno em Recupera��o" : "Aluno Reprovado";
		System.out.println(saidaResultado + ":" + media);
		
	}

}
