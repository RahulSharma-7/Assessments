package com.company;

public class Solution2 {


    public static void main(String args[]){

                String str="acbedgf";
                char temp;

                char arr[]=str.toCharArray();
                System.out.println(arr);

                for(int i=0;i<arr.length-1;i++){

                    for (int j=i+1;j<=arr.length-1;j++){

                        if(arr[i]>=arr[j]){
                            temp=arr[j];
                            arr[j]=arr[i];
                            arr[i]=temp;
                        }
                    }


                }

                System.out.println(arr);




    }
}
