package StreamAPI;

interface withDef {
    void show();

    default void defmethod() {
        System.out.println("DEFAULT CALLED");
    }
}

class demo implements withDef {
    @Override
    public void show() {
        System.out.println("SHOW RAN");
    }
}

class demo2 implements withDef {
    @Override
    public void show() {
        System.out.println("SHOW  2 RAN");
    }
}

public class defaultMethod {
    public static void main(String[] args) {
        demo d1 = new demo();
        demo2 d2 = new demo2();
        d1.show();
        d2.show();
        d2.defmethod();
    }
}
