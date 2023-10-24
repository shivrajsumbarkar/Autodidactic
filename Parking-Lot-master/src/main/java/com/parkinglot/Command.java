package com.parkinglot;


import java.util.HashMap;
import java.util.Map;

public enum Command {
    ERROR(""),
    EXIT("exit"),
    CREATE("create_parking_lot"),
    PARK("park"),
    LEAVE("leave"),
    STATUS("status");

    private static Map<String, Command> commandMap;

    static {
        commandMap = new HashMap<String, Command>();
        for (Command command : Command.values()) {
            commandMap.put(command.input, command);
        }
    }

    private String input;

    Command(String input) {
        this.input = input;
    }

    public static Command getCommand(String input) {
        return commandMap.getOrDefault(input, Command.ERROR);
    }
}
