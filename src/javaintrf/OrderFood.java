package javaintrf;

public class OrderFood {
    
    private String vegitables;
    private String oil;
    private OrderInterFace interFace;
    
    public OrderFood(String vegitables,String oil,OrderInterFace interFace) {
        this.vegitables = vegitables;
        this.oil = oil;
        this.interFace = interFace;
        
    }
    
    public void startPreparing(){
        String food = vegitables+oil;
        interFace.foodIsReadyHere(food);
    }
    
}
