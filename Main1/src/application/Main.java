package application;

import java.util.Scanner;

import entities.PlanoCartesiano;
import entities.Tela;
import entities.Robo;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ANSI_GREEN = "\u001B[32m";
    	String ANSI_RESET = "\u001B[0m";
    	
        PlanoCartesiano plano = new PlanoCartesiano();
        Tela printar = new Tela();
        
        printar.printTela();
                
        System.out.println("Digite a cor do seu robô: ");
        String cor = scan.nextLine();
        Robo robo = new Robo(0, 0, cor);
        
        System.out.println("Digite a posição do alimento:");
        System.out.print("X: ");
        int xAlimento = scan.nextInt();
        System.out.print("Y: ");
        int yAlimento = scan.nextInt();
        scan.nextLine();

        int tamanhoArea = 5;

        while (!(xAlimento == robo.getX() && yAlimento == robo.getY())) {
        	plano.imprimirPlanoCartesiano(tamanhoArea, robo.getX(), robo.getY(), xAlimento, yAlimento, cor);
            System.out.println("Digite o movimento desejado:");
            String direcao = scan.nextLine();
            if (direcao.matches("-?\\d+")) {
                int numero = Integer.parseInt(direcao);
                robo.moverRobo(numero);
                printar.mostrarTransicao(1000);
                
            } else {
                robo.moverRobo(direcao);
                printar.mostrarTransicao(1000);
            }
            robo.verificarPosicao(robo.getX(), robo.getY(), xAlimento, yAlimento);
        }
        plano.imprimirPlanoCartesiano(tamanhoArea, robo.getX(), robo.getY(), xAlimento, yAlimento, cor);
        
        scan.close();
    }
}