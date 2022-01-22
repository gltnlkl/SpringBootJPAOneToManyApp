package com.gulukal.blogonetomanyapp.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String decription;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="pc_fid", referencedColumnName = "id")
    private List<Comment> comments = new ArrayList<>();

}
