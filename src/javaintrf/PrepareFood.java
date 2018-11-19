
package javaintrf;

public abstract class PrepareFood {
    
    private String vegitables;
    private String oil;
    

    public PrepareFood(String vegitables,String oil) {
        this.vegitables = vegitables;
        this.oil = oil;
        
    }
    
    public void startPreparing(){
        String food = vegitables+oil;
        foodIsReadyHere(food);
    }
    
    public abstract void foodIsReadyHere(String food);//
    
    
}
