package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/student")
public class StudentController {
 @POST
 @Produces("text/html")
 @Path("/register")
 public String registerStudent(@FormParam("name_field") String name, @FormParam("age_field") Integer age, @FormParam("addr_field") String address) {
	 //logic to save student in db
	 String responseText = "Student Name : " + name + "<br>Student Age: "+age+"<br>Student Address: "+address;
	 return responseText;
 }
}
