/*****************************************************************************************************************
* Prova Técnica Java --> Projeto 2 --> By Jefferson Itajahy
*****************************************************************************************************************/
package br.com.fatura.informatica;

import java.util.Scanner;

public class FaturaTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Fatura fatura = new Fatura();
		
		System.out.println("Digite o número da fatura: ");
		fatura.setNumero(entrada.next());
		
		System.out.println("Digite a descrição do Item --> Exemplo: Mouse ou Teclado: ");
		fatura.setDescricao(entrada.next());
		
		System.out.println("Digite a quantidade de itens comprados --> números inteiros: ");
		fatura.setQtdeItemCompra(entrada.nextInt());
		
		System.out.println("Digite o preço do item --> Exemplo: 2,00 ou 20,00: ");
		fatura.setPrecoItem(entrada.nextDouble());
				
		System.out.println("Número da fatura: " + fatura.getNumero());
		System.out.println("Descrição da fatura: " + fatura.getDescricao());
		System.out.println("Quantidade de itens comprados: " + fatura.getQtdeItemCompra());
		System.out.println("Preço do item: " + fatura.getPrecoItem());
		System.out.print("Total da Fatura é: R$ " + fatura.getTotalFatura());
		
		System.out.println("Alô GitHub....");
		entrada.close();
	}

}
