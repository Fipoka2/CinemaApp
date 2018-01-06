package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import DAO.GenreDAO;
import DAO.MovieDAO;
import entity.GenreEntity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import service.GenreService;
import service.MovieService;

public class MainController implements Initializable {

    @FXML
    private Button infoButton;

    @FXML
    private ComboBox movieComboBox;

    @FXML
    private ListView movieView;

    private int iter = 1;

    private MovieService movieService = new MovieService(new MovieDAO());

    private GenreService genreService = new GenreService(new GenreDAO());

    private ObservableList<String> list = FXCollections.observableArrayList();

    public void initialize(URL location, ResourceBundle resources) {
        list.add("ttt");
    }

    public void showDateTime(ActionEvent event) {
        System.out.println("Button Clicked!");
        List<String> stringList = new ArrayList<String>();
        stringList.add("121212");
        List<GenreEntity> list = genreService.getAll();
        System.out.println(Arrays.toString(list.toArray()));
    }

}
