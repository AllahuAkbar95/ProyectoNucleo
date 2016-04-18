package ProyectTests.Tests;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MaintHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Document document = Jsoup.connect("http://google.com").get();
			System.out.println(document);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
