package point_2d;

public class Point2DMain {

    public static void main(String[] args) {
        
        Point2D point1 = new Point2D(3, 4);
        Point2D point2 = new Point2D(1, 1);
        
        point1.getParam();
        System.out.printf("Разстоянията от точките до координатното начало е %.3f\n\n", point1.pointCoordinate());
        
        point2.getParam();
        System.out.printf("Разстоянията от точките до координатното начало е %.3f\n\n", point2.pointCoordinate());
        
        PointRelation relation = new PointRelation();
        relation.pointRelation(point1, point2);  
    }
}
