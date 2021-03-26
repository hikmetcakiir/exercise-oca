public class Test4 {
    public static int operators(){         
         int x1 = -4;
	 System.out.println("x1= " + x1);
         int x2 = x1--;         
	 System.out.println("x2= " + x2);
	 System.out.println("x1= " + x1);
	 int x3 = ++x2;         
	 System.out.println("x3= " + x3);
	 System.out.println("x2= " + x2);
	 System.out.println("x1= " + x1);
	 if(x2 > x3){             
          --x3;         
         }else{             
          x1++;         
	}         
	return x1 + x2 + x3;     
    }     

    public static void main(String[] args) {
         //System.out.println(operators());
	 //String s = 63 + new Integer(10);
	 //System.out.println('6a');
	 System.out.println(63 + new Integer(47));
	 //String a = 'a';
	Boolean b = new Boolean(null);
	Boolean bc = new Boolean("True");
	if(b == bc);
	Integer c = new Integer('1');
	//String fr = new String('c');
	System.out.println(c);
	System.out.println('b'+new Integer(63));
	char newChar = 12;

	short xxx = 4;
	short y = xxx++; // = xxx + 4;
	System.out.println(y);

	Test4 t = new Test4();
	System.out.println(t.ss);
     }
	
	 
	String ss = this.toString();

}