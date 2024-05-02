package DesafioDIO;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ContaTerminal {
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Boolean autenticacao1 = false;
		Banco obj = new Banco();
		double saldo = obj.saldoFinal();
		
		System.out.println("----SIMULADOR DE CONTA BANCARIA-----");
		System.out.println();
		
		while (!autenticacao1) {
			System.out.println("Escolha uma das seguintes opcoes");
			System.out.println("[1] Cadastrar conta");
			System.out.println("[2] Entrar conta");
			System.out.println("[3] Sair");
			System.out.print("OPCAO: ");
				String opcao1 = in.nextLine();
			System.out.println();
				
				switch (opcao1) {
					case "1":
						System.out.print("Informe seu nome: ");
							String nomeNovoUsuario = in.nextLine();
						System.out.print("Informe o numero da Agencia (***-*): ");
							String agenciaNovoUsuario = in.nextLine();
						System.out.print("Informer o numero do usuario (****): ");
							int numeroNovoUsuario = in.nextInt();
							in.nextLine();
						System.out.println("Olá " + nomeNovoUsuario + ", obrigado por criar uma conta em nosso "
								+ "banco, sua agência é" + agenciaNovoUsuario + ", conta "+ numeroNovoUsuario + " e seu saldo " + saldo + " já está disponível para saque.");
						obj.contaUsuario(nomeNovoUsuario, agenciaNovoUsuario, numeroNovoUsuario);
						System.out.println();
						break;
					case "2":
						System.out.print("Informe seu nome: ");
							String nomeUsuario = in.nextLine();
						System.out.print("Informe o numero da Agencia (***-*): ");
							String agenciaUsuario = in.nextLine();
						System.out.print("Informer o numero do usuario (****): ");
							int numeroUsuario = in.nextInt();
							in.nextLine();
						boolean verifica = obj.verificaContaUsuario(nomeUsuario, agenciaUsuario, numeroUsuario);
						System.out.println();
						
						if (verifica) {
							System.out.println("Login bem-sucedido!");
		                    System.out.println();
							
								Boolean autenticacao2 = false;
								while (!autenticacao2) {
									System.out.println("Escolha uma das seguintes opcoes");
									System.out.println("[1] Adicionar dinheiro");
									System.out.println("[2] Retirar dinheiro");
									System.out.println("[3] Ver saldo");
									System.out.println("[4] Sair");
									System.out.print("OPCAO: ");
										String opcao2 = in.nextLine();
									System.out.println();
									
									switch (opcao2) {
										case "1":
											System.out.print("Valor que deseja adicionar: R$");
												double adicionarValor = in.nextDouble();
												in.nextLine();
												obj.valorAdicionado(adicionarValor);
												System.out.println();
											break;
										case "2":
											System.out.print("Valor que deseja retirar: R$");
												double retirarValor = in.nextDouble();
												in.nextLine();
												obj.valorRetirado(retirarValor);
												System.out.println();
												break;
										case "3":
											System.out.println("Saldo: R$" + saldo);
											System.out.println();
											break;
										case "4":
											autenticacao2 = true;
											break;
										default: 
											System.out.println("ERRO! INFORMACAO INVALIDA");
											System.out.println();
										break;		
									}
								}
						} else {
							System.out.println("Usuario não encontrado");
							System.out.println();
						}
							break;
					case "3":
						System.out.println("Saindo do sistema...");
						autenticacao1 = true;
						break;
					default: 
						System.out.println("ERRO! INFORMACAO INVALIDA");
						System.out.println();
					break;
				}
			
		}
			
		in.close();
	}

}
