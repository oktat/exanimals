package lan.zold;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;

public class MainController {

    String[] animals = {
        "kutya",
        "macska",
        "oroszlán",
        "elefánt",
        "zebra",
        "delfin",
        "tyúk",
        "panda",
        "tigris",
        "kígyó",
        "ló",
        "tehén",
        "majom",
        "bárány",
        "pingvin",
        "kaméleon",
        "süni",
        "róka",
        "vaddisznó",
        "bölény"
    };

    CheckBox[] animalCheckboxes = new CheckBox[animals.length];

    @FXML
    private GridPane grid;    

    @FXML
    void initialize() {
        for (int i = 0; i < animals.length; i++) {
            animalCheckboxes[i] = new CheckBox(animals[i]);
        }
        for (int i = 0; i < animalCheckboxes.length; i++) {
            grid.add(animalCheckboxes[i], i % 5, i / 5);
        }
        for (CheckBox checkBox : animalCheckboxes) {
            checkBox.selectedProperty().addListener((observable, oldValue, newValue) -> {
                System.out.println(checkBox.getText() + " state changed to: " + newValue);
            });
        }

    }

    @FXML
    void onClickSaveButton(ActionEvent event) {
        System.out.println("save");

        for (CheckBox checkBox : animalCheckboxes) {
            if (checkBox.isSelected()) {
                System.out.println(checkBox.getText());
            }
        }

    }

}
