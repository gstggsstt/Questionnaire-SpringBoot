package com.example.demo;

import lombok.Getter;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class LoadForm {

    @CrossOrigin
    @GetMapping(value="api/loadForms")
    @ResponseBody
    public Collection<Form> loadForm(){
        System.out.println("SentForm!!");
        return OneTimeStorage.getForms().values();
    }

    @CrossOrigin
    @GetMapping(value="api/getForm")
    @ResponseBody
    public Form getForm(@RequestParam Integer code){
        System.out.println("GetForm!!");
        if(OneTimeStorage.getForms().containsKey(code))
            return OneTimeStorage.getForms().get(code);
        return null;
    }
}
