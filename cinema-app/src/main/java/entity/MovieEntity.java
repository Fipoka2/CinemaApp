package entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie", schema = "cinemadb", catalog = "")
public class MovieEntity {
    private int id;
    private String name;
    private String description;
    private byte isAvaliable;
    private int rating;
    private int sold;
    private int duration;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 45)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "is_avaliable", nullable = false)
    public byte getIsAvaliable() {
        return isAvaliable;
    }

    public void setIsAvaliable(byte isAvaliable) {
        this.isAvaliable = isAvaliable;
    }

    @Basic
    @Column(name = "rating", nullable = false, precision = 0)
    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Basic
    @Column(name = "sold", nullable = false)
    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    @Basic
    @Column(name = "duration", nullable = false)
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MovieEntity that = (MovieEntity) o;

        if (id != that.id) return false;
        if (isAvaliable != that.isAvaliable) return false;
        if (rating != that.rating) return false;
        if (sold != that.sold) return false;
        if (duration != that.duration) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (int) isAvaliable;
        result = 31 * result + rating;
        result = 31 * result + sold;
        result = 31 * result + duration;
        return result;
    }
}
