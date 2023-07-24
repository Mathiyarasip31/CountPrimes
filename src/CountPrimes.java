import java.util.Scanner;

public class CountPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        Count(number);
    }

    public static void Count(int number) {
        int flag = 0;
        if (number == 1 || number == 0) {
            System.out.print("0");
        }

        for (int j = 2; j < number; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    flag = 1;
                    break;
                } else {
                    flag = 0;
                }
            }
            if (flag == 0) {
                System.out.print(j+" ");
            }
        }
    }
}
