class solan extends JuetTeaStore{
    Tea MakeTea(String type){
        if(type.equals("Green"))
         return new GreenTea();
        else if(type.equals("Ginger"))
         return new GingerTea();
        else 
         return new RegularTea();
    }
}