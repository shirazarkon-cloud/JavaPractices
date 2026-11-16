
import java.util.Scanner;
import java.util.Random;
public class t11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        System.out.println("הכנס משתנים עבור  a,b,c");
        Double a= scanner.nextDouble();
        Double b= scanner.nextDouble();
        Double c= scanner.nextDouble();
        if((b*b-4*a*c)>0)
        {
           double aura=Math.sqrt(b*b-4*a*c) ;
            System.out.println("x1="+((-b+aura)/(2*a)));
            System.out.println("x2="+((-b-aura)/(2*a)));
        } else if ((b*b-4*a*c)==0)
        {
            System.out.println("x="+((-b)/(2*a)));
        }
        else
        {
            System.out.println("לא נמצא פתרון למשוואה");
        }


    }
}

