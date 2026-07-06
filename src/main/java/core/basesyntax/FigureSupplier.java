package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    public static Figure getRandomFigure() {
        int figure = new Random().nextInt(5);
        String randomColor = ColorSupplier.getRandomColor();
        int size = new Random().nextInt(100);

        switch (figure) {
            case 0:
                return new Square(randomColor, size);
            case 1:
                return new Circle(randomColor, size);
            case 2:
                return new Rectangle(randomColor, size, size);
            case 3:
                return new RightTriangle(randomColor, size, size);
            case 4:
                return new IsoscelesTrapezoid(randomColor, size, size, size);
            default:
                return getDefaultFigure();
        }
    }

    public static Figure getDefaultFigure() {
        String color = "white";
        int radius = 10;
        return new Circle(color, radius);
    }
}
