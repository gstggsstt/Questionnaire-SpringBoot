package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SubmitForm {
    @CrossOrigin
    @PostMapping(value="api/submit/{code}")
    @ResponseBody
    public Result submitForm(@PathVariable Integer code, @RequestBody String str) {
        System.out.println(code+":"+str);
        OneTimeStorage.put(code, str);
        return new Result(200,0);
    }
    @CrossOrigin
    @GetMapping(value="api/getRes/{code}")
    @ResponseBody
    public List<String> getResult(@PathVariable Integer code) {
        if(OneTimeStorage.getResults().containsKey(code)) {
            for (String str : OneTimeStorage.getResults().get(code))
                System.out.println(str);
            return OneTimeStorage.getResults().get(code);
        }
        return new ArrayList<>();
    }
}
