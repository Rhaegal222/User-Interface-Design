package it.unical.demacs.informatica.gestorelibri.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;

public class UsersReader {
    private final HashMap<String, String> users;
    private static UsersReader instance = null;
    private static final String path = "/files" + File.separator + "users.txt";
    private UsersReader(){
        users = new HashMap<>();
        try{
            List<String> allUsers = Files.readAllLines(Path.of("src/main/java/it/unical/demacs/informatica/gestorelibri/files/users.txt"));
            allUsers.forEach(str -> {
                String[] res = str.split(";");
                users.put(res[0], res[1]);
            });
        } catch (Exception ignored) {}
    }
    public static UsersReader getInstance(){
        if(instance == null)
            instance = new UsersReader();
        return instance;
    }
    public boolean checkAccess(String user, String password){
        String pass = users.get(user);
        if(pass==null)
            return false;
        return pass.equals(password);
    }
}
