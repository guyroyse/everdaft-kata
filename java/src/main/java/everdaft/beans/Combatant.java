package everdaft.beans;

public interface Combatant {

    CombatantType getType();

    void damage(int points);

}