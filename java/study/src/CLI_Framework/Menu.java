package CLI_Framework;

import ch07.sec10.exam01.Phone;

public class Menu {
    String menus [] = {"학생수","점수입력","점수리스트","분석","종료"};

    public void printMenu() {
        System.out.println("-----------------------------------------------");
        for (int i =0; i< menus.length; i++) {
            System.out.printf("%d.$s | ", i+1,menus[i]);
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
    }

    public int getSelect() {
        int selectNo = Input.getInt("선택> ");
        return selectNo;
    }
}
