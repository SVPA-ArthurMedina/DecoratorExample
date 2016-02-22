package com.example.decoratorexample;

public class EquipmentSword extends Character {
  private Character character;

  public EquipmentSword(Character character) {
    this.character = character;
  }

  @Override public String getCharacterStats() {
    return character.getCharacterStats() + " and I have a Sword";
  }
}
