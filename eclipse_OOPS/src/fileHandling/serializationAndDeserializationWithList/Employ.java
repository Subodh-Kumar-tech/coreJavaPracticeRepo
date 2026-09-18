package fileHandling.serializationAndDeserializationWithList;

import java.io.Serializable;

public class Employ implements Serializable {

//	/**
//	 * 
//	 */
	private static final long serialVersionUID = 1L;
	private String companyName;
	private String name;
	private String empId;

	private transient String pswd;

	Employ(String companyName, String name, String empId, String pswd) {
		this.companyName = companyName;
		this.name = name;
		this.empId = empId;
		this.pswd = pswd;
	}

	public String getCompanyName() {
		return "CompanyName : " + companyName;
	}

	public String getName() {
		return "Name : " + name;
	}

	public String getEmpId() {
		return "EmpId : " + empId;
	}

	public String getpswd() {
		return "pswd : " + pswd;
	}

}
