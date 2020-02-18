
//Q9.Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)

public class Solution9 {
    enum House{

        BUNGLOW,APARTMENT(2000),VILLA;
        int price;
        House(){                                                            //Enum inside the class
            price=100000;
        }

        House(int cost){
            price=cost;
        }
        public int getPrice(){
            return price;
        }



    }
    public static void main(String args[]){





            System.out.println("The price of the "+House.BUNGLOW+" is "+House.BUNGLOW.getPrice());
            System.out.println("The price of the "+House.APARTMENT+" is "+House.APARTMENT.getPrice());
        }

    }

