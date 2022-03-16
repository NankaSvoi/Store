package model.product;

import java.util.Arrays;

public enum ToyType {
  CAR("1"),
  DOLL("2"),
  PUZZLE("3"),
  FUR("4");

  private final String code;

  ToyType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  public static ToyType byCode(String code) {
    return Arrays.stream(ToyType.values()).filter(type -> code.equals(type.getCode())).findFirst().get();
  }
}
