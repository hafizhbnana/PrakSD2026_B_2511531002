package pekan7_2511531002;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class SortingGUI_2511531002 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JTextField txtNama_1002, txtNim_1002, txtProdi_1002;
	private JButton addButton_1002, stepButton_1002, resetButton_1002;
	private JComboBox<String> comboSorting_1002;
	private JPanel panelArray_1002;
	private JTextArea areaLangkah_1002;
	private JLabel[] labelArray_1002;
	
	private ArrayList<Mahasiswa_2511531002> listMhs_1002;
	private ArrayList<Mahasiswa_2511531002> dataSorting_1002;
	
	private int i_1002;
	private boolean sortingSelesai_1002;

	public SortingGUI_2511531002() {
		setTitle("Visualisasi Sorting Mahasiswa");
		setSize(750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
		
		listMhs_1002 = new ArrayList<>();
		
		// Panel Input
		JPanel panelInput_1002 = new JPanel(new GridLayout(5, 2, 5, 5));
		panelInput_1002.setBorder(
				BorderFactory.createTitledBorder("Input Data"));
		
		panelInput_1002.add(new JLabel("Nama Mahasiswa"));
		txtNama_1002 = new JTextField();
		panelInput_1002.add(txtNama_1002);
		
		panelInput_1002.add(new JLabel("NIM"));
		txtNim_1002 = new JTextField();
		panelInput_1002.add(txtNim_1002);
		
		panelInput_1002.add(new JLabel("Program Studi"));
		txtProdi_1002 = new JTextField();
		panelInput_1002.add(txtProdi_1002);
		
		panelInput_1002.add(new JLabel("Pilih Sotring"));
		comboSorting_1002 = new JComboBox<>();
		
		comboSorting_1002.addItem("Insertion Sort");
		comboSorting_1002.addItem("Selection Sort");
		comboSorting_1002.addItem("Bubble Sort");
		
		panelInput_1002.add(comboSorting_1002);
		addButton_1002 = new JButton("Tambah Data");
		panelInput_1002.add(addButton_1002);
		
		// Panel Visual Array
		panelArray_1002 = new JPanel();
		panelArray_1002.setLayout(new FlowLayout());
		panelArray_1002.setBorder(
				BorderFactory.createTitledBorder("Visualisasi Data"));
		
		// Panel Control
		JPanel panelControl_1002 = new JPanel();
		stepButton_1002 = new JButton("Langkah Selanjutnya");
		resetButton_1002 = new JButton("Reset");
		panelControl_1002.add(stepButton_1002);
		panelControl_1002.add(resetButton_1002);
		
		// Text Area
		areaLangkah_1002 = new JTextArea();
		areaLangkah_1002.setEditable(false);
		areaLangkah_1002.setFont(new Font("Monospaced", Font.PLAIN, 14));
		JScrollPane scroll_1002 = new JScrollPane(areaLangkah_1002);
		scroll_1002.setPreferredSize(new Dimension(350, 500));
		
		// Add Component
		add(panelInput_1002, BorderLayout.NORTH);
		add(panelArray_1002, BorderLayout.CENTER);
		add(panelControl_1002, BorderLayout.SOUTH);
		add(scroll_1002, BorderLayout.EAST);
		
		// Button Event
		addButton_1002.addActionListener(e -> tambahData_1002());
		stepButton_1002.addActionListener(e -> prosesSorting_1002());
		resetButton_1002.addActionListener(e -> reset_1002());
		stepButton_1002.setEnabled(false);
	}
	
	// Method Tambah Data
	private void tambahData_1002() {
		String nama_1002 = txtNama_1002.getText().trim();
		String nim_1002 = txtNim_1002.getText().trim();
		String prodi_1002 = txtProdi_1002.getText().trim();
		
		if (nama_1002.isEmpty() || nim_1002.isEmpty() || prodi_1002.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Data belum lengkap!");
			return;
		}
		
		Mahasiswa_2511531002 mhs_1002 = new Mahasiswa_2511531002(nama_1002, nim_1002, prodi_1002);
		listMhs_1002.add(mhs_1002);
		tampilkanVisual_1002(listMhs_1002);
		
		txtNama_1002.setText("");
		txtNim_1002.setText("");
		txtProdi_1002.setText("");
		stepButton_1002.setEnabled(true);
		
		i_1002 = 1;
		sortingSelesai_1002 = false;
		areaLangkah_1002.setText("");
	}
	
	// Visual Tabel Array
	private void tampilkanVisual_1002(ArrayList<Mahasiswa_2511531002> data_1002) {
		panelArray_1002.removeAll();
		labelArray_1002 = new JLabel[data_1002.size()];
		
		for (int k_1002 = 0; k_1002 < data_1002.size(); k_1002++) {
			labelArray_1002[k_1002] = new JLabel(data_1002.get(k_1002).getNama_1002());
			labelArray_1002[k_1002].setFont(new Font("Arial", Font.BOLD, 16));
			labelArray_1002[k_1002].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_1002[k_1002].setPreferredSize(new Dimension(120, 50));
			labelArray_1002[k_1002].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_1002.add(labelArray_1002[k_1002]);
		}
		panelArray_1002.revalidate();
		panelArray_1002.repaint();
	}
	
	// Proses Sorting Step
	private void prosesSorting_1002() {
		if (listMhs_1002.size() <= 1) {
			JOptionPane.showMessageDialog(this, "Data minimal 2!");
			return;
		}
		
		if (dataSorting_1002 == null || i_1002 == 1) {
			dataSorting_1002 = new ArrayList<>();
			for (Mahasiswa_2511531002 m : listMhs_1002) {
				dataSorting_1002.add(new Mahasiswa_2511531002(
						m.getNama_1002(), m.getNama_1002(), m.getProdi_1002()));
			}
		}
		
		String pilihan_1002 = comboSorting_1002.getSelectedItem().toString();
		if (pilihan_1002.equals("Insetion Sort")) {
			insertionStep_1002();
		} else if (pilihan_1002.equals("Selection Sort")) {
			selectionStep_1002();
		} else {
			bubbleStep_1002();
		}
		
		tampilkanVisual_1002(dataSorting_1002);
	}
	
	// Insertion Sort Step
	private void insertionStep_1002() {
		if (i_1002 < dataSorting_1002.size()) {
			Mahasiswa_2511531002 key_1002 = dataSorting_1002.get(i_1002);
			int j_1002 = i_1002 - 1;
			
			while (j_1002 >= 0 && dataSorting_1002.get(
					j_1002).getNama_1002().compareToIgnoreCase(
							key_1002.getNama_1002()) > 0) {
				dataSorting_1002.set(j_1002 + 1, dataSorting_1002.get(j_1002));
				j_1002--;
			}
			
			dataSorting_1002.set(j_1002 + 1, key_1002);
			areaLangkah_1002.append(
					"Langkah " + i_1002 + " : " + tampilNama_1002(
							dataSorting_1002) + "\n");
			i_1002++;
		} else {
			selesai_1002();
		}
	}
	
	// Selection Sort Step
	private void selectionStep_1002() {
		if (i_1002 < dataSorting_1002.size()) {
			int min_1002 = i_1002 - 1;
			for (int j_1002 = i_1002; j_1002 < dataSorting_1002.size(); j_1002++) {
				if (dataSorting_1002.get(j_1002).getNama_1002().
						compareToIgnoreCase(dataSorting_1002.get(min_1002).
								getNama_1002()) < 0) {
					min_1002 = j_1002;
				}
			}
			Mahasiswa_2511531002 temp_1002 = dataSorting_1002.get(i_1002 - 1);
			dataSorting_1002.set(i_1002 - 1, dataSorting_1002.get(min_1002));
			dataSorting_1002.set(min_1002, temp_1002);
			
			areaLangkah_1002.append("Pass " + i_1002 + " : "
					+ tampilNama_1002(dataSorting_1002) + "\n");
			
			i_1002++;
		} else {
			selesai_1002();
		}
	}
	
	// Bubble Sort Step
	private void bubbleStep_1002() {
		if (i_1002 < dataSorting_1002.size()) {
			for (int j_1002 = 0; j_1002 < dataSorting_1002.size() - i_1002; j_1002++) {
				if (dataSorting_1002.get(j_1002).getNama_1002().compareToIgnoreCase(
						dataSorting_1002.get(j_1002 + 1).getNama_1002()) > 0) {
					Mahasiswa_2511531002 temp_1002 = dataSorting_1002.get(j_1002);
					dataSorting_1002.set(j_1002, dataSorting_1002.get(j_1002 + 1));
					dataSorting_1002.set(j_1002 + 1, temp_1002);
				}
			}
			areaLangkah_1002.append("Pass " + i_1002 + " : " + tampilNama_1002(
					dataSorting_1002) + "\n");
			
			i_1002++;
		} else {
			selesai_1002();
		}
	}
	
	// String Array
	private String tampilNama_1002(ArrayList<Mahasiswa_2511531002> data_1002) {
		String hasil_1002 = "[";
		
		for (int i_1002 = 0; i_1002 < data_1002.size(); i_1002++) {
			hasil_1002 += data_1002.get(i_1002).getNama_1002();
			if (i_1002 != data_1002.size() - 1) {
				hasil_1002 += ", ";
			}
		}
		hasil_1002 += "]";
		return hasil_1002;
	}
	
	// Sorting Selesai
	private void selesai_1002() {
		if (!sortingSelesai_1002) {
			sortingSelesai_1002 = true;
			stepButton_1002.setEnabled(false);
			JOptionPane.showMessageDialog(this, "Sorting selesai!");
		}
	}
	
	// Reset
	private void reset_1002() {
		listMhs_1002.clear();
		dataSorting_1002 = null;
		panelArray_1002.removeAll();
		panelArray_1002.revalidate();
		panelArray_1002.repaint();
		
		areaLangkah_1002.setText("");
		txtNama_1002.setText("");
		txtNim_1002.setText("");
		txtProdi_1002.setText("");
		
		stepButton_1002.setEnabled(false);
		i_1002 = 1;
		sortingSelesai_1002 = false;
	}
	
	// Main
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new SortingGUI_2511531002().setVisible(true);
		});
	}
}
