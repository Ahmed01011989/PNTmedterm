package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String str= "DAD";
        String reverse = new StringBuffer(str).reverse().toString();
        if (str.equals(reverse))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

        mom();
        madam();

    }

    public static void mom(){
        String str = "MOM";
        String reverse = new StringBuffer(str).reverse().toString();
        if (str.equals(reverse))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }

    public static void madam(){

        String str ="MOM";
        String reverse = new StringBuffer(str).reverse().toString();
        if(str.equals(reverse))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }


}