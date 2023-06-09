package com.fptyoga.yogacenter.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Class_table")
public class Class implements Serializable {

    @Id
    @Column(name = "class_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classid;

    @Column(name = "class_name")
    private String classname;

    @Column(name = "date")
    private String date;

    @Column(name = "status")
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course courseid;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private User trainerid;

    @ManyToOne()
    @JoinColumn(name = "time_id")
    private Time timeid;

    @ManyToOne()
    @JoinColumn(name = "room_id")
    private Room roomid;

    // @OneToMany(mappedBy = "class1", cascade = CascadeType.ALL)
    // private Set<Attendance> attendance;
}