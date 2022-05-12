package com.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class EmployeeGateway implements RequestHandler<Object,Employee>{

	@Override
	public Employee handleRequest(Object input, Context context) {
		Employee emp=new Employee(99,"prapti","sbg","prapti@mail.com");
		return emp;
	}
	
}
