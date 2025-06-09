package d250609.ch4;

public class BankAccount {
    String owner;
    static int accountCount = 0;
    public static final double INTEREST_RATE = 0.02;
    public BankAccount(String owner){
        this.owner = owner;
        accountCount++;
    }
    public static void showInfo() {
        System.out.println("현재 총 계좌 건수 : " + accountCount + ", 이자율 : "+ INTEREST_RATE);
    }
}
