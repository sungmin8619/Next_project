import java.util.ArrayList;
import java.util.Scanner;

public class Visit{
    public static void visit(ArrayList<Board> boardList){

        Scanner sc = new Scanner(System.in);

        // 게시글이 없을 때
        if(boardList.size() == 0){
            System.out.println("게시글이 없습니다 !");
            return;
        }

        System.out.println("조회하시겠습니까 ? (y/n)");
        String yn = sc.nextLine();

        if(yn.equals("y")){
            int k = boardList.size();
            int n = 0;
            boolean d = false;

            System.out.println("제목을 입력해주세요.");
            String ti = sc.nextLine();

            for(int i = 0; i < k; i++) {
                if (ti.equals(boardList.get(i).title)){
                    d = true;
                    n = i;  // id가 아니라 index 저장
                }
            }
            if(!d){
                System.out.println("찾으시는 제목이 없습니다 !");
            }
            if(d) {
                System.out.println(boardList.get(n).id + boardList.get(n).writer + boardList.get(n).title + boardList.get(n).date);
                System.out.println(boardList.get(n).content);
            }
        }
    }
}
