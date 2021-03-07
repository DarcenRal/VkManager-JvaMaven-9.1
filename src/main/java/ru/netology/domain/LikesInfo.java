package ru.netology.domain;

public class LikesInfo {
    private int count;
    private boolean userLikes;
    private boolean canLikes;
    private boolean canPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserLikes() {
        return userLikes;
    }

    public void setUserLikes(boolean userLikes) {
        this.userLikes = userLikes;
    }

    public boolean isCanLikes() {
        return canLikes;
    }

    public void setCanLikes(boolean canLikes) {
        this.canLikes = canLikes;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
