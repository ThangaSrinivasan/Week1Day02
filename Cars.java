package week1.day2;
public class Cars {	
	public boolean applyBreak()
	{
		return true;
	}
	public int applyGear()
	{
		return 4;
	}
	public String switchOnAc()
	{
	    String ac = "on";
		return ac;
	}
	public boolean applyaccelerator()
	{
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cars scross = new Cars();
        System.out.println(scross.applyBreak());
        System.out.println(scross.applyGear());
        System.out.println(scross.applyaccelerator());
        System.out.println(scross.switchOnAc());
	}

}
