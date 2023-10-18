/**
 * Hello
 */
public class Main {

    static Board createBoard() {
        Board board = new Board();
        return board;
    }


    public static void main(String[] args) {
        System.out.println("Hello World");
        Board board = createBoard();
        System.out.println(board.toString());

    }
}