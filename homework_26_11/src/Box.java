//написать класс Box с параметрами высота, длина, ширина, написать
// методы получения и задания этих параметров и мето вычисления
// обьема фигуры.
public class Box {
    int height;
    int width;
    int length;
    Box(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public void searchVolume() {
        System.out.print("The volume of the box: " + this.height * this.width * this.length + " cubic sm.");
    }
}
