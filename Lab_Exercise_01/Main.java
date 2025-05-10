class Mother {
    int x = 10;

    void show() {
        System.out.println("Show method in Mother class. Value of x: " + x);
    }
}

class Child extends Mother {
}

class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); 

        Child ch = new Child();
        ch.show(); 
    }
}
