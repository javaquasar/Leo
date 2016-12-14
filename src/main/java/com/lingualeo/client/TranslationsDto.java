package com.lingualeo.client;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TranslationsDto {

    private static final int FIRST_ELEMENT = 0;

    @SerializedName("error_msg")
    private String errorMsg;

    @SerializedName("is_user")
    private Integer isUser;

    @SerializedName("translate")
    private List<Translate> translateList = new ArrayList<>();
    private String transcription;

    @SerializedName("word_id")
    private long wordId;

    @SerializedName("word_top")
    private long wordTop;

    @SerializedName("sound_url")
    private String soundUrl;

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Integer getIsUser() {
        return isUser;
    }

    public void setIsUser(Integer isUser) {
        this.isUser = isUser;
    }

    public List<Translate> getTranslateList() {
        return translateList;
    }

    public void setTranslateList(List<Translate> translateList) {
        this.translateList = translateList;
    }

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public long getWordId() {
        return wordId;
    }

    public void setWordId(long wordId) {
        this.wordId = wordId;
    }

    public long getWordTop() {
        return wordTop;
    }

    public void setWordTop(long wordTop) {
        this.wordTop = wordTop;
    }

    public String getSoundUrl() {
        return soundUrl;
    }

    public void setSoundUrl(String soundUrl) {
        this.soundUrl = soundUrl;
    }

    public Translate getPopularTranslate() {
        Translate translate = null;
        if (!translateList.isEmpty()) {
            translate = translateList.get(FIRST_ELEMENT);
            for (Translate translateTemp : translateList) {
                if (translateTemp.getVotes() > translate.getVotes()) {
                    translate = translateTemp;
                }
            }
        }
        return translate;
    }

    public String getPopularTranslateValue() {
        return getPopularTranslate().getValue();
    }

}
