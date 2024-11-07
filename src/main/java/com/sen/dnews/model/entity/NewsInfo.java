package com.sen.dnews.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName news_info
 */
@TableName(value ="news_info")
@Data
public class NewsInfo implements Serializable {
    /**
     * 唯一id
     */
    @TableId
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

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 逻辑删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}