import java.util.Scanner;

public class maths {
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER:");
        int a=sc.nextInt();
        System.out.println("ENTER SECOND NUMBER:");
        int b=sc.nextInt();
        int sum = a+b;
        int dif = a-b;
        int pro = a*b ;
        int div = a/b;
        System.out.println("sum:"+sum);
        System.out.println("dif:"+dif);
        System.out.println("pro:"+pro);
        System.out.println("div:"+div);
        double pov = Math.pow(a,b);
        System.out.println("power:"+pov);

    }
}