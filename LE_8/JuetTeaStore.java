class JuetTeaStore{
    Tea tea;
    abstract Tea MakeTea(String type);
    void order(String type){
        tea = MakeTea(type);
        
        tea.boil();
        tea.serve();
        
    }
}