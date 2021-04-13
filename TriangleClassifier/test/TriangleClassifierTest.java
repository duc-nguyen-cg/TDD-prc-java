import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void classifyTriangle222() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 2;
        String expected = "Equilateral triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void classifyTriangle223() {
        int side1 = 2;
        int side2 = 2;
        int side3 = 3;
        String expected = "Isosceles triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void classifyTriangle345() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        String expected = "Triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void classifyTriangle823() {
        int side1 = 8;
        int side2 = 2;
        int side3 = 3;
        String expected = "Not a triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void classifyTriangleMinus121() {
        int side1 = -1;
        int side2 = 2;
        int side3 = 1;
        String expected = "Not a triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    void classifyTriangle011() {
        int side1 = 0;
        int side2 = 1;
        int side3 = 1;
        String expected = "Not a triangle";
        String result = TriangleClassifier.classifyTriangle(side1, side2, side3);
        assertEquals(expected, result);
    }
}