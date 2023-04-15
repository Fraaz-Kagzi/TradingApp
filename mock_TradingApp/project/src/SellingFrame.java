import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SellingFrame {
    public  void SellIntel(User user,double amount){
        String output = user.SellIntel(amount);
        TradingApp.print(output);
        String wallet = user.getWallet();
        TradingApp.updateWallet(wallet);

    }

    public  void SellApple(User user,double amount){
        String output = user.SellApple(amount);
        TradingApp.print(output);
        String wallet = user.getWallet();
        TradingApp.updateWallet(wallet);

    }
    public  void SellGoogle(User user,double amount){
        String output = user.SellGoogle(amount);
        TradingApp.print(output);
        String wallet = user.getWallet();
        TradingApp.updateWallet(wallet);

    }



   public SellingFrame(User user){
        Frame frame=new Frame();
        frame.setLayout(new FlowLayout());

       Button intelButton=new Button("SELL Intel shares");
       intelButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
               GetInput prompt = new GetInput();
               TextField txtF = new TextField("Enter amount to sell ");
               prompt.add(txtF);
               prompt.addSubmitListener(new ActionListener()
               {
                   public void actionPerformed(ActionEvent evt) {
                        SellIntel(user,Double.parseDouble(txtF.getText()));
                   }
               });
               prompt.activate();
           }
       });
       Button appleButton=new Button("SELL Apple shares");
       appleButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
               GetInput prompt = new GetInput();
               TextField txtF = new TextField("Enter amount to sell ");
               prompt.add(txtF);
               prompt.addSubmitListener(new ActionListener()
               {
                   public void actionPerformed(ActionEvent evt) {
                       SellApple(user,Double.parseDouble(txtF.getText()));
                   }
               });
               prompt.activate();
           }
       });
       Button googleButton=new Button("SELL Google shares");
       googleButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent evt) {
               GetInput prompt = new GetInput();
               TextField txtF = new TextField("Enter amount to sell ");
               prompt.add(txtF);
               prompt.addSubmitListener(new ActionListener()
               {
                   public void actionPerformed(ActionEvent evt) {
                       SellGoogle(user,Double.parseDouble(txtF.getText()));
                   }
               });
               prompt.activate();
           }
       });
       frame.add(intelButton);
       frame.add(appleButton);
       frame.add(googleButton);
       frame.setVisible(true);
       frame.setBounds(1100,100,300,500);
       // to make window closable
       frame.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent evt) {
               ((Frame) (evt.getSource())).dispose();
           }
       });
    }

}
