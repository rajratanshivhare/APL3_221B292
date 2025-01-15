
public class Main
{
    String name;
    int age;
    
    public void setter(){
        name="rajratan";
        age=20;
    }
    
    public void display(){
        System.out.println("Name : "+ name);
        System.out.println("age : "+ 20);
    }
    public static void main(String[] args){
        
        Main obj=new Main();
        obj.setter();
        obj.display();
    }
}
