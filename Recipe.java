public class Recipe {

    String name;
    double price;
    boolean veganrecipe;

    public Recipe(String name, double price,  boolean veganrecipe){

        this.name=name;
        this.price=price;
        this.veganrecipe=veganrecipe;
    }

    public void getRecipeInfo(){
        System.out.println("Name: "+name+", price:"+price);
    }



}
