import java.util.Scanner;

public class Ej_21_stringCompare {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int length = (A+B).length();
        String capitalA = A.substring(0,1).toUpperCase();
        String capitalB =B.substring(0,1).toUpperCase();
        String firstWord = capitalA + A.substring(1,A.length());
        String secondWord = capitalB + B.substring(1,B.length());

        System.out.println(length);
        if(A.compareTo(B) > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.println(firstWord+ " "+secondWord);

    }
}
