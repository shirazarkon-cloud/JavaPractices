
import java.util.Scanner;
import java.util.Random;
public class t12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
//        סדרה חשבונית היא סדרת מספרים, שבה ההפרש בין כל שני איברים עוקבים הוא
//    קבוע. לדוגמה, הסדרה הבאה היא סדרה חשבונית,
//        כיוון שההפרש בין כל שני איברים עוקבים הוא 6:
//        11, 17, 23, 29, 35, 41, 47...
//        סדרה חשבונית מוגדרת באמצעות שלושה פרמטרים:
//
//        מהו האיבר הראשון בסדרה (בדוגמה שלנו זה 11), ההפרש בין איברים עוקבים (בדוגמה שלנו 6)
//
//        וכמות האיברים (בדוגמה שלנו 7).
//        כתבו תוכנית בה המשתמש מתבקש להכניס שלושה: איבר ראשון בסדרה, הפרש וכמות איברים.
//        בתגובה, התוכנית תדפיס את הסדרה החשבונית הרלוונטית. שימו לב: עליכם לוודא שהפרמטר

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
