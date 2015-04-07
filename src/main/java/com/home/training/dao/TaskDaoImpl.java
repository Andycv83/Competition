package main.java.com.home.training.dao;

import java.util.Set;
import main.java.com.home.training.entity.Competition;
import main.java.com.home.training.entity.Task;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation;
import org.springframework.stereotype.Repository;

//@Repository
public class TaskDaoImpl implements TaskDAO {
 //   @Autowired
    private SessionFactory sessionFactory;
    
	public void addTask(Task task) {
		sessionFactory.getCurrentSession().save(task);
		
	}

	public void updateTask(Task task) {
		// TODO Auto-generated method stub
		
	}

	public void deleteTask(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public Set<Task> getAllTask(int CompetitionId) {
		return sessionFactory.getCurrentSession().createQuery("from Task").list();
	}

	public Task getTaskById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addCompetition(Competition competition) {
		// TODO Auto-generated method stub
		
	}

	public Set<Competition> getAllCompetition() {
		// TODO Auto-generated method stub
		return null;
	}

}
