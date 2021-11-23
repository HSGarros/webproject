package com.service;

import java.util.List;

import com.entity.New;

public interface NewService {
    /**
     * 查询全部新闻
     * @return
     */
    public List<New> listNews();

    /**
     * 查询前五个新闻
     * @return
     */
    public List<New> listFiveNews();

    /**
     * 添加新闻
     * @param title,content
     */
    public void addNews(String title,String content);
    /**
     * 基于ID获取指定新闻
     * @param id
     * @return
     */
    public New getNew(int id);
}
