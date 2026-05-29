package com.example.journalApplication.Controller;

import com.example.journalApplication.entity.JournalEntry;
import com.example.journalApplication.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return true;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry findById(@PathVariable ObjectId myId){
        return journalEntryService.findById(myId).orElse(null);
    }

    @DeleteMapping("/id/{myId}")
    public boolean deleteById(@PathVariable ObjectId myId){
        journalEntryService.deleteById(myId);
        return true;
    }

    @PutMapping("/id/{myId}")
    public JournalEntry updateById(@PathVariable ObjectId myId , @RequestBody JournalEntry newEntry){
        JournalEntry old= journalEntryService.findById(myId).orElse(null);
        if(old!= null){
            old.setTitle(newEntry.getTitle()!= null && !newEntry.getTitle().isEmpty()? newEntry.getTitle(): old.getTitle());
            old.setContent(newEntry.getContent()!= null && !newEntry.getContent().isEmpty()? newEntry.getContent(): old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;
    }
}
