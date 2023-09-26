package Week03;

import java.util.Objects;

public class Music {
    private String genre;
    private String title;
    private String duration;
    private week03.Date releaseDate;
    private Singer singer;

    public Music(String genre, String title, String duration, week03.Date releaseDate, Singer singer) {
        this.genre = genre;
        this.title = title;
        this.duration = duration;
        this.releaseDate = releaseDate;
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public week03.Date getDate() {
        return releaseDate;
    }

    public void setDate(week03.Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }
    public String toString() {
        return String.format(" genre: %s\n title :%s\n duration :%s\n releaseDate: %s\n singer :%s", genre, title, duration, releaseDate, singer);
    }


    //    public boolean equals(Music o) {
//        if (this == o) return true;
//        if (!(o instanceof Music music)) return false;
//        return getTitle().equals(music.getTitle());
//    }
    public boolean equals ( Object other){
        Music m = (Music)other;
        if (this.title == m.title){
            return true;
        }
        else {
            return false;
        }
    }


}
