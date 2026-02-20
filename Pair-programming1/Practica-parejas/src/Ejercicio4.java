public class Ejercicio4 {

    public void metodoGenerador() throws MiPropiaException3 {
        throw new MiPropiaException3("Error detectado en el metodo generador");
    }

    public static void main(String[] args) {
        // Crea una instancia del objeto
        Ejercicio4 objeto = new Ejercicio4();

        try {
            // Invoca el método que genera la excepción
            objeto.metodoGenerador();
        } catch (MiPropiaException3 e) {
            // Controla la excepción imprimiendo el mensaje
            System.out.println("Capturado: " + e.getMessage());
        }
    }
}