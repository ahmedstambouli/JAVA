package seance1;

public class Robot {
	 public int abs;
	 public int ord;
	 public int ori;
	
	public int getAbs()
	{
		return abs;
	}
	
	public int getOrd()
	{
		return ord;
	}
	
	public int getOri()
	{
		return ori;
	}
	
	
	public void setAbs(int a)
	{
		 abs=a;
	}
	
	public void setOrd(int a)
	{
		 ord=a;
	}
	
	public void setOri(int a)
	{
		 ori=a;
	}
	
	
	public Robot()
	{
		abs=0;
		ord=0;
		ori=0;
	}
	
	public Robot (int a , int b , int c)
	{
		abs=a;
		ord=b;
		ori=c;
	}
	
	
	public String toString()
	{
		return("abs = "+ abs + " ,ord ="+ ord+" ,ori ="+ori);
	}
	
		
	public boolean  equals(Robot R) {
		
		return ((this.abs == R.abs) && (this.ord == R.ord));
	}
	
		public void avencer(int dp) {
			this.abs+=dp;
			this.ord=dp;
			
		}
		
		public void avencer(int dx, int dy) {
			this.abs+=dx;
			this.ord=dy;
			
		}

}
