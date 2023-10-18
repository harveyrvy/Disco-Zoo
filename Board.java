

public class Board {
    
    //Tile[][] matrix = new Tile[5][5];
    String[][] matrix = new String[5][5];

    Board(){
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                //this.matrix[i][j] = new Tile();
                this.matrix[i][j] = "cell";
            }
        }
    }


    @Override
    public String toString() {
        System.out.println(this.matrix);
        return this.matrix.toString();
    }



    

    
}
