import java.util.Scanner;
class CareerPathFinder
{		
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("\t\t*****************************");
		System.out.println("\t\tWelcome To Career Path Finder");
		System.out.println("\t\t*****************************");
		System.out.println("\tCongragulations on completing 10th, Further options after 10th are.");
		
		
		System.out.println("\n1. Engineering Diploma");
		System.out.println("2. L.I.C Agent");
		System.out.println("3. Army Navy Air force(Defense)Police Dept Exam");
		System.out.println("4. Fine Arts/Commercial Art Diploma");
		System.out.println("5. Art Teacher Diploma");
		System.out.println("6. ITI");
		System.out.println("7. Railway T.C");
		System.out.println("8. 12th(H.S.C)");
		System.out.println("9. Bank Insurance/ Clerical Exam");
		System.out.println("10. Other govt clerical exam");
		System.out.println("11. Diploma in Dance/ Music");
		System.out.println("12. Certified Building Supervisor");
		System.out.println("13. Diploma in farm management(Animal Husbandry)");
		System.out.println("14. M.L.T");
		System.out.println("15. Various Diploma Courses");
		System.out.println("16. MS-CIT Cuorse");
		
		System.out.print("\n\t\tSelect choice for further study :");
		int ssc = keyboard.nextInt();
		
		if(ssc == 1)
		{
			System.out.println("\nGood Choice,Engineering Diploma has further option");
			System.out.println("\t\ta. govt contractor (Civil/Elevtronic)");
			System.out.println("\t\tb. Degree Engineering (B.E)");
			System.out.println("\t\tc. (A.M.I.E)/(I.E.T.E)");
			System.out.println("\t\td. R.T.O Inspector Exam");
			System.out.println("\t\te. Merchant Navy");
			
			System.out.print("\n\t\tSelect OPtion : ");
			char diploma = keyboard.next().charAt(0);
			if(diploma == 'a')
			{
				System.out.println("Congragulation,for selecting : a. govt contractor (Civil/Elevtronic)");
			}
			else if(diploma == 'b')
			{
				System.out.println("\t\tCongragulation,for selecting :b. Degree Engineering (B.E)");
			}
			else if(diploma == 'c')
			{
				System.out.println("\n\tCongragulation,for selecting :c. (A.M.I.E)/(I.E.T.E)" );
				System.out.println("\tFurther study you can do after this is [ MPSC/UPSC(Exam)]");
			}
			else if(diploma == 'd')
			{
				System.out.println("\t\tCongragulation,for selecting :d. R.T.O Inspector Exam");
			}
			else if(diploma == 'e')
			{
				System.out.println("\t\tCongragulation,for selecting :e. Merchant Navy");
			}
			else
			{
				System.out.println("Invalid choice!!!!!");
			}				
		}
		
		
		else if(ssc == 2)
		{
			System.out.println("\nGood Choice, L.I.C Agent");	
		}
		
		
		else if(ssc == 3)
		{
			System.out.println("\nGood Choice, Army Navy Air force(Defense)Police Dept Exam");
			System.out.println("\n\tFurther you can do after this is \n\t\ta.Police Constable\n\t\tb.Airmen\n\t\tc.Navik\n\t\td.Solider");
			
			System.out.print("\n\tSelect any one option : ");
			char army = keyboard.next().charAt(0);
			if(army == 'a')
			{
				System.out.println("\nGood Choice, a.Police Constable");
			}
			else if(army == 'b')
			{
				System.out.println("\nGood Choice, b.Airmen");
			}	
			else if(army == 'c')
			{
				System.out.println("\nGood Choice, tc.Navik");
			}	
			else if(army == 'd')
			{
				System.out.println("\nGood Choice, d.Solider");
			}	
			else
			{
				System.out.println("Invalid Choice!!!!!");
			}
			
		}
		
		
		else if(ssc == 4)
		{
			System.out.println("\nGood Choice, Fine Arts/Commercial Art Diploma");	
		}
		
		
		else if(ssc == 5)
		{
			System.out.println("\nGood Choice, Art Teacher Diploma");	
		}
		
		
		else if(ssc == 6)
		{
		System.out.println("\nGood Choice, ITI");			
		}
		
		
		else if(ssc == 7)
		{
		System.out.println("\nGood Choice, Railway T.C");			
		}
		
		
		else if(ssc == 8)
		{
			System.out.println("\nGood Choice, 12th(H.S.C), Has further choice select any one carefully\n");
			System.out.println("\t1. 12th Commerce");
			System.out.println("\t2. Diploma in Travel & Tourism");
			System.out.println("\t3. (D.M.L.T.)");
			System.out.println("\t4. L.I.C. Agent");
			System.out.println("\t5. Hotel Management Diploma");
			System.out.println("\t6. 12th Science");
			System.out.println("\t7. Student Pilot Licence");
			System.out.println("\t8. 12th Arts ");
			
			
			System.out.print("\n\t\tSelect your choice : ");
			int hsc = keyboard.nextInt();
			if(hsc == 1)
			{
				System.out.println("\nGood Choice, 1. 12th Commerce , it has further choice\n");
				System.out.println("\ta. C.A Foundation");
				System.out.println("\tb. B.Com");
				System.out.println("\tc. B.B.A");
				System.out.println("\td. C.S.Foundation");
				System.out.println("\te. B.C.A.(12th with Maths,English)");
				System.out.println("\tf. B.Arch.");
				System.out.println("\tg. D.Ed");
				System.out.println("\th. Call Center");
				
				System.out.print("\n\t\tSelect you choice :");
				char cmm = keyboard.next().charAt(0);
				if(cmm == 'a')
				{
					System.out.println("\nGood Choice, a. C.A Foundation");
				}
				else if(cmm == 'b')
				{
					System.out.println("\nGood Choice, b. B.Com , it has further choice \n");
					System.out.println("\ta. M.B.A");
					System.out.println("\tb. Bank / Insurance Probationary / Development Officer Exam");
					System.out.println("\tc. L.L.B.");
					System.out.println("\td. C.A.");
					System.out.println("\te. B.Ed.");
					System.out.println("\tf. I.C.W.A.");
					System.out.println("\tg. Bachlor in Library Science");
					System.out.println("\th. C.S.");
					System.out.println("\ti. Import Export Diploma");
					System.out.println("\tj. M.C.A.");
					System.out.println("\tk. M.C.M.");
					System.out.println("\tl. MPSC / UPSC (Exam)");
					System.out.println("\tm. Computer Course (Tally)");
					System.out.println("\tn. Indian Military Academy");
					
					
					System.out.print("\n\t\tSelect you choice :");
					char bcom = keyboard.next().charAt(0);
					
					if(bcom == 'a')
					{
						System.out.println("\nGood Choice, a. M.B.A");
						System.out.println("\n\tFurther you can do after this is [Manager / Bussinessman]");
					}
					else if (bcom == 'b')
					{
						System.out.println("\nGood Choice, b. Bank / Insurance Probationary / Development Officer Exam");
					}
					else if (bcom == 'c')
					{
						System.out.println("\nGood Choice, c. L.L.B.");
						System.out.println("\n\tFurther you can do after this is [ L.L.M.]");
					}
					else if (bcom == 'd')
					{
						System.out.println("\nGood Choice, d. C.A.");
					}
					else if (bcom == 'e')
					{
						System.out.println("\nGood Choice, e. B.Ed.");
						System.out.println("\n\tFurther you can do after this is [ M.Ed.]");
						System.out.println("\n\tAnd then [ Teacher]");
					}
					else if (bcom == 'f')
					{
						System.out.println("\nGood Choice, f. I.C.W.A.");
					}
					else if (bcom == 'g')
					{
						System.out.println("\nGood Choice, g. Bachlor in Library Science");
						System.out.println("\n\tFurther you can do after this is [ Librarian]");
					}
					else if (bcom == 'h')
					{
						System.out.println("\nGood Choice, h. C.S.");
					}
					else if (bcom == 'i')
					{
						System.out.println("\nGood Choice, i. Import Export Diploma");
					}
					else if (bcom == 'j')
					{
						System.out.println("\nGood Choice, j. M.C.A.");
						System.out.println("\n\tFurther you can do after this is [ Software Job]");
					}
					else if (bcom == 'k')
					{
						System.out.println("\nGood Choice, k. M.C.M.");
						System.out.println("\n\tFurther you can do after this is [ Software Job]");
					}
					else if (bcom == 'l')
					{
						System.out.println("\nGood Choice, l. MPSC / UPSC (Exam)");
						System.out.println("\n\tFurther you can do after this is [ I.A.S / Class-1 Officer]");
					}
					else if (bcom == 'm')
					{
						System.out.println("\nGood Choice, m. Computer Course (Tally)");
					}
					else if (bcom == 'n')
					{
						System.out.println("\nGood Choice, n. Indian Military Academy");
					}else
					{
						System.out.println("\nInvalid Choice!!!!!");
					}	
				}				
				else if(cmm == 'c')
				{
					System.out.println("\nGood Choice, c. B.B.A");
					System.out.println("\n\tFurther you can do after this is [M.B.A]");
				}				
				else if(cmm == 'd')
				{
					System.out.println("\nGood Choice, d. C.S.Foundation");
				}				
				else if(cmm == 'e')
				{
					System.out.println("\nGood Choice, e. B.C.A.(12th with Maths,English)");
				}				
				else if(cmm == 'f')
				{
					System.out.println("\nGood Choice, f. B.Arch.");
				}				
				
				else if(cmm == 'g')
				{
					System.out.println("\nGood Choice, g. D.Ed");
				}				
				else if(cmm == 'h')
				{
				System.out.println("\nGood Choice, h. Call Center");
				}				
				else 
				{
					System.out.println("\nInvalid Choice!!!!!");
				}	
			}
			else if(hsc == 2)
			{
				System.out.println("\nGood Choice, 2. Diploma in Travel & Tourism");
			}
			else if(hsc == 3)
			{
				System.out.println("\nGood Choice, 3. (D.M.L.T.)");
			}
			else if(hsc == 4)
			{
				System.out.println("\nGood Choice, 4. L.I.C. Agent");
			}
			else if(hsc == 5)
			{
				System.out.println("\nGood Choice, 5. Hotel Management Diploma");
				System.out.println("\n\tFurther you can do after this is [ Air Hostests / Flight Steward]");
				
			}
			else if(hsc == 6)
			{
				System.out.println("\nGood Choice, 6. 12th Science , you have further choice in this\n");
				System.out.println("a. With PCMB");
				System.out.println("b. With PCM");
				System.out.println("c. WIth PCB");
				System.out.println("d. D.Ed.");
				
				System.out.print("\n\tSelect any one option : ");
				char sci = keyboard.next().charAt(0);
				
				if(sci == 'a')
				{
					System.out.println("\nGood Choice,  a. With PCMB, it has further choice\n");
					System.out.println("1. B.Sc. in Diary Technology");
					System.out.println("2. Bachelor of Pharmacy");
					System.out.println("3. B.Tech. in Agriculture");
					System.out.println("4. B.Sc.Bio-Technology");
					System.out.println("5. B.Sc. in Agriculture");
					
					System.out.print("\n\tSelect any one option : ");
					int pcmb = keyboard.nextInt();
					
					if(pcmb == 1)
					{
						System.out.println("\nGood Choice, 1. B.Sc. in Diary Technology");
						System.out.println("\n\tFurther you can do after this is [ M.B.A. ]");
					}
					else if(pcmb == 2)
					{
						System.out.println("\nGood Choice, 2. Bachelor of Pharmacy , further you can do after this is\n");
						System.out.println("\t\ta. M.B.A.");
						System.out.println("\t\tb. Master in Pharmacy");
						
						System.out.print("\n\tSelect any one option : ");
						char bop = keyboard.next().charAt(0);
						
						if(bop == 'a')
						{
							System.out.println("\nGood Choice, a. M.B.A.");
						}
						else if (bop == 'b')
						{
							System.out.println("\nGood Choice, b. Master in Pharmacy");
						}
						
						else
						{
							System.out.println("\nInvalid Choice!!!! ");
						}
					}
					else if(pcmb == 3)
					{
						System.out.println("\nGood Choice, 3. B.Tech. in Agriculture , further you can do after this is\n");
						System.out.println("\t\ta. M.B.A.");
						System.out.println("\t\tb. M.Tech in Agriculture");
						
						System.out.print("\n\tSelect any one option : ");
						char bta = keyboard.next().charAt(0);
						
						if(bta == 'a')
						{
							System.out.println("\nGood Choice, a. M.B.A.");
						}
						else if (bta == 'b')
						{
							System.out.println("\nGood Choice, b. M.Tech in Agriculture");
						}
						
						else
						{
							System.out.println("\nInvalid Choice!!!! ");
						}
						
					}
					else if(pcmb == 4)
					{
						System.out.println("\nGood Choice, 4. B.Sc.Bio-Technology , further you can do after this is\n");
						System.out.println("\nGood Choice, a. M.B.A.");
						System.out.println("\nGood Choice, b. M.Sc. Bio-Technology");
						
						System.out.print("\n\tSelect any one option : ");
						char bbt = keyboard.next().charAt(0);
						
						if(bbt == 'a')
						{
							System.out.println("\nGood Choice, a. M.B.A.");
						}
						else if (bbt == 'b')
						{
							System.out.println("\nGood Choice, b. M.Sc. Bio-Technology");
						}
						
						else
						{
							System.out.println("\nInvalid Choice!!!! ");
						}
					}
					else if(pcmb == 5)
					{
						System.out.println("\nGood Choice, 5. B.Sc. in Agriculture , further you can do after this is\n");
						System.out.println("\t\ta. M.B.A.");
						System.out.println("\t\tb. M.Sc. Animal Husbandry / Diary Technology");
						
						System.out.print("\n\tSelect any one option : ");
						char bia = keyboard.next().charAt(0);
						
						if(bia == 'a')
						{
							System.out.println("\nGood Choice, a. M.B.A.");
						}
						else if (bia == 'b')
						{
							System.out.println("\nGood Choice, b. M.Sc. Animal Husbandry / Diary Technology");
						}
						else
						{
							System.out.println("\nInvalid Choice!!!! ");
						}
					}
					else 
					{
						System.out.println("\nInvalid Choice!!!! ");
					}
				}
				else if(sci == 'b')
				{
					System.out.println("\nGood Choice, b. With PCM, further you can do after this is\n");
					System.out.println("1. N.D.A");
					System.out.println("2. B.Arch");
					System.out.println("3. Bachelor of Planning & Design");
					System.out.println("4. Technical entry in Indian Army");
					System.out.println("5. B.E");
					System.out.println("6. B.Tech");
					System.out.println("7. Direct 2nd year engg Diploma");
					System.out.println("8. B.C.S/B.C.A(Phy)");
					System.out.println("9. (FTII)");
					System.out.println("10. Hoetl Management Degree");
					
					
					System.out.print("\n\tSelect any one option : ");
					int math = keyboard.nextInt();
					
					if(math == 1)
					{
						System.out.println("\nGood Choice,  1. N.D.A , further you can do after this is\n");
						System.out.println("a. Navy");
						System.out.println("b. Army");
						System.out.println("c. Airforce");
						
						System.out.print("\n\tSelect any one option : ");
						char nda = keyboard.next().charAt(0);
						
						if(nda == 'a')
						{
							System.out.println("\nGood Choice, a. Navy");
						}
						else if(nda == 'b')
						{
							System.out.println("\nGood Choice, b. Army");
						}
						else if(nda == 'c')
						{
							System.out.println("\nGood Choice, c. Airforce");
						}
						else
						{
							System.out.println("\nInvalid Choice!!!! ");
						}
					}
					else if(math == 2)
					{
						System.out.println("\nGood Choice, 2. B.Arch");
						System.out.println("\n\tFurther you can do after this is [ Diploma in Interior/Landscape Design ]");
					}
					else if(math == 3)
					{
						System.out.println("\nGood Choice, 3. Bachelor of Planning & Design");
					}
					else if(math == 4)
					{
						System.out.println("\nGood Choice, 4. Technical entry in Indian Army");
					}
					else if(math == 5)
					{
						System.out.println("\nGood Choice, 5. B.E, further you can do after this is\n");
						System.out.println("1. I.E.S.Exam");
						System.out.println("2. Merchant Navy");
						System.out.println("3. M.E.");
						System.out.println("4. MPSC/UPSC Exam");
						System.out.println("5. Defence Direct Entry");
						System.out.println("6. M.S.");
						System.out.println("7. M.B.A.");
						System.out.println("8. M.Tech");
						System.out.println("9. Govt COntractor(Civil/Electrical)");
						
						
						System.out.print("\n\tSelect any one option : ");
						int be = keyboard.nextInt();
						
						if(be == 1)
						{
							System.out.println("\nGood Choice, 1. I.E.S.Exam , further you can do after this is\n");
							System.out.println("\ta.Job in Railway");
							System.out.println("\tb.Job in Public Sector Company");
							
							System.out.print("\n\tSelect any one option : ");
							char ies = keyboard.next().charAt(0);
							
							if(ies == 'a')
							{
								System.out.println("\nGood Choice, a.Job in Railway");
							}
							else if(ies == 'b')
							{
								System.out.println("\nGood Choice, b.Job in Public Sector Company");
							}
							else 
							{
								System.out.println("\nInvalid Choice!!!! ");
							}
						}
						else if(be == 2)
						{
							System.out.println("\nGood Choice, 2. Merchant Navy");
							System.out.println("\n\tFurther you can do after this is [ Marine ENgineer ]");
						}
						else if(be == 3)
						{
							System.out.println("\nGood Choice, 3. M.E.,  further you can do after this is\n");
							System.out.println("\ta. Engineer");
							System.out.println("\tb. Teacher");
							
							System.out.print("\n\tSelect any one option : ");
							char me = keyboard.next().charAt(0);
							
							if(me == 'a')
							{
								System.out.println("\nGood Choice, a. Engineer");
							}
							else if(me == 'b')
							{
								System.out.println("\nGood Choice, b. Teacher");
							}
							else
							{
								System.out.println("\nInvalid Choice!!!! ");
							}
							
							
						}
						else if(be == 4)
						{
							System.out.println("\nGood Choice, 4. MPSC/UPSC Exam");
							System.out.println("\n\tFurther you can do after this is [ I.A.S.Officer ]");
						}
						else if(be == 5)
						{
							System.out.println("\nGood Choice, 5. Defence Direct Entry ,  further you can do after this is\n");
							System.out.println("\ta. Indianm Navy");
							System.out.println("\tb. Airforce");
							
							System.out.print("\n\tSelect any one option : ");
							char dde = keyboard.next().charAt(0);
							
							if(dde == 'a')
							{
								System.out.println("\nGood Choice, a. Indianm Navy");
							}
							else if(dde == 'b')
							{
								System.out.println("\nGood Choice, b. Airforce");
							}
							else
							{
								System.out.println("\nInvalid Choice!!!! ");
							}
						}
						else if(be == 6)
						{
							System.out.println("\nGood Choice, 6. M.S.");
						}
						else if(be == 7)
						{
							System.out.println("\nGood Choice, 7. M.B.A.");
						}
						else if(be == 8)
						{
							System.out.println("\nGood Choice, 8. M.Tech");
						}
						else if(be == 9)
						{
							System.out.println("\nGood Choice, 9. Govt COntractor(Civil/Electrical)");
						}
						else 
						{
							
						}	
					}
					else if(math == 6)
					{
						System.out.println("\nGood Choice, 6. B.Tech");
					}
					else if(math == 7)
					{
						System.out.println("\nGood Choice, 7. Direct 2nd year engg Diploma");
					}
					else if(math == 8)
					{
						System.out.println("\nGood Choice, 8. B.C.S/B.C.A(Phy), further you can do after this is\n");
						System.out.println("a. M.C.A.");
						System.out.println("b. M.C.S.");
						
						System.out.print("\n\tSelect any one option : ");
						char bcs = keyboard.next().charAt(0);
						
						if(bcs == 'a')
						{
							System.out.println("\nGood Choice,  a. M.C.A.");
						}
						else if(bcs == 'b')
						{
							System.out.println("\nGood Choice, b. M.C.S.");
							System.out.println("\n\tFurther you can do after this is [ M.C.M ]");
							System.out.println("\n\t Then M.B.A.");
						}
						else
						{
							System.out.println("\nInvalid Choice!!!! ");
						}
					}
					else if(math == 9)
					{
						System.out.println("\nGood Choice, 9. (FTII)");
						System.out.println("\n\tFurther you can do after this is [ job in film / TV Channels ]");
					}
					else if(math == 10)
					{
						System.out.println("\nGood Choice, 10. Hoetl Management Degree");
					}
					else
					{
						System.out.println("\nInvalid Choice!!!! ");
					}
				}
				else if(sci == 'c')
				{
					System.out.println("\nGood Choice, c. WIth PCB , further you can do after this is\n");
					System.out.println(" 1. B.A.M.S.");
					System.out.println(" 2. B.H.M.S.");
					System.out.println(" 3. B.V.Sc");
					System.out.println(" 4. B.D.S.");
					System.out.println(" 5. M.B.B.S.");
					System.out.println(" 6. Paramedical Courses");
					System.out.println(" 7. B.Sc Nursing");
					System.out.println(" 8. Diploma in Nursing");
					System.out.println(" 9. B.M.L.T.");
					System.out.println(" 10. B.Sc Home Science");
					System.out.println(" 11. B.Sc.(Botnay, Micro Biology, Zoology, Chemistry etc.)");
					
					
					System.out.print("\n\tSelect any one option : ");
					int medical = keyboard.nextInt();
					
					if(medical == 1)
					{
						System.out.println("\nGood Choice,  1. B.A.M.S.");
						System.out.println("\n\tFurther you can do after this is [ M.D. ]");
					}
					else if(medical == 2)
					{
						System.out.println("\nGood Choice,  2. B.H.M.S.");
					}
					else if(medical == 3)
					{
						System.out.println("\nGood Choice,  3. B.V.Sc");
					}
					else if(medical == 4)
					{
						System.out.println("\nGood Choice,  4. B.D.S.");
						System.out.println("\n\tFurther you can do after this is [ M.D.S ]");
					}
					else if(medical == 5)
					{
						System.out.println("\nGood Choice,  5. M.B.B.S. , further you can do after this is\n");
						System.out.println("\t a. M.D.");
						System.out.println("\t b. Special Diploma");
						System.out.println("\t c. M.S.");
						
						System.out.print("\n\tSelect any one option : ");
						char mmbs = keyboard.next().charAt(0);
						
						if(mmbs == 'a')
						{
							System.out.println("\nGood Choice,  a. M.D.");
						}
						else if(mmbs == 'b')
						{
							System.out.println("\nGood Choice,  b. Special Diploma");
						}
						else if(mmbs == 'c')
						{
							System.out.println("\nGood Choice,  c. M.S.");
						}
						else
						{
							System.out.println("\nInvalid Choice!!!! ");
						}	
					}
					else if(medical == 6)
					{
						System.out.println("\nGood Choice,  6. Paramedical Courses");
					}
					else if(medical == 7)
					{
						System.out.println("\nGood Choice,  7. B.Sc Nursing");
					}
					else if(medical == 8)
					{
						System.out.println("\nGood Choice,  8. Diploma in Nursing");
					}
					else if(medical == 9)
					{
						System.out.println("\nGood Choice,  9. B.M.L.T.");
					}
					else if(medical == 10)
					{
						System.out.println("\nGood Choice,  10. B.Sc Home Science");
					}
					else if(medical == 11)
					{
						System.out.println("\nGood Choice,  11. B.Sc.(Botnay, Micro Biology, Zoology, Chemistry etc.) , further you can do after this is\n");
						System.out.println("a. M.Sc.");
						System.out.println("b. M.Sc.(Bio-Tech)");
						
						
						System.out.print("\n\tSelect any one option : ");
						char bmzc = keyboard.next().charAt(0);
						
						if(bmzc == 'a')
						{
							System.out.println("\nGood Choice,  a. M.Sc.");
							System.out.println("\n\tFurther you can do after this is [ M.Phil ]");
							System.out.println("\n\tThen Ph.D.");
							
						}
						else if(bmzc == 'b')
						{
							System.out.println("\nGood Choice,  a. M.Sc.(Bio-Tech)");
							System.out.println("\n\tFurther you can do after this is [ M.Tech( bio-Tech)]");
						}
						else
						{
							System.out.println("\nInvalid Choice!!!! ");
							
						}
					}
					else
					{
						System.out.println("\nInvalid Choice!!!! ");
					}			
				}
				else if(sci == 'd')
				{
					System.out.println("\nGood Choice, d. D.Ed.");
				}
				else
				{
					System.out.println("\nInvalid Choice!!!! ");
				}
			}
			else if(hsc == 7)
			{
				System.out.println("\nGood Choice, 7. Student Pilot Licence");
				System.out.println("\n\tFurther you can do after this is \n\tprofessional Pilot Licence");
				System.out.println("\tAnd then Commercial Pilot Licence");
				
			}
			else if(hsc == 8)
			{
				System.out.println("\nGood Choice, 8. 12th Arts , it has further choice\n");
				System.out.println("1. D.Ed.");
				System.out.println("2. B.S.W.");
				System.out.println("3. L.L.B.Foundation");
				System.out.println("4. Fashion Designing");
				System.out.println("5. Interior Designing Diploma");
				System.out.println("6. B.A.");
				System.out.println("7. B.B.A.");
				System.out.println("8. Foreign Language Diploma");
				System.out.println("9. Call Center Job");
				System.out.println("10. B.Arch.(12th with MAths, English)");
				
				
				System.out.print("\n\t\tSelect your choice : ");
				int art = keyboard.nextInt();
				
				if(art == 1)
				{
					System.out.println("\nGood Choice, 1. D.Ed.");
					System.out.println("\n\tFurther you can do after this is [ Teacher ]");
				}
				else if(art == 2)
				{
					System.out.println("\nGood Choice, 2. B.S.W.");
					System.out.println("\n\tFurther you can do after this is [ M.S.W. ]");
				}
				else if(art == 3)
				{
					System.out.println("\nGood Choice, 3. L.L.B.Foundation , it has further 3 choice");
					System.out.println("\t1. D.T.L.");
					System.out.println("\t2. D.L.L.");
					System.out.println("\t3. L.L.M.");
					
					
					System.out.print("\n\t\tSelect any one : ");
					int llb = keyboard.nextInt();
					if(llb == 1)
					{
						System.out.println("\nGood Choice, 1. D.T.L.");
					}
					else if(llb == 2)
					{
						System.out.println("\nGood Choice, 2. D.L.L.");
					}
					else if(llb == 3)
					{
						System.out.println("\nGood Choice, 3. L.L.M.");
					}
					else
					{
						System.out.println("\nInvalid Choice!!!! ");
					}
					
				}
				else if(art == 4)
				{
					System.out.println("\nGood Choice, 4. Fashion Designing");
				}
				else if(art == 5)
				{
					System.out.println("\nGood Choice, 5. Interior Designing Diploma");
				}
				else if(art == 6)
				{
					System.out.println("\nGood Choice, 6. B.A. , it has further choice \n");
					System.out.println("a. B.P.Ed.");
					System.out.println("b. M.A.");
					System.out.println("c. M.A.in Mass Communication");
					System.out.println("d. Bachelor of Journalism");
					System.out.println("e. L.L.B.");
					System.out.println("f. Bachelor of Library Science");
					System.out.println("g. M.B.A.");
					System.out.println("h. MPSC / UPSC Exam");
					System.out.println("i. (NSD)");
					System.out.println("j. M.C.A.");
					System.out.println("k. M.C.M");
					System.out.println("l. B.Ed.");
					System.out.println("m. Advertising & commercial management Diploma");
					System.out.println("n. Event Management Diploma");
					System.out.println("o. Sub Inspector Exam for BSF/CRPF/CISF");
					
					
					System.out.print("\n\tSelect any one option : ");
					char ba = keyboard.next().charAt(0);
					
					if(ba == 'a')
					{
						System.out.println("\nGood Choice, a. B.P.Ed.");
						System.out.println("\n\tFurther you can do after this is [ P.T.Teacher ]");
					}
					else if(ba == 'b')
					{
						System.out.println("\nGood Choice, b. M.A.");
					}
					else if(ba == 'c')
					{
						System.out.println("\nGood Choice, c. M.A.in Mass Communication");
					}
					else if(ba == 'd')
					{
						System.out.println("\nGood Choice, d. Bachelor of Journalism");
					}
					else if(ba == 'e')
					{
						System.out.println("\nGood Choice, e. L.L.B.");
						System.out.println("\n\tFurther you can do after this is [ L.L.M. ]");
					}
					else if(ba == 'f')
					{
						System.out.println("\nGood Choice, f. Bachelor of Library Science");
					}
					else if(ba == 'g')
					{
						System.out.println("\nGood Choice, g. M.B.A.");
					}
					else if(ba == 'h')
					{
						System.out.println("\nGood Choice, h. MPSC / UPSC Exam");
						System.out.println("\n\tFurther you can do after this is [ I.A.S.Officer ]");
					}
					else if(ba == 'i')
					{
						System.out.println("\nGood Choice, i. (NSD)");
						System.out.println("\n\tFurther you can do after this is [ Acting in Films/Plays ]");
					}
					else if(ba == 'j')
					{
						System.out.println("\nGood Choice, j. M.C.A.");
						System.out.println("\n\tFurther you can do after this is [ Software Job ]");
					}
					else if(ba == 'k')
					{
						System.out.println("\nGood Choice, k. M.C.M");
						System.out.println("\n\tFurther you can do after this is [ Software Job ]");
					}
					else if(ba == 'l')
					{
						System.out.println("\nGood Choice, l. B.Ed.");
						System.out.println("\n\tFurther you can do after this is [ M.Ed. ]");
					}
					else if(ba == 'm')
					{
						System.out.println("\nGood Choice, m. Advertising & commercial management Diploma");
					}
					else if(ba == 'n')
					{
						System.out.println("\nGood Choice, n. Event Management Diploma");
					}
					else if(ba == 'o')
					{
						System.out.println("\nGood Choice, o. Sub Inspector Exam for BSF/CRPF/CISF");
					}
					else
					{
						System.out.println("\nInvalid Choice!!!!!");
					}	
				}
				else if(art == 7)
				{
					System.out.println("\nGood Choice, 7. B.B.A.");
					System.out.println("\n\tFurther study you can do after this is [M.B.A.]");
									System.out.println("\tAnd then [Manager / Bussinessman]");
				}
				else if(art == 8)
				{
					System.out.println("\nGood Choice, \nGood Choice, 8. Foreign Language Diploma");
				}
				else if(art == 9)
				{
					System.out.println("\nGood Choice, 9. Call Center Job");
				}
				else if(art == 10)
				{
					System.out.println("\nGood Choice, 10. B.Arch.(12th with MAths, English)");
				}
				else
				{
					System.out.println("\nInvalid Choice!!!! ");
				}
			}
			else
			{
				System.out.println("\nInvalid Choice!!!! ");
			}
		}
		
