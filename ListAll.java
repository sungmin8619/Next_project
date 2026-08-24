import java.util.ArrayList;

public class ListAll {
    public static void listall(ArrayList<Board> boardList) {
        System.out.println("[Next's 게시판]");

        if(boardList.isEmpty()) {
            System.out.println("작성된 게시글이 없습니다.");
        }

        for(Board board : boardList) {
            System.out.println(board.id + " " + board.title + " " + board.writer);
        }
    }
}
