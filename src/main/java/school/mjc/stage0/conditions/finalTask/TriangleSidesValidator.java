package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {

        if ( (firstSide + secondSide) > thirdSide && (firstSide + thirdSide) > secondSide && (secondSide + thirdSide) > firstSide ){
            System.out.println("this is a valid triangle");}
        else {
            System.out.println("it's not a triangle") ;}
    }
    public static void main(String[] args) {
        TriangleSidesValidator triangleSidesValidator = new TriangleSidesValidator();
        double firstSide = 1;
        double secondSide = 7;
        double thirdSide = 4;
        triangleSidesValidator.validate(firstSide,secondSide,thirdSide);
    }
}