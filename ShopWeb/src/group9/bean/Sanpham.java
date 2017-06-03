package group9.bean;

public class Sanpham {


	private String m_idC;
	private String m_tensanphamC;
	private float m_giaC;
	
	
	
	public Sanpham() {
		super();
	}



	public Sanpham(String m_idC, String m_tensanphamC, float m_giaC) {
		super();
		this.m_idC = m_idC;
		this.m_tensanphamC = m_tensanphamC;
		this.m_giaC = m_giaC;
	}



	public String getM_idC() {
		return m_idC;
	}



	public void setM_idC(String m_idC) {
		this.m_idC = m_idC;
	}



	public String getM_tensanphamC() {
		return m_tensanphamC;
	}



	public void setM_tensanphamC(String m_tensanphamC) {
		this.m_tensanphamC = m_tensanphamC;
	}



	public float getM_giaC() {
		return m_giaC;
	}



	public void setM_giaC(float m_giaC) {
		this.m_giaC = m_giaC;
	}



	
	
	
	
	
}
