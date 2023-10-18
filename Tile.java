

public class Tile {
    
    boolean state;
    Animal animal;
    

    public Tile(){
        state = false;
        animal = new Animal("None");
    }

    public Tile(Animal animal){
        state = true; 
        this.animal = animal;
    }


    @Override
    public String toString() {
        if (this.state == false) {
            return "Empty";
        }
        else {
            return this.animal.name;
        }
    } 
}
