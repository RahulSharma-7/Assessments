public class Solution9 {
public static void main(String args[]){

    Furniture fur1=new Furniture("Metal","Chair",6,5);
    Furniture fur2=new Furniture("Wooden","Table",7,5);
    Furniture fur3=new Furniture("Wooden","Chair",5,5);
    Furniture fur4=new Furniture("Metal","Table",7,6);

    fur1.isFireProved(fur1.ftestscore);
    fur3.isFireProved(fur3.ftestscore);
    fur2.isFireProved(fur2.ftestscore);
    fur4.isFireProved(fur4.ftestscore);

    fur1.isStressproved(fur1.stresstest);
    fur2.isStressproved(fur2.stresstest);
    fur3.isStressproved(fur3.stresstest);
    fur4.isStressproved(fur4.stresstest);

    }
}

class Furniture{

    String type;
    String category;
    int ftestscore;
    int stresstest;

    public Furniture(String type,String category,int value1,int value2){
        this.type=type;
        this.category=category;
        this.ftestscore=value1;
        this.stresstest=value2;
    }


    public void isStressproved(int a){
        if(a>6)
            System.out.println("The furniture is stress proved");
        else
            System.out.println("The Furniture has failed for stress test");
    }


    public void isFireProved(int a){
        if(a>=7)
            System.out.println("The furniture is fire tested");
        else
            System.out.println("The Furniture has failed for fire test");
    }


}




