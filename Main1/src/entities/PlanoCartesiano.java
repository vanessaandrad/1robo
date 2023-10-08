package entities;

public class PlanoCartesiano {
	String ANSI_RESET = "\u001B[0m";
	String ANSI_BLUE = "\u001B[34m";
	String ANSI_RED = "\u001B[31m";
	String ANSI_PURPLE = "\u001B[35m";
	String ANSI_GREEN = "\u001B[32m";
	
	public void imprimirPlanoCartesiano(int tamanho, int xRobo, int yRobo, int xAlimento, int yAlimento, String cor) {
        for(int i = tamanho - 1; i >= 0; i--) {
            for(int j = 0; j < tamanho; j++) {
                if (i == yRobo && j == xRobo) {
                	if(cor.equalsIgnoreCase("azul")){
                    System.out.print(ANSI_BLUE + "R " + ANSI_RESET);
                	}
                	else if(cor.equalsIgnoreCase("roxo")) {
                		System.out.print(ANSI_PURPLE + "R " + ANSI_RESET);
                	}
                	else {
                		System.out.print(ANSI_GREEN + "R " + ANSI_RESET);
                	}
                }
                else if (i == yAlimento && j == xAlimento) {
                    System.out.print(ANSI_RED + "A " + ANSI_RESET);
                }
                else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}