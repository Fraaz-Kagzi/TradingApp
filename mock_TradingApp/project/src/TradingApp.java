import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

public class TradingApp {

    private static TextArea infoArea = new TextArea();
    private static TextArea stockArea = new TextArea();
    private static TextArea walletArea = new TextArea();


    public static void print(String text){
        infoArea.setText(text);
    }
    public static void updateWallet(String text){
        walletArea.setText(text);
    }
    public static void updateStocks(String text){
        stockArea.setText(text);
    }

    User user;



    public  void newUser(String userInput){
        user=new User(userInput);
        String wallet = user.getWallet();
        updateWallet(wallet);
    }

    public void Deposit(int amount){
        String output = user.deposit(amount);
        print(output);
        String wallet = user.getWallet();
        updateWallet(wallet);
    }
    public void Withdraw(int amount){
        String output = user.withdraw(amount);
        print(output);
        String wallet = user.getWallet();
        updateWallet(wallet);
    }

    public  void showWallet(){
        String wallet = user.getWallet();
        updateWallet(wallet);


    }

    public TradingApp()  {
        Frame Frame = new Frame();
        Frame.setLayout(new FlowLayout());
        GetInput acp = new GetInput();
        print("CLICK NEW ACCOUNT TO CREATE YOUR OWN NEW ACCOUNT A PREMADE ACCOUNT HAS BEEN CREATED");
        // button to add new account///////////////////////////////////////////////////
        Button newAccountButton=new Button("New Account");
        newAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                GetInput acp = new GetInput();
                TextField txtF = new TextField("Enter name of new account ");
                acp.add(txtF);
                acp.addSubmitListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent evt) {
                        newUser(txtF.getText());
                    }
                });
                acp.activate();
            }
        });
        Frame.add(newAccountButton);

        // button to deposit GBP into account//////////////////////////////////////////////////
        Button deposit=new Button("DEPOSIT");
        deposit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                GetInput prompt = new GetInput();
                TextField txtF = new TextField("Enter amount to deposit ");
                prompt.add(txtF);
                prompt.addSubmitListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent evt) {
                        Deposit(Integer.parseInt(txtF.getText()));
                    }
                });
                prompt.activate();
            }
        });
        Frame.add(deposit);
        // button to withdraw GBP from account//////////////////////////////////////////////////
        Button withdraw=new Button("WITHDRAW");
        withdraw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                GetInput prompt = new GetInput();
                TextField txtF = new TextField("Enter amount to withdraw ");
                prompt.add(txtF);
                prompt.addSubmitListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent evt) {
                        Withdraw(Integer.parseInt(txtF.getText()));
                    }
                });
                prompt.activate();
            }
        });
        Frame.add(withdraw);

        // button to buy securities//////////////////////////////////////////////////
        Button Buy=new Button("BUY");
        Buy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                BuyingFrame bf = new BuyingFrame(user);
            }
        });
        Frame.add(Buy);
        // button to sell securities//////////////////////////////////////////////////

        Button Sell=new Button("SELL");
        Sell.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SellingFrame sf = new SellingFrame(user);
            }
        });
        Frame.add(Sell);

        // button to show wallet//////////////////////////////////////////////////
        Button showWallet = new Button("Show Wallet");
        showWallet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showWallet();
            }
        });
        Frame.add(showWallet);


/////////////END OF BUTTONS/////////////////////////////////////////////////////////////////
        this.newUser("USER");

        Frame.add(infoArea);
        Frame.add(walletArea);
        Frame.add(stockArea);
        infoArea.setEditable(false);
        walletArea.setEditable(false);
        walletArea.setBounds(100,100,200,40);
        infoArea.setBounds(5,7,90,70);

        //to make the GUI actually show
        Frame.setVisible(true);
        Frame.setBounds(450,360,600,900);
        // to make window closable
        CloseWindow close = new CloseWindow();
        Frame.addWindowListener(close);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new TradingApp();
        StocksClass Stocks = new StocksClass();

    }

}
