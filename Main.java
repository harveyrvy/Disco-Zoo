/**
 * Hello
 */
public class Main {

    static Board createBoard() {
        Board board = new Board();
        return board;
    }


    public static void main(String[] args) {
        Board board = createBoard();
        System.out.println(board.toString());
        Animal rabbit = new Animal("Rabbit");
        board.changeBoard(0,1,rabbit);
        System.out.println(board.toString());

    }
}