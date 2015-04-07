package main.java.com.home.training.dao;

import java.util.Set;
import main.java.com.home.training.entity.Competition;
import main.java.com.home.training.entity.Task;

public interface TaskDAO {

	public void addTask(Task task);
	
	public void updateTask(Task task);
	
	public void deleteTask(Integer id);
	
	public Set<Task> getAllTask(int CompetitionId);
	
	public Task getTaskById(int id);
	
	public void addCompetition(Competition competition);
	
	public Set <Competition> getAllCompetition();
	
}
