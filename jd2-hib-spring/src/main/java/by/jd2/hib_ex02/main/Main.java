package by.jd2.hib_ex02.main;


import java.text.ParseException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import by.jd2.hib_ex02.dao.DaoSample;


public class Main {

	public static void main(String[] args) throws ParseException {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DaoSample dao = context.getBean("myUser", DaoSample.class);
		
		dao.retrieveUserAndUserTasks();

	}
	

}
