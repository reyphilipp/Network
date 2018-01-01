import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ClientGui {
    public JPanel panelMain;
    public JTextField textFieldIpAddress;
    public JTextField textFieldHostname;
    public JTextField textFieldVlan;
    public JTextField textFieldBeschreibung;
    public JTextField textFieldPortSwitch;
    public JTextField textFieldMacAddress;
    public JButton buttonEintragEinfuegen;
    public JButton buttonEintragSpeichern;
    public JButton buttonEintragLoeschen;
    public JButton buttonEintragAbrufen;
    public JButton buttonAktualisierenListe;
    public JTable tableListe;
    public JLabel labelIpAddress;
    public JLabel labelHostname;
    public JLabel labelVlan;
    public JLabel labelBeschreibung;
    public JLabel labelPortSwitch;
    public JLabel labelMacAddress;

    public ClientGui(){
        panelMain.setBackground(Color.WHITE);
        buttonEintragEinfuegen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textFieldIpAddress.getText();

                KotKt.test(text);
            }
        });
    }


    /*public static void main(String[] args) {
        JFrame frame = new JFrame("Verwaltung Netzwerkteilnehmer");
        frame.setContentPane(new ClientGui().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setVisible(true);

    }*/
}
