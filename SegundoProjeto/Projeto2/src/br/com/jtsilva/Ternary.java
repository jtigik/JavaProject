package br.com.jtsilva;

public class Ternary {

    public static String if_comum(int num) {
        String msg = "";
        if (num > 10) {
            msg = "Number is greater than 10";
        } else {
            msg = "Number is less than or equal to 10";
        }
        return msg;
    }
 
    public static String if_ternario(int num){
        String msg = num > 10
                ? "Number is greater than 10"
                : "Number is less than or equal to 10";

        return msg;
    }

    public static void main(String[] args) {
        int num = 8;

        System.out.println("If comum: " + if_comum(num));

        System.out.println("If ternário: " + if_ternario(num));
    }
}
