import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BuyingFrame {
    public void BuyIntel(User user, int amount) {
        String output = user.BuyIntel(amount);
        TradingApp.print(output);
        String wallet = user.getWallet();
        TradingApp.updateWallet(wallet);

    }

    public void BuyApple(User user, int amount) {
        String output = user.BuyApple(amount);
        TradingApp.print(output);
        String wallet = user.getWallet();
        TradingApp.updateWallet(wallet);

    }

    public void BuyGoogle(User user, int amount) {
        String output = user.BuyGoogle(amount);
        TradingApp.print(output);
        String wallet = user.getWallet();
        TradingApp.updateWallet(wallet);

    }


    public BuyingFrame(User user) {
        Frame frame = new Frame();
        frame.setLayout(new FlowLayout());

        Button intelButton = new Button("BUY Intel shares");
        intelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                GetInput prompt = new GetInput();
                TextField txtF = new TextField("Enter amount to buy ");
                prompt.add(txtF);
                prompt.addSubmitListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        BuyIntel(user, Integer.parseInt(txtF.getText()));
                    }
                });
                prompt.activate();
            }
        });
        Button appleButton = new Button("BUY Apple shares");
        appleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                GetInput prompt = new GetInput();
                TextField txtF = new TextField("Enter amount to buy ");
                prompt.add(txtF);
                prompt.addSubmitListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        BuyApple(user, Integer.parseInt(txtF.getText()));
                    }
                });
                prompt.activate();
            }
        });
        Button googleButton = new Button("BUY Google shares");
        googleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                GetInput prompt = new GetInput();
                TextField txtF = new TextField("Enter amount to buy ");
                prompt.add(txtF);
                prompt.addSubmitListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        BuyGoogle(user, Integer.parseInt(txtF.getText()));
                    }
                });
                prompt.activate();
            }
        });
        frame.add(intelButton);
        frame.add(appleButton);
        frame.add(googleButton);
        frame.setVisible(true);
        frame.setBounds(50, 100, 300, 500);
        // to make window closable

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                ((Frame) (evt.getSource())).dispose();
            }
        });

    }
}
