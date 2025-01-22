class One {
    One(int x) {
        System.out.println("Parameterized constructor in One: " + x);
    }
}

class Two extends One {
    Two(int y) {
        super(y); 
        System.out.println("Constructor in Two: " + y);
    }
}
class Application4 {
    public static void main(String args[]) {
        Two obj = new Two(42); 
    }
}
