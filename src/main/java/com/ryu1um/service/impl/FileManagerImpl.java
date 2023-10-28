package com.ryu1um.service.impl;

import com.ryu1um.service.FileManager;
import lombok.extern.slf4j.Slf4j;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Slf4j
public class FileManagerImpl implements FileManager {

    @Override
    public List<String> readFile(String filepath) {
        try {
            Path path = Paths.get(filepath);
            return Files.readAllLines(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
