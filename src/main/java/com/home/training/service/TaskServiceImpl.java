package main.java.com.home.training.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import main.java.com.home.training.dao.TaskDAO;
import main.java.com.home.training.entity.Competition;
import main.java.com.home.training.entity.Task;

@Service
public class TaskServiceImpl implements TaskService {
	@Autowired
    private TaskDAO taskDAO;

	@Transactional
	public void addTask(Task task) {
		taskDAO.addTask(task);
		
	}

	@Transactional
	public void deleteTask(Integer id) {
		taskDAO.deleteTask(id);
		
	}

	@Transactional
	public void updateTask(Task task) {
		taskDAO.updateTask(task);
		
	}

	@Transactional
	public List<Task> getAllTask(int CompetitionId) {
		return taskDAO.getAllTask(CompetitionId);
	}

	@Transactional
	public Task getTaskById(int id) {
		return taskDAO.getTaskById(id);
	}

	@Transactional
	public void addCompetition(Competition competition) {
		taskDAO.addCompetition(competition);
		
	}

	@Transactional
	public List<Competition> getAllCompetition() {
		return taskDAO.getAllCompetition();
	}

}
