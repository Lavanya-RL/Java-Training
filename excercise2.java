package day3;

interface calcarea{
	public void area();
	
}
interface calcvol{
	public void volume();
}
class circle implements calcarea{

	int r=10;
	int arr;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		arr=(int) (3.14*r*r);
		System.out.println("area of circle is"+arr);
	}
	
}
class square implements calcarea{
	int a=10;
    int arr;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		arr=a*a;
		System.out.println("area of square"+arr);
	}
	
}
class triangle implements calcarea{
     int a=10,b=12,c=13,arr;
	@Override
	public void area() {
		// TODO Auto-generated method stub
		arr=(a+b+c)/2;
		System.out.println("area of triangle is"+arr);
				
	}
	
}
class sphere implements calcarea,calcvol{
    int r=10,vol,arr;
	@Override
	public void volume() {
		// TODO Auto-generated method stub
		vol= (int) ((int)(4/3)*3.14)*r*r*r;
		System.out.println("volume of sphere is"+vol);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		arr=(int)3.14*r*r;
		System.out.println("are OF SPHERE"+arr);
	}
	
}
class cuboid implements calcarea,calcvol{
     int a=10,arr,vol;
	@Override
	public void volume() {
		// TODO Auto-generated method stub
		vol=a*a*a;
		System.out.println("volume of cuboid is"+vol);
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		arr=a*a;
		System.out.println("area of cuboid"+arr);
	}
	
}
public class excercise2 {
	public static void main(String[] args) {
		
	
	circle cir=new circle();
    square sq=new square();
    triangle tr=new triangle();
    sphere sp=new sphere();
    cuboid cub=new cuboid();
    cir.area();
    sq.area();
    tr.area();
    sp.area();
    sp.volume();
    cub.area();
    cub.volume();
    
}
}
