package d250609.ch5_2;

public class Cat_Main_Ex1 {
    public static void main(String[] args) {
        Cat_Ex1 cat_Ex1 = new Cat_Ex1();
        cat_Ex1.favoriteFood = "소세지";
        cat_Ex1.showInfo();

        Cat_Ex1 cat_Ex2 = new Cat_Ex1("야옹님", "햄");
        cat_Ex2.showInfo();
    }
}
