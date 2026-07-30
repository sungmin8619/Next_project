import java.util.ArrayList;
import java.util.Scanner;

public class Edit {
    static Scanner scanner = new Scanner(System.in);

    public static void edit(ArrayList<Board> boardList) {
        System.out.println("수정할 글 번호: ");
        int id = Integer.parseInt(scanner.nextLine());

        for(Board board : boardList) {
            if(board.id == id) {

                // 제목 수정
                System.out.println("새 제목(변경하지 않으려면 Enter): ");
                String newTitle = scanner.nextLine();
                if(!newTitle.isEmpty()) board.title = newTitle;

                // 내용 수정
                System.out.println("새 내용(변경하지 않으려면 Enter): ");
                String newContent = scanner.nextLine();
                if(!newContent.isEmpty()) board.content = newContent;

                System.out.println("수정되었습니다.");
                return;
            }
        }
    }
}

