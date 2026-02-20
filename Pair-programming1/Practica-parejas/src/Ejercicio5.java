public class Ejercicio5 {
    public void probar() throws MiPropiaException3 {
        throw new MiPropiaException3("Este mensaje no se verá");
    }

    public static void main(String[] args) {
        // Asigna null a la variable
        Ejercicio5 objetoNulo = null;

        try {
            // Al ser nulo, esto lanzará NullPointerException
            objetoNulo.probar();
        } catch (Exception e) {
            // Atrapa la excepción genérica
            System.out.println("Se atrapo una excepcion general.");
            System.out.println("Tipo de error: " + e.getClass().getName());
        }
    }
}