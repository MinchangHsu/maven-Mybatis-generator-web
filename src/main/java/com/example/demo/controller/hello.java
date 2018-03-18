package com.example.demo.controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.helloService;

@RestController
@RequestMapping("/aa")
public class hello {
	
	@Autowired
	helloService helloService1;
    
    @RequestMapping(value = "/hello", method = {RequestMethod.POST})
    public @ResponseBody String getHealth(@RequestParam Map<String,Object> param){
        System.out.println("我已經進入Controller");
        System.out.println("我是參數:"+param);
        
//        int result = helloService1.insertData();
//        System.out.println("result :"+result);
//        if(result==0){
//        	System.out.println("新增失敗");
//        }else{
//        	System.out.println("新增成功 筆數 :"+result);
//        }
        
        return "結束";
    }
}
