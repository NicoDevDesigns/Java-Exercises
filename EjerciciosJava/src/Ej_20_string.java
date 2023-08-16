import java.io.*;
import java.util.*;


public class Ej_20_string {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            int sum= A.length()+B.length();

            int n= largo(A,B);

            String AlargerB=larger(A,B,n);

            String AEnMayuscula=cambiarMayuscula(A);
            String BEnMayuscula=cambiarMayuscula(B);

            System.out.println(sum);
            System.out.println(AlargerB);
            System.out.println(AEnMayuscula+" "+BEnMayuscula);

        }
        public static String larger(String A,String B,int n){
            String resultado="";
            for(int i=0;i<=n;i++){
                if(A.charAt(i)>B.charAt(i)){
                    resultado= "Yes";
                    break;
                }
                if(A.charAt(i)<B.charAt(i)){
                    resultado= "No";
                    break;
                }
            }
            return resultado;
        }
        public static String cambiarMayuscula(String palabra){
            return palabra.substring(0,1).toUpperCase()+palabra.substring(1);
        }
        public static int largo(String A,String B){

            if(A.length()>B.length()){
                return B.length();
            }else{
                return A.length();
            }
        }
}
