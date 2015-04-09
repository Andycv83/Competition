package main.java.com.home.training.entity;

import javax.persistence.*;

@Entity
@Table(name = "TASK")
public class Task {
	    @Id
	    @Column(name = "ID")
	    @GeneratedValue
	    private Integer id;
	    @Column(name = "COMPETITIONID")
	    private Integer CompetitionId;
	    @Column(name = "DESCRIPTION")
	    private String description;
	    @Column(name = "LEVEL")
	    private Level level;

		enum Level {
			beginer,
			expert		
		}; 
		
		 public int getId() {
				return id;
			}
			 public void setId(int id) {
				this.id = id;
			}
			
			public Level getLevel() {
				return level;
			}
			 
			 public void setLevel(Level level) {
				this.level = level;
			}
			 
			 public String getDescription() {
				return description;
			}
			 public void setDescription(String description) {
				this.description = description;
			}
			 public int getCompetitionId() {
				return CompetitionId;
			}
			 public void setCompetitionId(int CompetitionId) {
				this.CompetitionId = CompetitionId;
			}  
}
