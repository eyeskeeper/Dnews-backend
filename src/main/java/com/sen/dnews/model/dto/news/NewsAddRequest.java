package com.sen.dnews.model.dto.news;

import java.util.Date;

public class NewsAddRequest {
    private Long id;

    /**
     * 新闻发行单位
     */
    private String unit;

    /**
     * 信息报道人
     */
    private String journalist;

    /**
     * 新闻内容
     */
    private String content;

    /**
     * 新闻所属大类
     */
    private String type;

    /**
     * 新闻标签
     */
    private String label;

    /**
     * 新闻报导时间
     */
    private Date reportTime;

    /**
     * 新闻时间
     */
    private Date eventTime;

    /**
     * 新闻地点
     */
    private String eventLocation;

    /**
     * 新闻人物
     */
    private String eventCharacter;
}
