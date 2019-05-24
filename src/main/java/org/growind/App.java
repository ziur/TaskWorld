package org.growind;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException {
        App app = new App();
		List<String> commandParams = app.getCommand(args);
		String command = commandParams.get(0);
		List<String> params = commandParams.subList(1, commandParams.size());
		int exitCode = app.process(command, params) ? 0 : 1;
		System.exit(exitCode);
    }

    private List<String> getCommand(String[] args) {
    	if (args.length < 1) {
    		throw new InvalidCommandParametersException("Missing required command parameters");
		}
    	return Arrays.asList(args);
	}

    private boolean process(String command, List<String> parameters) throws IOException {
        TodoList todoList = new TodoList();
        return todoList.executeCommand(command, parameters);
    }
}
