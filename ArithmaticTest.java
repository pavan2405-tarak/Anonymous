package Anonymous;

public class ArithmaticTest {
	public static void main(String[] args) {
		Arithmatic sam=new Arithmatic() {
			@Override
		public int add() {
				// TODO Auto-generated method stub
				int a=10;
				int b=20;
				int c=a+b;
				System.out.println(c);
				return c ;
			}
			
			@Override
			int sub() {
				// TODO Auto-generated method stub
				int a=10;
				int b=5;
				int c=a-b;
				System.out.println(c);
				return c ;
			}
		};
		
		sam.add();
		sam.sub();
		
		
			
		
	}

}
