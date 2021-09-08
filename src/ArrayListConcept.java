import java.util.ArrayList;

public class ArrayListConcept {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        arr.add(0, 100);
        arr.add(1, "Manish");
        arr.add(2, 'A');
        arr.add(3, 500);
        arr.add(4, 123.77);
        arr.add(5, true);
        arr.add(6, "Aadi");
        arr.add(7, 'M');
        arr.add(8, 700);


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
