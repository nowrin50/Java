class SuperClass {
    protected void display() {
        System.out.println("Superclass display");
    }
}

class SubClass extends SuperClass {
    //  The visibility of the overridden method can be increased from protected to public
    public void display() {
        System.out.println("Subclass display");
    }
}

public class Main {
    public static void main(String[] args) {
        SuperClass myObj = new SubClass(); // SubClass object but stores it in a SuperClass variable,  to call methods defined in SuperClass
        myObj.display(); // This will call the display method of SubClass due to method overriding
    }
}
