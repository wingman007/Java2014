package point_2d;

public class PointRelation {
    
    protected void pointRelation(Point2D point1, Point2D point2) {

        if(point1.pointCoordinate() < point2.pointCoordinate()) {
            
            System.out.println("Релация за точките е : -1.\n");
        }
        
        if(point1.pointCoordinate() == point2.pointCoordinate()) {
            
            System.out.println("Релация за точките е : 0.\n");
        }
        
        if(point1.pointCoordinate() > point2.pointCoordinate()) {
            
            System.out.println("Релация за точките е : +1.\n");
        }
        
        double pointRelationProximity = point1.pointCoordinate() < point2.pointCoordinate() ? point1.pointCoordinate() : point2.pointCoordinate();
        
        System.out.printf("Точка %.3f е по-близо до координатното начало (0;0).\n", pointRelationProximity);
    }
}
