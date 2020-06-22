package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DeleteQ {
    @CrossOrigin
    @GetMapping(value="api/deleteQ")
    @ResponseBody
    public void deleteQ(@RequestParam Integer index){
        System.out.println("Delete Q "+index);
        OneTimeStorage.getForms().remove(index);
    }
    @CrossOrigin
    @GetMapping(value="api/pauseQ")
    @ResponseBody
    public void pauseQ(@RequestParam Integer index){
        System.out.println("Pause Q "+index);
        OneTimeStorage.getForms().get(index).setStatus("paused");
    }
    @CrossOrigin
    @GetMapping(value="api/continueQ")
    @ResponseBody
    public void continueQ(@RequestParam Integer index){
        System.out.println("Continue Q "+index);
        OneTimeStorage.getForms().get(index).setStatus("available");
    }
    @CrossOrigin
    @GetMapping(value="api/finishQ")
    @ResponseBody
    public void finishQ(@RequestParam Integer index){
        System.out.println("Finish Q "+index);
        OneTimeStorage.getForms().get(index).setStatus("finished");
    }
}
