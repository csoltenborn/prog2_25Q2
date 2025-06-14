package battleship.rules;

import battleship.model.Coordinate;
import battleship.model.Player;

import java.util.function.Consumer;

public class PlacementListener implements Consumer<Coordinate> {

    private final RuleEngine engine;

    private final Player player;

    public PlacementListener(final RuleEngine engine, final Player player) {
        this.engine = engine;
        this.player = player;
    }

    @Override
    public void accept(final Coordinate coordinate) {
        this.engine.placement(coordinate, this.player);
    }

}
