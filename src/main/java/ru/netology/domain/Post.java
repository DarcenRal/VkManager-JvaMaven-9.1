package ru.netology.domain;

import java.sql.Time;
import java.util.Date;

public class Post {
    private int postId;
    private String ownerName; //Владелец стены
    private Date date; //Дата поста
    private Time time; //Время поста
    private String postName;
    private String imageLogo;
    private String ImagePost;
    private int likeCounter;
    private int answerCounter;
    private int repostCounter;
    private int viewCounter;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getImageLogo() {
        return imageLogo;
    }

    public void setImageLogo(String imageLogo) {
        this.imageLogo = imageLogo;
    }

    public String getImagePost() {
        return ImagePost;
    }

    public void setImagePost(String imagePost) {
        ImagePost = imagePost;
    }

    public int getLikeCounter() {
        return likeCounter;
    }

    public void setLikeCounter(int likeCounter) {
        this.likeCounter = likeCounter;
    }

    public int getAnswerCounter() {
        return answerCounter;
    }

    public void setAnswerCounter(int answerCounter) {
        this.answerCounter = answerCounter;
    }

    public int getRepostCounter() {
        return repostCounter;
    }

    public void setRepostCounter(int repostCounter) {
        this.repostCounter = repostCounter;
    }

    public int getViewCounter() {
        return viewCounter;
    }

    public void setViewCounter(int viewCounter) {
        this.viewCounter = viewCounter;
    }
}
