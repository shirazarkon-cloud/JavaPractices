
import java.util.Scanner;
import java.util.Random;
public class T16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = 0;
        while (num <= 3 || num % 2 == 0) {
            System.out.println("הכנס מספר חיובי אי זוגי גדול משלוש");
            num = scanner.nextInt();
        }
        int star = 1;
        int revah = num / 2;
        int half = num /2;
        for (int i = 1; i <= half; i++)
        {
            for (int j=0;j<revah;j++){System.out.print(" ");}
            for (int t=0;t<star;t++){System.out.print("*");}
            revah--;
            star+=2;
            System.out.println();
        }
        for (int t=0;t<num;t++){System.out.print("*");}
        System.out.println();
        star=num-2;
        revah = 1;
        for (int i = 1; i <= half; i++)
        {

            for (int j=0;j<revah;j++){System.out.print(" ");}
            for (int t=0;t<star;t++){System.out.print("*");}
            revah++;
            star-=2;
            System.out.println();
        }
    }}

