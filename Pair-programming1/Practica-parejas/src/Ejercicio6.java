public class Ejercicio6 {
    // Método que produce una excepción propia
    public void a() throws MiPropiaException3 {
        throw new MiPropiaException3("Excepcion original del metodo A");
    }

    // Método b llama a "a", detecta su excepción y lanza una nueva
    public void b() throws Exception {
        try {
            a();
        } catch (MiPropiaException3 e) {
            throw new Exception("Excepcion relanzada desde el método B", e);
        }
    }

    public static void main(String[] args) {
        Ejercicio6 ej = new Ejercicio6();
        try {
            // Invoca b
            ej.b();
        } catch (Exception e) {
            // Imprime el stack trace
            e.printStackTrace();
        }
    }
}