package seance1;

public class TestRobot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Robot R1=new Robot();
			
			
			Robot R2 =new Robot(5, 4, 20);
			System.out.println(R2);
			/*Robot R3=null;
			R3=R2;
			Robot R4 =new Robot(5, 4, 20);
			Robot R5 =new Robot(50, 40, 20);
			System.out.println(R1);
			System.out.println(R3);
			System.out.println("R2 == R4 donne"+ " "+(R2.equals(R4)));*/
			//equals 
			//System.out.println(R2.equals(R4));
			//System.out.println(R2.equals(R5));
			
			
			//R2.setAbs(4);
			//R2.setOrd(5);
			//R2.setOri(10);
			R2.abs=4;
			R2.ord=6;
			

			
			System.out.println(R2);

	}
}
