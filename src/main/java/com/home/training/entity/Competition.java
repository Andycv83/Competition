package main.java.com.home.training.entity;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;

public class Competition {
//	@Entity
//	@Table(name = "COMPETITIONS")
	    @Id
	    @Column(name = "ID")
	    @GeneratedValue	    
		private int id;
		@Column(name = "NAME")
		private String name;
		@Column(name = "START")
		private Date start;
		@Column(name = "END")
		private Date end;
		
		private Set <Task> tasks ;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}	
		public Date getEnd() {
			return end;
		}
		public void setEnd(Date end) {
			this.end = end;
		}
		public Date getStart() {
			return start;
		}
		public void setStart(Date start) {
			this.start = start;
		}
		@XmlElement(name = "task")
		public Set<Task> getTasksList() {
			return tasks;
		}
		
	public void setTasksList(Set<Task> tasks) {
		this.tasks = tasks;
	}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		public void addTask(Task t){
			tasks.add(t);
		}
}
