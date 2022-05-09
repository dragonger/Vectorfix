import entities.Rent;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be rented:");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {

            System.out.println("\nRent#" + i + ":");

            System.out.print("Name:");
            String name = sc.next();

            System.out.print("Email:");
            String email = sc.next();

            System.out.println("Room:");
            int room = sc.nextInt();

            vect[room] = new Rent(name, email);
        }

        System.out.println("Deseja ver o relatorio de aluguel?: s/n");
        String responce = sc.next();

        if (responce.contentEquals("n")) {
            System.out.println("Saved record");

        } else {

            System.out.println("\n Busy rooms:");
            for (int i = 0; i < 10; i++) {

                if (vect[i] != null) {
                    System.out.println(i + ":" + vect[i]);

                }
            }
        }
    }
}
