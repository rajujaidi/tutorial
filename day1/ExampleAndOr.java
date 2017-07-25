package Day1;

public class ExampleAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int x,y;
 x =10;
 y =-10;
  if (x >0&& y>0){
	  System.out.println("Both num are +ve" );
  }else if(x>0||y>0){
	  System.out.println("Atleast one num +ve");
  }else {
	  System.out.println("Both nums are -ve");
  }
	}

}
