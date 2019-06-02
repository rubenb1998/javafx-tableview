import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    Stage window;
    TableView<Person> table;
    TextField nameInput, middlenameInput, backnameInput, adressInput, housenumberInput, zipcodeInput, residenceInput, dateofbirthInput, emailInput, phoneInput;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("thenewboston - JavaFX");

        TableColumn<Person, String> nameColumn = new TableColumn<>("name");
        nameColumn.setMinWidth(150);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));


        TableColumn<Person, String> middlenameColumn = new TableColumn<>("t.v.");
        middlenameColumn.setMinWidth(75);
        middlenameColumn.setCellValueFactory(new PropertyValueFactory<>("Middlename"));


        TableColumn<Person, String> backnameColumn = new TableColumn<>("last name");
        backnameColumn.setMinWidth(150);
        backnameColumn.setCellValueFactory(new PropertyValueFactory<>("backname"));


        TableColumn<Person, String> adressColumn = new TableColumn<>("adress");
        adressColumn.setMinWidth(150);
        adressColumn.setCellValueFactory(new PropertyValueFactory<>("adress"));


        TableColumn<Person, String> housenumberColumn = new TableColumn<>("Nr");
        housenumberColumn.setMinWidth(30);
        housenumberColumn.setCellValueFactory(new PropertyValueFactory<>("housenumber"));


        TableColumn<Person, String> zipcodeColumn = new TableColumn<>("zipcode");
        zipcodeColumn.setMinWidth(75);
        zipcodeColumn.setCellValueFactory(new PropertyValueFactory<>("zipcode"));


        TableColumn<Person, String> residenceColumn = new TableColumn<>("place");
        residenceColumn.setMinWidth(150);
        residenceColumn.setCellValueFactory(new PropertyValueFactory<>("residence"));


        TableColumn<Person, String> dateofbirthColumn = new TableColumn<>("date of birth");
        dateofbirthColumn.setMinWidth(100);
        dateofbirthColumn.setCellValueFactory(new PropertyValueFactory<>("dateofbirth"));


        TableColumn<Person, String> emailColumn = new TableColumn<>("Email");
        emailColumn.setMinWidth(200);
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));


        TableColumn<Person, String> phoneColumn = new TableColumn<>("phone");
        phoneColumn.setMinWidth(150);
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));


        nameInput = new TextField();
        nameInput.setPromptText("name");
        nameInput.setMinWidth(100);

        middlenameInput = new TextField();
        middlenameInput.setPromptText("t.v.");

        backnameInput = new TextField();
        backnameInput.setPromptText("lastName");


        adressInput = new TextField();
        adressInput.setPromptText("Adress");


        housenumberInput = new TextField();
        housenumberInput.setPromptText("nr");


        zipcodeInput = new TextField();
        zipcodeInput.setPromptText("zipcode");


        residenceInput = new TextField();
        residenceInput.setPromptText("place");


        dateofbirthInput = new TextField();
        dateofbirthInput.setPromptText("date of birth");


        emailInput = new TextField();
        emailInput.setPromptText("Email");


        phoneInput = new TextField();
        phoneInput.setPromptText("phone number");


        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());

        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteButtonClicked());


        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, middlenameInput, backnameInput, adressInput, housenumberInput, zipcodeInput, residenceInput, dateofbirthInput, emailInput, phoneInput, addButton, deleteButton);

        table = new TableView<>();
        table.setItems(getPerson());
        table.getColumns().addAll(nameColumn, middlenameColumn, backnameColumn, adressColumn, housenumberColumn, zipcodeColumn, residenceColumn, dateofbirthColumn, emailColumn, phoneColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }


    //Add button clicked
    public void addButtonClicked(){
        Person product = new Person();
        product.setName(nameInput.getText());
        product.setMiddlename(middlenameInput.getText());
        product.setBackname(backnameInput.getText());
        product.setAdress(adressInput.getText());
        product.setHousenumber(housenumberInput.getText());
        product.setZipcode(zipcodeInput.getText());
        product.setResidence(residenceInput.getText());
        product.setDateofbirth(dateofbirthInput.getText());
        product.setEmail(emailInput.getText());
        product.setPhone(phoneInput.getText());


        table.getItems().add(product);
        nameInput.clear();
        middlenameInput.clear();
        backnameInput.clear();
        adressInput.clear();
        housenumberInput.clear();
        zipcodeInput.clear();
        residenceInput.clear();
        dateofbirthInput.clear();
        emailInput.clear();
        phoneInput.clear();

    }

    //Delete button clicked
    public void deleteButtonClicked(){
        ObservableList<Person> PersonSelected, allPersons;
        allPersons = table.getItems();
        PersonSelected = table.getSelectionModel().getSelectedItems();

        PersonSelected.forEach(allPersons::remove);
    }

    public ObservableList<Person> getPerson(){
        ObservableList<Person> persons = FXCollections.observableArrayList();
        persons.add(new Person("testName", "" , "lastName", "adressName", "nr", "zipcode", "place", "dateOfBirth", "email@gmail.com", "phoneNumber"));
        persons.add(new Person("testName", "" , "lastName", "adressName", "nr", "zipcode", "place", "dateOfBirth", "email@gmail.com", "phoneNumber"));
        persons.add(new Person("testName", "" , "lastName", "adressName", "nr", "zipcode", "place", "dateOfBirth", "email@gmail.com", "phoneNumber"));
        return persons;
    }

}