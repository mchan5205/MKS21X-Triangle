public class Driver{
	public static void main(String[] args){
		Point p = new Point(5.0, 6.0);
		Point o = new Point(5.0, 8.0);
		System.out.println(p.getX());
		System.out.println(p.distanceTo(o));
		System.out.println(Point.distance(o, p));
		System.out.println(p);
	}	
}