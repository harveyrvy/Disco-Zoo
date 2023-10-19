

/**
 * Hello
 */
public class Main {

    static Board createBoard() {
        Board board = new Board();
        return board;
    }





    public static Animal createFarmAnimals(){
        Pair[] rabbitShape = {new Pair(0,0), new Pair(1,0), new Pair(2,0), new Pair(3,0)};
        final Animal r1 = new Animal("Rabbit", rabbitShape); 
        return r1;
    }

    public static void main(String[] args) throws Exception {
        Board board = createBoard();
        Animal r1 = createFarmAnimals();
        board.changeBoard(0,0,r1);
        board.printBoard();
        board.printCount();

    }

    

}