package minions;

import java.util.ArrayList;

public class Sentinel extends Minion{

    public Sentinel(int mana, int attackDamage, int health, String description, ArrayList<String> colors, String name,
                    boolean hasAttacked, boolean frozen) {
        super(mana, attackDamage, health, description, colors, name, hasAttacked, frozen);
    }

}
