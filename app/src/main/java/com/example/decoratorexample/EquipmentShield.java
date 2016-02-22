package com.example.decoratorexample;

public class EquipmentShield extends Character {
  private Character character;

  public EquipmentShield(Character character) {
    this.character = character;
  }

  @Override public String getCharacterStats() {
    return character.getCharacterStats() + " and I have a Shield";
  }
}
