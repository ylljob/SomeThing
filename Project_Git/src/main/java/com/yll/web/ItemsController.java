package com.yll.web;

import com.yll.domain.Items;
import com.yll.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findById")
    public String findById(Model model,String id){
        Items items = itemsService.findById(Integer.parseInt(id));
        model.addAttribute("item",items);
        return "itemDetail";
    }

    public void say(){
        System.out.println("我是Tom");
    }
}
