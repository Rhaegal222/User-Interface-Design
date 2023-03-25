package Es01;
import Es01.application.view.mainView;
import Es01.application.view.fileChooser;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        mainView.createInterface(fileChooser.createFileChooser());
    }
}
