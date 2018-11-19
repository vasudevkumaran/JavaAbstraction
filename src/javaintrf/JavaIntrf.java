
package javaintrf;

public class JavaIntrf implements OrderInterFace{

    
    public static void main(String[] args) {
        PrepareFood food = new PrepareFood("Onion", "RiceBran") {
            @Override
            public void foodIsReadyHere(String food) {
                System.out.println("Below food handed over through Abstract Class");
                System.out.println(food);
            }
        };
        food.startPreparing();
        JavaIntrf intrf = new JavaIntrf();
        OrderFood orderFood = new OrderFood("Onion", "RiceBran", intrf);
        orderFood.startPreparing();
        
        
    }

    @Override
    public void foodIsReadyHere(String food) {
        System.out.println("Below food handed over through Interface");
        System.out.println(food);
    }
    
}
