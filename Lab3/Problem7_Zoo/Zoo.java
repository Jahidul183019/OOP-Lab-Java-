import java.util.*;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void add(Animal a){ animals.add(a); }

    public void feedAll(){
        // TODO: For each animal, print: "<name> eats. Sound: <sound>"
        // Return type is void; we just require the exact print format for testing via a capture (not used here).
        // throw new UnsupportedOperationException("TODO");
        for(Animal a : animals){
            System.out.println(a.getName() + " eats. Sound: " + a.makeSound());
        }
    }

    public Animal oldest(){
        // TODO: return oldest animal (null if none)
        // throw new UnsupportedOperationException("TODO");
        if(animals.isEmpty()) return null;
        Animal oldest = animals.get(0);
        for(Animal a : animals){
            if(a.getAge() > oldest.getAge()) oldest = a;
        }
        return oldest;
    }

    public int size(){ return animals.size(); }
}
