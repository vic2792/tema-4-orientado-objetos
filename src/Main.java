import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("elige una opcion");
            System.out.println("1. Sumar 1+1");
            System.out.println("2 restar 2-1");
            System.out.println("3 salir");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {
                //int n1 = 4;
                //int n2 = 3;
                System.out.println("la suma es " + (1 + 1));
            } else if (option == 2) {
                System.out.println("la restas es " + (2-1));
            } else if (option == 3) {
                System.out.println("saliendo");
            } else {
                System.out.println("opcion incorrecta");
            }
        }while (option != 3);
        }
    }
}