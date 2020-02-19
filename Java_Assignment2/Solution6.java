public class Solution6 {
    public static void main(String args[]){

        try{

            System.out.println("Inside the try block");
            int arr[]=new int[2];
            int c=arr[3];
                    }
            catch (ArithmeticException e){
            e.printStackTrace();
            }
        catch(ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
        }
        catch (NoClassDefFoundError arr){
            arr.printStackTrace();
        }

finally {
            System.out.println("Inside thee finally block");
        }
    }
}
