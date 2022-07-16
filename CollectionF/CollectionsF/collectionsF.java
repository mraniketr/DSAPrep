
package CollectionF.CollectionsF;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionsF {
    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();
        ls.add(new Student(9, "Aniket"));
        ls.add(new Student(2, "Rahul"));
        ls.add(new Student(3, "Boya"));
        // Collections.sort(ls, new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2) {

        // return o1.getName().compareTo(o2.getName());

        // }
        // });

        // Lambda
        Collections.sort(ls, (o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println(ls);
    }
}