package methodas1;

public class  callmethod  {

int val=150;

int operation(int val) {
	val =val*10/100;
	return(val);
}

public static void main(String args[]) {
	callmethod d = new callmethod();
	System.out.println("Before operation value of data is "+d.val);
	d.operation(100);
	System.out.println("After operation value of data is "+d.val);
	}
}
