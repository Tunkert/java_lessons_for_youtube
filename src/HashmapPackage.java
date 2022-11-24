import java.util.HashMap;

public class HashmapPackage {
    public static void main(String[] args) {
        HashMap<String, String> mySkiAreas = new HashMap<String, String>();
        mySkiAreas.put("Vail", "Colorado");
        mySkiAreas.put("Keystone", "Colorado");
        mySkiAreas.put("Aspen", "Colorado");
        mySkiAreas.put("Breckenridge", "Colorado");
        mySkiAreas.put("Killington", "Vermont");
        mySkiAreas.put("Beaver Creek", "Colorado");
        mySkiAreas.put("Okemo", "Vermont");
        System.out.println(mySkiAreas);
        System.out.println(mySkiAreas.size());
        System.out.println(mySkiAreas.get("Killington"));
        System.out.println(mySkiAreas.remove("Okemo"));
        System.out.println(mySkiAreas);
        System.out.println(mySkiAreas.size());
        // print keys
        System.out.println(mySkiAreas.keySet());
        // print only values
        System.out.println(mySkiAreas.values());
        // clear the hashmap
//        mySkiAreas.clear();
//        System.out.println(mySkiAreas);
        // iterate through the keys and print them out
        for (String skiArea: mySkiAreas.keySet()) {
            System.out.println(skiArea);
        }
        // iterate through the values and print them out
        for (String state: mySkiAreas.values()) {
            System.out.println(state);
        }
    }
}
