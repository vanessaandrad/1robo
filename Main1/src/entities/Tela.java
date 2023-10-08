package entities;

import java.util.concurrent.TimeUnit;

public class Tela {
	String ANSI_RESET = "\u001B[0m";
	String ANSI_BLUE = "\u001B[34m";
	String ANSI_PURPLE = "\u001B[35m";
	String ANSI_GREEN = "\u001B[32m";
	String ANSI_YELLOW = "\u001B[33m";

	public void printTela() {
		System.out.println(ANSI_YELLOW + "----------------------------------------");
		System.out.println("Bem-vindo ao Jogo do Robô!");
		System.out.println("----------------------------------------" + ANSI_RESET);
		System.out.println("Descrição do jogo:");
		System.out.println("Você controla um robô em um plano cartesiano de tamanho 5x5.");
		System.out.println("Seu objetivo é encontrar o alimento que está localizado em uma posição específica.");
		System.out.println("Tome cuidado para não sair dos limites do plano!");
		System.out.println(ANSI_YELLOW + "----------------------------------------" + ANSI_RESET);
		System.out.println("Instruções:");
		System.out.println("Use os comandos 'up', 'down', 'left' e 'right' para mover o robô.");
		System.out.println("Você também pode usar números para mover o robô diretamente.");
		System.out.println("1- UP\n2- DOWN\n3- RIGHT\n4- LEFT");
		System.out.println(ANSI_YELLOW + "----------------------------------------");
		System.out.println("Divirta-se!");
		System.out.println("----------------------------------------" + ANSI_RESET);
		System.out.println();
		System.out.println("Cores disponíveis: ");
		System.out.println(ANSI_BLUE + "Azul" + ANSI_RESET);
		System.out.println(ANSI_PURPLE + "Roxo" + ANSI_RESET);
		System.out.println(ANSI_GREEN + "Verde" + ANSI_RESET);
		System.out.println();
	}

	public void mostrarTransicao(int tempo) {
		try {
			TimeUnit.MILLISECONDS.sleep(tempo);
		} catch (InterruptedException ex) {
		}
	}
}