package aluraApplication;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		String nomeCliente = "Daniel Silva";
		String tipoConta = "Conta Pagamento";
		int agenciaConta = 0001;
		int numeroConta = 123456789;
		String senhaCliente = "teste123";
		double saldoCliente = 33000;
		
		boolean sessaoLogin = true;
		
		String[] resultado = nomeCliente.split(" ", 2);
		String primeiroNome = resultado[0];
		
		while(sessaoLogin == true) {
			
			System.out.println("********************************");
			System.out.println("                                ");
			System.out.println("             AluraBank          ");
			System.out.println("                                ");
			System.out.println("  Olá, " + primeiroNome + "!    ");
			System.out.println("                                ");
			System.out.println("********************************");
			System.out.println("                                ");
			System.out.print("Digite sua senha: ");
			
			Scanner pegarSenha = new Scanner(System.in);
			String senhaInserida = pegarSenha.nextLine();
			
			if(!senhaInserida.equals(senhaCliente)) {
				System.out.println("Senha Incorreta! Tente novamente.");
			}else {
				System.out.println("Bem-Vindo, " + nomeCliente + "!");
				sessaoLogin = false;
			}
			
		}
		boolean sessaoUsuario = true;
		
		while(sessaoUsuario == true) {
			
			System.out.println("********************************");
			System.out.println("                                ");
			System.out.println("             AluraBank          ");
			System.out.println("                                ");
			System.out.println(" Agência: " + agenciaConta);
			System.out.println("                                ");
			System.out.println(" Conta: " + numeroConta);
			System.out.println("                                ");
			System.out.println(" Tipo conta: " + tipoConta);
			System.out.println("                                ");
			System.out.println(" Saldo atual: " + "R$ " + saldoCliente);
			System.out.println("                                ");
			System.out.println("********************************");
			System.out.println("                                ");
			System.out.println(" 1- Sacar ");
			System.out.println("                                ");
			System.out.println(" 2- Depositar");
			System.out.println("                                ");
			System.out.println(" 3- Consultar Saldo");
			System.out.println("                                ");
			System.out.println(" 4- Sair");
			System.out.println("                                ");
			System.out.print("Escolha a opção desejada: ");
			
			Scanner pegarOpcao = new Scanner(System.in);
			int opcaoSelecionada = pegarOpcao.nextInt();
			
			switch(opcaoSelecionada) {
			case 1:
				System.out.println("********************************");
				System.out.println("                                ");
				System.out.println("             AluraBank          ");
				System.out.println("                                ");
				System.out.println(" Saldo Atual: R$ " + saldoCliente);
				System.out.println("                                ");
				System.out.println("********************************");
				System.out.print("Digite o valor que deseja sacar: ");
				
				Scanner valorDigitado = new Scanner(System.in);
				double valorSacado = valorDigitado.nextInt();
				
				if(valorSacado > saldoCliente) {
					System.out.println(" O valor que deseja sacar é maior que o saldo atual!");
				}else {
					double novoValor = saldoCliente - valorSacado;
					saldoCliente = novoValor;
					System.out.println("Operação realizada com sucesso!");
				}
				
				break;
			case 2:
				System.out.println("********************************");
				System.out.println("                                ");
				System.out.println("             AluraBank          ");
				System.out.println("                                ");
				System.out.println(" Saldo Atual: R$ " + saldoCliente);
				System.out.println("                                ");
				System.out.println("********************************");
				System.out.print("Digite o valor que deseja depositar: ");
				
				valorDigitado = new Scanner(System.in);
				double valorDepositado = valorDigitado.nextInt();
				
				if(valorDepositado <= 0) {
					System.out.println("Não é possível depositar um valor zerado ou negativo!");
				}else {
					double novoValor = saldoCliente + valorDepositado;
					saldoCliente = novoValor;
					System.out.println("Operação realizada com sucesso!");
				}
				
				break;
			case 3:
				System.out.println("********************************");
				System.out.println("                                ");
				System.out.println("             AluraBank          ");
				System.out.println("                                ");
				System.out.println(" Saldo Atual: R$ " + saldoCliente);
				System.out.println("                                ");
				System.out.println("********************************");
				System.out.print("Digite X para voltar: ");
				
				valorDigitado = new Scanner(System.in);
				String voltar = valorDigitado.nextLine();
				break;
			case 4:
				System.out.println("*************************************");
				System.out.println("                                     ");
				System.out.println("                AluraBank            ");
				System.out.println("                                     ");
				System.out.println(" Sessão finalizada com segurança!    ");
				System.out.println("                                     ");
				System.out.println(" Obrigado por utilizar o AluraBank :)");
				System.out.println("                                     ");
				System.out.println("*************************************");
				
				sessaoUsuario = false;
				break;
			default:
				System.out.println("Operação Inválida!");
				break;
			}
		}
		
	}

}
