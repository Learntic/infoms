package com.cursos.infoMS.model;

import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "course")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer course_id;

    @NotBlank
    private String course_description;

    @NotBlank
    private String course_name;

    private Integer course_score;

    @NotNull
    private Integer course_topics;

    @Getter(AccessLevel.NONE)
    @OneToMany(mappedBy = "curso")
    private Set<Tema> temas;

}
