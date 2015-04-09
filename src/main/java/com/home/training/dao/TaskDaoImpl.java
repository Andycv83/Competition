package main.java.com.home.training.dao;

import java.util.List;

import main.java.com.home.training.entity.Competition;
import main.java.com.home.training.entity.Task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDaoImpl implements TaskDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
    
	public void addTask(Task task) {
		sessionFactory.getCurrentSession().save(task);		
	}

	@Override
	public void updateTask(Task task) {
			sessionFactory.getCurrentSession().update(task);
		 }
		

	public void deleteTask(Integer id) {
		Task task = (Task) sessionFactory.getCurrentSession().load(Task.class, id);
        if (null != task) {sessionFactory.getCurrentSession().delete(task);        
        }
	}

	public List<Task> getAllTask(int CompetitionId) {
		return sessionFactory.getCurrentSession().createQuery("from Task").list();
	}

	public Task getTaskById(int id) {
		Task task = (Task) sessionFactory.getCurrentSession().load(Task.class, id);	   
		  return task;
	}

	public void addCompetition(Competition competition) {
		sessionFactory.getCurrentSession().save(competition);	
		
	}

	public List<Competition> getAllCompetition() {
		return sessionFactory.getCurrentSession().createQuery("from Competition").list();
	}


}
