import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in );
        long number;
        int ns;
        int nsnumb;
        try {
            System.out.println("В какую систему исчисления вы хотите перевести?");
            nsnumb = Integer.parseInt(sc.nextLine());
            if(nsnumb == 2 || nsnumb == 8 || nsnumb == 10 || nsnumb == 16 ) {
                System.out.println("Введите исходное число: ");
                number = Long.parseLong(sc.nextLine(), nsnumb);
                System.out.println("Введите систему исчисления Вашего числа: ");
                ns = sc.nextInt();
                if (ns == 2 || ns == 8 || ns == 10 || ns == 16) {
                    System.out.println("Результат: " + Long.toString(number, ns));
                }
                else {
                    System.out.println("Error");
                }
            }
            else
                System.out.println("Error");
        }
        catch (Exception e) {
            System.out.println("Error");
        }


    }
}