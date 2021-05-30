package org.zerock.board.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "board") //@ToString 주의
@Getter
public class Reply extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    private String text;

    private String replyer;
    
    @ManyToOne
    private Board board; // N대1 관계 지정
}
