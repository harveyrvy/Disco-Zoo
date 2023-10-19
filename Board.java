import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    
    Tile[][] matrix = new Tile[5][5];

    Board(){
        generateDefaultBoard();
    }

    Board(Animal animal, Tile startTile) {
        generateDefaultBoard();

    }


    public void changeBoard(int startX, int startY, Animal animal){
        Pair[] tilesToBeChanged = animal.tiles;
        for (int i = 0; i < tilesToBeChanged.length; i++) {
            System.out.println("Changing tile");
            System.out.println(tilesToBeChanged[i]);
            System.out.println(tilesToBeChanged[i].getX());
            this.matrix[startX + tilesToBeChanged[i].getX()][startY + tilesToBeChanged[i].getY()] = new Tile(animal);
        }
    }

    private void generateDefaultBoard() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = new Tile();
            }
        }
    }


    @Override
    public String toString() {
        return Arrays.deepToString(this.matrix);
    }

    
}
