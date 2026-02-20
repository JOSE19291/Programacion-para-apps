public class Ejercicio1y2 {
    public static void main(String[] args) {
        try {
            // Se lanza el objeto Exception con mensaje
            throw new Exception("Error generado en el ejercicio");
        } catch (Exception e) {
            // Imprime el mensaje de la excepcion
            System.out.println("Mensaje de la excepción: " + e.getMessage());

            // Imprimir el stack trace
            e.printStackTrace();
        } finally {
            // Clausula finally con mensaje
            System.out.println("Se ha alcanzado la clausula finally.");
        }
    }
}