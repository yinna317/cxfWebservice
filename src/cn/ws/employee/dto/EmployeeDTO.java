package cn.ws.employee.dto;

public class EmployeeDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 工号
	 */

	private String employeeID;
	/**
	 * 员工姓名
	 */

	private String employeeName;

	/**
	 * 人员状态
	 */

	private String employeeStatus;

	/**
	 * 工种
	 */

	private String jobKinds;

	/**
	 * 班组
	 */

	private String workingUnit;

	/**
	 * 职位
	 */

	private String position;
	
	/**
	 * orgCode 所属组织架构 ORGCODE
	 */
	private String orgCode;

	/**
	 * 备注
	 */

	private String remark;

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getJobKinds() {
		return jobKinds;
	}

	public void setJobKinds(String jobKinds) {
		this.jobKinds = jobKinds;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public String getWorkingUnit() {
		return workingUnit;
	}

	public void setWorkingUnit(String workingUnit) {
		this.workingUnit = workingUnit;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeID=" + employeeID + ", employeeName="
				+ employeeName + ", employeeStatus=" + employeeStatus
				+ ", jobKinds=" + jobKinds + ", workingUnit=" + workingUnit
				+ ", position=" + position + ", orgCode=" + orgCode
				+ ", remark=" + remark + "]";
	}

	
}
