import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        class Board {
            int id;
            String title;
            String content;
            String writer;
            String date;
        }
        
        ArrayList<Board> BoardList = new ArrayList<>();

        if(menu == 4){
            int target_idx = -1;
            Scanner sc = new Scanner(System.in);
            System.out.print("삭제하실 게시물의 번호(ID)를 입력해주세요 : ");
            int want_id = sc.nextInt();
            for(int i = 0;i < BoardList.size();i++){
                if(want_id == BoardList.get(i).id){
                    target_idx = i;
                    break;
                }
            }
            BoardList.remove(target_idx);
        }
    }
}
