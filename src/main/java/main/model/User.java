package main.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Data
@ToString(exclude = "messages")
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "reg_time")
    private Date regTime;

    @Column(name = "session_id")
    private String sessionId;

    private String name;

    @OneToMany (fetch = FetchType.LAZY,
            mappedBy = "user",
            cascade = CascadeType.ALL)
    private List<Message> messages;
}
