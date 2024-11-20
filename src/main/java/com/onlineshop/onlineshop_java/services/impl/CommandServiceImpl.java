package com.onlineshop.onlineshop_java.services.impl;

import com.onlineshop.onlineshop_java.models.Command;
import com.onlineshop.onlineshop_java.repositories.CommandRepository;
import com.onlineshop.onlineshop_java.services.CommandService;
import com.onlineshop.onlineshop_java.services.ItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandServiceImpl implements CommandService {

    private CommandRepository commandRepository;
    public  CommandServiceImpl(CommandRepository commandRepository){
        this.commandRepository = commandRepository;
    }

    @Override
    public List<Command> getAllCommands() {
        return List.of();
    }

    @Override
    public Command createCommand(Command command) {
        return null;
    }

    @Override
    public Command updateCommand(Command command) {
        return null;
    }

    @Override
    public void deleteCommandById(int id) {

    }
}
