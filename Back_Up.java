import java.util.ArrayList;
import java.util.Scanner;

public class Back_Up {
    public static ArrayList<Board> backUpList = new ArrayList<>();
    public static void saveBackup(Board board) {
        backUpList.add(board);
    }
    public static void restore(ArrayList<Board> boardList) {
        if (backUpList.isEmpty()) {
            System.out.println("불러올 수 있는 게시물이 없습니다.\n");
            return;
        }
        for(int i = 0;i < backUpList.size();i++){
            System.out.println("글 번호 : " + backUpList.get(i).id + "제목 : " + backUpList.get(i).title + "작성자 : " + backUpList.get(i).writer);
        }
        Scanner sc = new Scanner(System.in);
        int target_idx = -1;
        while(true){
            System.out.print("불러오실 게시물의 번호를 입력해주세요 : ");
            int want_idx = -1;
            try{
                want_idx = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e) {
                System.out.println("숫자만 입력해 주세요.\n");
                continue;
            }
            if(want_idx <= 0) {
                System.out.println("올바른 번호를 입력해주세요.\n");
                continue;
            }
            target_idx = -1;
            for(int i = 0; i < backUpList.size(); i++) {
                if(want_idx == backUpList.get(i).id) {
                    target_idx = i;
                    break;
                }
            }
            if(target_idx == -1) {
                System.out.println("해당 게시물이 없습니다.\n");
                continue;
            }
            break;
        }
        Board restoredBoard = backUpList.remove(target_idx);
        restoredBoard.id = boardList.size() + 1;
        boardList.add(restoredBoard);
        System.out.println("게시물이 복구되었습니다.\n");
    }
}
