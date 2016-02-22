package com.example.decoratorexample;

public class Warrior extends Character {
  private String currentStats = "";

  public Warrior() {
    currentStats = "I'm a warrior class";
  }

  @Override public String getCharacterStats() {
    return currentStats;
  }
}
