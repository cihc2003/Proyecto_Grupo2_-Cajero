import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        // pedir al usuario que seleccione el modo
        System.out.println("Seleccione el modo (administrador/usuario): ");
        opcion = scanner.next();

        if (opcion.equals("administrador")) {
            System.out.println("Ingrese su número de identificación: ");
            String identificacion = scanner.next();

            System.out.println("Cree su contraseña: ");
            String contrasena = scanner.next();

            int intentos = 0;
            boolean bloqueado = false;

            // pedir al usuario que ingrese el usuario y la contraseña
            while (intentos < 3 && !bloqueado) {
                System.out.println("Ingrese su identificación: ");
                String identificacionIngresada = scanner.next();

                System.out.println("Ingrese su contraseña: ");
                String contrasenaIngresada = scanner.next();

                // verificar si la identificación y la contraseña son correctas
                if (identificacionIngresada.equals(identificacion) && contrasenaIngresada.equals(contrasena)) {
                    System.out.println("Bienvenido, administrador!");
                    break;
                } else {
                    intentos++;
                    System.out.println("Identificación o contraseña incorrecta. Por favor, intente de nuevo.");

                    if (intentos == 3) {
                        System.out.println("Ha ingresado información incorrecta 3 veces. Usted ha sido bloqueado.");
                        bloqueado = true;
                    }
                }
            }
        } else if (opcion.equals("usuario")) {
            System.out.println("Bienvenido, usuario!");
        } else {
            System.out.println("Opción inválida.");
        }
    }
}
