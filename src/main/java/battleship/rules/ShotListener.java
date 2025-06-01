package battleship.rules;

import battleship.model.Coordinate;
import battleship.model.Player;

import java.util.function.Consumer;

public class ShotListener implements Consumer<Coordinate> {

    private final RuleEngine engine;

    private final Player player;

    public ShotListener(final RuleEngine engine, final Player player) {
        this.engine = engine;
        this.player = player;
    }

    @Override
    public void accept(final Coordinate coordinate) {
        this.engine.shot(coordinate, this.player);
    }

}
