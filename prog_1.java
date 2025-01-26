import javax.swing.*;
public class prog_1 {
    public static String input = "Select conversion:\n" +
            "***************************\n" +
            "\n-BTC" +
            "\n[1] BTC to USD" +
            "\n[2] USD to BTC" +
            "\n[3]BTC to ETH" +
            "\n\n-ETH" +
            "\n[4] ETH to USD" +
            "\n[5] USD to ETH" +
            "\n[6] ETH to BTC" +
            "\n***************************" +
            "\n\n [0] Exit";
    public static int in = Integer.parseInt(JOptionPane.showInputDialog(input));
    public static void main(String[] args) {
        while (in > -1)  {
            if (in >= 1 && in <= 3) {
                btc(in);
            } else if (in >= 4 && in <= 6) {
                eth(in);
            } else if (in == 0) {
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect input");
                in = Integer.parseInt(JOptionPane.showInputDialog(input));
            }
        }
    }
    public static float eth = 9322.34f, btc = 16324.59f, total,p_total;
    private static void btc(int bit){
        if (bit == 1){
            float currency = Float.parseFloat(JOptionPane.showInputDialog("Enter total BTC to convert"));
            total = currency*btc;
            JOptionPane.showMessageDialog(null, "The result of conversion is $ "+total);
            next_opt();
        } else if (bit == 2) {
            float currency = Float.parseFloat(JOptionPane.showInputDialog("Enter total USD to convert"));
            total = currency/btc;
            JOptionPane.showMessageDialog(null, "The result of conversion is BTC "+total);
            next_opt();
        }else if (bit == 3){
            float currency = Float.parseFloat(JOptionPane.showInputDialog("Enter total BTC to convert"));
            p_total = currency*btc;
            total = p_total/eth;
            JOptionPane.showMessageDialog(null, "The result of conversion is ETH "+total);
            next_opt();
        }
    }
    private static void eth(int ether){
        if (ether == 4){
            float currency = Float.parseFloat(JOptionPane.showInputDialog("Enter total ETH to convert"));
            total = currency*eth;
            JOptionPane.showMessageDialog(null, "The result of conversion is $"+total);
            next_opt();
        } else if (ether == 5) {
            float currency = Float.parseFloat(JOptionPane.showInputDialog("Enter total USD to convert"));
            total = currency/eth;
            JOptionPane.showMessageDialog(null, "The result of conversion is ETH "+total);
            next_opt();
        }else if (ether == 6){
            float currency = Float.parseFloat(JOptionPane.showInputDialog("Enter total ETH to convert"));
            p_total = currency*eth;
            total = p_total/btc;
            JOptionPane.showMessageDialog(null, "The result of conversion is BTC "+total);
            next_opt();
        }
    }
    private static void next_opt(){
        int confirm = JOptionPane.showConfirmDialog(null,"Do you want to order more?");
        if(confirm == 0){
            in = Integer.parseInt(JOptionPane.showInputDialog(input));
        }else if(confirm == 1){
            JOptionPane.showMessageDialog(null,"Thank you for using our service!");
            System.exit(0);
        }
    }
}