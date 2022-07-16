package CollectionF.SetF;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetF {
    public static void main(String[] args) {
        // No order maintain - O(1)
        // Set<Integer> s1 = new HashSet<>();
        // Order is mainteained
        // Set<Integer> s1 = new LinkedHashSet<>();
        // Sorted Set - O(logn)
        // Set<Integer> s1 = new TreeSet<>();
        // s1.add(66);
        // s1.add(2);
        // s1.add(9);
        // s1.add(55);
        // System.out.println(s1);
        // s1.remove(55);
        // System.err.println(s1.isEmpty());
        // System.out.println(s1.size());
        // s1.clear();
        // System.out.println(s1);

        // Implement hashcode and equals to create custom comparision
        Set<Student> stud = new HashSet<>();
        stud.add(new Student(1, "Aniket"));
        stud.add(new Student(2, "Rahul"));
        stud.add(new Student(3, "Raj"));
        stud.add(new Student(3, "Raj"));
        System.out.println(stud);

    }
}
