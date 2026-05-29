//package com.example.journalApplication.Controller;
//
//import com.example.journalApplication.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryController {
//    private Map<Long , JournalEntry> journalEntires = new HashMap<>();
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntires.values());
//    }
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
//        journalEntires.put(myEntry.getId() , myEntry);
//        return true;
//    }
//
//    @GetMapping("/id/{myId}")
//    public JournalEntry findById(@PathVariable Long myId){
//        return journalEntires.get(myId);
//    }
//
//    @DeleteMapping("/id/{myId}")
//    public JournalEntry deleteById(@PathVariable Long myId){
//        return journalEntires.remove(myId);
//    }
//
//    @PutMapping("/id/{myId}")
//    public JournalEntry updateById(@PathVariable Long myId , @RequestBody JournalEntry myEntry){
//        return journalEntires.put(myId , myEntry);
//    }
//}
