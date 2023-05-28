package model.charaters;

import model.base.Armor;
import model.base.Character;
import model.base.Heal;
import model.base.Weapon;
import model.charaters.base.Mage;
import model.weapons.Hands;

public class WhiteMage extends Mage {
public class WhiteMage extends Mage implements Heal {
    public WhiteMage(String name, Armor armor) {
        super(name, new Hands(), armor);
    }

    @Override
    public void heal(Character character) {
        character.setHealthPoints((super.getLevel() + 1) * 2);
        setExperience((int)Math.pow(10,character.getLevel()));
        this.decreaseMana(character.getLevel() + 1);
    }
}