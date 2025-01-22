
class Mother {
    static void show() {
        System.out.println("Static Method in Mother");
    }
}

class Child extends Mother {
    static void show() {
        System.out.println("Static Method in Child");
    }
}

class Application31 {
    public static void main(String args[]) {
        Mother m1 = new Child();
        m1.show(); 
    }
}
