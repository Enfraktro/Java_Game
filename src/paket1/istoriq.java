package paket1;
import java.util.Random;
import paket2.Monster_Ghost;
import paket2.OrujieNoj;
import paket2.OrujiePruchka;
import paket2.SuperMonster;

public class istoriq {
	game game;
	interfeis ui;
	stranica vm;
	igrach player = new igrach();
	SuperMonster monster;
  public istoriq(game g, interfeis userI,stranica vMannager) {
game = g;
ui = userI;
vm = vMannager;
	  
  }
  public void defaultSetup() {
	  player.hp = 10;
	  ui.hpNumberLabel.setText(""+player.hp);
	  
	  player.currentWeapon= new OrujieNoj();
	  ui.weaponNameLabel.setText(player.currentWeapon.name);
	  
  }
  public void selectPositon(String nextPosition) {
	  switch(nextPosition) {
	  case "Вратите на Веристрас": TownGate();break;
	  case "Заговори го":talkGuard();break;
	  case"Атакувай го":attackGuard();break;
	  case"Тръгни си":leaveGuard();break;
	  case"север":north();break;
	  case"изток":east();break;
	  case"запад":west();break;
	  
	  
	  }
  }
  public void TownGate() {
	  ui.mainTextArea.setText("Ти си пред вратите на Веристрас. \nЕдин стражар седи пред теб. \nКакво Ще направиш?");
	  ui.choice1.setText("Заговори го");
	  ui.choice2.setText("Нападни стражаря");
	  ui.choice3.setText("Тръгни си");
	  ui.choice4.setText("");
	  
	  game.nextPosition1="Заговори го";
	  game.nextPosition2="Атакувай го";
	  game.nextPosition3="Тръгни си";
	  game.nextPosition4="";

  }
  public void talkGuard() {
	  ui.mainTextArea.setText("Стражар:Здравей страннико. \nТеб не съм те виждал преди. \nСъжелявам,но не мога да те допсуна");
	  ui.choice1.setText(">");
	  ui.choice2.setText("");
	  ui.choice3.setText("");
	  ui.choice4.setText("");
	  
	  game.nextPosition1="Вратите на Веристрас";
	  game.nextPosition2="";
	  game.nextPosition3="";
	  game.nextPosition4="";
  }
  public void attackGuard() {
	  ui.mainTextArea.setText("Стражар:Хей не бъди глупав. \nСтражът те удари толкова силно,че ти се отказва. \nПолучава +3 болка");
	  player.hp = player.hp-3;
	  ui.hpNumberLabel.setText(""+player.hp);
	  ui.choice1.setText(">");
	  ui.choice2.setText("");
	  ui.choice3.setText("");
	  ui.choice4.setText("");
	  
	  game.nextPosition1="Вратите на Веристрас";
	  game.nextPosition2="";
	  game.nextPosition3="";
	  game.nextPosition4="";
 }
  public void leaveGuard() {
	  ui.mainTextArea.setText("Ти си пред кръстопът. \nАко отидеш на юг се връщаш във Веристрас");
	  ui.choice1.setText("Отиди на север");
	  ui.choice2.setText("Отиди на изток");
	  ui.choice3.setText("Отиди на запад");
	  ui.choice4.setText("Отиди на юг");
	  
	  game.nextPosition1="север";
	  game.nextPosition2="изток";
	  game.nextPosition3="запад";
	  game.nextPosition4="Вратите на Веристрас";
	  
  }
  public void north() {
	  ui.mainTextArea.setText("Тук има лечебна река. \nОтпиваш от водата и си почиваш.\n\n(Получаваш +2 живот)");
	  player.hp = player.hp+2;
	  ui.hpNumberLabel.setText(""+player.hp);
	  ui.choice1.setText("Отиди на юг");
	  ui.choice2.setText("");
	  ui.choice3.setText("");
	  ui.choice4.setText("");
	  
	  game.nextPosition1="leaveGuard";
	  game.nextPosition2="";
	  game.nextPosition3="";
	  game.nextPosition4="";
  }
  public void east() {
	  ui.mainTextArea.setText("Ти влезе в гора и намери магическа пръчка!");
	  player.currentWeapon=new OrujiePruchka();
	  ui.weaponNameLabel.setText(player.currentWeapon.name);
	 
	  ui.choice1.setText("Отиди на Запад");
	  ui.choice2.setText("");
	  ui.choice3.setText("");
	  ui.choice4.setText("");
	  
	  game.nextPosition1="leaveGuard";
	  game.nextPosition2="";
	  game.nextPosition3="";
	  game.nextPosition4="";
	  
  }
  public void west() {
	  monster = new Monster_Ghost();
	  ui.mainTextArea.setText("Ти срещна зъл :"+monster.name+"!");
	  ui.choice1.setText("Бий се");
	  ui.choice2.setText("Бягай");
	  ui.choice3.setText("");
	  ui.choice4.setText("");
	  
	  game.nextPosition1="playerAttack";
	  game.nextPosition2="leaveGuard";
	  game.nextPosition3="";
	  game.nextPosition4="";
  }
  public void fight() {
	  ui.mainTextArea.setText(monster.name+": "+monster.hp+"\n\nКакво ще направиш?");
	  ui.choice1.setText("Бий се");
	  ui.choice2.setText("Бягай");
	  ui.choice3.setText("");
	  ui.choice4.setText("");
	  
	  game.nextPosition1="playerAttack";
	  game.nextPosition2="leaveGuard";
	  game.nextPosition3="";
	  game.nextPosition4="";
  }
  public void playerAttack() {
	  int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage);
	  ui.mainTextArea.setText("Ти атакува:"+monster.name+"и му вкара"+playerDamage+"живот");
	  monster.hp=monster.hp-playerDamage;
	  ui.choice1.setText(">");
	  ui.choice2.setText("");
	  ui.choice3.setText("");
	  ui.choice4.setText("");
	  if(monster.hp>0) {
		  game.nextPosition1="monsterAttack";
		  game.nextPosition2="";
		  game.nextPosition3="";
		  game.nextPosition4="";		  
	  }
	  else if(monster.hp<1) {
		  game.nextPosition1="win";
		  game.nextPosition2="";
		  game.nextPosition3="";
		  game.nextPosition4="";
	  }
	  
  }
  public void monsterAttack() {
	  int monsterDamage = new java.util.Random().nextInt(monster.attack);
	  
	  player.hp = player.hp-monsterDamage;
	  ui.hpNumberLabel.setText(""+player.hp);
	  ui.choice1.setText(">");
	  ui.choice2.setText("");
	  ui.choice3.setText("");
	  ui.choice4.setText("");
	  
	  if(player.hp>0) {
		  game.nextPosition1="fight";
		  game.nextPosition2="";
		  game.nextPosition3="";
		  game.nextPosition4="";
	  }else if (player.hp<1) {
		  game.nextPosition1="lose";
		  game.nextPosition2="";
		  game.nextPosition3="";
		  game.nextPosition4="";
	  }
  }
  public void win() {
	  ui.mainTextArea.setText("Ти победи чудовището");
  }
  
}
