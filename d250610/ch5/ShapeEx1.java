package d250610.ch5;

public class ShapeEx1 {
    private String kind;
    private String name;

    public void draw() {
        System.out.println("도형 그리기 기능");
    }

    public ShapeEx1() {
    }

    public ShapeEx1(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    // 게터/세터 여부,
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // showInfo 여부.
    public void showInfo() {
        System.out.println("종류 : " + kind);
        System.out.println("이름 : " + name);
    }
}
