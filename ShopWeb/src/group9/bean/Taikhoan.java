package group9.bean;

public class Taikhoan {

	public static final String GENDER_MALE ="M";
	   public static final String GENDER_FEMALE = "F";
	    
	   private String m_usernameC;
	   private String m_gioitinhC;
	   private String m_passwordC;
//------------------------------------BAO-------------------------------------------
	   private String m_sodtC;
	   private String m_diachiC;
	   private String m_phanquyenC;
//------------------------------------BAO-------------------------------------------
		public Taikhoan() {
			super();
		}


		public String getM_usernameC() {
			return m_usernameC;
		}


		public void setM_usernameC(String m_usernameC) {
			this.m_usernameC = m_usernameC;
		}


		public String getM_gioitinhC() {
			return m_gioitinhC;
		}


		public void setM_gioitinhC(String m_gioitinhC) {
			this.m_gioitinhC = m_gioitinhC;
		}


		public String getM_passwordC() {
			return m_passwordC;
		}


		public void setM_passwordC(String m_passwordC) {
			this.m_passwordC = m_passwordC;
		}
//------------------------------------BAO-------------------------------------------
		public String getM_sodtC() {
			return m_sodtC;
		}


		public void setM_sodtC(String m_sodtC) {
			this.m_sodtC = m_sodtC;
		}


		public String getM_diachiC() {
			return m_diachiC;
		}


		public void setM_diachiC(String m_diachiC) {
			this.m_diachiC = m_diachiC;
		}
				   
		
		
		
		
		public String getM_phanquyenC() {
			return m_phanquyenC;
		}


		public void setM_phanquyenC(String m_phanquyenC) {
			this.m_phanquyenC = m_phanquyenC;
		}


		public Taikhoan(String m_usernameC, String m_gioitinhC, String m_passwordC, String m_sodtC, String m_diachiC) {
			super();
			this.m_usernameC = m_usernameC;
			this.m_gioitinhC = m_gioitinhC;
			this.m_passwordC = m_passwordC;
			this.m_sodtC = m_sodtC;
			this.m_diachiC = m_diachiC;
		}


		public Taikhoan(String m_usernameC, String m_gioitinhC, String m_passwordC, String m_sodtC, String m_diachiC,
				String m_phanquyenC) {
			super();
			this.m_usernameC = m_usernameC;
			this.m_gioitinhC = m_gioitinhC;
			this.m_passwordC = m_passwordC;
			this.m_sodtC = m_sodtC;
			this.m_diachiC = m_diachiC;
			this.m_phanquyenC = m_phanquyenC;
		}
		
//------------------------------------BAO-------------------------------------------		
	   
	   
}
