package paket1;

public class stranica {
	interfeis ui;
public stranica(interfeis pi) {
	ui = pi;
}	
	public void pokajiStranica1() {
	//pokazwa zaglawnata stranica
		ui.titleNamePanel.setVisible(true);
		ui.startButtonPanel.setVisible(true);
		 //skriwame ikrana na igrata
		ui.mainTextPanel.setVisible(false);
		ui.choiceButtonPanel.setVisible(false);
		ui.playerPanel.setVisible(false);
		
	}
	public void titleToTown() {
		//skriwame zaglawnata stranica
		ui.titleNamePanel.setVisible(false);
		ui.startButtonPanel.setVisible(false);
		 //pokazwame ikrana na igrata
		ui.mainTextPanel.setVisible(true);
		ui.choiceButtonPanel.setVisible(true);
		ui.playerPanel.setVisible(true);
		
	}
}

