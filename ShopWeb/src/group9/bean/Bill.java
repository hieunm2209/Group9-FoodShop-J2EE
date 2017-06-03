package group9.bean;
import java.util.Date ;
public class Bill {
	private int m_idGiohangC;
	private String m_usernameC;
	private Date m_ngaylapC;
	private boolean m_isActiveC;
	public Bill()
	{
		super();
	}
	public Bill(int code, String username, Date ngaylap, boolean isActive) {
		// TODO Auto-generated constructor stub
		m_idGiohangC = code;
		m_usernameC = username;
		m_ngaylapC = ngaylap;
		m_isActiveC = isActive;
	}

	public int getM_idGiohangC() {
		return m_idGiohangC;
	}

	public void setM_idGiohangC(int m_idGiohangC) {
		this.m_idGiohangC = m_idGiohangC;
	}

	public String getM_usernameC() {
		return m_usernameC;
	}

	public void setM_usernameC(String m_usernameC) {
		this.m_usernameC = m_usernameC;
	}

	public Date getM_ngaylapC() {
		return m_ngaylapC;
	}

	public void setM_ngaylapC(Date m_ngaylapC) {
		this.m_ngaylapC = m_ngaylapC;
	}

	public boolean isM_isActiveC() {
		return m_isActiveC;
	}

	public void setM_isActiveC(boolean m_isActiveC) {
		this.m_isActiveC = m_isActiveC;
	}
	
}
