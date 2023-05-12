public class Sum {
public int sum(int x, int y) 
{ 
return (x + y); 
}
public int sum(int x, int y, int z)
{
 return (x + y + z);
}
public double sum(double x, double y)
{
 return (x + y);
}
public static void main(String args[])
{
 Sum s = new Sum();
 System.out.println(s.sum(10, 20));
 System.out.println(s.sum(10, 20, 30));
 System.out.println(s.sum(10.5, 20.5));
}
}
--------------------------------------------------------------------------------------------------------------------------------------------
Box.java
class Box
{
double width, height, depth;
Box(double w, double h, double d)
{
width = w;
height = h;
depth = d;
}
Box()
{
width = height = depth = 0;
}
Box(double len)
{
width = height = depth = len;
}
double volume()
{
return width * height * depth;
}
public static void main(String args[])
{
Box mybox1 = new Box(10, 20, 15);
Box mybox2 = new Box();
Box mycube = new Box(7);
double vol;
vol = mybox1.volume();
System.out.println(" Volume of mybox1 is " + vol);
vol = mybox2.volume();
System.out.println(" Volume of mybox2 is " + vol);
vol = mycube.volume();
System.out.println(" Volume of mycube is " + vol);
}
}
-------------------------------------------------------------------------------------------------------------------------------------
