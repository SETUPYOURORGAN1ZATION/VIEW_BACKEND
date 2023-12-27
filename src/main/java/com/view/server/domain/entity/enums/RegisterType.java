package com.view.server.domain.entity.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RegisterType {
  ATTENDANCE("출석"),
  ABSENT("인정결석"),
  TRUANCY("무단결석");
  private final String description;
}
