package battleship;

import javax.swing.*;

import battleship.ai.*;
import battleship.model.*;
import battleship.rules.*;
import battleship.view.*;

public class Main {

    public static void main(final String[] args) {
        final FieldGrid ownGrid = new FieldGrid();
        final FieldGrid opponentGrid = new FieldGrid();
        final JLabel status = new JLabel();
        final FieldListener ownFieldListener = new FieldListener(ownGrid);
        final FieldListener opponentFieldListener = new FieldListener(opponentGrid);
        final MainFrame frame = new MainFrame(ownGrid, opponentGrid, status);
        final ErrorMessenger errorMessenger = new ErrorMessenger(frame);
        final RuleEngine engine =
                new RuleEngine(StandardRules.INSTANCE, new SimpleAI(), ownFieldListener, opponentFieldListener, status, errorMessenger);
        ownGrid.setFields(engine.toFieldArray(Player.FIRST, true));
        opponentGrid.setFields(engine.toFieldArray(Player.SECOND, false));
        ownGrid.addListener(new PlacementListener(engine, Player.FIRST));
        opponentGrid.addListener(new ShotListener(engine, Player.FIRST));
        frame.pack();
        frame.setVisible(true);
    }

}
