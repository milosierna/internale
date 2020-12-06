package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    Stage stage = new Stage();
    ArrayList<Internal> internals = FileConstructor.readFormFile();

    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();
        Scene scene = new Scene(root, 600, 600);
        stage.setTitle("Internals");
        stage.setScene(scene);
        stage.show();
        addingLayout();
    }
    public void addingLayout() {
        GridPane root = new GridPane();

        Text textGrade = new Text("Average grade  " + Internals.getAverageOfGrades(internals));
        textGrade.setFill(Color.MEDIUMORCHID);
        root.add(textGrade, 0, 0);
        Text textPoints = new Text("Average points  " + Internals.getAverageOfPoints(internals));
        textPoints.setFill(Color.MEDIUMORCHID);
        root.add(textPoints, 0, 1);
        Text textMax = new Text("The max points  " + Internals.getMaxPointsOfInternal(internals));
        textMax.setFill(Color.MEDIUMORCHID);
        root.add(textMax, 0, 2);
        Text textPercentage = new Text("The percentage of 7 " + Internals.getPercentageOfTheBestGrade(internals) + " %");
        textPercentage.setFill(Color.MEDIUMORCHID);
        root.add(textPercentage, 0, 3);

        stage.getScene().setRoot(root);
}
    public static double getAverageOfPoints(ArrayList<Internal>internals) {
        double sum = 0;
        for (int i = 0; i < internals.size(); i++) {
            sum += internals.get(i).getPoints();
        }
        if (internals.size() != 0) {
            return sum / internals.size();
        } else {
            return 0;
        }
    }
    public static double getAverageOfGrades(ArrayList<Internal>internals) {
        double sum = 0;
        for (int i = 0; i < internals.size(); i++) {
            sum += internals.get(i).getGrade();
        }
        if (internals.size() != 0) {
            return sum / internals.size();
        } else {
            return 0;
        }
    }
    public static Internal getMaxPointsOfInternal(ArrayList<Internal>internals) {
        Internal max = internals.get(0);
        for (int i = 1; i < internals.size(); i++) {
            if (internals.get(i).getPoints()> max.getPoints()) {
                max = internals.get(i);
            }

        }
        return max;
    }
    public static float getPercentageOfTheBestGrade(ArrayList<Internal>internals) {
        float Percentage;
        for (int i = 1; i < internals.size(); i++) {
            if (internals.get(i).getGrade() == 7) {
                return Percentage = (float) ((internals.get(i).getGrade()*100/internals.size() ));


            }
        }


        return 0;
    }




    public static void main(String[] args) {
        launch(args);
    }
}
