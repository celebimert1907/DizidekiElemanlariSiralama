import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = 0;
        System.out.print("Listenin boyutunu giriniz: ");
        n = input.nextInt();

        System.out.println("Listenin elemanlarini giriniz !!!");

        int[]list = new int[n];


        int value = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < list.length; j++) {
                System.out.print(j + " index degereni giriniz: ");
                value = input.nextInt();
                list[j] = value;

            }
            Arrays.sort(list);
            System.out.println(Arrays.toString(list));
            break;
        }
    }
}
