package com.powerich.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 模板测试.
 * @author Administrator
 *
 */
@Controller
public class TemplateController {
   
    /**
     * 返回html模板.
     */
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String,Object> map){
       map.put("hello","from TemplateController.HelloHtml");
       return"/HelloHtml";
    }
    
    /**
	 * 返回html模板.
	 */
	@RequestMapping("/helloFtl")
	public String FreeMakerTemplateController(Map<String,Object> map){
	   map.put("hello","from TemplateController.helloFtl");
	   return"/HelloFtl";
	}
   
}
