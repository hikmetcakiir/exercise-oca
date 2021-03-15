public class AssignmentOperator{
	public static void main(String... args){
		//int x = (int)1.0;
		//short y =(short) 1921222;
		//int z = (int)9f;
		int t = (int)192301398193810323l;
		System.out.println(t);

		System.out.println("*************");
		short x = 10;
		short y = 3;
		//short z = x * y;
		short z = (short)(x * y);

		System.out.println("*************");
		int xx = 2, zz = 3;
		xx = xx * zz;
		xx *= zz;
		System.out.println("xx= " + xx);

		long valx = 10;
		int valy = 5;
		//valy = valy * valx;
		valy *= valx;
		System.out.println(valy);

		System.out.println("**********************");
		long value1 = 5;
		long value2 = (value1 = 6);
		System.out.println("value1=" +value1);
		System.out.println("value2=" +value2);
	}
}