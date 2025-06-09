package d250609.ch5;

public class Dog_Ex1 extends Animal_Ex1 {
    private String nation;

    @Override

    public void speak() {
        System.out.println("난 멍멍이야, 그래서 멍멍할게 ");
    }

    public Dog_Ex1() { 
    };

    public Dog_Ex1(String name, String nation) {
        
        super(name);


        this.nation = nation;
    }

    
    public void showInfo() {
        System.out.println("이름 : " + name);
        System.out.println("나라 : " + nation);
    }
}
