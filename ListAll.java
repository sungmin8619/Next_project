import java.util.ArrayList;

public class ListAll {
    public static void listall(ArrayList<Board> boardList) {
        System.out.println("[Next's 게시판]");

        if(boardList.isEmpty()) {
            System.out.println("Empty");
        }

        for(Board board : boardList) {
            System.out.println(board.id + " " + board.title + " " + board.writer);
        }
    }
}
