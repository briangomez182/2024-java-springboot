package org.example.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String title;

    @Column
    private double  rating;

    @Column
    private Integer awards;

    @Column
    private LocalDateTime release_date;

    @Column
    private Integer length;


    public Movie() {
    }

    public Movie(Integer id, String title, double rating, Integer awards, LocalDateTime release_date, Integer length) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.awards = awards;
        this.release_date = release_date;
        this.length = length;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Integer getAwards() {
        return awards;
    }

    public void setAwards(Integer awards) {
        this.awards = awards;
    }

    public LocalDateTime getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDateTime release_date) {
        this.release_date = release_date;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Movie{" + "\n" +
                "id=" + id + ",\n" +
                "title='" + title + ",\n" +
                "rating='" + rating + ",\n" +
                "awards='" + awards + ",\n" +
                "release_date=" + release_date + ",\n" +
                "length=" + length + "\n" +
                '}';
    }
}
