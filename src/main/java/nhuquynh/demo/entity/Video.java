package nhuquynh.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "videos")
@NamedQuery(name = "Video.findAll", query = "SELECT v FROM Video v")


public class Video implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "VideoId")
    private String videoId;

    @Column(name = "Active")
    private int active;

    @Column(name = "Description", nullable = true, length = 500)
    private String description;

    @Column(name = "Poster", nullable = true, length = 500)
    private String poster;

    @Column(name = "Title", nullable = true)
    private String title;


    @Column(name = "Views")
    private int views;

    //bi-directional many-to-one association to Category


    @ManyToOne
    @JoinColumn(name = "CategoryId")
    private Category category;


}