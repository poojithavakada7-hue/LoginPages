
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {

    JLabel title, userLabel, passLabel, message;
    JTextField username;
    JPasswordField password;
    JButton login, reset;

    LoginPage() {
        setTitle("Login Page");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new JLabel("USER LOGIN");
        title.setBounds(130, 20, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        add(title);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 80, 100, 25);
        add(userLabel);

        username = new JTextField();
        username.setBounds(150, 80, 180, 25);
        add(username);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 120, 100, 25);
        add(passLabel);

        password = new JPasswordField();
        password.setBounds(150, 120, 180, 25);
        add(password);

        login = new JButton("Login");
        login.setBounds(90, 170, 90, 30);
        add(login);

        reset = new JButton("Reset");
        reset.setBounds(200, 170, 90, 30);
        add(reset);

        message = new JLabel("");
        message.setBounds(100, 215, 250, 25);
        add(message);

        login.addActionListener(this);
        reset.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == login) {
            String user = username.getText();
            String pass = new String(password.getPassword());

            if (user.equals("Pooji") && pass.equals("1234")) {
                message.setText("Login Successful!");
            } else {
                message.setText("Invalid Username or Password");
            }
        }

        if (e.getSource() == reset) {
            username.setText("");
            password.setText("");
            message.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
