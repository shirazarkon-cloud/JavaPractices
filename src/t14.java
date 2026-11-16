
import java.util.Scanner;
import java.util.Random;
public class t14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//        מספר ראשוני הוא מספר שלם וחיובי, שיכול להתחלק ללא שארית רק בעצמו ובמספר 1.
//        כתבו תוכנית המדפיסה על המסך את N המספרים החיוביים הראשונים, כך ש-N מתקבל כקלט מהמשתמש.
//                לדוגמה, אם הערך שמוכנס על ידי המשתמש הוא 7, עלינו להדפיס את שבעת המספרים הראשוניים הראשונים:
//        2,3,5,7,11,13,17.
        System.out.println("הכנס כמות מספרים ראשוניים אתה רוצה");
        int N = scanner.nextInt();
        int howMany=0;
        int now=2;
        int sum=0;
        while(howMany<N)
        {
            for(int i=1;i<=now;i++)
            {
                if(now%i==0)sum++;
            }
            if(sum==2) {
                System.out.print(now+" ");
                howMany++;
            }
            now++;
            sum=0;
        }





    }
}