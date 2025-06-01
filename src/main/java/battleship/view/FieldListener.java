package battleship.view;

import battleship.model.Coordinate;
import battleship.model.Field;

import java.util.function.BiConsumer;

public class FieldListener implements BiConsumer<Coordinate, Field> {

    private final FieldGrid grid;

    public FieldListener(final FieldGrid grid) {
        this.grid = grid;
    }

    @Override
    public void accept(final Coordinate coordinate, final Field field) {
        this.grid.setField(coordinate, field);
    }

}
