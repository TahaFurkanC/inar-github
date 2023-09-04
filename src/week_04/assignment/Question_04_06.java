package week_04.assignment;

public class Question_04_06 {
    public static void main(String[] args){
        final double RADIUS = 40 ;

        double angle = Math.random() * 2 * Math.PI ;
        double x1 = RADIUS * Math.cos(Math.toRadians(angle));
        double y1 = RADIUS * Math.sin(Math.toRadians(angle));

        angle = Math.random() * 2 * Math.PI;
        double x2 = RADIUS * Math.cos(Math.toRadians(angle));
        double y2 = RADIUS * Math.sin(Math.toRadians(angle));

        angle = Math.random() * 2 * Math.PI;
        double x3 = RADIUS * Math.cos(Math.toRadians(angle));
        double y3 = RADIUS * Math.sin(Math.toRadians(angle));

        // Compute three sides of the triangle with given points
        double a = Math.sqrt((x2 - x3) * (x2 - x3)
                + (y2 - y3) * (y2 - y3));
        double b = Math.sqrt((x1 - x3) * (x1 - x3)
                + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x1 - x2) * (x1 - x2)
                + (y1 - y2) * (y1 - y2));

        // Compute the angles of the triangle using values for three sides
        double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)
                / (-2 * b * c)));
        double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)
                / (-2 * a * c)));
        double C = Math.toDegrees(Math.acos((c * c - b * b - a * a)
                / (-2 * a * b)));


        // Display result
        System.out.println("The three angles are " +
                Math.round(A * 100) / 100.0 + " " + Math.round(B * 100) / 100.0 + " " +
                Math.round(C * 100) / 100.0);
    }
}
