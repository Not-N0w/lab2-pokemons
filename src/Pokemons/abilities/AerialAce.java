package Pokemons.abilities;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, 1);
    }

    @Override
    protected String describe() {
        return "запутывает цель большой скоростью, а затем атакует";
    }
}