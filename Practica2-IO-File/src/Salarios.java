import java.io.*;
import java.util.Random;

public class Salarios {
    public static void main(String[] args) throws IOException {
        String[] rgs = { "asistente", "asociado", "titular" };
        double[] mins = { 50000, 60000, 75000 }, maxs = { 80000, 110000, 130000 };
        Random r = new Random();
        PrintWriter pw = new PrintWriter("salarios.txt");

        for (int i = 1; i <= 1000; i++) {
            int n = r.nextInt(3);
            double sal = mins[n] + (r.nextDouble() * (maxs[n] - mins[n]));
            // Redondeo manual a 2 decimales
            sal = Math.round(sal * 100.0) / 100.0;

            pw.println("Nombre" + i + " Apellido" + i + " " + rgs[n] + " " + sal);
        }
        pw.close();
    }
}