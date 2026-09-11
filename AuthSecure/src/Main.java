import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int option = 0;
        Scanner scan = new Scanner(System.in);
        option = scan.nextInt();
        String username;
        String password;
        String nombreCompleto;
        String email;

        System.out.println("----------------------------------");
        System.out.println("AUTHSECURE - CONTROL DE ACCESOS");
        System.out.println("----------------------------------");



        do {
            System.out.println("1. Registrar nuevo usuario");
            System.out.println("2. Iniciar sesion (Autenticacion)");
            System.out.println("3. Eliminar cuenta de usuario");
            System.out.println("4. Verificar disponibilidad");
            System.out.println("5. Salir");
        }
        while(option != 5); {
            switch (option) {
                case 1: {
                    System.out.println("username:");
                    username = scan.nextLine();

                    System.out.println("password:");
                    password = scan.nextLine();

                    System.out.println("nombreCompleto");
                    nombreCompleto = scan.nextLine();

                    System.out.println("email");
                    email = scan.nextLine();
                    break;
                }
                case 2: {
                    System.out.println("username:");
                    username = scan.nextLine();

                    System.out.println("password:");
                    password = scan.nextLine();

                    break;
                }
                case 3: {
                    System.out.println("Escriba el username del usuario a eliminar");

                    System.out.println("username:");
                    username = scan.nextLine();

                    break;
                }

                case 4: {
                    System.out.println("Verificacion de disponibilidad. Escriba el nombre del usuario a verificar");

                    System.out.println("username:");
                    username = scan.nextLine();

                    break;
                }

                default:
                    System.out.println("OPTION NO VALIDA");
            }
        }

    }
}