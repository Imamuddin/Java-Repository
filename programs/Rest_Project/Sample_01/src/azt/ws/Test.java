package azt.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class Test {

	@GET
	@Path("/hi")
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "Hey! I am doing well, you can proceeds";
	}

}
