package cn.edu.bzu.group12.orangenews.bean;


/**
 * @author pangPython
 *	后台管理员实体类
 */
public class Admin {

	private int admin_id;
	private String admin_name;
	private String admin_pwd;
	private String salt;
	private String admin_tel;
	private String admin_email;
	
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_pwd() {
		return admin_pwd;
	}
	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getAdmin_tel() {
		return admin_tel;
	}
	public void setAdmin_tel(String admin_tel) {
		this.admin_tel = admin_tel;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	
	
	
	
}
