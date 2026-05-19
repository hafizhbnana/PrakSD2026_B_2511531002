package pekan7_2511531002;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.SwingUtilities;

public class InsertionSortGUI_2511531002 extends JFrame {
	private static final long serialVersionUID = 1L;
//	private JPanel contentPane_1002;
	private int[] array_1002;
	private JLabel[] labelArray_1002;
	private JButton stepButton_1002, resetButton_1002, setButton_1002;
	private JTextField inputField_1002;
	private JPanel panelArray_1002;
	private JTextArea stepArea_1002;
	
	private int i_1002 = 1, j_1002;
	private boolean sorting_1002 = false;
	private int stepCount_1002 = 1;

	public InsertionSortGUI_2511531002() {
		setTitle("Insertion Sort Langkah per Langkah");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		// Panel Input
		JPanel inputPanel_1002 = new JPanel(new FlowLayout());
		inputField_1002 = new JTextField(30);
		setButton_1002 = new JButton("Set Array");
		inputPanel_1002.add(new JLabel("Masukkan angka (pisahkan dengna koma):"));
		inputPanel_1002.add(inputField_1002);
		inputPanel_1002.add(setButton_1002);
		
		// Panel array visual
		panelArray_1002 = new JPanel();
		panelArray_1002.setLayout(new FlowLayout());
		
		// Panel kontrol
		JPanel controlPanel_1002 = new JPanel();
		stepButton_1002 = new JButton("Langkah Selanjutnya");
		resetButton_1002 = new JButton("Reset");
		stepButton_1002.setEnabled(false);
		controlPanel_1002.add(stepButton_1002);
		controlPanel_1002.add(resetButton_1002);
		
		// Area teks untuk long langkah-langkah
		stepArea_1002 = new JTextArea(8, 60);
		stepArea_1002.setEditable(false);
		stepArea_1002.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scrollPane_1002 = new JScrollPane(stepArea_1002);
		
		// Tambahkan panel ke frame
		add(inputPanel_1002, BorderLayout.NORTH);
		add(panelArray_1002, BorderLayout.CENTER);
		add(controlPanel_1002, BorderLayout.SOUTH);
		add(scrollPane_1002, BorderLayout.EAST);
		
		// Event Set Array
		setButton_1002.addActionListener(e -> setArrayFromInput_1002());
		
		// Event Langkah Selanjutnya
		stepButton_1002.addActionListener(e -> performStep_1002());
		
		// Event Reset
		resetButton_1002.addActionListener(e -> reset_1002());
	}
	
	private void setArrayFromInput_1002() {
		String text_1002 = inputField_1002.getText().trim();
		if (text_1002.isEmpty()) return;
		String[] parts_1002 = text_1002.split(",");
		array_1002 = new int[parts_1002.length];
		try {
			for (int k_1002 = 0; k_1002 < parts_1002.length; k_1002++) {
				array_1002[k_1002] = Integer.parseInt(parts_1002[k_1002].trim()); }
		} catch (NumberFormatException e_1002) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan "
					+ "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return; }
		i_1002 = 1;
		stepCount_1002 = 1;
		sorting_1002 = true;
		stepButton_1002.setEnabled(true);
		stepArea_1002.setText("");
		panelArray_1002.removeAll();
		labelArray_1002 = new JLabel[array_1002.length];
		for (int k_1002 = 0; k_1002 < array_1002.length; k_1002++) {
			labelArray_1002[k_1002] = new JLabel(String.valueOf(array_1002[k_1002]));
			labelArray_1002[k_1002].setFont(new Font("Arial", Font.BOLD, 24));
			labelArray_1002[k_1002].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_1002[k_1002].setPreferredSize(new Dimension(50, 50));
			labelArray_1002[k_1002].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_1002.add(labelArray_1002[k_1002]);
		}
		panelArray_1002.revalidate();
		panelArray_1002.repaint();
	}
	
	private void performStep_1002() {
		if (i_1002 < array_1002.length && sorting_1002) {
			int key_1002 = array_1002[i_1002];
			j_1002 = i_1002 - 1;
			
			StringBuilder stepLog_1002 = new StringBuilder();
			stepLog_1002.append("Langkah ").append(stepCount_1002).
			append(": Memasukkan ").append(key_1002).append("\n");
			
			while (j_1002 >= 0 && array_1002[j_1002] > key_1002) {
				array_1002[j_1002 + 1] = array_1002[j_1002];
				j_1002--;
			}
			array_1002[j_1002 + 1] = key_1002;
			
			updateLabels_1002();
			stepLog_1002.append("Hasil: ").append(arrayToString_1002(array_1002)).append("\n\n");
			stepArea_1002.append(stepLog_1002.toString());
			
			i_1002++;
			stepCount_1002++;
			
			if (i_1002 == array_1002.length) {
				sorting_1002 = false;
				stepButton_1002.setEnabled(false);
				JOptionPane.showMessageDialog(this, "Sorting selesai!");
			}
		}
	}
	
	private void updateLabels_1002() {
		for (int k_1002 = 0; k_1002 < array_1002.length; k_1002++) {
			labelArray_1002[k_1002].setText(String.valueOf(array_1002[k_1002]));
		}
	}
	
	private void reset_1002() {
		inputField_1002.setText("");
		panelArray_1002.removeAll();
		panelArray_1002.revalidate();
		panelArray_1002.repaint();
		stepArea_1002.setText("");
		stepButton_1002.setEnabled(false);
		sorting_1002 = false;
		i_1002 = 1;
		stepCount_1002 = 1;
	}
	
	private String arrayToString_1002(int[] arr_1002) {
		StringBuilder sb_1002 = new StringBuilder();
		for (int k_1002 = 0; k_1002 < arr_1002.length; k_1002++) {
			sb_1002.append(arr_1002[k_1002]);
			if (k_1002 < arr_1002.length - 1) sb_1002.append(", ");
		}
		return sb_1002.toString();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			InsertionSortGUI_2511531002 gui_1002 = new InsertionSortGUI_2511531002();
			gui_1002.setVisible(true);
		});
	}
}
