import java.util.Scanner;

public class sayiBulma {
    public static void main(String[] args) {
        int n;
        int sayi;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);

        System.out.print("kaç sayı gireceksiniz ? : ");
        n = input.nextInt();

        for(int i = 1;i<=n; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = input.nextInt();
            if(sayi>max) max=sayi;
            else if(sayi<min) min=sayi;
        }
        System.out.println("en büyük sayı: "+max);
        System.out.println("en küçük sayı: "+min);

    }
}
