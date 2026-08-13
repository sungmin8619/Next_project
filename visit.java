import java.util.ArrayList;
import java.util.Scanner;

class Visit{
    public static void visit(ArrayList<Board> boardList){

        Scanner sc = new Scanner(System.in);

        System.out.println("Look it up ? (y/n)");
        String yn = sc.nextLine();

        if(yn.equals("y")){
            int k = boardList.size();
            int n = 0;
            boolean d = false;
            System.out.println("What's title ?");   //어떤 게시글 조회?
            String ti = sc.nextLine();              //제목 입력 받음

            for(int i = 0; i < k; i++) {           //title에 맞는 id 찾기
                if (ti.equals(boardList.get(i).title)){
                    d = true;
                    n = boardList.get(i).id;
                }
            }
            if(!d){
                System.out.println("error !");  //입력 받은 제목과 게시글의 제목이 다르면 error 표시
            }
            if(d) {
                System.out.println(boardList.get(n).id + boardList.get(n).writer + boardList.get(n).title + boardList.get(n).date);
                System.out.println(boardList.get(n).content);          //타이틀에 연결된 내용 불러옴
            }
        }
    }
}
