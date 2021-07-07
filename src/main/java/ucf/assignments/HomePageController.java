/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class HomePageController {
    @FXML
    private ListView<String> listView;


    @FXML
    public void addListClicked(ActionEvent actionEvent) {
        // switch to Edit List interface
        // implement by switching scenes
    }

    @FXML
    public void removeListClicked(ActionEvent actionEvent) {
        // get name of list you want to remove
        // delete from Json file
        // display to list view
    }

    @FXML
    public void editListClicked(ActionEvent actionEvent) {
        // get name of list user wants to edit
        // send list key to loadList
        // switch to edit list interface
        // implement by switching screens
    }

    @FXML
    public void saveListClicked(ActionEvent actionEvent) {
        // get all lists
        // save all lists to Json file
    }

    public void loadListView() {
        // load previously saved lists from Json file
        // display to listView
    }


}
