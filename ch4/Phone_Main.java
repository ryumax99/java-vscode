package ch4;

public class Phone_Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.model = "s24";
        phone1.price = "120만원";
        phone1.company = "삼성";
        phone1.showInfo();
        Phone phone2 = new Phone();
        phone2.model = "s25";
        phone2.price = "150만원";
        phone2.company = "삼성";
        phone2.showInfo();
        Phone phone3 = new Phone();
        phone3.model = "Iphone 16";
        phone3.price = "130만원";
        phone3.company = "애플";
        phone3.showInfo();
    }
}
