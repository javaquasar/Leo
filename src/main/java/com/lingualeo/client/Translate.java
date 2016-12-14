package com.lingualeo.client;

import com.google.gson.annotations.SerializedName;

public class Translate {

    private Integer id;
    private String value;
    private Integer votes;
    
    @SerializedName("is_user")
    private Integer isUser;
    
    @SerializedName("pic_url")
    private String picUrl;

    @Override
    public String toString() {
        return "TranslateDto{" + "id=" + id + ", value=" + value + ", votes=" + votes + ", isUser=" + isUser + ", sound_url=" + '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Integer getIsUser() {
        return isUser;
    }

    public void setIsUser(Integer isUser) {
        this.isUser = isUser;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
    
    
}
