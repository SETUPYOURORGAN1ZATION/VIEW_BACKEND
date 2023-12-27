package com.view.server.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component

public class PassTicket {
  @Id
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private long id;

  @Column(nullable = false)
  private long grade;

  @Column(nullable = false)
  private long classNum;

  @Column(nullable = false)
  private long studentNum;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String password;

}
