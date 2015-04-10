package main.java.com.home.training.service;

import java.util.List;

import main.java.com.home.training.entity.Competition;
import main.java.com.home.training.entity.Task;

public interface TaskService {
	
	public void addTask(Task task);
	
	public void updateTask(Task task);
	
	public void deleteTask(Integer id);
	
	public List<Task> getAllTask(int CompetitionId);
	
	public Task getTaskById(int id);
	
	public void addCompetition(Competition competition);
	
	public List<Competition> getAllCompetition();
}
