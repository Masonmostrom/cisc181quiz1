public class Baseballer 
{

	
	private int Hits;
	private int AB;
	private int BB;
	private int HBP;
	private int SF;
	private int single;
	private int doubles;
	private int triple;
	private int HR;
	
	private double BA;
	private double OBP;
	private double SLG;
	private double OBS;
	private double TB;
	
	
	
	
	public Baseballer(int hits, int aB, int bB, int hBP, int sF, int doubles, int triple, int hR) 
	{
		super();
		Hits = hits;
		AB = aB;
		BB = bB;
		HBP = hBP;
		SF = sF;
		this.doubles = doubles;
		this.triple = triple;
		HR = hR;
		
		single = this.Hits - this.doubles - this.triple - this.HR;
		this.BA = this.calculateBA();
		this.OBP = this.calculateOBP();
		this.SLG = this.calculateSLG();
		this.OBS = this.calculateOBS();
		this.TB = this.calculateTB();
		
	}
	public double calculateBA()
	{
		return(double)this.Hits / (double)this.AB;
	}
	public double getBA()
	{
		return this.BA;
	}
	public double calculateOBP()
	{
		return ((double)this.Hits + (double)this.BB + (double)this.HBP)/((double)this.AB + (double)this.SF);
	}
	public double getOBP()
	{
		return this.OBP;
	}
	public double calculateSLG()
	{
		return (((double)single + (2.0 * (double)this.doubles)+(3.0 * (double)this.triple)+ (4.0 *(double)this.HR)) / (double)this.AB);
	}
	public double getSLG()
	{
		return this.SLG;
	}
	public double calculateOBS()
	{
		return this.OBP + this.SLG;
	}
	public double getOBS()
	{
		return this.OBS;
	}
	public double calculateTB()
	{
		return (double)single + (2.0* (double)this.doubles)+(3.0*(double)this.triple)+(4.0 * (double)this.HR);
	}
	public double getTB()
	{
		return this.TB;
	}
	public int getHits() 
	{
		return Hits;
	}
	public void setHits(int hits)
	{
		Hits = hits;
	}
	public int getAB() 
	{
		return AB;
	}
	public void setAB(int aB) 
	{
		AB = aB;
	}
	public int getBB()
	{
		return BB;
	}
	public void setBB(int bB) 
	{
		BB = bB;
	}
	public int getHBP()
	{
		return HBP;
	}
	public void setHBP(int hBP) 
	{
		HBP = hBP;
	}
	public int getSF() 
	{
		return SF;
	}
	public void setSF(int sF) 
	{
		SF = sF;
	}
	public int getDoubles() 
	{
		return doubles;
	}
	public void setDoubles(int doubles) 
	{
		this.doubles = doubles;
	}
	public int getTriple() 
	{
		return triple;
	}
	public void setTriple(int triple) 
	{
		this.triple = triple;
	}
	public int getHR() 
	{
		return HR;
	}
	public void setHR(int hR) 
	{
		HR = hR;
	}
	
}
