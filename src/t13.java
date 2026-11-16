
import java.util.Scanner;
import java.util.Random;
public class t13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
//        כתבו תוכנית המבקשת מהמשתמש להכניס מספר שלם ומדפיסה על המסך את סכום הספרות שלו. לדוגמה,
//                עבור המספר 5235 התוכנית תדפיס 15, כיוון ש-5+2+3+5 נותן 15.
        System.out.println("הכנס מספר שלם");
        int num= scanner.nextInt();
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num=num/10;
        }
        System.out.println("סכום ספרות המספר הוא:"+sum);
    }
}
