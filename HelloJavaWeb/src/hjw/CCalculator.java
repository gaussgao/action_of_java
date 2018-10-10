package hjw;


public class CCalculator {

	private double m_fRedius = 0.0;
	
	public double getRedius()
	{
		return m_fRedius;
	}
	
	public void setRedius(double r)
	{
		m_fRedius =r;
	}
	
	public double getLength()
	{
		return Math.PI*2.0*m_fRedius;
	}
	
	public double getArea()
	{
		return Math.PI*m_fRedius*m_fRedius;
	}
	
}


