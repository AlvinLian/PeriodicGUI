import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class PeriodicGUI extends JFrame implements ActionListener {
    JFrame mainFrame;
    JButton[] elementButtons = new JButton[118];
    JPanel tablePanel;
    JPanel keyPanel;
    Font myFont = new Font(Font.SERIF, Font.PLAIN,  20);

    PeriodicTable p1 = new PeriodicTable();
    public PeriodicGUI() {
        mainFrame = new JFrame("Periodic Table of Elements");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1000, 500);
        mainFrame.setLayout(null);

        elementButtons[0] = new JButton("H");
        elementButtons[1] = new JButton("He");
        elementButtons[2] = new JButton("Li");
        elementButtons[3] = new JButton("Be");
        elementButtons[4] = new JButton("B");
        elementButtons[5] = new JButton("C");
        elementButtons[6] = new JButton("N");
        elementButtons[7] = new JButton("O");
        elementButtons[8] = new JButton("F");
        elementButtons[9] = new JButton("Ne");
        elementButtons[10] = new JButton("Na");
        elementButtons[11] = new JButton("Mg");
        elementButtons[12] = new JButton("Al");
        elementButtons[13] = new JButton("Si");
        elementButtons[14] = new JButton("P");
        elementButtons[15] = new JButton("S");
        elementButtons[16] = new JButton("Cl");
        elementButtons[17] = new JButton("Ar");
        elementButtons[18] = new JButton("K");
        elementButtons[19] = new JButton("Ca");
        elementButtons[20] = new JButton("Sc");
        elementButtons[21] = new JButton("Ti");
        elementButtons[22] = new JButton("V");
        elementButtons[23] = new JButton("Cr");
        elementButtons[24] = new JButton("Mn");
        elementButtons[25] = new JButton("Fe");
        elementButtons[26] = new JButton("Ni");
        elementButtons[27] = new JButton("Co");
        elementButtons[28] = new JButton("Cu");
        elementButtons[29] = new JButton("Zn");
        elementButtons[30] = new JButton("Ga");
        elementButtons[31] = new JButton("Ge");
        elementButtons[32] = new JButton("As");
        elementButtons[33] = new JButton("Se");
        elementButtons[34] = new JButton("Br");
        elementButtons[35] = new JButton("Kr");
        elementButtons[36] = new JButton("Rb");
        elementButtons[37] = new JButton("Sr");
        elementButtons[38] = new JButton("Y");
        elementButtons[39] = new JButton("Zr");
        elementButtons[40] = new JButton("Nb");
        elementButtons[41] = new JButton("Mo");
        elementButtons[42] = new JButton("Tc");
        elementButtons[43] = new JButton("Ru");
        elementButtons[44] = new JButton("Rh");
        elementButtons[45] = new JButton("Pd");
        elementButtons[46] = new JButton("Ag");
        elementButtons[47] = new JButton("Cd");
        elementButtons[48] = new JButton("In");
        elementButtons[49] = new JButton("Sn");
        elementButtons[50] = new JButton("Sb");
        elementButtons[51] = new JButton("Te");
        elementButtons[52] = new JButton("I");
        elementButtons[53] = new JButton("Xe");
        elementButtons[54] = new JButton("Cs");
        elementButtons[55] = new JButton("Ba");
        elementButtons[56] = new JButton("La");
        elementButtons[57] = new JButton("Ce");
        elementButtons[58] = new JButton("Pr");
        elementButtons[59] = new JButton("Nd");
        elementButtons[60] = new JButton("Pm");
        elementButtons[61] = new JButton("Sm");
        elementButtons[62] = new JButton("Eu");
        elementButtons[63] = new JButton("Gd");
        elementButtons[64] = new JButton("Tb");
        elementButtons[65] = new JButton("Dy");
        elementButtons[66] = new JButton("Ho");
        elementButtons[67] = new JButton("Er");
        elementButtons[68] = new JButton("Tm");
        elementButtons[69] = new JButton("Yb");
        elementButtons[70] = new JButton("Lu");
        elementButtons[71] = new JButton("Hf");
        elementButtons[72] = new JButton("Ta");
        elementButtons[73] = new JButton("W");
        elementButtons[74] = new JButton("Re");
        elementButtons[75] = new JButton("Os");
        elementButtons[76] = new JButton("Ir");
        elementButtons[77] = new JButton("Pt");
        elementButtons[78] = new JButton("Au");
        elementButtons[79] = new JButton("Hg");
        elementButtons[80] = new JButton("Tl");
        elementButtons[81] = new JButton("Pb");
        elementButtons[82] = new JButton("Bi");
        elementButtons[83] = new JButton("Po");
        elementButtons[84] = new JButton("At");
        elementButtons[85] = new JButton("Rn");
        elementButtons[86] = new JButton("Fr");
        elementButtons[87] = new JButton("Ra");
        elementButtons[88] = new JButton("Ac");
        elementButtons[89] = new JButton("Th");
        elementButtons[90] = new JButton("Pa");
        elementButtons[91] = new JButton("U");
        elementButtons[92] = new JButton("Np");
        elementButtons[93] = new JButton("Pu");
        elementButtons[94] = new JButton("Am");
        elementButtons[95] = new JButton("Cm");
        elementButtons[96] = new JButton("Bk");
        elementButtons[97] = new JButton("Cf");
        elementButtons[98] = new JButton("Es");
        elementButtons[99] = new JButton("Fm");
        elementButtons[100] = new JButton("Md");
        elementButtons[101] = new JButton("No");
        elementButtons[102] = new JButton("Lr");
        elementButtons[103] = new JButton("Rf");
        elementButtons[104] = new JButton("Db");
        elementButtons[105] = new JButton("Sg");
        elementButtons[106] = new JButton("Bh");
        elementButtons[107] = new JButton("Hs");
        elementButtons[108] = new JButton("Mt");
        elementButtons[109] = new JButton("Ds");
        elementButtons[110] = new JButton("Rg");
        elementButtons[111] = new JButton("Cn");
        elementButtons[112] = new JButton("Nh");
        elementButtons[113] = new JButton("Fl");
        elementButtons[114] = new JButton("Mc");
        elementButtons[115] = new JButton("Lv");
        elementButtons[116] = new JButton("Ts");
        elementButtons[117] = new JButton("Og");;

        for(int i = 0; i < 118; i++) {
            elementButtons[i].addActionListener(this);
            elementButtons[i].setFont(myFont);
            elementButtons[i].setFocusable(false);
        }

        tablePanel = new JPanel();
        tablePanel.setBounds(50, 20, 1200, 600);
        tablePanel.setLayout(new GridLayout(9, 18, 0, 0));
        //panel.setBackground(Color.GRAY);

        int elementNum = 0;
        for(int i = 1; i <= 162; i++) {
            if(i == 93) {
                tablePanel.add(new JLabel("La to Lu"));
            } else if(i == 111) {
                tablePanel.add(new JLabel("Ac to Lr"));
            }else if((i >= 2 && i <= 17) || (i >= 21 && i <= 30) || (i >= 39 & i <= 48) || (i == 93) || (i ==111)
            || (i >= 127 && i <= 129) || (i >= 145 && i <= 147)) {
                tablePanel.add(new JLabel(""));
            } else {
                if(i ==94) {
                    elementNum = 71;
                } else if (i == 112) {
                    elementNum = 103;
                } else if (i == 130) {
                    elementNum = 56;
                } else if(i == 148) {
                    elementNum = 88;
                }
                tablePanel.add(elementButtons[elementNum]);
                elementNum++;
            }

        }

        for(int i = 0; i < 118; i++) {
            if (i == 0 || (i >= 5 && i <= 8) || (i >= 14 && i <= 16) || (i >= 33 & i <= 34) || i== 52) {
                elementButtons[i].setBackground(Color.CYAN); // nonmetals
            } else if (i == 2 || i == 10 || i == 18 || i == 36 || i== 54 || i == 86 ) {
                elementButtons[i].setBackground(new Color(0, 204, 0)); // alkali
            } else if(i == 3 || i == 11 || i == 19 || i == 37 || i == 55 || i ==87) {
                elementButtons[i].setBackground(new Color(239, 16, 16)); // alkaline earth
            } else if((i >= 20 && i <= 29) || (i >= 38 && i <= 47) || (i >=71 && i <= 79) || (i >= 103 && i <= 107)) {
                elementButtons[i].setBackground(new Color(126, 123, 178)); // transition metals
            } else if(i == 4 || i == 13 || i == 31 || i == 32 || i == 50 || i == 51) {
                elementButtons[i].setBackground(new Color(250, 223, 136)); // metalloids
            } else if()
        }

        mainFrame.add(tablePanel);
        mainFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 118; i++) {
            if(e.getSource() == elementButtons[i]) {
                JOptionPane.showMessageDialog(null, p1.displayMessage(i), "Element Info", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        PeriodicGUI newGUI = new PeriodicGUI();
    }
}
