package com.ecnu.springbootmongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/28 21:52
 * @Author: Ling Chen
 * @Description:
 */
@Document
public class Baike {
    @Id
    private String id;
    private String desc;
    private List <String> tag = new ArrayList <>();
    private Comment comment = null;
    private Date createTime = null;
    private Date updateTime = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List <String> getTag() {
        return tag;
    }

    public void setTag(List <String> tag) {
        this.tag = tag;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
