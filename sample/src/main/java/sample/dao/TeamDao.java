package sample.dao;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name = "team")
public class TeamDao {
    public  TeamDao() {}

    public TeamDao(@NotNull Long id,@NotNull String name, @NotNull Long rate ) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column (name = "name")
    private String name;

    @NotNull
    @Column(name = "rate")
    private Long rate;


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

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }


}
