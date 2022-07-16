package CollectionF.CollectionsF;

import java.util.Comparator;

public class Student {
    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // @Override
    // public int compareTo(Object o) {
    // Student s1 = (Student) o;
    // return this.id - s1.id;
    // }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}