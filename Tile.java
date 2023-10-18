import java.util.Arrays;

public class Tile {
    
    boolean state;
    Animal animal;
    

    public Tile(){
        state = false;
        animal = new Animal("None");
    }

    @Override
    public String toString() {
        return "(" + this.state + ", " + this.animal.name + ")";
    } 
}
