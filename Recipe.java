public class Recipe {

    String name;
    double price;
    boolean veganrecipe;
    int numberTest1;
    String textTest1;

    public Recipe(String name, double price,  boolean veganrecipe){

        this.name=name;
        this.price=price;
        this.veganrecipe=veganrecipe;
    }

    public void getRecipeInfo(){
        System.out.println("Name: "+name+", price:"+price);
    }



}
