package d250609.ch5_2;

import d250609.ch5.Animal_Ex1;

public class Cat_Ex1 extends Animal_Ex1 {
    String favoriteFood;
    
    public void showInfo(){
        System.out.println("좋아하는 음식" + favoriteFood);
    }

    public Cat_Ex1(){
        super();
    }

    public Cat_Ex1(String name, String favoriteFood){
        super(name);
    }


    
}
