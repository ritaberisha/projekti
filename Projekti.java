import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
 
public class Projekti extends Application {
 
    @Override public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Si e kaloj diten time");
        stage.setWidth(500);
        stage.setHeight(500);
 
        ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("Fjetje (ore)", 7),
                new PieChart.Data("Argetim (ore)", 9),
                new PieChart.Data("Ne klase (ore)", 3),
                new PieChart.Data("Detyra shtepie (ore)", 5));
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Si e kaloj diten time");

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
