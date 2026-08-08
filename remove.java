import java.util.ArrayList;
import java.util.Scanner;

public class Remove {
    public static void remove(ArrayList<Board> boardList) {
        if (boardList.size() == 0) {
            System.out.println("삭제할 수 있는 게시물이 없습니다.\n");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제하실 게시물의 번호를 입력해주세요 : ");
        int want_idx = -1;
        try {
            want_idx = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해 주세요.\n");
            return;
        }
        if (want_idx <= 0) {
            System.out.println("올바른 번호를 입력해주세요.\n");
            return;
        }
        int target_idx = -1;
        for (int i = 0; i < boardList.size(); i++) {
            if (want_idx == boardList.get(i).id) {
                target_idx = i;
                break;
            }
        }
        if (target_idx == -1) {
            System.out.println("해당 게시물이 없습니다.\n");
            return;
        }
        boardList.remove(target_idx);
        for (int i = target_idx; i < boardList.size(); i++) {
            boardList.get(i).id--;
        }
        System.out.println("게시물이 성공적으로 삭제되었습니다.\n");
    }
}
