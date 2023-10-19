import java.util.Arrays;


public class Board {
    
    Tile[][] matrix = new Tile[5][5];

    Board(){
        generateDefaultBoard();
    }

    Board(Animal animal, Tile startTile) {
        generateDefaultBoard();

    }


    public void changeBoard(int startX, int startY, Animal animal) throws Exception{
        Pair[] tilesToBeChanged = animal.tiles;
        for (int i = 0; i < tilesToBeChanged.length; i++) {
            // First check for errors when placing the animal
            if(startX + tilesToBeChanged[i].getX() < 0 || startX + tilesToBeChanged[i].getX() > 4 || startY + tilesToBeChanged[i].getY() < 0 || startY + tilesToBeChanged[i].getY() > 4 ){
                throw new Exception("Animal will be placed outside of board");
            }
            if (this.matrix[startX + tilesToBeChanged[i].getX()][startY + tilesToBeChanged[i].getY()].state != false) {
                throw new Exception("Replacing over another animal");
            }
            // ...then place the animal if all is okay
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
