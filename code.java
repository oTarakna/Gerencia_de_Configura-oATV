import javax.swing.JOptionPane;
public class Media1 {

        public static void main(String args[])  {

            int n1, n2, n3, n4, media;
            
            String msn1, msn2, msn3, msn4;

            msn1 = JOptionPane.showInputDialog("Entre com a primeira nota");
            msn2 = JOptionPane.showInputDialog("Entre com a segunda nota");
            msn3 = JOptionPane.showInputDialog("Entre com a terceira nota ");
            msn4 = JOptionPane.showInputDialog("Entre com a quarta nota");


            n1= Integer.parseInt(msn1);
            n2= Integer.parseInt(msn2);
            n3= Integer.parseInt(msn3);
            n4= Integer.parseInt(msn4);


            media =(n1 + n2 + n3 + n4) / 4;
            JOptionPane.showMessageDialog(null, "O Total " + media, ".", JOptionPane.PLAIN_MESSAGE);
            System.out.println("Total  =" + media);
            System.exit(0);
                    }