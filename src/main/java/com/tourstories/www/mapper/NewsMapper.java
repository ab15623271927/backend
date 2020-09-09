package com.tourstories.www.mapper;
import com.tourstories.www.Model.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NewsMapper {

    // select all from the News
    // news is the table name on database
    @Select("select * from news")
    List<News> findAll();




}

