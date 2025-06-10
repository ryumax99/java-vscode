package d250610.ch6;

public class Object_Ex1 {
    String name;
    
    public Object_Ex1(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        String result = "이 클래스의 맴버 변수 name의 값" + name;
        return name;
    }
}
