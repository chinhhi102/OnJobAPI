package saigontech.edu.vn.bespringmvcrestful;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/subject")
public class SubjectRESTfulService {
	
	private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	
	@Path("{location}/{date}")
	@GET
	@Produces("application/xml")
	public String getSubject_XML(@PathParam("location") String location, @PathParam("date") String dateStr) {
		Date date = null;
		if (dateStr == null || dateStr.length() == 0) {
			date = new Date();
		} else {
			try {
				date = df.parse(dateStr);
			} catch (ParseException e) {
				date = new Date();
			}
		}
		dateStr = df.format(date);

		String[] weathers = new String[] { "Hot", "Rain", "Cold" };
		int i = new Random().nextInt(3);
		String weather = weathers[i];

		return "<weather>"//
				+ "<date>" + dateStr + "</date>"//
				+ "<location>" + location + "</location>"//
				+ "<info>" + weather + "</info>"//
				+ "</weather>";
	}
}
