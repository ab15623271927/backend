package com.tourstories.www.services;

import com.tourstories.www.Model.News;

import java.util.List;

// Here, we are doing this only bcz of making - loose coupling
// Run time polymorphism will occurs too
public interface NewsService {
    public List<News>  getAllNews();

    public News getSingleNews(long newsId);

    public  News addNews(News news);
}

