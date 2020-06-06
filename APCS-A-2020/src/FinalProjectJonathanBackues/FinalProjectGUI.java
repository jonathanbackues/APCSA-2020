package FinalProjectJonathanBackues;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class FinalProjectGUI {

	private int firstTeam;
	private int secondTeam;
	private int whichTeam;
	private int whichPlayer;
	private int newWins;
	private int newLosses;
	public static void main(String[] args) {
		new FinalProjectGUI();
	}
	public FinalProjectGUI() {
		
		Teams test1 = new Teams();
		
		JFrame guiFrame = new JFrame();
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("League Statistics Database and Game Simulator");
		guiFrame.setSize(1000,800);
		guiFrame.setLocationRelativeTo(null);
		
		String[] titleStuff = {"League Statistics Database and Game Simulator", "", "By Jonathan Backues","", 
				"Instructions: Use the dropdown at the top in order to switch between the different features: Title, Statistics, Edit, and Simulation.", 
				"Statistics instructions: Choose the team and the player you want to view and you can check or edit them. If you wish to edit, set their stats and then click edit.", 
				"Simulation instructions: Choose two teams to face off, and the winning team will be returned."};
		
		String[] playerOptions = {"Player1","Player2","Player3","Player4","Player5"};

		String[] panelOptions = {"Title","Statistics","Simulation"};
		
		String[] teamOptions = {"Team1","Team2","Team3","Team4"};
		
		String[] possibleWins = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
		String[] possibleLosses = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
		
		JLabel panelLbl = new JLabel("Options");
		JComboBox panels = new JComboBox(panelOptions);

		final JPanel titlePanel = new JPanel();
		titlePanel.setVisible(true);
		JList title = new JList(titleStuff);
		title.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		titlePanel.add(title);
	
		final JPanel editPanel = new JPanel();
		editPanel.setVisible(false);
		JLabel editPlayersLbl = new JLabel("Player:");
		JLabel editTeamsLbl = new JLabel("Team:");
		JComboBox editTeams = new JComboBox(teamOptions);
		JComboBox editPlayers = new JComboBox(playerOptions);
		JComboBox changeWins = new JComboBox(possibleWins);
		JComboBox changeLosses = new JComboBox(possibleLosses);
		JButton changeStats = new JButton("Change Statistics");
		JButton checkStats = new JButton("Check Statistics"); 
		JLabel wins = new JLabel("Wins:");
		JLabel losses  = new JLabel("Losses:");
		JLabel rating = new JLabel("Rating:");
		editPanel.add(editTeamsLbl);
		editPanel.add(editTeams);
		editPanel.add(editPlayersLbl);
		editPanel.add(editPlayers);
		editPanel.add(checkStats);
		editPanel.add(changeStats);
		editPanel.add(wins);
		editPanel.add(losses);
		editPanel.add(rating);
		editPanel.add(changeWins);
		editPanel.add(changeLosses);
		
		final JPanel simulationPanel = new JPanel();
		simulationPanel.setVisible(false);
		JLabel teams1Lbl = new JLabel("First Team:");
		JLabel teams2Lbl = new JLabel("Second Team:");
		JComboBox teams1 = new JComboBox(teamOptions);
		JComboBox teams2 = new JComboBox(teamOptions);
		JButton simulateButton = new JButton("Simulate");
		simulationPanel.add(teams1Lbl);
		simulationPanel.add(teams1);
		simulationPanel.add(teams2Lbl);
		simulationPanel.add(teams2);
		simulationPanel.add(simulateButton);
		JLabel result = new JLabel("Result: ");
    	simulationPanel.add(result, BorderLayout.SOUTH);
		

		panels.addActionListener(new ActionListener()
		{
			@Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String selectedOption = (String) combo.getSelectedItem();
		 
		        if (selectedOption.equals("Statistics")) {
		        	editPanel.setVisible(true);
		        	simulationPanel.setVisible(false);
		        	titlePanel.setVisible(false);
		        } else if (selectedOption.contentEquals("Simulation")) {
		        	editPanel.setVisible(false);
		        	simulationPanel.setVisible(true);
		        	titlePanel.setVisible(false);
		        } else if (selectedOption.contentEquals("Title")) {
		        	editPanel.setVisible(false);
		        	simulationPanel.setVisible(false);
		        	titlePanel.setVisible(true);
		        }
		    }
		});
		
		teams1.addActionListener(new ActionListener()
		{
			@Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String team1 = (String) combo.getSelectedItem();
		        if (team1.equals("Team1")) {
		        	firstTeam = 0;
		        } else if (team1.equals("Team2")) {
		        	firstTeam = 1;
		        } else if (team1.equals("Team3")) {
		        	firstTeam = 2;
		        } else if (team1.equals("Team4")) {
		        	firstTeam = 3;
		        }
		        
		    }
		});
		
		teams2.addActionListener(new ActionListener()
		{
			@Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String team2 = (String) combo.getSelectedItem();
		        if (team2.equals("Team1")) {
		        	secondTeam = 0;
		        } else if (team2.equals("Team2")) {
		        	secondTeam = 1;
		        } else if (team2.equals("Team3")) {
		        	secondTeam = 2;
		        } else if (team2.equals("Team4")) {
		        	secondTeam = 3;
		        }
		        
		    }
		});
		
		simulateButton.addActionListener(new ActionListener()
		{
			@Override
		    public void actionPerformed(ActionEvent event) {
				
		        Simulate battle = new Simulate(firstTeam, secondTeam);
		        System.out.println(battle.getWinner());
		        if (battle.getWinner() != 6) {
		        	result.setText("Result: Team "+ battle.getWinner()+ " won!");
		        } else {
		        	result.setText("Result: A team can not face itself!");
		        }
		    }
			
		});
		
		editTeams.addActionListener(new ActionListener()
		{
			@Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String team = (String) combo.getSelectedItem();
		        if (team.equals("Team1")) {
		        	whichTeam = 0;
		        } else if (team.equals("Team2")) {
		        	whichTeam = 1;
		        } else if (team.equals("Team3")) {
		        	whichTeam = 2;
		        } else if (team.equals("Team4")) {
		        	whichTeam = 3;
		        }
		        
		    }
		});
		
		editPlayers.addActionListener(new ActionListener()
		{
			@Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String player = (String) combo.getSelectedItem();
		        if (player.equals("Player1")) {
		        	whichPlayer = 0;
		        } else if (player.equals("Player2")) {
		        	whichPlayer = 1;
		        } else if (player.equals("Player3")) {
		        	whichPlayer = 2;
		        } else if (player.equals("Player4")) {
		        	whichPlayer = 3;
		        } else if (player.equals("Player5")) {
		        	whichPlayer = 4;
		        }
		        
		    }
		});
		
		checkStats.addActionListener(new ActionListener()
		{
			@Override
		    public void actionPerformed(ActionEvent event) {
		        Staff check = new Staff(whichTeam,whichPlayer);
		        wins.setText("Wins: " + check.getPlayerWins());
		        losses.setText("Losses: "+ check.getPlayerLosses());
		        check.setPlayerRating();
		        rating.setText("Rating: "+ String.format("%.2f",check.getPlayerRating()));	
		        }
		});
		
		changeStats.addActionListener(new ActionListener()
		{
			@Override
		    public void actionPerformed(ActionEvent event) {
		        Staff change = new Staff(whichTeam,whichPlayer);
		        change.setPlayerWins(newWins);
		        change.setPlayerLosses(newLosses);
		        
		        
		    }
		});
		
		changeWins.addActionListener(new ActionListener()
		{
			@Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String value = (String) combo.getSelectedItem();
		        newWins = Integer.parseInt(value);

		        
		    }
		});
		
		changeLosses.addActionListener(new ActionListener()
		{
			@Override
		    public void actionPerformed(ActionEvent event) {
		        JComboBox<String> combo = (JComboBox<String>) event.getSource();
		        String value = (String) combo.getSelectedItem();
		        newLosses = Integer.parseInt(value);

		        
		    }
		});
		
		
		guiFrame.add(panels, BorderLayout.NORTH);
		guiFrame.add(editPanel, BorderLayout.EAST);
		guiFrame.add(simulationPanel, BorderLayout.WEST);
		guiFrame.add(titlePanel, BorderLayout.CENTER);

		guiFrame.setVisible(true);
	}
}