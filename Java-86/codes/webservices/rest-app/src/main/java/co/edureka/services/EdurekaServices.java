package co.edureka.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.glassfish.jersey.process.internal.RequestScoped;

@Path("/edureka")
public class EdurekaServices {
	@GET
	@Produces("text/html")
	public String indiaService() {
		return "<h2>India Customer Service Center @ edureka</h2>";
	}

	@GET
	@Produces("text/html")
	@Path("/intl")
	public String internationalService() {
		return "<h2>International Customer Service Center @ edureka</h2>";
	}
	
	@GET
	@Produces("text/html")
	@Path("/details/{name}/{course}")
	public String getCourseDetails(@PathParam("name") String cust_name, @PathParam("course") String course) {
		String responseText = "<h2>Hi "+cust_name+",<br>Thanks for your enquiry.<br>We will share the details of course: "+course+" soon";
		return responseText;
	}
	
	@GET
	@Produces("text/html")
	@Path("/enquiry")
	public String findCourseDetails(@QueryParam("name") String cust_name, @QueryParam("course") String course) {
		String responseText = "<h2>Customer Name: "+cust_name+"<br>Course: "+course;
		return responseText;
	}	
}                      
