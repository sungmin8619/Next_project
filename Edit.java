import java.util.ArrayList;
import java.util.Scanner;

public class Edit {
    static Scanner scanner = new Scanner(System.in);

    public static void edit(ArrayList<Board> boardList) {

        if (boardList.isEmpty()) {
            System.out.println("수정할 게시글이 없습니다.");
            return;
        }

        int id = 0;
        Board targetboard = null;

        while (true) {
            System.out.println("수정할 글 번호: ");

            try {
                id = Integer.parseInt(scanner.nextLine());

                // 0 이하의 숫자 입력
                if (id <= 0) {
                    System.out.println("1 이상의 게시글 번호를 입력해주세요.");
                    continue;
                }

                // 올바른 숫자 입력
                for (Board board : boardList) {
                    if (board.id == id) {
                        targetboard = board;
                        break;
                    }
                }

                if (targetboard == null) {
                    System.out.println("해당 id의 게시글이 없습니다. 올바른 id를 입력해 주세요.");
                    continue;
                }

                break;

            } catch (NumberFormatException e) { // 문자를 입력한 경우
                System.out.println("숫자만 입력해 주세요.");
            }
        }

        boolean isEdited = false;

        // 제목 수정
        System.out.println("새 제목(변경하지 않으려면 Enter): ");
        String newTitle = scanner.nextLine();
        if (!newTitle.isBlank()) {
            targetboard.title = newTitle;
            isEdited = true;
        }

        // 내용 수정
        System.out.println("새 내용(변경하지 않으려면 Enter): ");
        String newContent = scanner.nextLine();
        if (!newContent.isBlank()) {
            targetboard.content = newContent;
            isEdited = true;
        }

        if (isEdited) {
            System.out.println("수정되었습니다.");
        } else {
            System.out.println("수정된 내용이 없습니다.");
        }
        return;
    }
}
