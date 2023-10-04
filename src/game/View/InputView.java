package game.View;

import java.util.Scanner;

public final class InputView {
    private static Scanner sc = new Scanner(System.in);

    private InputView() {
    }

    public static String inputRaceSelection() {
        System.out.print("플레이어는 Terran, Protos, Zerg 세 가지 종족 중 하나를 선택해주세요 : ");
        return sc.nextLine().toLowerCase();
    }

    public static String[] inputUnitSelection() {
        System.out.print("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요 (번호로 입력): ");
        String[] unitsIndex;
        while (true) {
            unitsIndex = sc.nextLine().split(" ");
            if (unitsIndex.length != 2){
                System.out.println("아군 유닛과 적군 유닛의 번호를 다시 입력해주세요");
                continue;
            }

            try{
                Integer.parseInt(unitsIndex[0]);
                Integer.parseInt(unitsIndex[1]);
            }catch(NumberFormatException e){
                System.out.println("공백으로 나눠진 숫자로 입력해주세요.");
                continue;
            }

            return unitsIndex;
        }
    }
}
