public class TriangleClassifier {
    public static boolean isTriangle(int side1, int side2, int side3){
        boolean isPositive = side1 > 0 & side2 > 0 & side3 > 0;
        boolean isTriangle = (side1 + side2 > side3) & (side2 + side3 > side1) & (side3 + side1 > side2);
        return isPositive & isTriangle;
    }

    public static String classifyTriangle(int side1, int side2, int side3) {
        String message = "";
        boolean isEquilateral = (side1 == side2) & (side2 == side3);
        boolean isIsosceles = (side1 == side2) || (side2 == side3) || (side3 == side1);

        if (isTriangle(side1, side2, side3)){
            if (isEquilateral) {
                message = "Equilateral triangle";
            } else {
                if (isIsosceles) {
                    message = "Isosceles triangle";
                } else {
                    message = "Triangle";
                }
            }
        } else {
            message = "Not a triangle";
        }
        return message;
    }
}
