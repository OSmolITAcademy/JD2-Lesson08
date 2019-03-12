package by.htp.jd2.di_map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		 String confFile = "applicationContext.xml";
	        ApplicationContext context 
	                                = new ClassPathXmlApplicationContext(confFile);
	        FilmDirectors filmDir = (FilmDirectors) context.getBean("filmDirectors");
	        filmDir.pringDirectors();

	}

}
