package homework.rsw0605.ch4;

public class Model {
    String carname;
    String manufacturer;
    String vin;
    String regDate;

    public Model(String carname, String manufacturer, String vin, String regDate) {
        this.carname = carname;
        this.manufacturer = manufacturer;
        this.vin = vin;
        this.regDate = regDate;
    }

    public void showInfo() {
        System.out.println("자동차명 : " + this.carname);
        System.out.println("제조사 : " + this.manufacturer);
        System.out.println("연식 : " + this.vin);    
        System.out.println("등록일 : " + this.regDate);
        System.out.println("===============================================================");
    }
    public String getCarname() {
        return carname;
    }

    public String getManuf() {
        return manufacturer;
    }

}
// carname, manufacturer, vin, regDate