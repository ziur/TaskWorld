package org.growind;

public class Task {
	private String title;
	private long id;

	public Task(String taskTitle) {

		title = taskTitle;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "(" + id +"): "+ title;
	}
}
