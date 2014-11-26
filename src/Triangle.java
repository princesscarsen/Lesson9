import TurtleGraphics.Pen;

public class Triangle extends AbstractShape {
    private double x2,y2,x3,y3,a,b;
    
    
    public Triangle(){
        super();
        x2=50;
        y2=50;
        x3=100;
        y3=0;
        a=0;
        b=0;
        
               
    }
    

    
    public double area() {
    return Math.abs((xPos*y2-x2*yPos) + (x2*y3-x3*y2) + (x3*yPos-xPos*y3))/2;
    }
   public void move(double x, double y){
    a=x-xPos;
    b=y-yPos;
    xPos=x;
    yPos=y;
    x2=x2+a;
    y2=y2+b;
    x3=x3+a;
    y3=y3+b;
  }

    
    public void draw(Pen p) {
    p.up();
    p.move(xPos,yPos);
    p.down();
    p.move(x2,y2);
    p.move(x3,y3);
    p.move(xPos,yPos);
    
    }

    
    public void stretchBy(double factor) {
    x2=(x2-xPos)*factor + xPos;
    y2=(y2-yPos) * factor + xPos;
    x3=(x3-xPos) * factor + xPos;
    y3=(y3-yPos) *factor + xPos;
    }

    
    public double perimeter() {
    return Math.sqrt((xPos-x2)*(xPos-x2)+(yPos-y2)*(yPos-y2));
    }
    
}
