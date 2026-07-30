import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Create {

    static Scanner scanner = new Scanner(System.in);

    public static void create(ArrayList<Board> boardList) {
        Board board = new Board();

        // id 생성
        board.id = boardList.size() + 1;

        // 제목 입력
        System.out.println("제목: ");
        board.title = scanner.nextLine();

        // 내용 입력
        System.out.println("내용: ");
        board.content = scanner.nextLine();

        // 작성자
        System.out.println("작성자: ");
        board.writer = scanner.nextLine();

        // 날짜 (현재 날짜)
        board.date = LocalDate.now().toString();

        // 저장
        boardList.add(board);

        System.out.println("추가되었습니다.");
    }
}
