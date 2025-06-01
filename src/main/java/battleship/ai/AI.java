package battleship.ai;

import battleship.model.Field;
import battleship.model.ShipPlacement;
import battleship.model.ShipType;
import battleship.model.Shot;
import battleship.rules.Rules;

public interface AI {

    ShipPlacement getShipPlacement(final Rules rules, final Field[][] ownFields, final ShipType type);

    Shot getShot(final Rules rules, final Field[][] opponentField);

}
