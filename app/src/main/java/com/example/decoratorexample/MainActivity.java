package com.example.decoratorexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private TextView warriorStats;
  private Character character;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button createWarriorBtn = (Button) findViewById(R.id.create_warrior_btn);
    Button addShieldBtn = (Button) findViewById(R.id.add_shield_btn);
    Button addSwordBtn = (Button) findViewById(R.id.add_sword_btn);
    warriorStats = (TextView) findViewById(R.id.warrior_stat_text);

    createWarriorBtn.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        character = createWarrior();
        String characterStats = character.getCharacterStats();
        warriorStats.setText(characterStats);
      }
    });

    addSwordBtn.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        if(character != null) {
          character = giveWarriorASword(character);
          String characterStats = character.getCharacterStats();
          warriorStats.setText(characterStats);
        }
      }
    });

    addShieldBtn.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        if(character != null) {
          character = giveWarriorAShield(character);
          String characterStats = character.getCharacterStats();
          warriorStats.setText(characterStats);
        }
      }
    });
  }

  private Character createWarrior() {
    return new Warrior();
  }

  private Character giveWarriorASword(Character character) {
    return new EquipmentSword(character);
  }

  private Character giveWarriorAShield(Character character) {
    return new EquipmentShield(character);
  }
}
