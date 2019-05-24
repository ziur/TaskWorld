package org.growind;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TaskStore {
	private static String TODO_TASKS = "todo-tasks.txt";
	public static void addTask(Task task) throws IOException {
		String userHome = System.getProperty("user.home");
		Path path = Paths.get(userHome, TODO_TASKS);
		long taskId = System.currentTimeMillis();
		task.setId(taskId);
		String toSave =  task.getId() + "|>" + task.getTitle();
		Files.write(path, toSave.getBytes(), StandardOpenOption.APPEND);
	}
}
