package com.karam.connect;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

	@FXML
	public Pane myPane;

	@FXML
	public Button myButton;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		Circle circle=new Circle();
		circle.setRadius(20);
		circle.setFill(Color.RED);
		circle.setTranslateX(50); //Move the circe 50 pixel along the positive x axis.
		circle.setTranslateY(50); //Move the circe 50 pixel along the positive y axis.


		myPane.getChildren().add(circle);

		myButton.setOnAction(event -> {
			startAnimation(circle);
		});
	}

	private void startAnimation(Circle circle) {
		TranslateTransition transition=new TranslateTransition(Duration.seconds(.5),circle);//parametrised constructor
		transition.setToY(200);
		transition.play();
	}
}
