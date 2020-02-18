public class Solution4
{
    public static void main(String args[]){


        String str="rAhUl @ SHarMA @ To The New Gr.Noide";

        int len=str.length();
//        Lower Case --->97 to 122
//        Upper case--> 65 to 90
//    Digits 48 to 57
    char ch;
        int UCase=0;
        int LCase=0;
        int Digits=0;
        int SpecialCharacters=0;
            for(int i=0;i<len;i++){
                ch = str.charAt(i);
            if(ch<=122&&ch>=97){
                UCase++;
            }

               else if(ch<=90&&ch>=65){
                    LCase++;
                }
                else if(ch<=57&&ch>=48){
                    Digits++;
                }

            else
                {
                SpecialCharacters++;
                }

            }

                    System.out.println("The Upper Case Characters are "+(UCase*100)/len+"%");
                    System.out.println("The Lower Case Characters are "+(LCase*100)/len+"%");
                    System.out.println("The Digits are "+(Digits*100)/len+"%");
                    System.out.println("The Special characters are "+(SpecialCharacters*100)/len+"%");



    }

}
