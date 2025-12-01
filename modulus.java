import java.util.Scanner;

public class chetan {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c ;
        if(b ==0){
            System.out.println("zero divsion error");
        }
        else{
            c = a % b;
            System.out.println(c);
        }
    
    }
}
