

public class Animal {

    String name;
    Pair[] tiles;



    Animal(String name){
        this.name = name;
        Pair[] defaultTiles = {new Pair(0,0)};
        this.tiles = defaultTiles;
    }

    Animal(String name, Pair[] tiles){
        this.name = name;
        this.tiles = tiles;
    }
}
