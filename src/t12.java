
import java.util.Scanner;
import java.util.Random;
public class t12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();

        System.out.println("הכנס איבר ראשון בסדרה");
        int num= scanner.nextInt();
        System.out.println("הכנס הפרש" );
        int hfresh= scanner.nextInt();
        int count=0;
        while (count<=0)
        {
            System.out.println("הכנס כמות איברים חיובית");
            count= scanner.nextInt();
        }
        for(int i=1;i<=count;i++)
        {
            System.out.print(num+" ");
            num+=hfresh;
        }
    }
}
