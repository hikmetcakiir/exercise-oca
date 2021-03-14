package test2;

import java.util.List;
import java.util.ArrayList;

public class Finalizer{
	private static List objects = new ArrayList();
	protected void finalize(){
		//objects.add(this); //if comment out ,program will compile error
	}

}