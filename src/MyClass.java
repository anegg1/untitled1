class Class1 {
    private String id = "1234";

    public String getId() {
        return id;
    }

}

class Class2 {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

}



public class MyClass {
    public static void main(String args[]) {
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();

        String id = class1.getId();
        class2.setId(id);
        System.out.println(id);
    }
}