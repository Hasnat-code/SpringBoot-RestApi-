package com.example.Restapi.controller;

import com.example.Restapi.Entity.JournalEntry;
import org.springframework.web.bind.annotation.*;
import com.example.Restapi.Entity.JournalEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

//handle http request
@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    //    @GetMapping("/health-check")
//    public String health_check()
//    {
//        return "ok";
//
//    }
    @GetMapping
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntries.values());

    }

    @PostMapping()
    public boolean creatEntry(@RequestBody JournalEntry myEntry) {
        journalEntries.put(myEntry.getId(), myEntry);
        return true;

    }

    @GetMapping("/id/{myid}")
    public JournalEntry getjournalentrybyID(@PathVariable long myid) {
        return journalEntries.get(myid);

    }

    @DeleteMapping("/id/{myid}")
    public JournalEntry deletejournalentrybyid(@PathVariable long myid) {
        return journalEntries.remove(myid);

    }


    @PutMapping("/id/{id}")
    public JournalEntry updateEntrybyid(@PathVariable long id, @RequestBody JournalEntry myEntry) {
        return journalEntries.put(id,myEntry);
    }
}
