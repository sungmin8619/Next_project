import java.util.ArrayList;
import java.util.Scanner;

public class Edit {
    static Scanner scanner = new Scanner(System.in);

    public static void edit(ArrayList<Board> boardList) {

        if(boardList.isEmpty()){
            System.out.println("수정할 게시글이 없습니다.");
            return;
        }

        System.out.println("수정할 글 번호: ");
        int id;
        try{
            id = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해 주세요.");
            return;
        }

        if(id<=0){
            System.out.println("1 이상의 게시글 번호를 입력해주세요.");
            return;
        }

        for(Board board : boardList) {
            if(board.id == id) {

                // 제목 수정
                System.out.println("새 제목(변경하지 않으려면 Enter): ");
                String newTitle = scanner.nextLine();
                if(!newTitle.isBlank()) board.title = newTitle;

                // 내용 수정
                System.out.println("새 내용(변경하지 않으려면 Enter): ");
                String newContent = scanner.nextLine();
                if(!newContent.isBlank()) board.content = newContent;

                System.out.println("수정되었습니다.");
                return;
            }
        }

        System.out.println("해당 id의 게시글이 없습니다.");
    }
}

