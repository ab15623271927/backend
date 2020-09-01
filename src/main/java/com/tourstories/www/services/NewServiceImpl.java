package com.tourstories.www.services;
import com.tourstories.www.entities.News;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

// Spring will identify -  NewServiceImpl  is a service class on this project
@Service
public class NewServiceImpl implements  NewsService{
    List<News> list;

    public NewServiceImpl(){
        // in future we will use database layer - DAO
        list = new ArrayList<>();
        list.add(new News(1," Wuhan East lake", "Wuhan east lake is one of the longest lake in the world", "Sajib Chakma"));
        list.add(new News(3," Wuhan Botenical Garden", "Wuhan Botenical Garden is one of the beatiful garden in the world", "Sajib Chakma"));
    }

    @Override
    public List<News> getAllNews() {
        return list;
    }

    // to get single news
    @Override
    public News getSingleNews(long newsId) {
        News news = null;
        for(News news1:list ){
            if(news1.getId() == newsId){
                news = news1;
                break;
            }
        }
        return news;
    }

    // to post new news on list

    @Override
    public News addNews(News news) {
        list.add(news);
        return news;
    }
}