		else if(ssc == 9)
		{
			System.out.println("\nGood Choice, Bank Insurance/ Clerical Exam");
			
		}
		
		else if(ssc == 10)
		{
			System.out.println("\nGood Choice, Other govt clerical exam");
			System.out.println("\n\tFurther study you can do after this is [Govt Clerk]");	
		}
		
		else if(ssc == 11)
		{
			System.out.println("\nGood Choice, Diploma in Dance/ Music");
		}
		
		else if(ssc == 12)
		{
			System.out.println("\nGood Choice, Certified Building Supervisor");	
		}
		
		
		else if(ssc == 13)
		{
			System.out.println("\nGood Choice, Diploma in farm management(Animal Husbandry)");	
		}
		
		
		else if(ssc == 14)
		{
			System.out.println("\nGood Choice, M.L.T");	
		}
		
		
		else if(ssc == 15)
		{
			System.out.println("\nGood Choice, Various Diploma Courses");
			System.out.println("\n\tFurther study you can do after this is  \n\n a.Interior Design \n b.Stenography \n c.Private Secretary Practice \n d.Beauty Culture & Hair Dressing \n e.Garment Technology");
			System.out.print("\n Select any option carefylly : ");
			char vds = keyboard.next().charAt(0);
			if(vds == 'a')
			{
				System.out.println("\nGood Choice, a.Interior Design");
			}
			else if(vds == 'b')
			{
				System.out.println("\nGood Choice, b.Stenography");
			}
			else if(vds == 'c')
			{
				System.out.println("\nGood Choice, c.Private Secretary Practice");
			}
			else if(vds == 'd')
			{
				System.out.println("\nGood Choice, d.Beauty Culture & Hair Dressing");
			}
			else if(vds == 'e')
			{
				System.out.println("\nGood Choice, e.Garment Technology");
			}
			else
			{
				System.out.println("Invalid Chpoice!!!!!");
			}
			
		}
		else if(ssc == 16)
		{
			System.out.println("\nGood Choice, MS-CIT Cuorse");
			System.out.println("\n\tFurther study you can do after this is [Data Entry Operator]");	
		}
		
		else
		{
			System.out.println("\nInvalid Choice!!!!!");
		}
	}	
}