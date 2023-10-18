import java.util.Arrays;

public class Board {
    
    Tile[][] matrix = new Tile[5][5];

    Board(){
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = new Tile();
            }
        }
    }



    public void changeBoard(int x, int y, Animal animal){
        this.matrix[x][y] = new Tile(animal);
    }


    @Override
    public String toString() {
        return Arrays.deepToString(this.matrix);
    }



    

    
}
