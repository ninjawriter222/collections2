package collections;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        //ArrayList Example You Already Accepted.
        String[] things = {"lasers", "rockets", "hollow points", "candy"};
        List<String> list1 = new ArrayList<String>();

        //add array items to list
        for (String x : things) {
            list1.add(x);
        }

        String[] surealThings = {"lasers", "candy"};
        List<String> list2 = new ArrayList<String>();

        //add array items to list
        for (String y : surealThings) {
            list2.add(y);
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.printf("%s ", list1.get(i));
        }
        for (int j = 0; j < list2.size(); j++) {
            System.out.printf("%s ", list2.get(j));
        }
//Map Example
        System.out.println("HashMap Example:");
        Map map = new HashMap();
        map.put("lasers", "1 - 10");
        map.put("rockets", "11 - 20");
        map.put("hollow points", "21 - 30");
        map.put("Candy", "31 - 40");
        map.put("Vikings", "41 - 50");

        System.out.println("Points occupied on the HashMap: \n");

        map.forEach((x, z) -> System.out.println("Things - " + x
                + ", Location " + z + "\n"));
//Tree example
        System.out.println("TreeSet Example:");
        TreeSet Stuff = new TreeSet();
        Stuff.add("lasers");
        Stuff.add("rockets");
        Stuff.add("hollow points");
        Stuff.add("candy");
        Stuff.add("vikings");

        Iterator list = Stuff.iterator();
        while (list.hasNext()) {
            Object element = list.next();
            System.out.print(element + "\n");
        }
// Queue example
        System.out.println("\nQueue Example:");
        Queue<String> various = new LinkedList<>();

        various.add("lasers");
        various.add("rockets");
        various.add("hollow points");
        various.add("candy");
        various.add("vikings");

        various.forEach(name -> {
           System.out.println(name);
        });
//Set Example
        System.out.println("Set Example:");
        int progression[] = {2, 9, 4, 0, 3,};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            boolean add = set.add(progression[i]);
        }
        System.out.println(set + "\n");
    }

}
