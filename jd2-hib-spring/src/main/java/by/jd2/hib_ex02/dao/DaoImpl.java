package by.jd2.hib_ex02.dao;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import by.jd2.hib_ex02.bean.Task;
import by.jd2.hib_ex02.bean.User;

public class DaoImpl implements DaoSample{

	private SessionFactory factory;
	

	public void retrieveUserAndUserTasks() {

		Session session = factory.getCurrentSession();

		session.beginTransaction();

		int userId = 8;
		User user= session.get(User.class, userId);		
		
		System.out.println("User: " + user.getUserDetail().getCity());
		
		Set<Task> tasks = user.getTasks();
		
		System.out.println("---- " + tasks.size());
		
		for(Task task : tasks) {
			System.out.println(task.getIdTask() + " - " + task.getTitle());
		}
		
		session.getTransaction().commit();

		session.close();
	
	}

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

}
