/*
 *
 *  *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  *  Copyright 2021 Alice Yu
 *
 */

package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditListControllerTest {

    @Test
    void addItemClicked() {
        // create a json object with all values for an item (Date, description...)
        // addItem(json object)
        // isItem = check json file for item
        // assertTrue(isItem);
    }

    @Test
    void removeItemClicked() {
        //  create a json object with all values for an item (Date, description...)
        // removeItem(json object)
        // isItem = check json file for item
        // assertNotTrue(isItem)

    }

    @Test
    void allItemsButtonClicked() {
        // get all values from Json file
        // put into list
        // assertEquals(listValues, allValues())
    }

    @Test
    void completedItemsClicked() {
        // get all completed values from Json file
        // put into list
        // assertEquals(completedValuesList, completedItems())
    }

    @Test
    void incompleteItemsClicked() {
        // get all completed values from Json file
        // put into list
        // assertEquals(incompleteValuesList, incompleteItems())
    }

    @Test
    void saveListClicked() {
        // Load all values from Json file
        // into listFromJson
        // listValues = saveList()
        // assertEquals(listValues, listFromJson)
    }

    @Test
    void setTitle() {
        // get data from text field into String title
        // setTitle()
        // assertEquals(setTitle(), title)
    }

    @Test
    void loadList() {
        // load all items in a list from Json file
        // into itemsListFromJson
        // listValues = loadList()
        // assertEquals(listValues, itemsListFromJson)
    }

    @Test
    void getTitle() {
        // create a json object with all values for an item (Date, description...)
        // String title;
        // assertEquals(getTitle(), title)
    }

    @Test
    void checkIfMarked(){
        // get a json object with all values for an item (Date, description...)
        // boolean saved = savelist(json object)
        // boolean check = json File value of item
        // assertEquals(saved, check)
    }

    @Test
    void checkIfItemEdited(){
         // get a json object with all values for an item (Date, description...)
        // String saved = savelist(json object)
        // String check = json File value of item
        // assertEquals(saved, check)
    }

    @Test
    void checkIfDueDateEdited(){
        // get a json object with all values for an item (Date, description...)
        // String saved = savelist(json object)
        // String check = json File value of item
        // assertEquals(saved, check)
    }

    @Test
    void checkIfDueDescriptionEdited(){
        // get a json object with all values for an item (Date, description...)
        // String saved = savelist(json object)
        // String check = json File value of item
        // assertEquals(saved, check)
    }

}