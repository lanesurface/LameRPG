//Programmed by: Nathaniel, Cleaned by: Lane
//Revision: 1.7.1

import java.util.Scanner;

public class LameRPG{
	static int StatRoll(boolean Pro) {
		if (Pro == true) {
			return (((int) (Math.random() * 7) + 1) + 2);
		}
		else {
			return ((int)(Math.random() * 7) + 1);
		}
	}
	static int AI(String monster, int EStr, int ELuc, int EMag, int EHP, int EMP, int EcurrentHP){
		int Edamage = 0;
		
		if (monster.equals("Rat")) {
			Edamage = (int) ((EStr * Math.random()) + 1);
			System.out.println("The Rat crunches up and jumps forward at you, teeth beared!\nYou are cut for " + Edamage+" damage!!");
			
			return Edamage;
		} 
		else if (monster.equals("Bat")) {
			Edamage = (int) ((EStr * Math.random()) + 1);
			System.out.println("The bat hisses and swoops down at you!! \nYou are cut for " + Edamage+" damage!!");
			
			return Edamage;
		} 
		else if (monster.equals("Wolf")) {
			Edamage = (int) ((EStr * Math.random()) + 1);
			System.out.println("The Wolf dashes forward and bites at you!\nYou are punctured for " + Edamage+" damage!!");
			
			return Edamage;
		} 
		else if (monster.equals("Bear")) {
			Edamage = (int) ((EStr * Math.random()) + 1);
			System.out.println("The Bear runs forward and claws at you!\nYour flesh is ripped and sliced for " + Edamage+" damage!!");
			
			return Edamage;
		} 
		else if (monster.equals("Tiger")) {
			Edamage = (int) ((EStr * Math.random()) + 1);
			System.out.println("The Tiger roars and pounces at you!\nYou are jumped on for " + Edamage+" damage!!");
			
			return Edamage;
		} 
		else if (monster.equals("Madman")) {
			Edamage = (int) ((EStr * Math.random()) + 1);
			System.out.println("The Madman stares at you with his crazed eyes\nHe runs at you, knife overhead!! \nHe brings the knife down and slices you for " + Edamage+" damage!!");
			
			return Edamage;
		} 
		else if (monster.equals("Skeleton")) {
			Edamage = (int) ((EStr * Math.random()) + 1);
			System.out.println("The Skeleton chatters and rattles right before he abruptly comes at you, leaving too little time to react before you meet his boney fist!\nYou are smashed for " + Edamage+" damage!!");
			
			return Edamage;
		} 
		else if (monster.equals("Demon")) {
			Edamage = (int) ((EStr * Math.random()) + 1);
			System.out.println("The demon chuckles and soars overhead, into the vast sky!\nOut of nowhere, after a few moments, he comes down and utterly obliterates you with his balrog!!!\nYou are destroyed for " + Edamage+" damage!!");
			
			return Edamage;
		} 
		else {
			System.out.println("ERROR ERROR, please report to Nathaniel!");
			
			return 1;
		}
	}

	static void anyNew(int Level){
		switch (Level) {
		case 2:
			System.out.println("Congratulations, you unlocked the Lightning Spell!!");
			
			return;
		case 3:
			System.out.println("Congratulations, you unlocked the Heal Spell!!");
			
			return;
		case 4:
			System.out.println("Congratulations, you unlocked the Stop Spell!!");
			
			return;
		case 5:
			System.out.println("Congratulations, you unlocked the Finish Spell!!");
			
			return;
		default:
			return;
		}
	}
	static int statGrowth(int Luc, String Per) {
		int ret = (int) ((Math.random()* 3) + (Luc / 20 + 1));
		System.out.println("Your "+ Per + " stat went up by " + ret + " points!!");
		
		return ret;
	}
	static String encounter(int x){
		switch (x){
		case 1:
			return "Rat";
		case 2:
			return "Bat";
		case 3:
			return "Wolf";
		case 4:
			return "Bear";
		case 5:
			return "Tiger";
		case 6:
			return "Madman";
		case 7:
			return "Skeleton";
		case 8:
			return "Demon";
		default:
			return "ERROR";
		}
	}

