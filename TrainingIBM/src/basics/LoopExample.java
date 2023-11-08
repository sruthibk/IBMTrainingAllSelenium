package basics;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<9;i++) {
			System.out.println("line of code"+ i);
		}
		
		//---------while loop--
		int i = 5;
		while(i>1)
		{
			System.out.println("value of i" + i);
			i = i-1;
			
		}
		
		int x = 20;
		do {
			System.out.println("value of x"+ x);
			x=x+1;
			
		}
		while(x<20);
	}

}
