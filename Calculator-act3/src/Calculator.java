// Con manejo de excepciones
/* public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Java Calculator operando 1 operando 2");
            return;
        }

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[2]);
            int res = 0;

            if (args[1].equals("+"))
                res = n1 + n2;
            else if (args[1].equals("-"))
                res = n1 - n2;
            else if (args[1].equals("."))
                res = n1 * n2;
            else if (args[1].equals("/"))
                res = n1 / n2;

            System.out.println(args[0] + " + " + args[2] + " = " + res);

        } catch (NumberFormatException e) {
            // Revision para mostrar mensaje
            try {
                Integer.parseInt(args[0]);
                System.out.println("Entrada incorrecta: " + args[2]);
            } catch (NumberFormatException e2) {
                System.out.println("Entrada incorrecta: " + args[0]);
            }
        }
    }
} */

// Sin manejo de excepciones
public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Java Calculator operando 1 operando 2");
            return;
        }

        // Primer operando
        for (char c : args[0].toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Entrada incorrecta: " + args[0]);
                return;
            }
        }

        // Segundo operando
        for (char c : args[2].toCharArray()) {
            if (!Character.isDigit(c)) {
                System.out.println("Entrada incorrecta: " + args[2]);
                return;
            }
        }

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[2]);
        int res = 0;

        if (args[1].equals("+"))
            res = n1 + n2;
        else if (args[1].equals("-"))
            res = n1 - n2;
        else if (args[1].equals("."))
            res = n1 * n2;
        else if (args[1].equals("/"))
            res = n1 / n2;

        System.out.println(args[0] + " + " + args[2] + " = " + res);
    }
}