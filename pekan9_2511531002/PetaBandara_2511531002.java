package pekan9_2511531002;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.util.List;
import java.util.*;
import javax.swing.*;

public class PetaBandara_2511531002 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane_1002;
	private GraphPanel_1002 pnlGraph_1002;
	private JComboBox<String> cbStart_1002;
	private JComboBox<String> cbGoal_1002;
	private JTextArea txtHasil_1002;
	private HashMap<String, ArrayList<String>> graph_1002;
	private HashMap<String, Point> positions_1002;
	private Set<String> visitedNodes_1002 = new HashSet<>();
	private List<String> path_1002 = new ArrayList<>();

	public PetaBandara_2511531002() {
		setTitle("Peta Bandara BFS DFS - 2511531002");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1100,700);
		setLocationRelativeTo(null);
		
		contentPane_1002 = new JPanel();
		contentPane_1002.setLayout(null);
		
		setContentPane(contentPane_1002);
		
		pnlGraph_1002 = new GraphPanel_1002();
		pnlGraph_1002.setBounds(10,10,740,620);
		contentPane_1002.add(pnlGraph_1002);
		
		JLabel lblStart_1002 = new JLabel("Start");
		lblStart_1002.setBounds(770,20,100,25);
		contentPane_1002.add(lblStart_1002);
		
		cbStart_1002 = new JComboBox<>();
		cbStart_1002.setBounds(770,45,250,30);
		contentPane_1002.add(cbStart_1002);
		
		JLabel lblGoal_1002 = new JLabel("Goal");
		lblGoal_1002.setBounds(770,90,100,25);
		contentPane_1002.add(lblGoal_1002);
		
		cbGoal_1002 = new JComboBox<>();
		cbGoal_1002.setBounds(770, 115, 250, 30);
		contentPane_1002.add(cbGoal_1002);
		
		JButton btnBFS_1002 = new JButton("BFS");
		btnBFS_1002.setBounds(770,170,80,35);
		contentPane_1002.add(btnBFS_1002);
		
		JButton btnDFS_1002 = new JButton("DFS");
		btnDFS_1002.setBounds(860,170,80,35);
		contentPane_1002.add(btnDFS_1002);
		
		JButton btnReset_1002 = new JButton("Reset");
		btnReset_1002.setBounds(950,170,80,35);
		contentPane_1002.add(btnReset_1002);
		
		txtHasil_1002 = new JTextArea();
		txtHasil_1002.setEditable(false);
		
		JScrollPane scroll_1002 = new JScrollPane(txtHasil_1002);
		scroll_1002.setBounds(770,230,280,380);
		contentPane_1002.add(scroll_1002);
		
		initGraph_1002();
		initPositions_1002();
		
		btnBFS_1002.addActionListener(e ->
		BFS_1002(
				cbStart_1002.getSelectedItem().toString(),
				cbGoal_1002.getSelectedItem().toString()
				)
		);
		
		btnDFS_1002.addActionListener(e ->
		DFS_1002(
				cbStart_1002.getSelectedItem().toString(),
				cbGoal_1002.getSelectedItem().toString()
				)
		);
		
		btnReset_1002.addActionListener(e ->
		resetGraph_1002());
	}
	
	private void initGraph_1002() {
		graph_1002 = new HashMap<>();
		String[] nodes_1002 = {
				"Parking",
				"DropOffZone",
				"CheckInCounter",
				"SecurityCheck",
				"Immigration",
				"DutyFreeShop",
				"AirportLounge",
				"TerminalA",
				"TerminalB",
				"SkyTrain",
				"BaggageClaim",
				"ArrivalExit"
		};
		
		for(String node_1002 : nodes_1002) {
			graph_1002.put(node_1002, new ArrayList<>());
			cbStart_1002.addItem(node_1002);
			cbGoal_1002.addItem(node_1002);
		}
		
		addEdge_1002("Parking","DropOffZone");
		addEdge_1002("Parking","CheckInCounter");
	    addEdge_1002("DropOffZone","CheckInCounter");
	    addEdge_1002("CheckInCounter","SecurityCheck");
	    addEdge_1002("CheckInCounter","DutyFreeShop");
	    addEdge_1002("SecurityCheck","Immigration");
	    addEdge_1002("SecurityCheck","AirportLounge");
	    addEdge_1002("Immigration","DutyFreeShop");
	    addEdge_1002("DutyFreeShop","AirportLounge");
	    addEdge_1002("DutyFreeShop","TerminalA");
	    addEdge_1002("DutyFreeShop","TerminalB");
	    addEdge_1002("AirportLounge","TerminalA");
	    addEdge_1002("AirportLounge","TerminalB");
	    addEdge_1002("TerminalA","TerminalB");
	    addEdge_1002("TerminalA","SkyTrain");
	    addEdge_1002("TerminalB","SkyTrain");
	    addEdge_1002("SkyTrain","BaggageClaim");
	    addEdge_1002("BaggageClaim","ArrivalExit");
	}
	
	private void addEdge_1002(String from_1002, String to_1002) {
		graph_1002.get(from_1002).add(to_1002);
		graph_1002.get(to_1002).add(from_1002);
	}
	
	private void initPositions_1002() {
		positions_1002 = new HashMap<>();
		
	    positions_1002.put("Parking",new Point(120,500));
	    positions_1002.put("DropOffZone",new Point(280,500));
	    positions_1002.put("CheckInCounter",new Point(200,400));
	    positions_1002.put("SecurityCheck",new Point(200,300));
	    positions_1002.put("Immigration",new Point(100,200));
	    positions_1002.put("DutyFreeShop",new Point(300,200));
	    positions_1002.put("AirportLounge",new Point(300,100));
	    positions_1002.put("TerminalA",new Point(480,80));
	    positions_1002.put("TerminalB",new Point(480,200));
	    positions_1002.put("SkyTrain",new Point(620,140));
	    positions_1002.put("BaggageClaim",new Point(620,300));
	    positions_1002.put("ArrivalExit",new Point(620,450));
	}
	
	class GraphPanel_1002 extends JPanel {
		public GraphPanel_1002() { setBackground(Color.WHITE);}
		
		@Override
		protected void paintComponent(Graphics g_1002) {
			super.paintComponent(g_1002);
			Graphics2D g2_1002 = (Graphics2D) g_1002;
			
			for (String node_1002 : graph_1002.keySet()) {
				Point p1_1002 = positions_1002.get(node_1002);
				for (String next_1002 : graph_1002.get(node_1002)) {
					Point p2_1002 = positions_1002.get(next_1002);
					g2_1002.setColor(Color.BLACK);
					g2_1002.drawLine(p1_1002.x, p1_1002.y, p2_1002.x, p2_1002.y);
				}
			}
			
			for (String node_1002 : graph_1002.keySet()) {
				Point p_1002 = positions_1002.get(node_1002);
				
				if(path_1002.contains(node_1002))
					g2_1002.setColor(Color.GREEN);
				else if(visitedNodes_1002.contains(node_1002))
					g2_1002.setColor(Color.YELLOW);
				else
					g2_1002.setColor(Color.LIGHT_GRAY);
				
				g2_1002.fillOval(p_1002.x-25, p_1002.y-25, 50, 50);
				g2_1002.setColor(Color.BLACK);
				g2_1002.drawOval(p_1002.x-25, p_1002.y-25, 50, 50);
				g2_1002.drawString(node_1002, p_1002.x-35, p_1002.y+40);
			}
		}
	}
	
	private void BFS_1002(String start_1002, String goal_1002) {
		Queue<String> q_1002 = new LinkedList<>();
		HashSet<String> visited_1002 = new HashSet<>();
		HashMap<String,String> parent_1002 = new HashMap<>();
		ArrayList<String> order_1002 = new ArrayList<>();
		
		q_1002.add(start_1002);
		visited_1002.add(start_1002);
		
		while(!q_1002.isEmpty()) {
			String curr_1002 = q_1002.poll();
			order_1002.add(curr_1002);
			if (curr_1002.equals(goal_1002))
				break;
			
			for(String n_1002 : graph_1002.get(curr_1002)) {
				if(!visited_1002.contains(n_1002)) {
					visited_1002.add(n_1002);
					parent_1002.put(n_1002, curr_1002);
					q_1002.add(n_1002);
				}
			}
		}
		
		visitedNodes_1002 = visited_1002;
		path_1002 = buildPath_1002(
				parent_1002, start_1002, goal_1002);
		
		txtHasil_1002.setText(
				"ALGORITMA : BFS\n\n" +
				"Path : " + path_1002 +
				"\n\nVisited : " + order_1002 +
				"\n\nJumlah Node Dieksplorasi : "
				+ order_1002.size());
		pnlGraph_1002.repaint();
	}
	
	private void DFS_1002(String start_1002, String goal_1002) {
		Stack<String> stack_1002 = new Stack<>();
		HashSet<String> visited_1002 = new HashSet<>();
		HashMap<String,String> parent_1002 = new HashMap<>();
		ArrayList<String> order_1002 = new ArrayList<>();
		
		stack_1002.push(start_1002);
		while(!stack_1002.isEmpty()) {
			String curr_1002 = stack_1002.pop();
			
			if(visited_1002.contains(curr_1002))
				continue;
			
			visited_1002.add(curr_1002);
			order_1002.add(curr_1002);
			
			if(curr_1002.equals(goal_1002))
				break;
			
			List<String> neighbors_1002 = graph_1002.get(curr_1002);
			for(int i_1002 = neighbors_1002.size()-1; i_1002 >= 0; i_1002--) {
				String next_1002 = neighbors_1002.get(i_1002);
				if(!visited_1002.contains(next_1002)) {
					if(!parent_1002.containsKey(next_1002))
						parent_1002.put(next_1002, curr_1002);
					stack_1002.push(next_1002);
				}
			}
		}
		
		visitedNodes_1002 = visited_1002;
		path_1002 = buildPath_1002(parent_1002, start_1002, goal_1002);
		
		txtHasil_1002.setText(
				"ALGORITMA : DFS\n\n" +
				"Path : " + path_1002 +
				"\n\nVisited : " + order_1002 +
				"\n\nJumlah Node Dieksplorasi : "
				+ order_1002.size());
		pnlGraph_1002.repaint();
	}
	
	private ArrayList<String> buildPath_1002(
			HashMap<String,String> parent_1002,
			String start_1002, String goal_1002){
		
		ArrayList<String> result_1002 = new ArrayList<>();
		if(!start_1002.equals(goal_1002)
				&& !parent_1002.containsKey(goal_1002))
			return result_1002;
		
		String curr_1002 = goal_1002;
		while(curr_1002 != null) {
			result_1002.add(0, curr_1002);
			curr_1002 = parent_1002.get(curr_1002);
		}
		
		return result_1002;
	}
	
	private void resetGraph_1002() {
		visitedNodes_1002.clear();
		path_1002.clear();
		txtHasil_1002.setText("");
		pnlGraph_1002.repaint();
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetaBandara_2511531002 frame = new PetaBandara_2511531002();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
 