	static int Fight(String x, String Para){
		if (x.equals("Rat")) {
			switch (Para) {
			case "EStr":
				return 3;
			case "ELuc":
				return 2;
			case "EMag":
				return 1;
			case "EHP":
				return 20;
			case "EMP":
				return 0;
			case "Elevel":
				return 1;
			default:
				return 404;
			}
		} 
		else if (x.equals("Bat")) {
			switch (Para) {
			case "EStr":
				return 6;
			case "ELuc":
				return 4;
			case "EMag":
				return 2;
			case "EHP":
				return 40;
			case "EMP":
				return 10;
			case "Elevel":
				return 2;
			default:
				return 404;
			}
		} 
		else if (x.equals("Wolf")) {
			switch (Para){
			case "EStr":
				return 9;
			case "ELuc":
				return 1;
			case "EMag":
				return 1;
			case "EHP":
				return 50;
			case "EMP":
				return 20;
			case "Elevel":
				return 3;
			default:
				return 404;
			}
		} 
		else if (x.equals("Bear")) {
			switch (Para){
			case "EStr":
				return 9;
			case "ELuc":
				return 3;
			case "EMag":
				return 10;
			case "EHP":
				return 120;
			case "EMP":
				return 30;
			case "Elevel":
				return 4;
			default:
				return 404;
			}
		} 
		else if (x.equals("Tiger")) {
			switch (Para){
			case "EStr":
				return 20;
			case "ELuc":
				return 16;
			case "EMag":
				return 19;
			case "EHP":
				return 100;
			case "EMP":
				return 40;
			case "Elevel":
				return 6;
			default:
				return 404;
			}
		}
		else if (x.equals("Madman")) {
			switch (Para){
			case "EStr":
				return 70;
			case "ELuc":
				return 100;
			case "EMag":
				return 60;
			case "EHP":
				return 40;
			case "EMP":
				return 50;
			case "Elevel":
				return 8;
			default:
				return 404;
			}
		} 
		else if (x.equals("Skeleton")) {
			switch (Para){
			case "EStr":
				return 60;
			case "ELuc":
				return 30;
			case "EMag":
				return 40;
			case "EHP":
				return 160;
			case "EMP":
				return 100;
			case "Elevel":
				return 20;
			default:
				return 404;
			}
		} 
		else if (x.equals("Demon")) {
			switch (Para){
			case "EStr":
				return 100;
			case "ELuc":
				return 100;
			case "EMag":
				return 120;
			case "EHP":
				return 200;
			case "EMP":
				return 2000;
			case "Elevel":
				return 30;
			default:
				return 404;
			}
		} 
		else {
			System.out.println("This is an error, it means something went horribly wrong");
			return 404;
		}
	}

	static void Magic(int level){
		switch (level){
		case 1 :
			System.out.println("Spell list (choose one) Fireball(1MP)");
			break;
		case 2 :
			System.out.println("Spell list (choose one) Fireball(1MP), Lightning(3MP)");
			break;
		case 3 :
			System.out.println("Spell list (choose one) Fireball(1MP), Lightning(3MP), Heal(5MP)");
			break;
		case 4 :
			System.out.println("Spell list (choose one) Fireball(1MP), Lightning(3MP), Heal(5MP), Stop(7MP)");
			break;
		case 5 :
			System.out.println("Spell list (choose one) Fireball(1MP), Lightning(3MP), Heal(5MP), Stop(7MP), Finish(20MP, Doesn't work on Demon)");
		}
	}
	
