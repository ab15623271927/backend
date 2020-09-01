package com.tourstories.www.controller;

import com.tourstories.www.entities.News;
import com.tourstories.www.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class UserController {
    // interface variable will be here
    // here, @Autowired helps - to create new object on background for - NewsService class- then(Dependency injection) injection will happen
    @Autowired
    public NewsService newsService;

    @GetMapping("/user")
    public  String User(){
        return "This is user contronller";
    }

    @GetMapping("/news")
    public List<News>getAllNews(){
        // Service layer will plays roles
        //  here, newsService - interface method will call - but interface method does not have any body - so will call it's child class body

        return this.newsService.getAllNews();
    }

    // get single news
    @GetMapping("/news/{newsId}")
    public News getSingleNews(@PathVariable String newsId){
        return this.newsService.getSingleNews(Long.parseLong(newsId));
    }

    // post news
    // Here, we are passing object on addNews(News news) method - which will come from request body so - @RequestBody will help to achive that
    @PostMapping(path="/news", consumes = "application/json")
    public News addNews(@RequestBody News news){
       return this.newsService.addNews(news);
    }
}
