import java.util.HashSet;
import java.util.Iterator;

public class HashSetPackage {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Tim");
        names.add("Sean");
        names.add("Sarah");
        names.add("Aaron");
        names.add("Joe");
        names.add("Tim"); // this is a duplicate - sets only have one
        System.out.println(names);

        // some methods
        System.out.println(names.contains("Sarah")); // true
        System.out.println(names.contains("Billy")); // false
//        names.clear();
        System.out.println(names);

        // let's iterate through our set with Iterator Package
        Iterator<String> myIt = names.iterator();

        while(myIt.hasNext()) {
            System.out.println(myIt.next());
        }

        // or just do this
        for (String name: names) {
            System.out.println(name);
        }
    }
}
