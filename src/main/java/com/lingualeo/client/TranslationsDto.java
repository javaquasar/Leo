package com.lingualeo.client;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TranslationsDto {
    
    @SerializedName("error_msg")
    public String errorMsg;
    
    @SerializedName("is_user")
    public Integer isUser;
    
    public List<TranslateDto> translate = new ArrayList<>();
    public String transcription;
    
    @SerializedName("word_id")
    public long wordId;
    
    @SerializedName("word_top")
    public long wordTop;
    
    @SerializedName("sound_url")
    public String soundUrl;   

}
