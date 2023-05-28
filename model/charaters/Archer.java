package model.charaters;

public class Archer {
import model.armors.LightArmor;
import model.base.Character;
import model.weapons.Bow;
import model.weapons.WizardsStaff;

public class Archer extends Character {
    public Archer(String name, Bow weapon, LightArmor armor) {
        super(name, weapon, armor);
    }


    public int getArrows() {
        return arrows;
    }

    public int getMaxArrows() {
        return maxArrows;
    }

    public void addArrows(int mana) {
        arrows += mana;
        if (arrows > maxArrows)
            arrows = maxArrows;
    }

    private int arrows;
    private int maxArrows;

    @Override
    public void updateLevel() {
        super.updateLevel();
        maxArrows += 10;
    }

    @Override
    public void attack(Character target) {
        if (arrows > 0)
            super.attack(target);
        else
            System.out.println("Недостаточно стрел для атаки");
        if (super.getWeapon() instanceof WizardsStaff)
            arrows -= super.getWeapon().getDamage() / 10;
    }
}