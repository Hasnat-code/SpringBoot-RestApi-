package com.example.Restapi.controller;

import com.example.Restapi.Entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Restapi.Entity.JournalEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

//handle http request
@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long,JournalEntry>journalEntries=new HashMap<>();

    @GetMapping("/ok")
    public List<JournalEntry> getAll()
    {
        return new ArrayList<>(journalEntries.values());

    }
    @PostMapping
    public void createEntry(){

    }
}
