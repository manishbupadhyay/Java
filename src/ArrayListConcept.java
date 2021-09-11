import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        arr.add(100);
        arr.add("Manish");
        arr.add('A');
        arr.add(500);
        arr.add(123.77);
        arr.add(true);
        arr.add("Aadi");
        arr.add('M');
        arr.add(700);


        System.out.println(arr.get(0));

        // to print all value from arraylist
        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }

        // to restrict arraylist - let say if we want to add only integer value in array list
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(4);
        //arrList.add("Manish upadhyay");//
    }
}
