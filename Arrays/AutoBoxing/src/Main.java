import java.util.ArrayList;

public class Main {
    public static class IntClass{
        private int myValue;

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }

        public IntClass(int myValue) {
            this.myValue = myValue;
        }
    }
    public static void main(String[] args) {
        //ArrayList<int> myIntArrayList = new ArrayList<int>();

        //ArrayList works only with classes. Does not work with primitive types
        ArrayList<IntClass> myIntArrayList = new ArrayList<IntClass>();
        //We created a wrapper for int primitive type
        myIntArrayList.add(new IntClass(23));

        Integer integer = new Integer(50);
        ArrayList<Integer> IntegerArrayList = new ArrayList<Integer>();

        for(int i=0; i<=10; i++){
            //Autoboxing: converting primitive type to wrapper class (Integer)
            IntegerArrayList.add(Integer.valueOf(i));
        }

        for(int i=0; i<=10; i++){
            //Unboxing: converting Integer class object to primitive type
            System.out.println(IntegerArrayList.get(i).intValue());
        }

        Integer myNewIntValue = 56; //Integer.valueOf(56) ---> java does it for u
        int myInt = myNewIntValue; //myNewIntValue.intValue()

        //Same is applicable for double class
    }
}