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
     * @param n
     */
    public Boolean addNews(New n);
    /**
     * 基于ID获取指定新闻
     * @param id
     * @return
     */
    public New getNew(int id);
    /**
     * 基于ID 删除指定新闻
     * @param id
     * @return
     */
    public Boolean dropNew(int id);
    /**
     *
     * @param id
     * @return
     */
    public Boolean modifyNew(int id,New n);
    /**
     * 基于title
     * @param title
     * @return
     */
    public List<New> searchNews(String title);
}
