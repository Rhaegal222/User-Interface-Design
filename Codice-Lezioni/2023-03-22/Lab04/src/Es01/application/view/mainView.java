package Es01.application.view;

import javax.swing.*;

public class mainView {
    static JFrame f = new JFrame("Exam test");
    public static void createInterface(String pathFile) {
        f.setSize(1280, 720);
        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu exam = new JMenu("Exam");
        JMenu help = new JMenu("Help");

        menuBar.add(file);
        menuBar.add(exam);
        menuBar.add(help);

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem aboutItem = new JMenuItem("About");
        JMenuItem checkItem = new JMenuItem("Check answer");
        JMenuItem suggestionsItem = new JMenuItem("Suggestions");

        file.add(newItem);
        file.add(loadItem);
        exam.add(checkItem);
        exam.add(suggestionsItem);
        help.add(aboutItem);

        f.setJMenuBar(menuBar);
        f.setVisible(true);
    }
}
