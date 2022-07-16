package CollectionF.SetF;

public class Student {
    private int id;
    private String Name;

    Student(int id, String Name) {
        this.id = id;
        this.Name = Name;
    }

    @Override
    public int hashCode() {

        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Student [Name=" + Name + ", id=" + id + "]";
    }

}