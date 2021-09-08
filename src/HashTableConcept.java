import java.util.Hashtable;

public class HashTableConcept {
    public static void main(String[] args) {
        Hashtable h = new Hashtable<>();
        h.put("A", "Test");
        h.put("B", "Hello");
        h.put("C", "World");

        System.out.println(h.size());

        h.put(1, 'A');
        h.put(2, 4);
        h.put(3, "Tom");

        System.out.println(h.get(2));

        // to restrict hash table - let say if we want to add only integer value in hash table 

        Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
        h1.put(4, 17);
        h1.put(3, 91);
        //h1.put(5, "abc");

        System.out.println(h1.get(3));

        Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
        h2.put(5, "xyz");

        System.out.println(h2.get(5));
    }
}
