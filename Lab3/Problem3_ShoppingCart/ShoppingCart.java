import java.util.*;

public class ShoppingCart {
    private ArrayList<Product> items = new ArrayList<>();
    private double discountPercent = 0.0; // 0..100

    public void addProduct(Product p){
        // TODO: add product to list
        // throw new UnsupportedOperationException("TODO");
         items.add(p);
    }

    public boolean removeProductById(int id){
        // TODO: remove first product with id; return true if removed
        // throw new UnsupportedOperationException("TODO");
         for (int i = 0; i < items.size(); i++){
        if (items.get(i).getId() == id){
            items.remove(i);
            return true;
        }
    }
    return false;
    }

    public void applyDiscount(double percent){
        // TODO: set discountPercent (0..90 inclusive), else throw IllegalArgumentException
        // throw new UnsupportedOperationException("TODO");

         if(percent < 0 || percent > 90) 
            throw new IllegalArgumentException("Discount must be 0-90%");
        discountPercent = percent;
    }

    public double getTotalCost(){
        // TODO: sum of prices minus percent discount
        // throw new UnsupportedOperationException("TODO");
    double total = 0.0;
        for (Product p : items){
            total += p.getPrice();
        }
        total = total * (1 - discountPercent / 100.0);
        return total;
    }


    public int size(){
         return items.size();
    }
}
