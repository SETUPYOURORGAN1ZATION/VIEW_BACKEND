package com.view.server.domain.entity;

import com.view.server.domain.entity.enums.RegisterType;
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

public class Register {
  @Id
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false)
  private long studentNumber;

  @Column(nullable = false)
  private String checkedDate;

  @Column(nullable = false)
  private RegisterType status;

  @Column(nullable = true)
  private String description;
}
