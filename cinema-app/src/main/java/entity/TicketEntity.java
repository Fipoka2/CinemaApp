package entity;

import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket", schema = "cinemadb", catalog = "")
public class TicketEntity {
    private int id;
    private Timestamp startTime;
    private int price;
    private AuditoriumEntity auditoriumByAuditoriumId;
    private MovieEntity movieByMovieId;
    private SeatTypeEntity seatTypeBySeatTypeId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "start_time", nullable = false)
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "price", nullable = false, precision = 0)
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TicketEntity that = (TicketEntity) o;

        if (id != that.id) return false;
        if (price != that.price) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "auditorium_id", referencedColumnName = "id", nullable = false)
    public AuditoriumEntity getAuditoriumByAuditoriumId() {
        return auditoriumByAuditoriumId;
    }

    public void setAuditoriumByAuditoriumId(AuditoriumEntity auditoriumByAuditoriumId) {
        this.auditoriumByAuditoriumId = auditoriumByAuditoriumId;
    }

    @ManyToOne
    @JoinColumn(name = "movie_id", referencedColumnName = "id", nullable = false)
    public MovieEntity getMovieByMovieId() {
        return movieByMovieId;
    }

    public void setMovieByMovieId(MovieEntity movieByMovieId) {
        this.movieByMovieId = movieByMovieId;
    }

    @ManyToOne
    @JoinColumn(name = "seat_type_id", referencedColumnName = "id", nullable = false)
    public SeatTypeEntity getSeatTypeBySeatTypeId() {
        return seatTypeBySeatTypeId;
    }

    public void setSeatTypeBySeatTypeId(SeatTypeEntity seatTypeBySeatTypeId) {
        this.seatTypeBySeatTypeId = seatTypeBySeatTypeId;
    }
}
