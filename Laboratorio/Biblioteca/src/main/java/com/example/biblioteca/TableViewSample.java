package com.example.biblioteca;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TableViewSample extends Application {

    private final TableView table = new TableView();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("Books");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button AddBook = new Button("Add Book");
        grid.add(AddBook, 0, 0);

        Button SetTheme = new Button("Set light Theme");
        grid.add(SetTheme, 1, 0);

        Button Logout = new Button("Logout");
        grid.add(Logout, 2, 0);

        table.setEditable(true);

        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");

        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

        Scene scene = new Scene(grid, 500, 700);
        stage.setScene(scene);

        stage.show();
    }
}