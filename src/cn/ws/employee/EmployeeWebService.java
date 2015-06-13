package cn.ws.employee;

import javax.jws.WebParam;
import javax.jws.WebService;

import cn.ws.employee.dto.EmployeeDTO;

@WebService(name = "EmployeeWebService")
public interface EmployeeWebService {

	/**
	 * 添加员工信息
	 * 
	 * @param employee
	 * @param operatorId
	 * @return
	 */
	public String addEmployee(
			@WebParam(name = "EmployeeDTO") EmployeeDTO employee,
			@WebParam(name = "operatorId") String operatorId);

	
	

}