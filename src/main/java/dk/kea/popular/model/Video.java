package dk.kea.popular.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;
    private int views;
    private int likes;
    private int length;
    private Date date;
    private String category;

    public Video() {
    }

    public Video(String name, String url, int views, int likes, int length, Date date, String category) {
        this.name = name;
        this.url = url;
        this.views = views;
        this.likes = likes;
        this.length = length;
        this.date = date;
        this.category = category;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int videoSeconds) {
        this.length = videoSeconds;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", views=" + views +
                ", likes=" + likes +
                ", category='" + category + '\'' +
                '}';
    }
}
