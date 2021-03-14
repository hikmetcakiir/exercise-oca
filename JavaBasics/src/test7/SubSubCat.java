package test7;

public class SubSubCat{
	public static void main(String []args){
		System.out.println("Hello From SubSubCat");
		SubCat subCat = new SubCat();
		System.out.println("Greeting from "+subCat.sayHi());
	}
}