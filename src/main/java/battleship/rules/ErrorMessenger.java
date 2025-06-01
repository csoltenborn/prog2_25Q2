package battleship.rules;

import javax.swing.*;
import java.util.function.Consumer;

public class ErrorMessenger implements Consumer<String> {

    private final JFrame parent;

    public ErrorMessenger(final JFrame parent) {
        this.parent = parent;
    }

    @Override
    public void accept(final String errorMessage) {
        JOptionPane.showMessageDialog(this.parent, errorMessage);
    }

}
