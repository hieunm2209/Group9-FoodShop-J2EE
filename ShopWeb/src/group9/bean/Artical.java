package group9.bean;

public class Artical {
	private int m_idNewC;
	private int m_id_userC;
	private String m_titleC;
	private String m_short_detailC;
	private String m_long_detailC;
	private String m_imageC;
	private String m_date_createC;
	private String m_date_updateC;
	
	
	
	public Artical() {
		super();
	}
	public Artical(int m_idNewC, int m_id_userC, String m_titleC, String m_short_detailC, String m_long_detailC,
			String m_imageC, String m_date_createC, String m_date_updateC, int m_is_savedraftC) {
		super();
		this.m_idNewC = m_idNewC;
		this.m_id_userC = m_id_userC;
		this.m_titleC = m_titleC;
		this.m_short_detailC = m_short_detailC;
		this.m_long_detailC = m_long_detailC;
		this.m_imageC = m_imageC;
		this.m_date_createC = m_date_createC;
		this.m_date_updateC = m_date_updateC;
	}
	public int getM_idNewC() {
		return m_idNewC;
	}
	public void setM_idNewC(int m_idNewC) {
		this.m_idNewC = m_idNewC;
	}
	public int getM_id_userC() {
		return m_id_userC;
	}
	public void setM_id_userC(int m_id_userC) {
		this.m_id_userC = m_id_userC;
	}
	public String getM_titleC() {
		return m_titleC;
	}
	public void setM_titleC(String m_titleC) {
		this.m_titleC = m_titleC;
	}
	public String getM_short_detailC() {
		return m_short_detailC;
	}
	public void setM_short_detailC(String m_short_detailC) {
		this.m_short_detailC = m_short_detailC;
	}
	public String getM_long_detailC() {
		return m_long_detailC;
	}
	public void setM_long_detailC(String m_long_detailC) {
		this.m_long_detailC = m_long_detailC;
	}
	public String getM_imageC() {
		return m_imageC;
	}
	public void setM_imageC(String m_imageC) {
		this.m_imageC = m_imageC;
	}
	public String getM_date_createC() {
		return m_date_createC;
	}
	public void setM_date_createC(String m_date_createC) {
		this.m_date_createC = m_date_createC;
	}
	public String getM_date_updateC() {
		return m_date_updateC;
	}
	public void setM_date_updateC(String m_date_updateC) {
		this.m_date_updateC = m_date_updateC;
	}
	
	
	
	
	
}
