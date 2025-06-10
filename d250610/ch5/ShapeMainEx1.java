package d250610.ch5;

public class ShapeMainEx1 {
    public static void main(String[] args) {
        CircleEx circleEx1 = new CircleEx();
        circleEx1.draw();
        RectangleEx1 rectangleEx1 = new RectangleEx1();
        rectangleEx1.draw();

        ShapeEx1 shapeEx12 = new CircleEx(); // 자식 타입 -> 부모 타입 , 형변환, 업 캐스팅
        ShapeEx1 shapeEx13 = new RectangleEx1();
        shapeEx12.draw();
        shapeEx13.draw();


    }
}
