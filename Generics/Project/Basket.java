import java.util.ArrayList;
public class Basket<U extends Fruit> {
    ArrayList<U> basket = new ArrayList<>();
    private float basketWeight = 0;
    public<U> void add(){
        
    }
    public float getBasketWeight(ArrayList<U> basket){
        for(int i = 0; i < basket.size(); i++){
            basketWeight += basket.get(i).getWeight();  
        }

    }

}
