
public class Rum extends Beverage {
    @Override
    protected void AddIngredient() {
        System.out.println("Adding Ice");
    }
    @Override
    protected void Stirring() {
        System.out.println("Stirring");
    }
   
}
