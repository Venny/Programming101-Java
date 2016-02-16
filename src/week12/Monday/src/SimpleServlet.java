

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;
import com.sun.xml.bind.v2.schemagen.xmlschema.List;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SimpleServlet() {
        super();        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.getWriter().append(getRSSContent("http://www.sportal.bg/uploads/rss_category_2.xml"));
		} catch (IllegalArgumentException | FeedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private String getRSSContent(String link) throws IOException, IllegalArgumentException, FeedException{
		String output = "";
		try {
			URL url = new URL(link);
			HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
			
			// Feed Reading
			SyndFeedInput input = new SyndFeedInput();
			SyndFeed feed = input.build(new XmlReader(httpCon));
			List entries = (List) feed.getEntries();
			Iterator itEntries = ((java.util.List) entries).iterator();
			
			while(itEntries.hasNext()){
				SyndEntry entry = (SyndEntry) itEntries.next();
				output += "<div>" +
							"<h3>" + entry.getTitle() + "</h3>" +
							entry.getLink() +
							"<div>" + entry.getDescription().getValue() + "</div>" +
							"<div><em>" + entry.getAuthor() + "</em></div>" +
						"</div>";
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			output = "Error!";
			e.printStackTrace();
		}
		return output;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
