import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Create {

    static Scanner scanner = new Scanner(System.in);

    public static void create(ArrayList<Board> boardList) {
        Board board = new Board();

        // id 생성
        board.id = boardList.size() + 1;

        while(true) {
            // 제목 입력
            System.out.println("제목: ");
            board.title = scanner.nextLine();

            // 제목이 공란일 경우
            if(board.title.isBlank()){
                System.out.println("제목은 비워둘 수 없습니다.");
                return;
            } else { // 제목 입력 -> 넘어가기
                break;
            }
        }

        while(true) {
            // 내용 입력
            System.out.println("내용: ");
            board.content = scanner.nextLine();

            // 내용이 공란일 경우
            if(board.content.isBlank()){
                System.out.println("내용은 비워둘 수 없습니다.");
                return;
            } else { // 내용 입력 -> 넘어가기
                break;
            }
        }

        while(true) {
            // 작성자
            System.out.println("작성자: ");
            board.writer = scanner.nextLine();

            // 작성자가 공란일 경우
            if(board.writer.isBlank()){
                System.out.println("작성자는 비워둘 수 없습니다.");
                return;
            } else { // 작성자 입력 -> 넘어가기
                break;
            }
        }

        // 날짜 (현재 날짜)
        board.date = LocalDate.now().toString();

        // 저장
        boardList.add(board);

        System.out.println("추가되었습니다.");
    }
}
