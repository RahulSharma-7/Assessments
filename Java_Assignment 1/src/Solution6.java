

//Q6. There is an array with every element repeated twice except one. Find that element


public class Solution6 {

    public static void main(String args[]){
int j=0;
int temp;
        int arr[]={2,3,2,3,6,4,5,4,5,10,10};
        int len=arr.length;
        for(int i=0;i<len-2;i++){
                           for(j=i+1;j<len;j++) {
                               if(arr[i]>=arr[j]){
                                   temp=arr[i];
                                   arr[i]=arr[j];
                                   arr[j]=temp;
                               }


                           }



        }



        for (j=0;j<len;j=j+2){

            if(arr[j]!=arr[j+1]){
                System.out.println(arr[j]);
                break;
            }
        }







    }
}
