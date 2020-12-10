public class Point {
   
private double x;
private double y;
   
public Point(double x0,double y0){
this.x = x0;
this.y = y0;
}
   
public double distanceTo(Point q){

double difference_square_x = (q.x-this.x)*(q.x-this.x);
double difference_square_y = (q.y-this.y)*(q.y-this.y);
return Math.sqrt(difference_square_x + difference_square_y);
}
   
public String toString() {
return "{" +
 "x=" + x +
 ", y=" + y +
'}';
}
   
public int quadrant(){
if (this.x> 0 & this.y>0) return 1;
else if (this.x< 0 & this.y>0) return 2;
else if (this.x< 0 & this.y<0) return 3;
else return 4;
}
  
public void flip(){
double x = (this.x)*-1;
double y = (this.y)*-1;
  System.out.println("Flipped co-ordinates are {" + x + y + "}" );
}

public static void main(String[] args) {

Point p = new Point(-1,2);
Point origin = new Point(0,0);

System.out.println("Point is:" + p);
System.out.println("Distance to origin is:" +p.distanceTo(origin));
System.out.println("Quadrant Number in which this point lies: " + p.quadrant());
  p.flip();
}
}
