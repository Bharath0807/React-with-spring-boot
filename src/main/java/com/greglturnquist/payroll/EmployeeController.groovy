package com.greglturnquist.payroll

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class EmployeeController {

	@RequestMapping(value='/api/employees')
	def getEmployee() {
		[
			["firstName":"test","lastName":"last","description":"Description"],
			["firstName":"test1","lastName":"last1","description":"Description1"]
		]
	}
}
