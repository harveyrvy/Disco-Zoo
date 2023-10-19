
public class Board {
    
    Tile[][] matrix = new Tile[5][5];
    int[][] counts = new int[5][5];

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
            // add a count to the tile where an animal is
            this.counts[startX + tilesToBeChanged[i].getX()][startY + tilesToBeChanged[i].getY()] += 1;
        }
    }

    private void generateDefaultBoard() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = new Tile();
                this.counts[i][j] = 0;
            }
        }
    }

    public void printBoard(){
        int rows = matrix.length;
        int columns = matrix[0].length;
        String str = "";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                str += matrix[i][j] + "\t";
            }
            System.out.println(str);
            str = "";
        }
        System.out.println();
    }

    public void printCount(){
        int rows = counts.length;
        int columns = counts[0].length;
        String str = "";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                str += counts[i][j] + "\t";
            }
            System.out.println(str);
            str = "";
        }
        System.out.println();
    }
    
}
