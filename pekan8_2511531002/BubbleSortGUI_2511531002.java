package pekan8_2511531002;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class BubbleSortGUI_2511531002 extends JFrame {

    private static final long serialVersionUID = 1L;

    private JPanel contentPane_1002;
    private JTextField inputField_1002;
    private JButton inputButton_1002;
    private JButton stepButton_1002;
    private JButton resetButton_1002;
    private JPanel panelArray_1002;
    private JTextArea stepArea_1002;

    private int[] array_1002;
    private JLabel[] labelArray_1002;

    private int i_1002 = 0;
    private int j_1002 = 0;
    private int stepCount_1002 = 1;
    private boolean sorting_1002 = false;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                BubbleSortGUI_2511531002 frame = new BubbleSortGUI_2511531002();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public BubbleSortGUI_2511531002() {

        setTitle("Visualisasi Bubble Sort");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 500);

        contentPane_1002 = new JPanel();
        contentPane_1002.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane_1002.setLayout(new BorderLayout(10, 10));
        setContentPane(contentPane_1002);

        JPanel topPanel = new JPanel(new FlowLayout());

        JLabel lblInput = new JLabel("Masukkan angka (pisahkan koma):");

        inputField_1002 = new JTextField(25);

        inputButton_1002 = new JButton("Tampilkan");

        topPanel.add(lblInput);
        topPanel.add(inputField_1002);
        topPanel.add(inputButton_1002);

        contentPane_1002.add(topPanel, BorderLayout.NORTH);

        panelArray_1002 = new JPanel();
        panelArray_1002.setLayout(new FlowLayout());

        contentPane_1002.add(panelArray_1002, BorderLayout.CENTER);

        stepArea_1002 = new JTextArea();
        stepArea_1002.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(stepArea_1002);

        scrollPane.setPreferredSize(new Dimension(300, 0));

        contentPane_1002.add(scrollPane, BorderLayout.EAST);

        JPanel bottomPanel = new JPanel();

        stepButton_1002 = new JButton("Sorting Selanjutnya");

        resetButton_1002 = new JButton("Reset");

        stepButton_1002.setEnabled(false);

        bottomPanel.add(stepButton_1002);
        bottomPanel.add(resetButton_1002);

        contentPane_1002.add(bottomPanel, BorderLayout.SOUTH);

        inputButton_1002.addActionListener(e -> setArrayFromInput_1002());

        stepButton_1002.addActionListener(e -> nextStep_1002());

        resetButton_1002.addActionListener(e -> reset_1002());
    }

    private void setArrayFromInput_1002() {

        String text = inputField_1002.getText().trim();

        if (text.isEmpty())
            return;

        String[] parts = text.split(",");

        array_1002 = new int[parts.length];

        try {

            for (int k = 0; k < parts.length; k++) {
                array_1002[k] = Integer.parseInt(parts[k].trim());
            }

        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Masukkan hanya angka yang dipisahkan koma!",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);

            return;
        }

        i_1002 = 0;
        j_1002 = 0;
        stepCount_1002 = 1;
        sorting_1002 = true;

        stepButton_1002.setEnabled(true);
        stepArea_1002.setText("");

        panelArray_1002.removeAll();

        labelArray_1002 = new JLabel[array_1002.length];

        for (int k = 0; k < array_1002.length; k++) {

            labelArray_1002[k] = new JLabel(String.valueOf(array_1002[k]));

            labelArray_1002[k].setFont(new Font("Arial", Font.BOLD, 24));

            labelArray_1002[k].setOpaque(true);

            labelArray_1002[k].setBackground(Color.WHITE);

            labelArray_1002[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));

            labelArray_1002[k].setPreferredSize(new Dimension(60, 50));

            labelArray_1002[k].setHorizontalAlignment(SwingConstants.CENTER);

            panelArray_1002.add(labelArray_1002[k]);
        }

        panelArray_1002.revalidate();
        panelArray_1002.repaint();
    }

    private void nextStep_1002() {

        if (!sorting_1002)
            return;

        resetColors_1002();

        if (j_1002 < array_1002.length - i_1002 - 1) {

            labelArray_1002[j_1002].setBackground(Color.YELLOW);
            labelArray_1002[j_1002 + 1].setBackground(Color.YELLOW);

            int nilaiKiri = array_1002[j_1002];
            int nilaiKanan = array_1002[j_1002 + 1];

            if (array_1002[j_1002] > array_1002[j_1002 + 1]) {

                int temp = array_1002[j_1002];
                array_1002[j_1002] = array_1002[j_1002 + 1];
                array_1002[j_1002 + 1] = temp;

                updateLabels_1002();

                labelArray_1002[j_1002].setBackground(Color.RED);
                labelArray_1002[j_1002 + 1].setBackground(Color.RED);

                stepArea_1002.append(
                        "Langkah " + stepCount_1002 +
                        " : Tukar " +
                        nilaiKiri + " dengan " +
                        nilaiKanan + "\n");

            } else {

                stepArea_1002.append(
                        "Langkah " + stepCount_1002 +
                        " : Tidak ada pertukaran (" +
                        nilaiKiri + " dan " +
                        nilaiKanan + ")\n");
            }

            j_1002++;

        } else {

            labelArray_1002[array_1002.length - i_1002 - 1].setBackground(Color.GREEN);

            j_1002 = 0;
            i_1002++;
        }

        stepCount_1002++;

        if (i_1002 >= array_1002.length - 1) {

            sorting_1002 = false;

            for (JLabel lbl : labelArray_1002) {
                lbl.setBackground(Color.GREEN);
            }

            stepButton_1002.setEnabled(false);

            stepArea_1002.append("\n=== SORTING SELESAI ===\n");

            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels_1002() {

        for (int k = 0; k < array_1002.length; k++) {

            labelArray_1002[k].setText(String.valueOf(array_1002[k]));
        }
    }

    private void resetColors_1002() {

        if (labelArray_1002 == null)
            return;

        for (JLabel lbl_1002 : labelArray_1002) {

            if (!Color.GREEN.equals(lbl_1002.getBackground())) {

                lbl_1002.setBackground(Color.WHITE);
            }
        }
    }

    private void reset_1002() {

        inputField_1002.setText("");

        panelArray_1002.removeAll();
        panelArray_1002.revalidate();
        panelArray_1002.repaint();

        stepArea_1002.setText("");

        stepButton_1002.setEnabled(false);

        array_1002 = null;
        labelArray_1002 = null;

        sorting_1002 = false;
        i_1002 = 0;
        j_1002 = 0;
        stepCount_1002 = 1;
    }
}