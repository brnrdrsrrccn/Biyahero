import java.io.InputStream;

import javax.swing.Icon;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.*;
import javafx.scene.text.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {

        // Load customized font
        InputStream fontPath = getClass().getResourceAsStream("/Assets/coolvetica/coolvetica rg.otf");
        Font.loadFont(fontPath, 12);

        // Setting title for the stage
        primaryStage.setTitle("Biyahero");

        // Elements Declarations/Initializations
        // Removing column constraints
        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setPercentWidth(100);

        // Texts
        Text heading = new Text("Login");
        heading.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 32));
        heading.setId("text");
        Text subheading1 = new Text("Username");
        subheading1.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 16));
        subheading1.setId("text");
        Text subheading2 = new Text("Password");
        subheading2.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 16));
        subheading2.setId("text");
        Text text1 = new Text("Have no account yet?");
        text1.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 16));
        text1.setId("text");

        // Fields
        TextField username = new TextField();
        username.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 11));
        username.setId("user-field");
        username.setPromptText("Type your username");
        PasswordField password = new PasswordField();
        password.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 11));
        password.setId("pass-field");
        password.setPromptText("Type your password");

        // Hyperlinks
        Hyperlink forgot = new Hyperlink("Forgot your password?");
        forgot.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 11));
        forgot.setId("hyper-text-forgot");
        Hyperlink signupbtn = new Hyperlink("SIGN UP");
        signupbtn.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 24));
        signupbtn.setId("hyper-text-signup");

        // Buttons
        Button login = new Button("LOGIN");
        login.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 16));
        login.setId("button");
        login.setPrefWidth(150);

        // Pane Declarations/Initializations
        GridPane grid = new GridPane();
        grid.setPrefSize(150, 300);
        grid.setMinSize(200, 200);
        grid.setMaxSize(280, 330);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 25, 25, 25));
        grid.getColumnConstraints().add(columnConstraints);
        grid.setId("window");
        grid.add(heading, 0, 1);
        grid.setHalignment(heading, HPos.CENTER);
        grid.add(subheading1, 0, 3);
        grid.add(username, 0, 4);
        grid.add(subheading2, 0, 5);
        grid.add(password, 0, 6);
        grid.add(forgot, 0, 7);
        grid.setHalignment(forgot, HPos.RIGHT);
        grid.add(login, 0, 11);
        grid.setHalignment(login, HPos.CENTER);

        StackPane layout = new StackPane();
        layout.setId("bgpane");
        layout.getChildren().add(grid);
        layout.getChildren().add(text1);
        layout.getChildren().add(signupbtn);
        text1.setTranslateY(240);
        signupbtn.setTranslateY(270);

        // Event handlers
        signupbtn.setOnAction(e -> signuppage(primaryStage));
        login.setOnAction(e -> mainpage(primaryStage));

        Scene loginpage = new Scene(layout, 360, 640);
        loginpage.getStylesheets().addAll(this.getClass().getResource("Style.css").toExternalForm());
        primaryStage.setScene(loginpage);
        primaryStage.show();

    }

    private void signuppage(Stage primaryStage) {

        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setPercentWidth(100);

        // Texts
        Text heading = new Text("Register");
        heading.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 32));
        heading.setId("text");
        Text subheading1 = new Text("Email");
        subheading1.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 16));
        subheading1.setId("text");
        Text subheading2 = new Text("Username");
        subheading2.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 16));
        subheading2.setId("text");
        Text subheading3 = new Text("Password");
        subheading3.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 16));
        subheading3.setId("text");

        // Fields
        TextField email = new TextField();
        email.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 11));
        email.setId("email-field");
        email.setPromptText("Type your email");
        TextField username = new TextField();
        username.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 11));
        username.setId("user-field");
        username.setPromptText("Type your username");
        PasswordField password = new PasswordField();
        password.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 11));
        password.setId("pass-field");
        password.setPromptText("Type your password");

        // Hyperlink
        Hyperlink loginbtn = new Hyperlink("LOGIN");
        loginbtn.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 24));
        loginbtn.setId("hyper-text-login");

        // Buttons
        Button register = new Button("REGISTER");
        register.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 16));
        register.setId("button");
        register.setPrefWidth(150);

        GridPane grid = new GridPane();
        grid.setPrefSize(150, 300);
        grid.setMinSize(200, 200);
        grid.setMaxSize(280, 400);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 25, 25, 25));
        grid.getColumnConstraints().add(columnConstraints);
        grid.setId("window");
        grid.add(heading, 0, 1);
        grid.setHalignment(heading, HPos.CENTER);
        grid.add(subheading1, 0, 3);
        grid.add(email, 0, 4);
        grid.add(subheading2, 0, 5);
        grid.add(username, 0, 6);
        grid.add(subheading3, 0, 7);
        grid.add(password, 0, 8);
        grid.add(register, 0, 13);
        grid.setHalignment(register, HPos.CENTER);

        StackPane layout = new StackPane();
        layout.setId("bgpane");
        layout.getChildren().add(grid);
        layout.getChildren().add(loginbtn);
        grid.setTranslateY(35);
        loginbtn.setTranslateY(270);

        // Event handlers
        loginbtn.setOnAction(e -> start(primaryStage));
        register.setOnAction(e -> mainpage(primaryStage));

        Scene signuppage = new Scene(layout, 360, 640);
        signuppage.getStylesheets().addAll(this.getClass().getResource("Style.css").toExternalForm());
        primaryStage.setScene(signuppage);
        primaryStage.show();
    }

    private void mainpage(Stage primaryStage) {

        Image profileImage = new Image(getClass().getResourceAsStream("/Assets/S.png"));
        Image locationimg = new Image(getClass().getResourceAsStream("/Assets/loc.png"));
        Image rainyimg = new Image(getClass().getResourceAsStream("/Assets/rainy.png"));
        Image homebtn = new Image(getClass().getResourceAsStream("/Assets/homebtn.png"));
        Image trafbtn = new Image(getClass().getResourceAsStream("/Assets/traffbtn.png"));
        Image searchbtn = new Image(getClass().getResourceAsStream("/Assets/searchbtn.png"));
        Image profbtn = new Image(getClass().getResourceAsStream("/Assets/profilebtn.png"));
        Image air = new Image(getClass().getResourceAsStream("/Assets/air.png"));
        Image cloud = new Image(getClass().getResourceAsStream("/Assets/rain.png"));
        Image drop = new Image(getClass().getResourceAsStream("/Assets/raindrop.png"));
        Image tricon = new Image(getClass().getResourceAsStream("/Assets/trafficon.png"));

        ColumnConstraints columnConstraints = new ColumnConstraints();
        columnConstraints.setPercentWidth(100);

        ImageView profileImageView = new ImageView(profileImage);
        profileImageView.setFitWidth(40);
        profileImageView.setFitHeight(40);
        ImageView location = new ImageView(locationimg);
        location.setFitWidth(15);
        location.setFitHeight(12);
        ImageView rain = new ImageView(rainyimg);
        rain.setFitWidth(50);
        rain.setFitHeight(50);
        ImageView home = new ImageView(homebtn);
        home.setFitWidth(25);
        home.setFitHeight(25);
        ImageView traffic = new ImageView(trafbtn);
        traffic.setFitWidth(25);
        traffic.setFitHeight(25);
        ImageView search = new ImageView(searchbtn);
        search.setFitWidth(25);
        search.setFitHeight(25);
        ImageView profile = new ImageView(profbtn);
        profile.setFitWidth(25);
        profile.setFitHeight(25);
        ImageView wind = new ImageView(air);
        wind.setFitWidth(35);
        wind.setFitHeight(35);
        ImageView cloudrain = new ImageView(cloud);
        cloudrain.setFitWidth(30);
        cloudrain.setFitHeight(30);
        ImageView raindrop = new ImageView(drop);
        raindrop.setFitWidth(35);
        raindrop.setFitHeight(35);
        ImageView trafficon1 = new ImageView(tricon);
        trafficon1.setFitWidth(25);
        trafficon1.setFitHeight(25);
        ImageView trafficon2 = new ImageView(tricon);
        trafficon2.setFitWidth(25);
        trafficon2.setFitHeight(25);
        ImageView trafficon3 = new ImageView(tricon);
        trafficon3.setFitWidth(25);
        trafficon3.setFitHeight(25);
        ImageView trafficon4 = new ImageView(tricon);
        trafficon4.setFitWidth(25);
        trafficon4.setFitHeight(25);

        Line line = new Line(0, 30, 360, 30);
        line.setStyle("-fx-stroke: #B1D4E0;");
        Line line1 = new Line(0, 30, 360, 30);
        line1.setStyle("-fx-stroke: #B1D4E0;");

        Label greet = new Label("Hello, User!");
        greet.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 28));
        greet.setId("label");
        Label day = new Label("Monday");
        day.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        day.setId("label-grid");
        Label temp = new Label("35");
        temp.setFont(Font.font("Coolvetica Rg", FontWeight.NORMAL, 48));
        temp.setId("label-grid");
        Label cel = new Label("°C");
        cel.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 20));
        cel.setStyle("-fx-text-fill: #FEE466;");
        Label loc = new Label("Manila, Philippines", location);
        loc.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        loc.setId("label-grid");
        Label rainn = new Label(null, rain);
        Label date = new Label("January 25, 2024");
        date.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        date.setId("label-grid");
        Label weather = new Label("Rainy - Cloudy");
        weather.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        weather.setId("label-grid");
        Label airspd = new Label("5 km/h \nWind");
        airspd.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        airspd.setId("label-grid");
        Label chrain = new Label("30% Chance\nof Rain");
        chrain.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        chrain.setId("label-grid");
        Label humid = new Label("  30%\nHumidity");
        humid.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        humid.setId("label-grid");
        Label trstat = new Label("Traffic Status");
        trstat.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 20));
        trstat.setId("label");
        Label trafgrid1 = new Label("Traffic Status\nhere");
        trafgrid1.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        trafgrid1.setId("label-grid");
        Label trafgrid2 = new Label("Traffic Status\nhere");
        trafgrid2.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        trafgrid2.setId("label-grid");
        Label trafgrid3 = new Label("Traffic Status\nhere");
        trafgrid3.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        trafgrid3.setId("label-grid");
        Label trafgrid4 = new Label("Traffic Status\nhere");
        trafgrid4.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        trafgrid4.setId("label-grid");
        Hyperlink viewall = new Hyperlink("See all -->");
        viewall.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 16));
        viewall.setId("hyper-text-login");

        Button profileButton = new Button(null, profileImageView);
        profileButton.setId("profile-button");
        Button homeButton = new Button(null, home);
        homeButton.setId("active-button");
        homeButton.setPrefWidth(60);
        homeButton.setPrefHeight(10);
        Button traffButton = new Button(null, traffic);
        traffButton.setId("menu-button");
        traffButton.setPrefWidth(60);
        traffButton.setPrefHeight(10);
        Button searchButton = new Button(null, search);
        searchButton.setId("menu-button");
        searchButton.setPrefWidth(60);
        searchButton.setPrefHeight(10);
        Button profButton = new Button(null, profile);
        profButton.setPrefWidth(60);
        profButton.setPrefHeight(10);
        profButton.setId("menu-button");

        Pane grid1 = new Pane();
        grid1.setId("grid1");
        grid1.setPrefSize(150, 300);
        grid1.setMinSize(200, 200);
        grid1.setMaxSize(325, 146);
        grid1.getChildren().add(day);
        grid1.getChildren().add(temp);
        grid1.getChildren().add(cel);
        grid1.getChildren().add(loc);
        grid1.getChildren().add(rainn);
        grid1.getChildren().add(date);
        grid1.getChildren().add(weather);
        day.setLayoutX(30);
        day.setLayoutY(10);
        temp.setLayoutX(45);
        temp.setLayoutY(30);
        cel.setLayoutX(100);
        cel.setLayoutY(30);
        loc.setLayoutX(20);
        loc.setLayoutY(100);
        rainn.setLayoutX(175);
        rainn.setLayoutY(25);
        date.setLayoutX(190);
        date.setLayoutY(10);
        weather.setLayoutX(180);
        weather.setLayoutY(100);

        Pane grid2 = new Pane();
        grid2.setId("grid2");
        grid2.setPrefSize(64, 73);
        grid2.setMinSize(64, 73);
        grid2.setMaxSize(64, 73);
        grid2.getChildren().add(wind);
        grid2.getChildren().add(airspd);
        wind.setLayoutX(15);
        wind.setLayoutY(5);
        airspd.setLayoutX(18);
        airspd.setLayoutY(40);

        Pane grid3 = new Pane();
        grid3.setId("grid3");
        grid3.setPrefSize(64, 73);
        grid3.setMinSize(64, 73);
        grid3.setMaxSize(64, 73);
        grid3.getChildren().add(cloudrain);
        grid3.getChildren().add(chrain);
        cloudrain.setLayoutX(15);
        cloudrain.setLayoutY(5);
        chrain.setLayoutX(10);
        chrain.setLayoutY(40);

        Pane grid4 = new Pane();
        grid4.setId("grid4");
        grid4.setPrefSize(64, 73);
        grid4.setMinSize(64, 73);
        grid4.setMaxSize(64, 73);
        grid4.getChildren().add(raindrop);
        grid4.getChildren().add(humid);
        raindrop.setLayoutX(15);
        raindrop.setLayoutY(5);
        humid.setLayoutX(15);
        humid.setLayoutY(40);

        Pane grid5 = new Pane();
        grid5.setId("grid5");
        grid5.setPrefSize(80, 106);
        grid5.setMinSize(80, 106);
        grid5.setMaxSize(80, 106);
        grid5.getChildren().add(trafficon1);
        grid5.getChildren().add(trafgrid1);
        trafficon1.setLayoutX(25);
        trafficon1.setLayoutY(5);
        trafgrid1.setLayoutX(15);
        trafgrid1.setLayoutY(40);

        Pane grid6 = new Pane();
        grid6.setId("grid6");
        grid6.setPrefSize(80, 106);
        grid6.setMinSize(80, 106);
        grid6.setMaxSize(80, 106);
        grid6.getChildren().add(trafficon2);
        grid6.getChildren().add(trafgrid2);
        trafficon2.setLayoutX(25);
        trafficon2.setLayoutY(5);
        trafgrid2.setLayoutX(15);
        trafgrid2.setLayoutY(40);

        Pane grid7 = new Pane();
        grid7.setId("grid7");
        grid7.setPrefSize(80, 106);
        grid7.setMinSize(80, 106);
        grid7.setMaxSize(80, 106);
        grid7.getChildren().add(trafficon3);
        grid7.getChildren().add(trafgrid3);
        trafficon3.setLayoutX(25);
        trafficon3.setLayoutY(5);
        trafgrid3.setLayoutX(15);
        trafgrid3.setLayoutY(40);

        Pane grid8 = new Pane();
        grid8.setId("grid8");
        grid8.setPrefSize(80, 106);
        grid8.setMinSize(80, 106);
        grid8.setMaxSize(80, 106);
        grid8.getChildren().add(trafficon4);
        grid8.getChildren().add(trafgrid4);
        trafficon4.setLayoutX(25);
        trafficon4.setLayoutY(5);
        trafgrid4.setLayoutX(15);
        trafgrid4.setLayoutY(40);

        StackPane layout = new StackPane();
        layout.setId("mainbg");
        layout.getChildren().add(greet);
        layout.getChildren().add(grid1);
        layout.getChildren().add(grid2);
        layout.getChildren().add(grid3);
        layout.getChildren().add(grid4);
        layout.getChildren().add(grid5);
        layout.getChildren().add(grid6);
        layout.getChildren().add(grid7);
        layout.getChildren().add(grid8);
        layout.getChildren().add(line);
        layout.getChildren().add(line1);
        layout.getChildren().add(trstat);
        layout.getChildren().add(profileButton);
        layout.getChildren().add(homeButton);
        layout.getChildren().add(traffButton);
        layout.getChildren().add(searchButton);
        layout.getChildren().add(profButton);
        layout.getChildren().add(viewall);
        greet.setTranslateX(-80);
        greet.setTranslateY(-260);
        grid1.setTranslateX(10);
        grid1.setTranslateY(-120);
        grid2.setTranslateX(-105);
        grid2.setTranslateY(-28);
        grid3.setTranslateX(0);
        grid3.setTranslateY(-28);
        grid4.setTranslateX(100);
        grid4.setTranslateY(-28);
        grid5.setTranslateX(-130);
        grid5.setTranslateY(150);
        grid6.setTranslateX(-45);
        grid6.setTranslateY(150);
        grid7.setTranslateX(40);
        grid7.setTranslateY(150);
        grid8.setTranslateX(125);
        grid8.setTranslateY(150);
        viewall.setTranslateX(130);
        viewall.setTranslateY(220);
        trstat.setTranslateX(-110);
        trstat.setTranslateY(65);
        profileButton.setTranslateX(120);
        profileButton.setTranslateY(-260);
        line.setTranslateY(240);
        line1.setTranslateY(30);
        homeButton.setTranslateX(-130);
        homeButton.setTranslateY(280);
        traffButton.setTranslateX(-43);
        traffButton.setTranslateY(280);
        searchButton.setTranslateX(48);
        searchButton.setTranslateY(280);
        profButton.setTranslateX(133);
        profButton.setTranslateY(280);

        // Event handlers
        homeButton.setOnAction(e -> mainpage(primaryStage));
        traffButton.setOnAction(e -> traffpage(primaryStage));
        searchButton.setOnAction(e -> searchpage(primaryStage));
        profButton.setOnAction(e -> profpage(primaryStage));
        profileButton.setOnAction(e -> profpage(primaryStage));
        viewall.setOnAction(e -> traffpage(primaryStage));

        Scene mainpage = new Scene(layout, 360, 640);
        mainpage.getStylesheets().addAll(this.getClass().getResource("Style.css").toExternalForm());
        primaryStage.setScene(mainpage);
        primaryStage.show();
    }

    private void traffpage(Stage primaryStage) {

        Image homebtn = new Image(getClass().getResourceAsStream("/Assets/homebtn.png"));
        Image trafbtn = new Image(getClass().getResourceAsStream("/Assets/traffbtn.png"));
        Image searchbtn = new Image(getClass().getResourceAsStream("/Assets/searchbtn.png"));
        Image profbtn = new Image(getClass().getResourceAsStream("/Assets/profilebtn.png"));
        Image tricon = new Image(getClass().getResourceAsStream("/Assets/trafficon.png"));

        ImageView home = new ImageView(homebtn);
        home.setFitWidth(25);
        home.setFitHeight(25);
        ImageView traffic = new ImageView(trafbtn);
        traffic.setFitWidth(25);
        traffic.setFitHeight(25);
        ImageView search = new ImageView(searchbtn);
        search.setFitWidth(25);
        search.setFitHeight(25);
        ImageView profile = new ImageView(profbtn);
        profile.setFitWidth(25);
        profile.setFitHeight(25);
        ImageView trafficon1 = new ImageView(tricon);
        trafficon1.setFitWidth(25);
        trafficon1.setFitHeight(25);
        ImageView trafficon2 = new ImageView(tricon);
        trafficon2.setFitWidth(25);
        trafficon2.setFitHeight(25);
        ImageView trafficon3 = new ImageView(tricon);
        trafficon3.setFitWidth(25);
        trafficon3.setFitHeight(25);
        ImageView trafficon4 = new ImageView(tricon);
        trafficon4.setFitWidth(25);
        trafficon4.setFitHeight(25);

        Line line = new Line(0, 30, 360, 30);
        line.setStyle("-fx-stroke: #B1D4E0;");

        Text title = new Text("Traffic Status");
        title.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 28));
        title.setId("text");

        Label trafgrid1 = new Label("Traffic Status\nhere");
        trafgrid1.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        trafgrid1.setId("label-grid");
        Label trafgrid2 = new Label("Traffic Status\nhere");
        trafgrid2.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        trafgrid2.setId("label-grid");
        Label trafgrid3 = new Label("Traffic Status\nhere");
        trafgrid3.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        trafgrid3.setId("label-grid");
        Label trafgrid4 = new Label("Traffic Status\nhere");
        trafgrid4.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        trafgrid4.setId("label-grid");

        Button homeButton = new Button(null, home);
        homeButton.setId("menu-button");
        homeButton.setPrefWidth(60);
        homeButton.setPrefHeight(10);
        Button traffButton = new Button(null, traffic);
        traffButton.setId("active-button");
        traffButton.setPrefWidth(60);
        traffButton.setPrefHeight(10);
        Button searchButton = new Button(null, search);
        searchButton.setId("menu-button");
        searchButton.setPrefWidth(60);
        searchButton.setPrefHeight(10);
        Button profButton = new Button(null, profile);
        profButton.setPrefWidth(60);
        profButton.setPrefHeight(10);
        profButton.setId("menu-button");

        Pane map = new Pane();
        map.setId("map");
        map.setPrefSize(313, 313);
        map.setMinSize(313, 313);
        map.setMaxSize(313, 313);

        Pane grid5 = new Pane();
        grid5.setId("grid5");
        grid5.setPrefSize(80, 106);
        grid5.setMinSize(80, 106);
        grid5.setMaxSize(80, 106);
        grid5.getChildren().add(trafficon1);
        grid5.getChildren().add(trafgrid1);
        trafficon1.setLayoutX(25);
        trafficon1.setLayoutY(5);
        trafgrid1.setLayoutX(15);
        trafgrid1.setLayoutY(40);

        Pane grid6 = new Pane();
        grid6.setId("grid6");
        grid6.setPrefSize(80, 106);
        grid6.setMinSize(80, 106);
        grid6.setMaxSize(80, 106);
        grid6.getChildren().add(trafficon2);
        grid6.getChildren().add(trafgrid2);
        trafficon2.setLayoutX(25);
        trafficon2.setLayoutY(5);
        trafgrid2.setLayoutX(15);
        trafgrid2.setLayoutY(40);

        Pane grid7 = new Pane();
        grid7.setId("grid7");
        grid7.setPrefSize(80, 106);
        grid7.setMinSize(80, 106);
        grid7.setMaxSize(80, 106);
        grid7.getChildren().add(trafficon3);
        grid7.getChildren().add(trafgrid3);
        trafficon3.setLayoutX(25);
        trafficon3.setLayoutY(5);
        trafgrid3.setLayoutX(15);
        trafgrid3.setLayoutY(40);

        Pane grid8 = new Pane();
        grid8.setId("grid8");
        grid8.setPrefSize(80, 106);
        grid8.setMinSize(80, 106);
        grid8.setMaxSize(80, 106);
        grid8.getChildren().add(trafficon4);
        grid8.getChildren().add(trafgrid4);
        trafficon4.setLayoutX(25);
        trafficon4.setLayoutY(5);
        trafgrid4.setLayoutX(15);
        trafgrid4.setLayoutY(40);

        StackPane layout = new StackPane();
        layout.setId("traffbg");
        layout.getChildren().add(line);
        layout.getChildren().add(homeButton);
        layout.getChildren().add(traffButton);
        layout.getChildren().add(searchButton);
        layout.getChildren().add(profButton);
        layout.getChildren().add(map);
        layout.getChildren().add(title);
        layout.getChildren().add(grid5);
        layout.getChildren().add(grid6);
        layout.getChildren().add(grid7);
        layout.getChildren().add(grid8);
        title.setTranslateX(0);
        title.setTranslateY(-275);
        line.setTranslateY(240);
        map.setTranslateX(0);
        map.setTranslateY(60);
        grid5.setTranslateX(-130);
        grid5.setTranslateY(-170);
        grid6.setTranslateX(-45);
        grid6.setTranslateY(-170);
        grid7.setTranslateX(40);
        grid7.setTranslateY(-170);
        grid8.setTranslateX(125);
        grid8.setTranslateY(-170);
        homeButton.setTranslateX(-130);
        homeButton.setTranslateY(280);
        traffButton.setTranslateX(-43);
        traffButton.setTranslateY(280);
        searchButton.setTranslateX(48);
        searchButton.setTranslateY(280);
        profButton.setTranslateX(133);
        profButton.setTranslateY(280);

        // Event handlers
        homeButton.setOnAction(e -> mainpage(primaryStage));
        traffButton.setOnAction(e -> traffpage(primaryStage));
        searchButton.setOnAction(e -> searchpage(primaryStage));
        profButton.setOnAction(e -> profpage(primaryStage));

        Scene traffpage = new Scene(layout, 360, 640);
        traffpage.getStylesheets().addAll(this.getClass().getResource("Style.css").toExternalForm());
        primaryStage.setScene(traffpage);
        primaryStage.show();
    }

    private void searchpage(Stage primaryStage) {

        Image homebtn = new Image(getClass().getResourceAsStream("/Assets/homebtn.png"));
        Image trafbtn = new Image(getClass().getResourceAsStream("/Assets/traffbtn.png"));
        Image searchbtn = new Image(getClass().getResourceAsStream("/Assets/searchbtn.png"));
        Image profbtn = new Image(getClass().getResourceAsStream("/Assets/profilebtn.png"));
        Image desticon = new Image(getClass().getResourceAsStream("/Assets/destination.png"));
        Image searchbg = new Image(getClass().getResourceAsStream("/Assets/searchbgph.png"));
        Image walking = new Image(getClass().getResourceAsStream("/Assets/walk.png"));
        Image jeepney = new Image(getClass().getResourceAsStream("/Assets/jeep.png"));
        Image tricycle = new Image(getClass().getResourceAsStream("/Assets/tricycle.png"));
        Image train = new Image(getClass().getResourceAsStream("/Assets/train.png"));

        ImageView home = new ImageView(homebtn);
        home.setFitWidth(25);
        home.setFitHeight(25);
        ImageView traffic = new ImageView(trafbtn);
        traffic.setFitWidth(25);
        traffic.setFitHeight(25);
        ImageView search = new ImageView(searchbtn);
        search.setFitWidth(25);
        search.setFitHeight(25);
        ImageView profile = new ImageView(profbtn);
        profile.setFitWidth(25);
        profile.setFitHeight(25);
        ImageView desicon = new ImageView(desticon);
        desicon.setFitWidth(60);
        desicon.setFitHeight(70);
        ImageView desicon1 = new ImageView(desticon);
        desicon1.setFitWidth(60);
        desicon1.setFitHeight(70);
        ImageView bgsearch = new ImageView(searchbg);
        bgsearch.setFitWidth(360);
        bgsearch.setFitHeight(360);
        ImageView walk = new ImageView(walking);
        walk.setFitWidth(25);
        walk.setFitHeight(25);
        ImageView jeep = new ImageView(jeepney);
        jeep.setFitWidth(25);
        jeep.setFitHeight(25);
        ImageView tric = new ImageView(tricycle);
        tric.setFitWidth(25);
        tric.setFitHeight(25);
        ImageView tren = new ImageView(train);
        tren.setFitWidth(25);
        tren.setFitHeight(25);
        ImageView jeep1 = new ImageView(jeepney);
        jeep1.setFitWidth(25);
        jeep1.setFitHeight(25);

        Line line = new Line(0, 30, 360, 30);
        line.setStyle("-fx-stroke: #B1D4E0;");

        Text title = new Text("Find your destination");
        title.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 28));
        title.setId("text");
        Text from = new Text("From");
        from.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        from.setId("destext");
        Text to = new Text("to");
        to.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 10));
        to.setId("destext");
        Text cost = new Text("Travel Cost");
        cost.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 14));
        cost.setId("destext");

        TextField fromtxt = new TextField();
        fromtxt.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 11));
        fromtxt.setId("txt-field");
        fromtxt.setPromptText("Enter your current location");
        TextField totxt = new TextField();
        totxt.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 11));
        totxt.setId("txt-field");
        totxt.setPromptText("Enter your desired location");

        Label destgrid1 = new Label("PUP Sta. Mesa, Manila");
        destgrid1.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 12));
        destgrid1.setId("destext1");
        Label destgrid2 = new Label("SM Sta. Mesa, Manila");
        destgrid2.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 12));
        destgrid2.setId("destext1");
        Label destgrid3 = new Label("11:11 AM");
        destgrid3.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 8));
        destgrid3.setId("destext");
        Label destgrid4 = new Label("11:17 AM");
        destgrid4.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 8));
        destgrid4.setId("destext");
        Label destgrid5 = new Label("P 13.00");
        destgrid5.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 14));
        destgrid5.setId("destext");

        Button walkbut = new Button("23 min", walk);
        walkbut.setId("dest-button");
        walkbut.setPrefWidth(82);
        walkbut.setPrefHeight(42);
        Button jeepbut = new Button("6 min", jeep);
        jeepbut.setId("dest-button");
        jeepbut.setPrefWidth(82);
        jeepbut.setPrefHeight(42);
        Button tricbut = new Button("10 min", tric);
        tricbut.setId("dest-button");
        tricbut.setPrefWidth(82);
        tricbut.setPrefHeight(42);
        Button trainbut = new Button("-", tren);
        trainbut.setId("dest-button");
        trainbut.setPrefWidth(82);
        trainbut.setPrefHeight(42);
        Button jeepbut1 = new Button(null, jeep1);
        jeepbut1.setId("dest-button");
        jeepbut1.setPrefWidth(45);
        jeepbut1.setPrefHeight(25);
        Button homeButton = new Button(null, home);
        homeButton.setId("menu-button");
        homeButton.setPrefWidth(60);
        homeButton.setPrefHeight(10);
        Button traffButton = new Button(null, traffic);
        traffButton.setId("menu-button");
        traffButton.setPrefWidth(60);
        traffButton.setPrefHeight(10);
        Button searchButton = new Button(null, search);
        searchButton.setId("active-button");
        searchButton.setPrefWidth(60);
        searchButton.setPrefHeight(10);
        Button profButton = new Button(null, profile);
        profButton.setPrefWidth(60);
        profButton.setPrefHeight(10);
        profButton.setId("menu-button");

        Pane destination = new Pane();
        destination.setId("dest");
        destination.setPrefSize(256, 99);
        destination.setMinSize(256, 99);
        destination.setMaxSize(256, 99);
        destination.getChildren().add(desicon);
        destination.getChildren().add(from);
        destination.getChildren().add(to);
        destination.getChildren().add(fromtxt);
        destination.getChildren().add(totxt);
        fromtxt.setLayoutX(60);
        fromtxt.setLayoutY(25);
        from.setLayoutX(60);
        from.setLayoutY(25);
        totxt.setLayoutX(60);
        totxt.setLayoutY(65);
        to.setLayoutX(60);
        to.setLayoutY(65);
        desicon.setLayoutX(10);
        desicon.setLayoutY(10);

        StackPane layout = new StackPane();
        layout.setId("searchbg");
        layout.getChildren().add(destination);
        layout.getChildren().add(title);
        layout.getChildren().add(line);
        layout.getChildren().add(homeButton);
        layout.getChildren().add(traffButton);
        layout.getChildren().add(searchButton);
        layout.getChildren().add(profButton);
        layout.getChildren().add(bgsearch);
        layout.getChildren().add(walkbut);
        layout.getChildren().add(jeepbut);
        layout.getChildren().add(tricbut);
        layout.getChildren().add(trainbut);
        layout.getChildren().add(cost);
        layout.getChildren().add(desicon1);
        layout.getChildren().add(destgrid1);
        layout.getChildren().add(destgrid2);
        layout.getChildren().add(destgrid3);
        layout.getChildren().add(destgrid4);
        layout.getChildren().add(destgrid5);
        layout.getChildren().add(jeepbut1);
        destgrid1.setTranslateX(-30);
        destgrid1.setTranslateY(28);
        destgrid3.setTranslateX(-70);
        destgrid3.setTranslateY(40);
        destgrid2.setTranslateX(-33);
        destgrid2.setTranslateY(68);
        destgrid4.setTranslateX(-70);
        destgrid4.setTranslateY(80);
        destgrid5.setTranslateX(80);
        destgrid5.setTranslateY(85);
        jeepbut1.setTranslateX(80);
        jeepbut1.setTranslateY(50);
        cost.setTranslateX(80);
        cost.setTranslateY(20);
        desicon1.setTranslateX(-100);
        desicon1.setTranslateY(50);
        walkbut.setTranslateX(-127.5);
        walkbut.setTranslateY(-60);
        jeepbut.setTranslateX(-42.5);
        jeepbut.setTranslateY(-60);
        tricbut.setTranslateX(42.5);
        tricbut.setTranslateY(-60);
        trainbut.setTranslateX(127.5);
        trainbut.setTranslateY(-60);
        destination.setTranslateX(0);
        destination.setTranslateY(-185);
        title.setTranslateX(0);
        title.setTranslateY(10);
        line.setTranslateY(240);
        bgsearch.setTranslateX(0);
        bgsearch.setTranslateY(60);
        homeButton.setTranslateX(-130);
        homeButton.setTranslateY(280);
        traffButton.setTranslateX(-43);
        traffButton.setTranslateY(280);
        searchButton.setTranslateX(48);
        searchButton.setTranslateY(280);
        profButton.setTranslateX(133);
        profButton.setTranslateY(280);
        title.setTranslateY(-275);

        // Event handlers
        homeButton.setOnAction(e -> mainpage(primaryStage));
        traffButton.setOnAction(e -> traffpage(primaryStage));
        searchButton.setOnAction(e -> searchpage(primaryStage));
        profButton.setOnAction(e -> profpage(primaryStage));

        Scene searchpage = new Scene(layout, 360, 640);
        searchpage.getStylesheets().addAll(this.getClass().getResource("Style.css").toExternalForm());
        primaryStage.setScene(searchpage);
        primaryStage.show();
    }

    private void profpage(Stage primaryStage) {

        Image homebtn = new Image(getClass().getResourceAsStream("/Assets/homebtn.png"));
        Image trafbtn = new Image(getClass().getResourceAsStream("/Assets/traffbtn.png"));
        Image searchbtn = new Image(getClass().getResourceAsStream("/Assets/searchbtn.png"));
        Image profbtn = new Image(getClass().getResourceAsStream("/Assets/profilebtn.png"));
        Image proficon = new Image(getClass().getResourceAsStream("/Assets/S.png"));
        Image username = new Image(getClass().getResourceAsStream("/Assets/username.png"));
        Image password = new Image(getClass().getResourceAsStream("/Assets/password.png"));
        Image email = new Image(getClass().getResourceAsStream("/Assets/email.png"));

        ImageView home = new ImageView(homebtn);
        home.setFitWidth(25);
        home.setFitHeight(25);
        ImageView traffic = new ImageView(trafbtn);
        traffic.setFitWidth(25);
        traffic.setFitHeight(25);
        ImageView search = new ImageView(searchbtn);
        search.setFitWidth(25);
        search.setFitHeight(25);
        ImageView profile = new ImageView(profbtn);
        profile.setFitWidth(25);
        profile.setFitHeight(25);
        ImageView proficonn = new ImageView(proficon);
        proficonn.setFitWidth(150);
        proficonn.setFitHeight(150);
        ImageView user = new ImageView(username);
        user.setFitWidth(25);
        user.setFitHeight(25);
        ImageView pass = new ImageView(password);
        pass.setFitWidth(25);
        pass.setFitHeight(25);
        ImageView eml = new ImageView(email);
        eml.setFitWidth(25);
        eml.setFitHeight(25);

        Line line = new Line(0, 30, 360, 30);
        line.setStyle("-fx-stroke: #B1D4E0;");

        Text title = new Text("Profile");
        title.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 28));
        title.setId("text");
        Text usr = new Text("Username:");
        usr.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 20));
        usr.setId("destitle");
        Text pss = new Text("Password:");
        pss.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 20));
        pss.setId("destitle");
        Text eil = new Text("Email:");
        eil.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 20));
        eil.setId("destitle");

        Label userid = new Label("bunre2");
        userid.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 20));
        userid.setId("label");
        Label passid = new Label("********");
        passid.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 20));
        passid.setId("label");
        Label emailid = new Label("bernardresurreccion1@gmail.com");
        emailid.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 15));
        emailid.setId("label");

        Button homeButton = new Button(null, home);
        homeButton.setId("menu-button");
        homeButton.setPrefWidth(60);
        homeButton.setPrefHeight(10);
        Button traffButton = new Button(null, traffic);
        traffButton.setId("menu-button");
        traffButton.setPrefWidth(60);
        traffButton.setPrefHeight(10);
        Button searchButton = new Button(null, search);
        searchButton.setId("menu-button");
        searchButton.setPrefWidth(60);
        searchButton.setPrefHeight(10);
        Button profButton = new Button(null, profile);
        profButton.setPrefWidth(60);
        profButton.setPrefHeight(10);
        profButton.setId("active-button");
        Button loginbtn = new Button("SIGN OUT");
        loginbtn.setFont(Font.font("Coolvetica Rg", FontWeight.BOLD, 16));
        loginbtn.setId("button");
        loginbtn.setPrefWidth(150);

        StackPane layout = new StackPane();
        layout.setId("profbg");
        layout.getChildren().add(line);
        layout.getChildren().add(homeButton);
        layout.getChildren().add(traffButton);
        layout.getChildren().add(searchButton);
        layout.getChildren().add(profButton);
        layout.getChildren().add(loginbtn);
        layout.getChildren().add(proficonn);
        layout.getChildren().add(title);
        layout.getChildren().add(user);
        layout.getChildren().add(pass);
        layout.getChildren().add(eml);
        layout.getChildren().add(usr);
        layout.getChildren().add(pss);
        layout.getChildren().add(eil);
        layout.getChildren().add(userid);
        layout.getChildren().add(passid);
        layout.getChildren().add(emailid);
        user.setTranslateX(-150);
        user.setTranslateY(0);
        pass.setTranslateX(-150);
        pass.setTranslateY(60);
        eml.setTranslateX(-150);
        eml.setTranslateY(120);
        usr.setTranslateX(-82.5);
        usr.setTranslateY(0);
        pss.setTranslateX(-82.5);
        pss.setTranslateY(60);
        eil.setTranslateX(-100);
        eil.setTranslateY(120);
        userid.setTranslateX(-3);
        userid.setTranslateY(0);
        passid.setTranslateX(10);
        passid.setTranslateY(60);
        emailid.setTranslateX(30);
        emailid.setTranslateY(120);
        title.setTranslateX(0);
        title.setTranslateY(-290);
        proficonn.setTranslateX(0);
        proficonn.setTranslateY(-145);
        line.setTranslateY(240);
        homeButton.setTranslateX(-130);
        homeButton.setTranslateY(280);
        traffButton.setTranslateX(-43);
        traffButton.setTranslateY(280);
        searchButton.setTranslateX(48);
        searchButton.setTranslateY(280);
        profButton.setTranslateX(133);
        profButton.setTranslateY(280);
        loginbtn.setTranslateY(200);

        // Event handlers
        homeButton.setOnAction(e -> mainpage(primaryStage));
        traffButton.setOnAction(e -> traffpage(primaryStage));
        searchButton.setOnAction(e -> searchpage(primaryStage));
        profButton.setOnAction(e -> profpage(primaryStage));
        loginbtn.setOnAction(e -> start(primaryStage));

        Scene profpage = new Scene(layout, 360, 640);
        profpage.getStylesheets().addAll(this.getClass().getResource("Style.css").toExternalForm());
        primaryStage.setScene(profpage);
        primaryStage.show();
    }
}