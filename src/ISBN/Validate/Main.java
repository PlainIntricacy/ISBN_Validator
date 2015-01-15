/**
 ISBN_Validator
 Java ISBN Code Validator

 Simple Java program that checks a given code for ISBN format compliance

 Input: ISBN format code

 Output: true or false

 Based on this reddit daily challenge: http://goo.gl/iQiHKv

 Author: todyerutz@plainintricacy.wordpress.com
 */

package ISBN.Validate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your ISBN code:");
        String in = input.nextLine().replaceAll("[^0-9]", "");
        input.close();
        boolean check = true;
        int q=0;
        if(in.length()!=10){
            check = false;
        }else{
            int f = Integer.parseInt(in);
            for(int i=1;i<=10;i++){
                q+=((f%10)*i);
                f/=10;
            }
            if(q%11!=0){
                check = false;
            }
        }
        System.out.println("ISBN validation: " + check);
    }
}