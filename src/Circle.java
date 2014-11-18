import TurtleGraphics.Pen;

public class Circle extends AbstractShape{

   protected double radius;
    
    public Circle(){
     super();
     radius=1;
    }
    
    public Circle(double x, double y, double r){
        super();
        radius=r;
    }
    
      public double area() {
            return Math.PI * radius * radius;
    }

   
    public void draw(Pen p) {
        double side = 2.0 * Math.PI * radius / 120.0;
        p.up();
        p.move(xPos + radius,yPos);
        p.setDirection(90);
        p.down();
        
        for (int i=1; i<120; i++)
        {
            p.move(side);
            p.turn(3);
        }
    }
    public void stretchBy(double factor) {
        radius *= factor;
    }
    
    public String toString(){
        String str="This is a CIRCLE\n";
        str += "XLOC: " + xPos + "\tYLOC: " + yPos + "\n";
        str += "RADIUS: " + radius + "\n";
        str += "AREA: " + area();
        return str;
    }
    
}
