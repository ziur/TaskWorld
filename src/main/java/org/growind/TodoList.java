package org.growind;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class TodoList {
	public TodoList() {

	}

	public boolean executeCommand(String command, List<String> parameters) throws IOException {
		if (Objects.equals("--task", command) || Objects.equals("-t", command)) {
			createTask(parameters);
		}
		return true;
	}

	private Task createTask(List<String> parameters) throws IOException {
		String taskTitle = String.join(" ", parameters);
		Task task = new Task(taskTitle);
		TaskStore.addTask(task);
		System.out.println("Task create successfully : " + task);
		return task;
	}


}
