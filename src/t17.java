
import java.util.Scanner;
import java.util.Random;
public class t17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        for(int i=1;i<1000;i++)
        {   int num=i;
            int sum=0;
            int count=0;
            while(num!=0){count++;num=num/10;}
            num=i;
            for(int j=1;j<=count;j++)
           {
               sum+=Math.pow((num%10), count);
               num=num/10;
           }
if(sum==i) System.out.println(i);

        }
    }
}

