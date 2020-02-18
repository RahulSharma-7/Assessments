/*Q10.Write a single program for following operation using overloading
        A) Adding 2 integer number
        B) Adding 2 double
        C) multiplying 2 float
        D) multiplying 2 int
        E) concate 2 string
        F) Concate 3 String  */




public class Solution10 {

    public static void main(String args[]) {

        System.out.println("The Sum of int is " + Add(10, 17));
        System.out.println("The Sum of float is " + Add(10.5, 17.5));
        System.out.println("The Multiplication of int is " + Multiply(10, 17));
        System.out.println("The Multiplication of float is " + Multiply(1.1, 1.1));
        System.out.println("The Concated String is " + Concat("Rahul", "Sharma"));
        System.out.println("The Concated String is " + Concat("Rahul", "Sharma", "To The New"));
    }

        public static int Add( int a, int b){
            return a + b;
        }
        public static double Add ( double a, double b){
            return a + b;
        }

        public static double Multiply ( double a, double b){
            return a * b;
        }

        public static  double Multiply ( int a, int b){
            return a * b;
        }
        public static  String Concat (String a, String b, String c){
            return a + " " + b + " " + c;
        }
        public  static String Concat (String a, String b){
            return a + " " + b;
        }
    }
