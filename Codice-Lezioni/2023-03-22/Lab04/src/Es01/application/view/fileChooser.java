package Es01.application.view;

import javax.swing.*;
import java.io.File;

public class fileChooser {
    public static String createFileChooser(){
        JFileChooser c = new JFileChooser();
        int res = c.showOpenDialog(mainView.f);
        if(res == JFileChooser.APPROVE_OPTION){
            File file = c.getSelectedFile();
            return file.getAbsolutePath();
        }
        return null;
    }

}
