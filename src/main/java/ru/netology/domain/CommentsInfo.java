package ru.netology.domain;

public class CommentsInfo {
    private String logoCommenter;
    private String commenterId;
    private String commentText;
    private String dateComment;

    public String getLogoCommenter() {
        return logoCommenter;
    }

    public void setLogoCommenter(String logoCommenter) {
        this.logoCommenter = logoCommenter;
    }

    public String getCommenterId() {
        return commenterId;
    }

    public void setCommenterId(String commenterId) {
        this.commenterId = commenterId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public String getDateComment() {
        return dateComment;
    }

    public void setDateComment(String dateComment) {
        this.dateComment = dateComment;
    }

    public String getTimeComment() {
        return timeComment;
    }

    public void setTimeComment(String timeComment) {
        this.timeComment = timeComment;
    }

    private String timeComment;
}
