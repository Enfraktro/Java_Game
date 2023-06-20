package paket1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class game {
ChoiceHandler cHandler = new ChoiceHandler();
	interfeis ui = new interfeis();
	stranica vm = new stranica(ui);
	istoriq story = new istoriq(this,ui,vm);
	
	String nextPosition1,nextPosition2,nextPosition3,nextPosition4;
	
	public static void main(String[] args) {
new game();
	}
	public game() {
		ui.createUI(cHandler);
		story.defaultSetup();
		vm.pokajiStranica1();
		
	}
	public class ChoiceHandler implements ActionListener{
	
		public void actionPerformed(ActionEvent event) {
			String yourChoice = event.getActionCommand();
			
			switch(yourChoice) {
			case "Започни":vm.titleToTown();story.TownGate();break;
			case "c1":story.selectPositon(nextPosition1);break;
			case "c2":story.selectPositon(nextPosition2); break;
			case "c3":story.selectPositon(nextPosition3); break;
			case "c4":story.selectPositon(nextPosition4);break;
			}
		}
	}

}
