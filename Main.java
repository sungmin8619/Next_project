import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  static ArrayList<Board> boardList = new ArrayList<>(); 
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    while(true) {
      menu();
      int choice = Integer.parseInt(scanner.nextLine());

      switch(choice){
        case 1:
          Create.create(boardList);
          break;

        case 2:
          Visit.visit(boardList);
          break;

        case 3:
          Remove.remove(boardList);
          break;

        case 4:
          Edit.edit(boardList);
          break;

        case 5:
          System.out.println("게시판을 종료합니다.");
          return;

          default:
            System.out.println("잘못된 입력입니다. 메뉴를 다시 입력해주세요.");
            break;

      }
    }
  }
  private static void menu() {
    System.out.println("[게시판]");
    System.out.println("1. 작성");
    System.out.println("2. 조회");
    System.out.println("3. 삭제");
    System.out.println("4. 수정");
    System.out.println("5. 종료");
    System.out.println("메뉴를 선택해 주세요: ");

  }
}
