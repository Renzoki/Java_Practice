public class HaloHalo {
    private String size;
    private int orderNumber;
    private double cost;

    //Constructor (Sets the cost based on size)
    public HaloHalo(String size){
        this.size = size;
        switch (size){
            case "Small":
                this.cost = 88.0d;
                break;
            case "Medium":
                this.cost = 109.0d;
                break;
            case "Large":
                this.cost = 129.0d;
                break;
        }
    }

    //Setter methods
    public void setOrderNumber(int orderNum){ //Sets the order number
        this.orderNumber = orderNum;
    }

    public void addSangkap(Sangkap ingredient) {
        String ingredientName = ingredient.getSangkap();
        double ingredientCost = ingredient.getIngredientCost(ingredientName);

        cost += ingredientCost;
        System.out.println("Adding " + ingredientName + " " + ingredientCost);
    }

    //Getter methods
    public int getOrderNumber(){
        return orderNumber;
    }

    public String getSize(){
        return size;
    }

    public double getCost(){
        return cost;
    }

    public double getTotalCost(){
        return cost;
    }
}
