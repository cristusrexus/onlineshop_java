package com.onlineshop.onlineshop_java.services;

import com.onlineshop.onlineshop_java.models.Command;

import java.util.List;

public interface CommandService {

    List<Command> getAllCommands();

    Command createCommand(Command command);

    Command updateCommand(Command command);

    void deleteCommandById(int id);
}
