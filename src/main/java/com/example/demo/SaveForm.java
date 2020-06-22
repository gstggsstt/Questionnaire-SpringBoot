package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SaveForm{

    @Getter
    private static ApplicationContext ac=null;

    @CrossOrigin
    @PostMapping(value="api/saveForm")
    @ResponseBody
    public Result saveForm(@RequestBody Form f){
        for(Problem e:f.getProbs()){
            System.out.println(e.toString());
        }
        f.setCode(OneTimeStorage.newCnt());
        OneTimeStorage.getForms().put(f.getCode(),f);
        return new Result(200, f.getCode());
    }
}
