package d250609.ch4;

public class StaticEx4Main {
    public static void main(String[] args) {
        StaticEx4 staticEx4_1 = new StaticEx4("류성원1");

        System.out.println("총 수 확인");
        StaticEx4.showInfoTotal();

        StaticEx4 staticEx4_2 = new StaticEx4("류성원2");
        StaticEx4.showInfoTotal();

        StaticEx4 staticEx4_3 = new StaticEx4("류성원3");
        StaticEx4.showInfoTotal();
    }
}