	public static void main(String[] args){
		boolean strPro = false, magPro = false, lucPro = false, FinalFight= false;
		int Str = 0, Luc=0, Mag=0, HP=0, MP=0, Exp=2, TNL=5, currentHP = 0, numOfFights = 1, level=1, gold=5, newgamePlus=1, currentMP=0, StrPot = 1, LucPot = 1, MagPot = 1;
		int EStr=0, ELuc=0, EMag=0, EHP=0, EMP=0, EcurrentHP=0, Elevel=0, EcurrentMP=0, isStop = 0;
		
		System.out.println("What is your character's name?");
		Scanner sc = new Scanner(System.in);
		String charName = sc.nextLine();
		
		if (charName.toLowerCase().equals("domingo")){
			System.out.println("Ah, Domingo to you too sir!! (Hello Hunter, I know it is you!)");
		} 
		else {
			System.out.println(charName + " is it? Intresting, a name worthy of our hero!");
		}
		
		System.out.println("Now then, what stat are you proficent in, " + charName + "?");
		boolean key = true;
		
		while (key == true){
			key = false;
			
			System.out.println("Hint: You can answer Strength, Magic, or Luck! ");
			Scanner sc1 = new Scanner(System.in);
			String StatPro = sc1.nextLine();
			
			if (StatPro.toLowerCase().equals("strength")){
				System.out.println("The warrior type, I see, protecting the weak and defenseless - crushing all evil and darkness under your blade!");
				strPro = true;
			} 
			else if(StatPro.toLowerCase().equals("magic")){
				System.out.println("Ah, yes I see the spark in your eye, you perfer the strength of magic to get you by! Blasting evil with fire and striking thunder down on those who oppose! ");
				magPro = true;
			} 
			else if(StatPro.toLowerCase().equals("luck")){
				System.out.println("The gambler, eh? You trust your dice and the power of fate to wage fights for you! You rely on tricky tatics that may not always work out to get an edge in combat!");
				lucPro = true;
			} 
			else {
				System.out.println("Hmmm, I haven't heard of that stat before...");
				key = true;
			}
		}
		
		System.out.println("Now then, lets see what you really are!");
		boolean key2 = true;
		
		while (key2 == true) {
			key2 = false;
			Str = StatRoll(strPro);
			Luc = StatRoll(lucPro);
			Mag = StatRoll(magPro);
			HP = (100 + ((Str * 3) * (Luc / 3 )));
			MP = (10 + ((Mag * 2) * (Luc / 4 )));
			currentHP = HP;
			currentMP = MP;
			
			System.out.println("----------- Stats -----------");
			System.out.println("	Health - "+ HP);
			System.out.println("	Mystic Energy - "+ MP);
			System.out.println("	Luck - " + Luc);
			System.out.println("	Strength - " + Str );
			System.out.println("	Magic Power - " + Mag);
			System.out.println("Are these stats okay?");
			
			Scanner sc2 = new Scanner(System.in);
			String YorN = sc2.nextLine();
			
			if(YorN.equalsIgnoreCase("yes")||YorN.equalsIgnoreCase("ye")||YorN.equalsIgnoreCase("y")||YorN.equalsIgnoreCase("sure")){

			}
			else {
				key2 = true;
			}
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		boolean key3 = true;
		
		while (key3 == true){
			String monster = encounter(numOfFights);
			
			if (monster.equals("Demon")){
				FinalFight = true;
			}
			
			EHP = (Fight(monster, "EHP") * newgamePlus);
			EStr = (Fight(monster, "EStr") * newgamePlus);
			ELuc = (Fight(monster, "ELuc") * newgamePlus);
			EMP = (Fight(monster, "EMP") * newgamePlus);
			EMag = (Fight(monster, "EMag") * newgamePlus);
			Elevel = (Fight(monster, "Elevel") * newgamePlus);
			EcurrentHP = EHP;
			
			System.out.println("While you are walking around a grassy field, a " + monster +" jumps out of some bushes and attacks!!");
			boolean key4 = true;
			
			while (key4 == true) {
				if (EcurrentHP <= 0) {
					System.out.println("~~~~~VICTORY~~~~~");
					
					int vicGold = (int) ((Math.random() * Elevel) + Elevel + Luc);
					int vicEXP = (int) ((Math.random() * Elevel) + Elevel + Luc);
					
					System.out.println("You defeated the "+ monster + " and found " + vicGold + " gold on the fallen enemy, and gained "+ vicEXP + " experience!");
					
					gold += vicGold;
					Exp += vicEXP;
					numOfFights++;
					key4 = false;
					key3 = true;
					
					System.out.println("You now have " + gold + " Gold pieces and " + Exp + " experience points!!");
					
					if (Exp >= TNL){
						System.out.println("Level UP!!");
						Str += statGrowth(Luc, "Strength");
						Luc += statGrowth(Luc, "Luck");
						Mag += statGrowth(Luc, "Magic Power");
						int HPval  = statGrowth(Luc, "Health");
						int MPval  = statGrowth(Luc, "Mystic Energy");
						level++;
						anyNew(level);
						HP += HPval;
						MP += MPval;
						currentHP += HPval;
						currentMP += MPval;
						Exp = 0;
						TNL += 20;
					}
					
					System.out.println("After the difficult fight, you decide to go to the town's local shop!");
					boolean key5 = true;
					
					while (key5 == true) {
						System.out.println("You currently have " + gold + " Gold. The shop currently is selling - \n Health Potion(Fully restores health!) 10 Gold \n Mana Potion(Fully restores mana) 13 Gold\n Strength Potion (Raises Strength by 1 point!) "+ ((10 + (StrPot * 5)) - ((int) (Luc / 2))) + " Gold\n Luck Potion (Raises Luck by 1 point!) "+ ((10 + (LucPot * 5)) - ((int) (Luc / 2))) + " Gold\n Mystic Power Potion (Raises Magic Power by 1 point!) "+ ((10 + (MagPot * 5)) - ((int) (Luc / 2))) + " Gold\nWhat do you want to buy (Exit to leave)");
						
						Scanner sc6 = new Scanner(System.in);
						String WTB = sc6.nextLine();
						
						if (WTB.equalsIgnoreCase("Health Potion")||WTB.equalsIgnoreCase("HP")||WTB.equalsIgnoreCase("Health")||WTB.equalsIgnoreCase("H")){
							if (gold >= 10){
								System.out.println("You immediately purchase the Health Potion and down it!");
								
								currentHP = HP;
								gold -= 10;
							} 
							else {
								System.out.println("You don't have enough Gold!!!!");
							}
						} 
						else if (WTB.equalsIgnoreCase("Mana Potion")||WTB.equalsIgnoreCase("MP")||WTB.equalsIgnoreCase("Mana")||WTB.equalsIgnoreCase("M")){
							if (gold >= 13){
								System.out.println("You immediately purchase the Mana Potion and down it!");
								
								currentMP = MP;
								gold -= 13;
							} 
							else {	
								System.out.println("You don't have enough Gold!!!!");
							}
						}
						else if (WTB.equalsIgnoreCase("Strength Potion")||WTB.equalsIgnoreCase("SP")||WTB.equalsIgnoreCase("Strength")||WTB.equalsIgnoreCase("S")){
							if (gold >= ((10 + (StrPot * 5)) - ((int) (Luc / 2)))) {
								System.out.println("You immediately purchase the Strength Potion and down it!");
								
								Str++;
								gold -= ((10 + (StrPot * 5)) - ((int) (Luc / 2)));
								StrPot++;
							} 
							else {
								System.out.println("You don't have enough Gold!!!!");
							}
						} 
						else if (WTB.equalsIgnoreCase("Luck Potion")||WTB.equalsIgnoreCase("LP")||WTB.equalsIgnoreCase("Luck")||WTB.equalsIgnoreCase("L")){
							if (gold >= ((10 + (LucPot * 5)) - ((int) (Luc / 2)))) {
								System.out.println("You immediately purchase the Luck Potion and down it!");
								
								Luc++;
								gold -= ((10 + (LucPot * 5)) - ((int) (Luc / 2)));
								LucPot++;
							} 
							else {
								System.out.println("You don't have enough Gold!!!!");
							}
						} 
						else if (WTB.equalsIgnoreCase("Mystic Power Potion")||WTB.equalsIgnoreCase("MMP")||WTB.equalsIgnoreCase("Mystic Power")||WTB.equalsIgnoreCase("Mystic")){
							if (gold >= ((10 + (MagPot * 5)) - ((int) (Luc / 2)))) {
								System.out.println("You immediately purchase the Mystic Power Potion and down it!");
								
								Mag++;
								gold -= ((10 + (MagPot * 5)) - ((int) (Luc / 2)));
								MagPot++;
							} 
							else {
								System.out.println("You don't have enough Gold!!!!");
							}
						}
						else if (WTB.equalsIgnoreCase("exit")&& FinalFight != true){
							key5 = false;
						} 
						else if (WTB.equalsIgnoreCase("exit")&& FinalFight == true){
							System.out.println("As you walk out of the shop, you take a deep breath and look around.\n The townpeople around you are chearing your name! \n \"" + charName + ", " + charName + "\" they yell out \" Thank you for ridding us of the horrible beasts of this world!\nConfused, you cock your head \" The horrible demon was the monster that locked our world in fear!\" they exclaimed! \" A hero, a hero!! You are our hero!\" \n Slowly a smile dawns on your face, and you know that you are the hero of this world!!");
							System.out.println("Thanks for playing!!!! \n\n\n");
							System.out.println("Do you want to start the newGame plus? It's this game with your same character, but a lot harder!!!");
							
							Scanner scF = new Scanner(System.in);
							String FinalChoice = scF.nextLine();
							
							if (FinalChoice.equalsIgnoreCase("Yes")||FinalChoice.equalsIgnoreCase("y")||FinalChoice.equalsIgnoreCase("Ye")||FinalChoice.equalsIgnoreCase("sure")){
								numOfFights = 1;
								newgamePlus++;
								MagPot = 0;
								StrPot = 0;
								LucPot = 0;
								FinalFight = false;
							}
						} 
						else {
							System.out.println("The shop doesn't sell that item!! (Remember, to leave, type exit)");
						}
					}
				} 
				else if (currentHP <= 0){
					System.out.println("Toothless and bleeding, you fall to you knees - your eyes flashing before your eyes. The last sight you see is the " + monster + " happily jumping up and down at rush of victory...");
					System.out.println("Game Over");
					System.exit(0);
				}
				else {
					System.out.println("Fight!! " + charName + "(HP " + HP +"/"+ currentHP + ")(MP " + MP +"/"+currentMP+ ")		VS			" + monster + "(HP "+EHP+"/"+EcurrentHP+")(MP"+ EMP +"/"+EcurrentMP+")");
					System.out.println("What do you do? (Attack, Magic, Stats)");
					
					Scanner sc3 = new Scanner(System.in);
					String Userchoice = sc3.nextLine();
					
					if (Userchoice.equalsIgnoreCase("attack")||Userchoice.equalsIgnoreCase("a")){
						int damage = (int) (((Math.random() * Str) + 4));
						EcurrentHP -= damage;
						System.out.println("You swing at the " + monster + "!! " + monster + " takes " + damage + " damage!\n\n");
						currentHP -= AI(monster,EStr, ELuc, EMag, EHP, EMP, EcurrentHP);
					} 
					else if (Userchoice.equalsIgnoreCase("magic")||Userchoice.equalsIgnoreCase("m")) {
						boolean minikey = true;
						
						while(minikey == true){
							minikey = false;
							Magic(level);
							System.out.println("Choose one to cast!");
							Scanner sc4 = new Scanner(System.in);
							String Mcast = sc4.nextLine();
							if (Mcast.equalsIgnoreCase("fireball")||Mcast.equalsIgnoreCase("f")||Mcast.equalsIgnoreCase("fb")) {
								if (currentMP >= 1){
									int damage = (int) (((Math.random() * Mag) + 4));
									currentMP -= 1;
									EcurrentHP -= damage;
									System.out.println("You hold both your hands out infront of you, and a blue ball of burning MysticFlame manifests itself within your hands!\nYou bring back your arm and throw it at the enemy - searing him for " + damage + " damage!\n\n");
									currentHP -= AI(monster,EStr, ELuc, EMag, EHP, EMP, EcurrentHP);
								} 
								else {
									System.out.println("You hold both your hands out infront of you, but nothing happens (Not enough mana, ya dumdum).");
								}
							}
							else if (Mcast.equalsIgnoreCase("lightning")||Mcast.equalsIgnoreCase("l")||Mcast.equalsIgnoreCase("ln")){
								if (level >= 2) {
									if (currentMP >= 3) {
										int damage = (int) (((Math.random() * (Mag* 2)) + 4));
										
										currentMP -= 3;
										EcurrentHP -= damage;
										System.out.println("Eyes closed, you begin to focus hard on your breathing and heart rythem...\nSuddenly, your heart begins to beat faster and faster, as if you were running...\nCRASH!! you hear a crack of thunder rain from the sky onto the " + monster + " shocking him for " + damage + " damage\n\n");
										currentHP -= AI(monster,EStr, ELuc, EMag, EHP, EMP, EcurrentHP);
									} 
									else {
										System.out.println("You close your eyes, but cannot seem to focus (Not enough mana, ya dingdong).");
									}
								} 
								else {
									System.out.println("You rack your head, but you find yourself unable to remember that spell...");
								}
							}
							else if (Mcast.equalsIgnoreCase("Heal")||Mcast.equalsIgnoreCase("h")||Mcast.equalsIgnoreCase("he")) {
								if (level >= 3){
									if (currentMP >= 5){
										if(currentHP < HP){
											int healin = (int) (((Math.random() * (Mag * 2)) + 4));
											currentMP -= 5;
											
											for (int i = healin; i >= HP; i--){
												healin = i;
											}
											
											currentHP += healin;
											System.out.println("You search your heart for hope in, what seems to be, a hopeless situation - praying to whatever forces may be out there...\nSuddenly, a continueous beam a green light falls from the sky around your body, healing you for "+healin+" Health! \n\n");
											currentHP -= AI(monster,EStr, ELuc, EMag, EHP, EMP, EcurrentHP);
										} 
										else {
											System.out.println("You lack wounds to be healed!");
										}
									}
									else {
										System.out.println("You pray, but no one responds (Not enough mana, ya silly goose).");
									}
								} 
								else {
									System.out.println("You rack your head, but you find yourself unable to remember that spell...");
								}
							}
							else if (Mcast.equalsIgnoreCase("stop")||Mcast.equalsIgnoreCase("s")||Mcast.equalsIgnoreCase("st")) {
								if (level >= 4){
									if (currentMP >= 7){
										isStop = 2;
										System.out.println("Searching your mind for the memories on time magic, you slow your breathing...\nFinally, with all the pieces of the spell compiled within your mind, you yell out a mighty warcry!!\nThe " + monster + " stops moving, as if time had stopped for him...");
										currentHP -= AI(monster,EStr, ELuc, EMag, EHP, EMP, EcurrentHP);
									} 
									else {
										System.out.println("Your too exhasted to preform a time magic spell... (Not enough mana, you FOOOOL!).");
									}
								} 
								else {
									System.out.println("You rack your head, but you find yourself unable to remember that spell...");
								}
							} 
							else if (Mcast.equalsIgnoreCase("finish")||Mcast.equalsIgnoreCase("fi")||Mcast.equalsIgnoreCase("fin")){
								if (level >= 5){
									if (currentMP >= 20) {
										EcurrentHP = 0;
										System.out.println("Your heart beats heavy as you fill it to the brim with pure haterid for the " + monster + ".\nYou mutter multiple curse words as you stare the at the " + monster + "'s stupid face.\nFinally, unable to fill yourself with any more hate, you scream as loud as you can - thousands of shadows spew out from your mouth...\nThe shadows surround the " + monster + ", and, for a moment, you almost feel sorry for it.\nAt last, the shadows dissapear, leaving behind only the bones of the " + monster);
									} 
									else {
										System.out.println("You callapse to your knees, this spell places too much stress on your body... (Not enough mana, ya stupid).");
									}
								} 
								else {
									System.out.println("You rack your head, but you find yourself unable to remember that spell...");
								}
							} 
							else if (Mcast.equalsIgnoreCase("exit")){
								minikey = false;
							} 
							else {
								System.out.println("Bad command, please re-enter! \n(if you want to go back to the main battle menu, type exit!)");
								minikey = true;
							}
						}
					} 
					else if(Userchoice.equalsIgnoreCase("stat")||Userchoice.equalsIgnoreCase("stats")||Userchoice.equalsIgnoreCase("s")) {
						System.out.println("----------- Your Stats -----------");
						System.out.println("	Health - "+ HP);
						System.out.println("	Mystic Energy - "+ MP);
						System.out.println("	Luck - " + Luc);
						System.out.println("	Strength - " + Str );
						System.out.println("	Magic Power - " + Mag + "\n\n");
						System.out.println("----------- "+monster+"'s Stats -----------");
						System.out.println("	Health - "+ EHP);
						System.out.println("	Mystic Energy - "+ EMP);
						System.out.println("	Luck - " + ELuc);
						System.out.println("	Strength - " + EStr );
						System.out.println("	Magic Power - " + EMag);
					}
					else if(Userchoice.equalsIgnoreCase("t")||Userchoice.equalsIgnoreCase("tricks")){
						System.out.println("Tricks (choose one) - Back attack, Rest, End, Steal (money)");
						System.out.println("Choose one to attempt!");
						
						Scanner sc5 = new Scanner(System.in);
						String Tricks = sc5.nextLine();
					}
				}
			}
		}
	}
}