import java.util.ArrayList;
import java.util.Scanner;

class Board {
    int id;
    String title;
    String content;
    String writer;
    String date;
}
        
class BoardManager{
    static ArrayList<Board> boardList = new ArrayList<>();
}

public class Remove{
    public static void remove(ArrayList<Board> boardList){
        if(menu == 4){
            if(boardList.size() == 0){
                System.out.println("삭제할 수 있는 게시물이 없습니다.\n");
                return;
            }
            int target_idx = -1;
            Scanner sc = new Scanner(System.in);
            System.out.print("삭제하실 게시물의 번호를 입력해주세요 : ");
            int want_idx = sc.nextInt();
            sc.nectline();
            if(want_idx <= 0){
                System.out.println("올바른 번호를 입력해주세요.\n");
                return;
            }
            for(int i = 0;i < boardList.size();i++){
                if(want_idx == boardList.get(i).id){
                    target_idx = i;
                    break;
                }
            }
            if(target_idx == -1){
                System.out.println("해당 게시물이 없습니다.\n");
                return;
            }
            boardList.remove(target_idx);
            for(int i = target_idx;i < boardList.size();i++){
                boardList.get(i).id--;
            }
        }
    }
}
