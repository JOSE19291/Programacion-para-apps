import java.util.Scanner;

public class ConteoVotos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int voto;
        int totalVotos = 0;
        int cand1 = 0;
        int cand2 = 0;

        System.out.println("Ingrese el número del candidato (1 o 2). Ingrese 0 para finalizar:");
        voto = teclado.nextInt();

        while (voto != 0) {
            if (voto == 1) {
                cand1++;
                totalVotos++;
            } else if (voto == 2) {
                cand2++;
                totalVotos++;
            } else {
                System.out.println("Voto nulo (candidato no reconocido).");
            }

            System.out.print("Siguiente voto: ");
            voto = teclado.nextInt();
        }

        if (totalVotos > 0) {
            // Calculamos los porcentajes
            double porc1 = (cand1 * 100.0) / totalVotos;
            double porc2 = (cand2 * 100.0) / totalVotos;

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Total de votos: " + totalVotos);
            System.out.println("Candidato 1: " + porc1 + "%");
            System.out.println("Candidato 2: " + porc2 + "%");
        } else {
            System.out.println("No se registraron votos.");
        }
    }
}