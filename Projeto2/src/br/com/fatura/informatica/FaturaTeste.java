/*****************************************************************************************************************
* Prova T�cnica Java --> Projeto 2 --> By Jefferson Itajahy
*****************************************************************************************************************/
package br.com.fatura.informatica;

import java.util.Scanner;

public class FaturaTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Fatura fatura = new Fatura();
		
		System.out.println("Digite o n�mero da fatura: ");
		fatura.setNumero(entrada.next());
		
		System.out.println("Digite a descri��o do Item --> Exemplo: Mouse ou Teclado: ");
		fatura.setDescricao(entrada.next());
		
		System.out.println("Digite a quantidade de itens comprados --> n�meros inteiros: ");
		fatura.setQtdeItemCompra(entrada.nextInt());
		
		System.out.println("Digite o pre�o do item --> Exemplo: 2,00 ou 20,00: ");
		fatura.setPrecoItem(entrada.nextDouble());
				
		System.out.println("N�mero da fatura: " + fatura.getNumero());
		System.out.println("Descri��o da fatura: " + fatura.getDescricao());
		System.out.println("Quantidade de itens comprados: " + fatura.getQtdeItemCompra());
		System.out.println("Pre�o do item: " + fatura.getPrecoItem());
		System.out.print("Total da Fatura �: R$ " + fatura.getTotalFatura());
		
		System.out.println("Al� GitHub....");
		entrada.close();
	}

}
