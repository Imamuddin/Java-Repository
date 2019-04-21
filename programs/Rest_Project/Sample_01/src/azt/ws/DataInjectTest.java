package azt.ws;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/di")
public class DataInjectTest {

	@GET
	@Path("/insertdata/{emp_name}/{location}")
	@Produces(MediaType.TEXT_PLAIN)
	public String insertData(@PathParam("emp_name") String empName,
			@PathParam("location") String loc) {
		if (empName != null && loc != null) {
			System.out.println(empName + "\t" + loc);
			return "success";
		} else {
			return "failed";
		}

	}

	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_XML)
	public String insertQuery(@QueryParam("emp_name") String empName,
			@QueryParam("location") String loc) {

		if (empName != null && loc != null) {
			System.out.println(empName + "\t" + loc);
			return "<result><status>success</status></result>";
		} else {
			return "<result><status>failed</status></result>";
		}

	}

	@GET
	@Path("/matrix")
	@Produces(MediaType.APPLICATION_JSON)
	public String insertMatrix(@MatrixParam("emp_name") String empName,
			@MatrixParam("location") String loc) {
		if (empName != null && loc != null) {
			System.out.println(empName + "\t" + loc);
			return "{\"status\",\"success\"}";
		} else {
			return "{\"status\",\"failed\"}";
		}

	}

	@POST
	@Path("/form")
	@Produces(MediaType.TEXT_HTML)
	public String insertHtml(@FormParam("emp_name") String empName,
			@FormParam("location") String loc) {

		if (empName != null && loc != null) {
			System.out.println(empName + "\t" + loc);
			return "<html><body bgcolor='#054' text='white'><h1>Success</h1></body></html>";
		} else {
			return "<html><body bgcolor='#054' text='white'><h1>Fail</h1></body></html>";
		}

	}

}
