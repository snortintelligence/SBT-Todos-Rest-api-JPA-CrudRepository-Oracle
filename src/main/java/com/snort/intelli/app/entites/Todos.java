package com.snort.intelli.app.entites;
import org.hibernate.annotations.SQLUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_Todos")
public class Todos {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long taskId;
	private String title;
	private String description;
	private Boolean completed;
	private Date assignedDate;
	private Date updatedDate;

	public Todos() {
		super();
	}

	public Todos(Long taskId, String title, String description, Boolean completed, Date assignedDate,
			Date updatedDate) {
		super();
		this.taskId = taskId;
		this.title = title;
		this.description = description;
		this.completed = completed;
		this.assignedDate = assignedDate;
		this.updatedDate = updatedDate;
	}

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean isCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public Date getAssignedDate() {
		return assignedDate;
	}

	public void setAssignedDate(Date assignedDate) {
		this.assignedDate = assignedDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "Todos [taskId=" + taskId + ", title=" + title + ", description=" + description + ", completed="
				+ completed + ", assignedDate=" + assignedDate + ", updatedDate=" + updatedDate + "]";
	}

}
