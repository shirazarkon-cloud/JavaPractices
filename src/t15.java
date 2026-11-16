
import java.util.Scanner;
import java.util.Random;
public class t15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
//       סדרת פיבונאצ'י היא סדרת מספרים, ששני איבריה הראשונים הם 0 ו-1,
//       וכל איבר לאחר מכן שווה לסכום שני קודמיו. לפיכך, סדרת פיבונאצ'י נראית כך:
//0,1,1,2,3,5,8,13,21,34,55.....
//כתבו תוכנית המקבלת מהמשתמש כקלט מספר שלם, ומדפיסה האם המספר שהוכנס הוא איבר בסדרת פיבונאצ'י או לא.
        System.out.println("הכנס מספר");
int num= scanner.nextInt();
int now=1;
int next=1;
int help=0;
boolean have=false;
if (num==0) have=true;
while(num>=now&&have==false)
{
    if(num==now)have=true;
    help=next;
    next+=now;
    now=help;
}
if (have==true) System.out.println("חלק מסדרת פיבונאצ'י");
else System.out.println("לא חלק מסדרת פיבונאצ'י");
    }
}

