package vidmot;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import vinnsla.Floskur;

import java.net.URL;
import java.util.ResourceBundle;

public class FloskurController /*implements Initializable*/ {
    Floskur floskur = new Floskur();
    /*private Floskur vinnsluTilvisun;*/

    /*@Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vinnsluTilvisun = new Floskur();
    }*/

    @FXML
    private HBox dosirHBox;
    @FXML
    private TextField textFieldDosir;
    @FXML
    private Label dosirLabel;

    @FXML
    private HBox floskurHBox;
    @FXML
    private TextField textFieldFloskur;
    @FXML
    private Label floskurLabel;

    @FXML
    private HBox samtalsHBox;
    @FXML
    private Label samtalsEinn;
    @FXML
    private Label samtalsTveir;

    @FXML
    private HBox greidaHBox;
    @FXML
    private Button buttonGreida;
    @FXML
    private Label greidaEinn;
    @FXML
    private Label greidaTveir;

    @FXML
    public Button buttonHreinsa;

    /**
     * Handler fyrir að setja inn fjölda dósa
     *
     * @param actionEvent
     */
    @FXML
    protected void onDosir(ActionEvent actionEvent) {
        try {
            int fjoldiD = Integer.parseInt(textFieldDosir.getText());
            floskur.setFjoldiDosir(fjoldiD);
            dosirLabel.setText(String.valueOf(fjoldiD));
        }
        catch (Exception e) {

        }
    }

    /**
     * Handler fyrir að setja inn fjölda flaska
     *
     * @param actionEvent
     */
    @FXML
    protected void onFloskur(ActionEvent actionEvent) {
        try {
            int fjoldiF = Integer.parseInt(textFieldFloskur.getText());
            floskur.setFjoldiDosir(fjoldiF);
            floskurLabel.setText(String.valueOf(fjoldiF));
        }
        catch (Exception e) {

        }
    }

    /**
     * Handler til að greiða fyrir flöskur og dósir
     *
     * @param actionEvent
     */
    @FXML
    protected void onGreida(ActionEvent actionEvent) {

    }

    /**
     * Handler til að hreinsa tölur úr dósa og flöskusviðum
     *
     * @param actionEvent
     */
    @FXML
    protected void onHreinsa(ActionEvent actionEvent) {
        floskur.hreinsa();
        textFieldDosir.clear();
        textFieldFloskur.clear();
        dosirLabel.setText("0");
        floskurLabel.setText("0");
        samtalsEinn.setText("0");
        samtalsTveir.setText("0");
    }
}
