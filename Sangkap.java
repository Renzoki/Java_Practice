public class Sangkap {
    private String ingredient;

    public Sangkap(String ingredient){
        this.ingredient = ingredient;
    }

    public String getSangkap(){
        return ingredient;
    }

    public double getIngredientCost(String ingredient){
        this.ingredient = ingredient;

        if (ingredient.equals("Macapuno")){
            return 15.0d;
        }
        if (ingredient.equals("Kaong")){
            return 5.0d;
        }
        if (ingredient.equals("Ube")){
            return 17.0d;
        }
        if (ingredient.equals("Leche Flan")){
            return 20.0d;
        }
        if (ingredient.equals("Langka")){
            return 30.0d;
        }
        else
            return 0;
    }
}
