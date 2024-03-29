package edu.guilford;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class FishingPane extends Pane {

        SeaCreatures seaCreature = new SeaCreatures();
        // File smallFish = new
        // File(FishingPane.class.getResource("/smallfish.png").toURI());
        private ImageView smallFish;
        private ImageView smallFish2;
        private ImageView smallFish3;
        private ImageView largeFish;
        private ImageView largeFish2;
        private ImageView woodenStick;
        private ImageView octopus;
        private ImageView fisherman;

        // instantiate a line shape to be used as the fishing line
        private Line line;

        Random random = new Random();
        Timer timer;

        // declare a helpButton
        Button helpButton = new Button("Help");

        // declare a stopButton
        Button stopButton = new Button("Stop");

        // Constructor
        public FishingPane(SeaCreatures seaCreature) {
                this.seaCreature = seaCreature;

                // create an array list of 9 random sea creatures
                ArrayList seaCreaturesArray = new ArrayList();
                for (int number = 0; number < 9; number++) {
                        SeaCreatures seaCreatureObject = new SeaCreatures();
                        seaCreaturesArray.add(seaCreatureObject);
                        this.getChildren().add(seaCreatureObject.getImage());
                }

                // iterate through the array list and use transition method to animate each sea
                // creature
                for (int number = 0; number < seaCreaturesArray.size(); number++) {
                        SeaCreatures seaCreatureObject = (SeaCreatures) seaCreaturesArray.get(number);
                        seaCreatureObject.transition(seaCreatureObject.getImage());
                        //set the transition to repeat forever
                        seaCreatureObject.getTransition().setOnFinished(e -> {
                                //have the transition repeat forever
                                //remove the image from the pane and array list
                                this.getChildren().remove(seaCreatureObject.getImage());
                                //remove from the array list
                                //seaCreaturesArray.remove(seaCreatureObject);
                                //add a new random one to the pane and array list
                                SeaCreatures newSeaCreatureObject = new SeaCreatures();
                                this.getChildren().add(newSeaCreatureObject.getImage());
                                newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                        });

                }

                //infinitely iterate through the array list and use transition method to animate each sea
                // creature


                // for loop for seaCreatures that once the transition is finished, it removes
                // the image from the pane and the array list and adds a new random one
                // to the pane and array list. It keeps doing this every time the transition is
                // finished for each object, so it is constantly adding and removing
                // objects from the pane and array list

                SeaCreatures seaCreature2 = (SeaCreatures) seaCreaturesArray.get(1);
                SeaCreatures seaCreature3 = (SeaCreatures) seaCreaturesArray.get(2);
                SeaCreatures seaCreature4 = (SeaCreatures) seaCreaturesArray.get(3);
                SeaCreatures seaCreature5 = (SeaCreatures) seaCreaturesArray.get(4);
                SeaCreatures seaCreature6 = (SeaCreatures) seaCreaturesArray.get(5);
                SeaCreatures seaCreature7 = (SeaCreatures) seaCreaturesArray.get(6);
                SeaCreatures seaCreature8 = (SeaCreatures) seaCreaturesArray.get(7);
                SeaCreatures seaCreature9 = (SeaCreatures) seaCreaturesArray.get(8);

                // while loop for each sea creature that once the transition is finished, it
                // removes the image from the pane and the array list and adds a new random one
                // to the pane and array list. It keeps doing this every time the transition is
                // finished for each object, so it is constantly adding and removing
                // objects from the pane and array list

                // take seaCreature1 and once the transition is finished, remove the image from
                // the pane and array list and add a new random one to the pane and array list
                // and have this sequence repeat forever

                //while there is an index 0 in the array list, do the following
                        //get the first element of the array list
                        SeaCreatures seaCreature1 = (SeaCreatures) seaCreaturesArray.get(0);
                        //once the transition is finished, do the following
                        // seaCreature1.getTransition().setOnFinished(e -> {
                        //         //have the transition repeat forever
                        //         //remove the image from the pane and array list
                        //         this.getChildren().remove(seaCreature1.getImage());
                        //         //add a new random one to the pane and array list
                        //         SeaCreatures newSeaCreatureObject = new SeaCreatures();
                        //         seaCreaturesArray.set(0, newSeaCreatureObject);
                        //         this.getChildren().add(newSeaCreatureObject.getImage());
                        //         newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                        // });

                // seaCreature2.getTransition().setOnFinished(e -> {
                // this.getChildren().remove(seaCreature2.getImage());
                // seaCreaturesArray.remove(seaCreature2);
                // SeaCreatures newSeaCreatureObject = new SeaCreatures();
                // seaCreaturesArray.add(1, newSeaCreatureObject);
                // this.getChildren().add(newSeaCreatureObject.getImage());
                // newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                // });

                // seaCreature3.getTransition().setOnFinished(e -> {
                // this.getChildren().remove(seaCreature3.getImage());
                // seaCreaturesArray.remove(seaCreature3);
                // SeaCreatures newSeaCreatureObject = new SeaCreatures();
                // seaCreaturesArray.add(2, newSeaCreatureObject);
                // this.getChildren().add(newSeaCreatureObject.getImage());
                // newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                // });

                // seaCreature4.getTransition().setOnFinished(e -> {
                // this.getChildren().remove(seaCreature4.getImage());
                // seaCreaturesArray.remove(seaCreature4);
                // SeaCreatures newSeaCreatureObject = new SeaCreatures();
                // seaCreaturesArray.add(3, newSeaCreatureObject);
                // this.getChildren().add(newSeaCreatureObject.getImage());
                // newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                // });

                // seaCreature5.getTransition().setOnFinished(e -> {
                // this.getChildren().remove(seaCreature5.getImage());
                // seaCreaturesArray.remove(seaCreature5);
                // SeaCreatures newSeaCreatureObject = new SeaCreatures();
                // seaCreaturesArray.add(4, newSeaCreatureObject);
                // this.getChildren().add(newSeaCreatureObject.getImage());
                // newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                // });

                // seaCreature6.getTransition().setOnFinished(e -> {
                // this.getChildren().remove(seaCreature6.getImage());
                // seaCreaturesArray.remove(seaCreature6);
                // SeaCreatures newSeaCreatureObject = new SeaCreatures();
                // seaCreaturesArray.add(5, newSeaCreatureObject);
                // this.getChildren().add(newSeaCreatureObject.getImage());
                // newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                // });

                // seaCreature7.getTransition().setOnFinished(e -> {
                // this.getChildren().remove(seaCreature7.getImage());
                // seaCreaturesArray.remove(seaCreature7);
                // SeaCreatures newSeaCreatureObject = new SeaCreatures();
                // seaCreaturesArray.add(6, newSeaCreatureObject);
                // this.getChildren().add(newSeaCreatureObject.getImage());
                // newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                // });

                // seaCreature8.getTransition().setOnFinished(e -> {
                // this.getChildren().remove(seaCreature8.getImage());
                // seaCreaturesArray.remove(seaCreature8);
                // SeaCreatures newSeaCreatureObject = new SeaCreatures();
                // seaCreaturesArray.add(7, newSeaCreatureObject);
                // this.getChildren().add(newSeaCreatureObject.getImage());
                // newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                // });

                // seaCreature9.getTransition().setOnFinished(e -> {
                // this.getChildren().remove(seaCreature9.getImage());
                // seaCreaturesArray.remove(seaCreature9);
                // SeaCreatures newSeaCreatureObject = new SeaCreatures();
                // seaCreaturesArray.add(8, newSeaCreatureObject);
                // this.getChildren().add(newSeaCreatureObject.getImage());
                // newSeaCreatureObject.transition(newSeaCreatureObject.getImage());
                // });

                fisherman = new ImageView(
                                new File(FishingPane.class.getResource("fisherman.png").getPath()).toURI().toString());

                System.out.println(seaCreature.getName());

                // // Animate fishes and seacreatures
                // TranslateTransition smallFishTransition = new TranslateTransition();
                // smallFishTransition.setNode(smallFish);
                // smallFishTransition.setDuration(javafx.util.Duration.seconds(random.nextInt(5)
                // + 10));
                // smallFishTransition.setByX(-1000);
                // smallFishTransition.setCycleCount(0);
                // smallFishTransition.play();

                // TranslateTransition smallFishTransition2 = new TranslateTransition();
                // smallFishTransition2.setNode(smallFish2);
                // smallFishTransition2.setDuration(javafx.util.Duration.seconds(random.nextInt(5)
                // + 10));
                // smallFishTransition2.setByX(-1000);
                // smallFishTransition2.setCycleCount(0);
                // smallFishTransition2.play();

                // TranslateTransition smallFishTransition3 = new TranslateTransition();
                // smallFishTransition3.setNode(smallFish3);
                // smallFishTransition3.setDuration(javafx.util.Duration.seconds(random.nextInt(5)
                // + 10));
                // smallFishTransition3.setByX(-1000);
                // smallFishTransition3.setCycleCount(0);
                // smallFishTransition3.play();

                // TranslateTransition largeFishTransition = new TranslateTransition();
                // largeFishTransition.setNode(largeFish);
                // largeFishTransition.setDuration(javafx.util.Duration.seconds(random.nextInt(5)
                // + 10));
                // largeFishTransition.setByX(-1000);
                // largeFishTransition.setCycleCount(0);
                // largeFishTransition.play();

                // TranslateTransition largeFishTransition2 = new TranslateTransition();
                // largeFishTransition2.setNode(largeFish2);
                // largeFishTransition2.setDuration(javafx.util.Duration.seconds(random.nextInt(5)
                // + 10));
                // largeFishTransition2.setByX(-1000);
                // largeFishTransition2.setCycleCount(0);
                // largeFishTransition2.play();
                // seaCreature.transition(seaCreature.getImage());
                // System.out.println(seaCreature.getImage());
                // System.out.println(seaCreature.toString());

                // TranslateTransition woodenStickTransition = new TranslateTransition();
                // woodenStickTransition.setNode(woodenStick);
                // woodenStickTransition.setDuration(javafx.util.Duration.seconds((random.nextInt(5)
                // + 10)));
                // woodenStickTransition.setByX(-1000);
                // woodenStickTransition.play();

                // TranslateTransition octopusTransition = new TranslateTransition();
                // octopusTransition.setNode(octopus);
                // octopusTransition.setDuration(javafx.util.Duration.seconds(15));
                // octopusTransition.setByX(-1200);
                // octopusTransition.play();

                // // to the far right of the pane in the middle
                // smallFish.setX(900);
                // smallFish2.setX(900);
                // smallFish3.setX(900);
                // largeFish.setX(900);
                // largeFish2.setX(900);
                // woodenStick.setX(900);
                // octopus.setX(900);

                // set line right below the fisherman
                // parameters represent x1, y1, x2, y2 which are the starting and ending points
                // of the line
                // -467/14
                line = new Line(339, 183, 339, 650);
                line.setStrokeWidth(2);

                line.setStartX(339);
                line.setStartY(183);
                line.setEndX(317);
                line.setEndY(827);

                // use fullLine method to make line longer
                fullLine(line);

                // use translate transition to move line downward
                PathTransition lineTransition = new PathTransition();
                lineTransition.setNode(line);
                lineTransition.setDuration(javafx.util.Duration.seconds(10));
                lineTransition.setPath(line);
                lineTransition.play();

                // // set Y to a random number between 400 and 500 for small fish
                // smallFish.setY(random.nextInt(100) + 400);
                // smallFish2.setY(random.nextInt(100) + 400);
                // smallFish3.setY(random.nextInt(100) + 400);

                // // set Y to a random number between 500 and 600 for wooden stick
                // woodenStick.setY(random.nextInt(100) + 500);

                // // set large fish Y to a random number between 600 and 700
                // largeFish.setY(random.nextInt(100) + 600);
                // largeFish2.setY(random.nextInt(100) + 600);

                // //set octopus Y to a random number between 700 and 800
                // octopus.setY(random.nextInt(100) + 700);

                // set fisherman to the middle of the pane
                fisherman.setX(325);
                fisherman.setY(165);

                // rotate wooden stick
                // RotateTransition rotate = new RotateTransition();
                // rotate.setNode(woodenStick);
                // rotate.setDuration(javafx.util.Duration.seconds(15));
                // rotate.setByAngle(360);
                // rotate.setCycleCount(Animation.INDEFINITE);
                // rotate.play();

                // // add all the images of the objects attribute image from the arraylist to
                // the pane
                // for(int i = 0; i < seaCreaturesArray.size(); i++){
                // SeaCreatures seaCreatureObject = (SeaCreatures) seaCreaturesArray.get(i);
                // //get image of each object in the arraylist
                // ImageView image = seaCreatureObject.getImage();
                // this.getChildren().add(image);
                // }
                // this.getChildren().add(smallFish);
                // this.getChildren().add(smallFish2);
                // this.getChildren().add(smallFish3);
                // this.getChildren().add(largeFish);
                // this.getChildren().add(seaCreature.getImage());
                // this.getChildren().add(woodenStick);
                // this.getChildren().add(octopus);
                this.getChildren().add(line);

                // add the fisherman to the middle of the pane
                this.getChildren().add(fisherman);

                // add buttons
                // add help button to the top right of the pane
                Button helpButton = new Button("Help");
                helpButton.setLayoutX(780);
                helpButton.setLayoutY(10);
                helpButton.setPrefSize(100, 20);
                // set color to purple and text to white
                helpButton.setStyle("-fx-background-color: PURPLE; -fx-text-fill: #ffffff; -fx-font-size: 20px;");
                this.getChildren().add(helpButton);

                // add stop button the top left of the pane
                stopButton.setLayoutX(10);
                stopButton.setLayoutY(10);
                stopButton.setPrefSize(100, 20);
                stopButton.setStyle("-fx-background-color: PURPLE; -fx-text-fill: #ffffff; -fx-font-size: 20px;");
                this.getChildren().add(stopButton);

                // do a setonFinished for each transition to make it repeat with each object in
                // the arraylist

                // // when the fish has completed the animation, remove it from the pane
                // smallFishTransition.setOnFinished(e -> {
                // this.getChildren().remove(smallFish);
                // smallFish = new ImageView(
                // new File(FishingPane.class.getResource("smallfish.png").getPath()).toURI()
                // .toString());
                // // add the new fish to the pane
                // this.getChildren().add(smallFish);
                // smallFishTransition.setNode(smallFish);
                // // set duration between 10 and 15 seconds randomly
                // smallFishTransition.setDuration(javafx.util.Duration.seconds(random.nextInt(5)
                // + 10));
                // smallFishTransition.setByX(-1000);
                // // set the new fish to the far right of the pane in the middle
                // smallFish.setX(900);
                // // set Y to a random number between 400 and 500
                // smallFish.setY(random.nextInt(100) + 400);
                // // animate the new fish
                // smallFishTransition.play();
                // // use timeline keyframe to set a delay of 5 seconds before it creates a new
                // // fish
                // // Timeline time = new Timeline(new KeyFrame(Duration.seconds(5), ev -> {
                // // // create a new fish
                // // smallFish = new ImageView(
                // // new
                // //
                // File(FishingPane.class.getResource("smallfish.png").getPath()).toURI().toString());
                // // // add the new fish to the pane
                // // this.getChildren().add(smallFish);
                // // smallFishTransition.setNode(smallFish);
                // // smallFishTransition.setDuration(javafx.util.Duration.seconds(5));
                // // smallFishTransition.setByX(-1000);
                // // // set the new fish to the far right of the pane in the middle
                // // smallFish.setX(900);
                // // //set Y to a random number between 400 and 500
                // // smallFish.setY(random.nextInt(100) + 400);
                // // // animate the new fish
                // // smallFishTransition.play();

                // // }));
                // // time.setCycleCount(Timeline.INDEFINITE);
                // // time.play();

                // });

                // // when smallfish2 has completed the animation, remove it from the pane
                // smallFishTransition2.setOnFinished(e -> {
                // this.getChildren().remove(smallFish2);
                // smallFish2 = new ImageView(
                // new File(FishingPane.class.getResource("smallfish_2.png").getPath()).toURI()
                // .toString());
                // // add the new fish to the pane
                // this.getChildren().add(smallFish2);
                // smallFishTransition2.setNode(smallFish2);
                // smallFishTransition2.setDuration(javafx.util.Duration.seconds(random.nextInt(5)
                // + 10));
                // smallFishTransition2.setByX(-1000);
                // // set the new fish to the far right of the pane in the middle
                // smallFish2.setX(900);
                // // set Y to a random number between 400 and 500
                // smallFish2.setY(random.nextInt(100) + 400);
                // // animate the new fish
                // smallFishTransition2.play();
                // });

                // // add the same thing for smallfish3
                // smallFishTransition3.setOnFinished(e -> {
                // this.getChildren().remove(smallFish3);
                // smallFish3 = new ImageView(
                // new File(FishingPane.class.getResource("smallfish_3.png").getPath()).toURI()
                // .toString());
                // // add the new fish to the pane
                // this.getChildren().add(smallFish3);
                // smallFishTransition3.setNode(smallFish3);
                // smallFishTransition3.setDuration(javafx.util.Duration.seconds(random.nextInt(5)
                // + 10));
                // smallFishTransition3.setByX(-1000);
                // // set the new fish to the far right of the pane in the middle
                // smallFish3.setX(900);
                // // set Y to a random number between 400 and 500
                // smallFish3.setY(random.nextInt(100) + 400);
                // // animate the new fish
                // smallFishTransition3.play();
                // });

                // // add the same thing for largefish
                // largeFishTransition.setOnFinished(e -> {
                // this.getChildren().remove(largeFish);
                // largeFish = new ImageView(
                // new File(FishingPane.class.getResource("largefish.png").getPath()).toURI()
                // .toString());
                // // add the new fish to the pane
                // this.getChildren().add(largeFish);
                // largeFishTransition.setNode(largeFish);
                // largeFishTransition.setDuration(javafx.util.Duration.seconds(random.nextInt(5)
                // + 10));
                // largeFishTransition.setByX(-1000);
                // // set the new fish to the far right of the pane in the middle
                // largeFish.setX(900);
                // // set Y to a random number between 400 and 500
                // largeFish.setY(random.nextInt(100) + 600);
                // // animate the new fish
                // largeFishTransition.play();
                // });

                // // add the same thing for largefish2
                // // largeFishTransition2.setOnFinished(e -> {
                // // this.getChildren().remove(largeFish2);
                // // largeFish2 = new ImageView(
                // // new
                // File(FishingPane.class.getResource("largefish_2.png").getPath()).toURI()
                // // .toString());
                // // // add the new fish to the pane
                // // this.getChildren().add(largeFish2);
                // // largeFishTransition2.setNode(largeFish2);
                // //
                // largeFishTransition2.setDuration(javafx.util.Duration.seconds(random.nextInt(5)
                // + 10));
                // // largeFishTransition2.setByX(-1000);
                // // // set the new fish to the far right of the pane in the middle
                // // largeFish2.setX(900);
                // // // set Y to a random number between 400 and 500
                // // largeFish2.setY(random.nextInt(100) + 600);
                // // // animate the new fish
                // // largeFishTransition2.play();
                // // });

                // // add the same thing for woodenstick
                // woodenStickTransition.setOnFinished(e -> {
                // this.getChildren().remove(woodenStick);
                // woodenStick = new ImageView(
                // new File(FishingPane.class.getResource("woodenstick.png").getPath()).toURI()
                // .toString());
                // // add the new fish to the pane
                // this.getChildren().add(woodenStick);
                // woodenStickTransition.setNode(woodenStick);
                // woodenStickTransition.setDuration(javafx.util.Duration.seconds(random.nextInt(5)
                // + 10));
                // woodenStickTransition.setByX(-1000);
                // // set the new fish to the far right of the pane in the middle
                // woodenStick.setX(900);
                // // set Y to a random number between 400 and 500
                // woodenStick.setY(random.nextInt(100) + 600);
                // // rotate wooden stick
                // RotateTransition rotateagain = new RotateTransition();
                // rotateagain.setNode(woodenStick);
                // rotateagain.setDuration(javafx.util.Duration.seconds(15));
                // rotateagain.setByAngle(360);
                // rotateagain.setCycleCount(Animation.INDEFINITE);
                // // animate and rotate the woodenstick
                // woodenStickTransition.play();
                // rotateagain.play();
                // });

                // //add the same thing for octopus
                // octopusTransition.setOnFinished(e -> {
                // this.getChildren().remove(octopus);
                // octopus = new ImageView(
                // new File(FishingPane.class.getResource("octopus.png").getPath()).toURI()
                // .toString());
                // // add the new fish to the pane
                // this.getChildren().add(octopus);
                // octopusTransition.setNode(octopus);
                // //set duration between 15 and 30 seconds
                // octopusTransition.setDuration(javafx.util.Duration.seconds(random.nextInt(30)
                // + 30));
                // octopusTransition.setByX(-1000);
                // // set the new fish to the far right of the pane in the middle
                // octopus.setX(900);
                // // set Y to a random number between 700 and 800
                // octopus.setY(random.nextInt(100) + 700);
                // // animate the new fish
                // octopusTransition.play();
                // });

                // have line extend down to the bottom of the pane and then back up with every
                // spacebar press
                // TranslateTransition lineTransition = new TranslateTransition();
                // lineTransition.setOnFinished(e -> {
                // lineTransition.setNode(line);
                // lineTransition.setDuration(javafx.util.Duration.seconds(8));
                // lineTransition.setByY(183);
                // lineTransition.setByX(339);
                // lineTransition.play();
                // lineTransition.setOnFinished(ev -> {
                // lineTransition.setNode(line);
                // lineTransition.setDuration(javafx.util.Duration.seconds(8));
                // lineTransition.setByY(829);
                // lineTransition.setByX(317);
                // lineTransition.play();
                // });

                // event listener for space bar
                // this.setOnKeyPressed(e -> {
                // if (e.getCode() == KeyCode.SPACE) {
                // // if the line is not already extended, extend it
                // line = new Line(339, 183, 339, 650 + 100);
                // line.setEndY(650 + 100);
                // line.setEndX(339);

                // }
                // });

        }

        public Group fullLine(Line line) {
                Line startLine = new Line(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY());
                Line endLine = new Line(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY());
                return new Group(startLine, endLine);
        }

}