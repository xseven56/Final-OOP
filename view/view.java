package FINAL.view;

package view;

import model.base.Character;

public class View {
    public View() {
    }
    public void Attack(Character character1, Character character2){
        System.out.println(character1 +  " атакует " + character2);
    }
}