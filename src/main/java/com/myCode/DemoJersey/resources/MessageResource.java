package com.myCode.DemoJersey.resources;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.myCode.DemoJersey.model.Employee;
import com.myCode.DemoJersey.service.EmployeeService;

@Path("/employees")
public class MessageResource {
	
	EmployeeService empService = new EmployeeService();
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getMessage() {
//		return "hello world man";
//	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> getEmployees() {
		return empService.getAllEmployees();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee test(@PathParam("id") int id) {
		return empService.getEmployee(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addEmployee(Employee employee) throws URISyntaxException {
		Employee newEmp = empService.addEmployee(employee);
		return Response.created(new URI("/DemoJersey/webapi/employees/"+newEmp.getId()))
						.entity(newEmp)
						.build();
		//return empService.addEmployee(employee);
	}
	
	@PUT
	@Path("/{empId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee updateEmployee(@PathParam("empId") int empId,Employee emp) {
		emp.setId(empId);
		return empService.updateEmployee(emp);
	}
	
	@DELETE
	@Path("/{empId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteEmployee(@PathParam("empId") int empId) {
		empService.removeEmployee(empId);
	}
	
}
