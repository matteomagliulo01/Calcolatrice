import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci il primo numero ");
        int x = scanner.nextInt();
        System.out.println("Inserisci il secondo numero ");
        int y = scanner.nextInt();

        Calcolatrice calcolatrice=new Calcolatrice(x,y);

        System.out.println("Addizione"+calcolatrice.Somma());

        System.out.println("Sottrazione"+calcolatrice.Sottrazione());

        System.out.println("Divisione"+calcolatrice.Divisione());

        System.out.println("Moltiplicazione"+calcolatrice.Moltiplicazione());
    }
}