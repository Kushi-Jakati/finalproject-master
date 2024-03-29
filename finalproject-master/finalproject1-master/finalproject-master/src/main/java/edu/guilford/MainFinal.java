package edu.guilford;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * JavaFX App
 */

//extends Javafx Animation class
public class MainFinal extends Application {

    private static Scene scene;
    private static Scene key;

    @Override
    public void start(Stage stage) throws IOException, URISyntaxException {
        // Instantiate the controller
        VBox root = new VBox();
        SeaCreatures seaCreature = new SeaCreatures();
        // set background image using the ocean.png file through the Image class and the
        // BackgroundImage class
        Image image = new Image(new File(MainFinal.class.getResource("ocean_2.png").getPath()).toURI().toString());
        //resize the image
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        //set the background image
        root.setBackground(new Background(backgroundImage));
        root.getChildren().add(new FishingPane(seaCreature));
        scene = new Scene(root, 900, 828);
        stage.setScene(scene);
        stage.show();
        //make it so that the program stops when the window is closed
        stage.setOnCloseRequest(e -> System.exit(0));
    }

    // @Override
    // public void keys(Stage stage2) throws IOException, URISyntaxException{
    //     // Instantiate the controller
    //     VBox root = new VBox();
    //     //add KeyPane to the scene
    //     KeyPane keyPane = new KeyPane();
    //     root.getChildren().add(keyPane);
    //     //scene is equal to a panel for javafx
    //     key = new Scene(root, 900, 828);
    //     stage2.setScene(key);
    //     stage2.show();
    // }

    public static void main(String[] args) {
        launch();
    }

}