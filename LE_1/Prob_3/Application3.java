class Mother {
    void show() {
        System.out.println("Hello World");
    }
}
class Child extends Mother {
   
    void show() {
        System.out.println("Hello JUET");
    }
}
class Application3 {
    public static void main(String args[]) {
        Mother m1 = new Child(); 
        m1.show(); 
    }
}
