package cn.ws.employee.impl;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.ws.employee.EmployeeWebService;
import cn.ws.employee.dto.EmployeeDTO;

/**
 * 员工服务层实现类
 * 
 * @author Administrator
 * 
 */
@WebService(endpointInterface = "cn.ws.employee.EmployeeWebService")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
@Service("employeeWebServiceImpl")
public class EmployeeWebServiceImpl implements EmployeeWebService {
	


	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public String addEmployee(
		 EmployeeDTO employeeDto,
			 String operatorId) {

		/*
		 * if (createEmployee(employeeDto).equals("-1")) { return "-1"; }
		 */

		return "0";
	}

	

}
