package homework.rsw0605.ch4;

import java.util.Scanner;

import util.date.DateUtil;

public class Func {
    static final int MAX_CARS = 100; 

    static Model[] models = new Model[MAX_CARS];

    static int carCount = 0; 

    public static void addCar(Scanner scanner) {
        if (carCount < MAX_CARS) { 
            System.out.println("자동차명을 입력하세요: ");
            String carname = scanner.nextLine();

            System.out.println("제조사을 입력하세요: ");
            String manufacturer = scanner.nextLine();

            System.out.println("연식을 입력하세요: ");
            String vin = scanner.nextLine();

            String regDate = DateUtil.getCurrentDateTime();

            Model model = new Model(carname, manufacturer, vin, regDate);

            models[carCount] = model;
           
            carCount++;
            System.out.println("자동차가 추가되었습니다 :  차종 : " + carname + ", 제조사 :  " + manufacturer +  ", 연식 : " + vin + ", 등록일 : " + regDate);
            System.out.println("===============================================================");
        } else {
            System.out.println("자동차 수가 최대치를 초과했습니다.");
        }
    } 


    public static void viewCars() {
        if (carCount == 0) {
            System.out.println("등록된 자동차가 없습니다.");
            return; 
        }
        System.out.println("등록된 자동차 목록:");
        System.out.println("===============================================================");
        for (int i = 0; i < carCount; i++) {
            models[i].showInfo();
            System.out.println("===============================================================");
        }
    } 

    public static void updateCar(Scanner scanner) {
        System.out.println("수정할 자동차의 인덱스를 입력하세요 (0 ~ " + (carCount - 1) + "): ");
        int index = scanner.nextInt(); 
        scanner.nextLine(); 
        if (index < 0 || index >= carCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        System.out.println("수정할 자동차의 이름을 입력하세요: ");
        String carname = scanner.nextLine();
       

        System.out.println("수정할 자동차의 제조사를 입력하세요: ");
        String manufacturer = scanner.nextLine();
       

        System.out.println("수정할 자동차의 연식을 입력하세요: ");
        String vin = scanner.nextLine();
     


        String regDate = DateUtil.getCurrentDateTime();
   


        Model model = new Model(carname, manufacturer, vin, regDate);

        models[index] = model;

        System.out.println("자동차 정보가 수정되었습니다: " + carname + ", " + manufacturer + ", "
                + ", " + vin + ", 수정일자 :  " + regDate );
    } 

    public static void deleteCar(Scanner scanner) {
        System.out.println("삭제할 자동차의 인덱스를 입력하세요 (0 ~ " + (carCount - 1) + "): ");
        int index = scanner.nextInt(); 
        scanner.nextLine(); 

        if (index < 0 || index >= carCount) {
            System.out.println("잘못된 인덱스입니다.");
            return; 
        }

        Model model = models[index];
        System.out.println("삭제할 자동차 정보: ");
        model.showInfo(); 

        for (int i = index; i < carCount - 1; i++) {
            models[i] = models[i + 1]; 
        }
        
        models[carCount - 1] = null; 

     
        carCount--;
        System.out.println("자동차 정보가 삭제되었습니다.");
    }
    
    public static void addDummyCars() {
        for (int i = 0; i < 5; i++) {
            if (carCount < MAX_CARS) {
                Model dummyModel = new Model(
                        "더미자동차" + (i + 1),
                        "제조사" + (i + 1),
                        "연식" + (i + 1) ,
                        DateUtil.getCurrentDateTime());
                models[carCount] = dummyModel;
                carCount++;
            } else {
                System.out.println("더미 자동차 추가 실패: 최대 자동차 수 초과");
                break;
            }
        }
        System.out.println("더미 자동차가 5대 추가되었습니다.");
    }

    public static void searchCar(Scanner scanner) {
        System.out.println("검색할 자동차의 이름 또는 제조사를 입력하세요: ");
        String searchQuery = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < carCount; i++) {

            if (models[i].getCarname().contains(searchQuery) || models[i].getManuf().contains(searchQuery)) {

                models[i].showInfo();
                found = true;
            }
        }

        if (!found) { 
            System.out.println("검색 결과가 없습니다.");
        }
    }
    public static void car_main(Scanner scanner) {
        int menu;
        do {
            System.out.println("자동차 관리 프로그램");
            System.out.println("===============================================================");
            System.out.println("1. 자동차 추가 , 2. 자동차 조회, 3. 자동차 수정, 4. 자동차 삭제,");
            System.out.println("5. 더미 자동차 추가 5개, 6. 검색기능,  0. 종료");
            System.out.println("===============================================================");
            System.out.print("메뉴를 선택하세요(0 ~ 6): ");
            menu = scanner.nextInt();
            scanner.nextLine(); 
            switch (menu) {
                case 1:
                    Func.addCar(scanner);
                    break;
                case 2:
                    Func.viewCars();
                    break;
                case 3:
                    Func.updateCar(scanner);
                    break;
                case 4:
                    Func.deleteCar(scanner);
                    break;
                case 5:
                    Func.addDummyCars();
                    System.out.println("더미 자동차 5대가 추가되었습니다.");
                    break;
                case 6:
                    Func.searchCar(scanner);
                    System.out.println("자동차 검색 기능이 실행되었습니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
            }

        } while (menu != 0);
    }
}
