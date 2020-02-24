//
// Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull()
// and an additional operation getMin() which should return minimum element from the SpecialStack. (Expected complexity ­ O(1))
//



import java.util.Stack;

class DataStructure {

    int currentValue;
    int minValue=0;

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minstack = new Stack<Integer>();


    public void Push(int value){

        this.currentValue=value;
        stack.push(value);
        Min();
    }
    public int Pop(){


        if(stack.peek()==minstack.peek())
        {
            minstack.pop();
        }
            return stack.pop();

    }

    public boolean IsEmpty(){
        return stack.isEmpty();
    }
    private void Min(){

    if(!minstack.isEmpty()){
        if(this.currentValue<minstack.peek()){
            minstack.push(currentValue);
        }
    }
    else
    {
        minstack.push(this.currentValue);
    }

    }
    public int getMin(){
        return minstack.peek();
    }




}



 public class Sol8DataStr {

    public static void main(String args[])
    {

        DataStructure dataStructure = new DataStructure();

        dataStructure.Push(10);

        dataStructure.Push(9);
        dataStructure.Push(11);

        System.out.println(dataStructure.getMin());
        System.out.println(dataStructure.Pop());





    }


}
