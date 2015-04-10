package main.java.com.home.training.entity;

import org.hibernate.mapping.List;

import main.java.com.home.training.entity.Task.Level;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Competition competition = new Competition();
		
		Task tt = new Task();
		tt.setId(777);
		tt.setDescription("tesing task for hibernate");
		tt.setCompetitionId(1);
		tt.setLevel(Level.beginer);
		
		competition.addTask(tt);
		
		
		
	}

}
