package com.lingualeo.client;

import com.google.gson.annotations.SerializedName;

public class TranslateDto {

    public Integer id;
    public String value;
    public Integer votes;
    
    @SerializedName("is_user")
    public Integer isUser;
    
    @SerializedName("pic_url")
    public String picUrl;

    @Override
    public String toString() {
        return "TranslateDto{" + "id=" + id + ", value=" + value + ", votes=" + votes + ", isUser=" + isUser + ", sound_url=" + '}';
    }
}
