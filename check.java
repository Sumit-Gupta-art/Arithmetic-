import java.util.Scanner;
class check 
{
	public static void main(String[] args)
 	{

System.out.println();
System.out.println();
System.out.println();
           System.out.println("-------------------------------------------Arithmetic Game-----------------------------------------");
System.out.println();
         
	   Scanner userInput=new Scanner(System.in);
	   do
     	    {
	      System.out.println("Do you want to play Y/N:");
              char toPlay=userInput.next().charAt(0);
	      if(toPlay!='Y')
		{
		  System.out.println("Game Exited!!!");
                  System.exit(0);
		}
	      System.out.println("PRESS E FOR EASY");
System.out.println();
              System.out.println("PRESS M FOR MEDIUM");
System.out.println();
              System.out.println("PRESS H FOR HARD");
System.out.println();
              System.out.println("SELECT THE MODE YOU WANT TO PLAY: ");
System.out.println();
              char gameMode=userInput.next().charAt(0);
              switch(gameMode)
                    {
                       case 'E':
                       System.out.println("Mode Easy");
System.out.println();
                       System.out.println("ARITHMETIC OPERATION CAN BE PERFORM || '+' || '-' || '*' || ");
System.out.println();
                       System.out.println("Select the Arithmetic operation you want to perform:");
System.out.println();
                       char operation=userInput.next().charAt(0);
                       
                          /*
                           NEED TO CHECK BEFORE EXECUTING
                           if(operation!= '+' || operation!='-' || operation!='*')
                           {
                             System.out.println("Their is no operation on it sorry:"+operation);
                             break;
                           }*/

                       
                       switch(operation)
                             {
                              case '+':
                      System.out.println("Enter the values of operand of length of 2 character");
System.out.println();
                       System.out.println();
 		       System.out.println("Enter the value of operand1: ");
		       byte operand1=userInput.nextByte();
                       System.out.println("The value of operand1 is:"+operand1);
System.out.println();
 		       System.out.println("Enter the value of operand2: ");
                       byte operand2=userInput.nextByte();
                       System.out.println("The value of operand2 is :"+operand2);
System.out.println();
                       int Add=operand1+operand2;
                       
                       System.out.println("What will be value of"+operand1+ " + " +operand2);
System.out.println();
                       System.out.println("Guess the value:");
                       int guessValue=userInput.nextInt();
                       if(Add==guessValue)
                              {
                               System.out.println("YOU SEEM TO GOOD AT THIS");
System.out.println();
                               System.out.println("THE ANSWER IS ABSOLUTELY CORRECT WHICH IS "+Add);
                              }
                       else
                              {
System.out.println();
                                System.out.println("SEEMS YOU ARE BEGINNER");
System.out.println();
                                System.out.println("I WOULD BE HAPPY IF YOUR ANSWER WAS CORRECT");
System.out.println();
				System.out.println("THE ANSWER IS: "+Add);
 			      }
                             break;

                        case '-':
                      System.out.println("Enter the values of operand of length of 2 character");
System.out.println();
                       System.out.println();
 		       System.out.println("Enter the value of operand1: ");
		       byte operan1=userInput.nextByte();
                       System.out.println("The value of operand1 is:"+operan1);
System.out.println();
 		       System.out.println("Enter the value of operand2: ");
                       byte operan2=userInput.nextByte();
                       System.out.println("The value of operand2 is :"+operan2);
System.out.println();
                       int Sub=operan1-operan2;
                       
                       System.out.println("What will be value of"+operan1+ " - " +operan2);
System.out.println();
                       System.out.println("Guess the value:");
                       int guesValue=userInput.nextInt();
                       if(Sub==guesValue)
                              {
                               System.out.println("YOU SEEM TO GOOD AT THIS");
System.out.println();
                               System.out.println("THE ANSWER IS ABSOLUTELY CORRECT WHICH IS: "+Sub);
                              }
                       else
                              {
System.out.println();
                                System.out.println("SEEMS YOU ARE BEGINNER");
System.out.println();
                                System.out.println("I WOULD BE HAPPY IF YOUR ANSWER WAS CORRECT");
System.out.println();
				System.out.println("THE ANSWER IS: "+Sub);
 			      }
                            break;

                      case '*':
                      System.out.println("Enter the values of operand of length of 2 character");
System.out.println();
                       System.out.println();
 		       System.out.println("Enter the value of operand1: ");
		       byte opera1=userInput.nextByte();
                       System.out.println("The value of operand1 is:"+opera1);
System.out.println();
 		       System.out.println("Enter the value of operand2: ");
                       byte opera2=userInput.nextByte();
                       System.out.println("The value of operand2 is :"+opera2);
System.out.println();
                       int Mul=opera1*opera2;
                       
                       System.out.println("What will be value of"+opera1+ " * " +opera2);
System.out.println();
                       System.out.println("Guess the value:");
                       int gssValue=userInput.nextInt();
                       if(Mul==gssValue)
                              {
                               System.out.println("YOU SEEM TO GOOD AT THIS");
System.out.println();
                               System.out.println("THE ANSWER IS ABSOLUTELY CORRECT WHICH IS: "+Mul);
                              }
                       else
                              {
System.out.println();
                                System.out.println("SEEMS YOU ARE BEGINNER");
System.out.println();
                                System.out.println("I WOULD BE HAPPY IF YOUR ANSWER WAS CORRECT");
System.out.println();
				System.out.println("THE ANSWER IS: "+Mul);
 			      }

                         default:
                            System.out.println("No operation found!!!");
 		     	    break;

                              
                             }
                       
		       
 		       break;
 
		       case 'M':
 		       System.out.println("Mode Medium");
System.out.println();
                       System.out.println("ARITHMETIC OPERATION CAN BE PERFORM || '+' || '-' || '*' || '+*' || '-+' ");
System.out.println();
                       System.out.println("Select the Arithmetic operation you want to perform:");
System.out.println();
                       String operation1=userInput.next();

                       switch(operation1)
                             {
                              case "+":
                      System.out.println("Enter the values of operand of length of 2 character");
System.out.println();
                       System.out.println();
 		       System.out.println("Enter the value of operand1: ");
		       int operandm1=userInput.nextInt();
                       System.out.println("The value of operand1 is:"+operandm1);
System.out.println();
 		       System.out.println("Enter the value of operand2: ");
                       int operandm2=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operandm2);
System.out.println();
                       System.out.println("Enter the value of operand3: ");
                       int operandm3=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operandm3);
System.out.println();
                       int Addm=operandm1+operandm2+operandm3;
                       
                       System.out.println("What will be value of"+operandm1+ " + " +operandm2 +" + " +operandm3);
System.out.println();
                       System.out.println("Guess the value:");
                       int guessValuem=userInput.nextInt();
                       if(Addm==guessValuem)
                              {
                               System.out.println("YOU SEEM TO GOOD AT THIS");
System.out.println();
                               System.out.println("THE ANSWER IS ABSOLUTELY CORRECT WHICH IS "+Addm);
                              }
                       else
                              {
System.out.println();
                                System.out.println("SEEMS YOU ARE BEGINNER");
System.out.println();
                                System.out.println("I WOULD BE HAPPY IF YOUR ANSWER WAS CORRECT");
System.out.println();
				System.out.println("THE ANSWER IS: "+Addm);
 			      }
                             break;

                        case "-":
                      System.out.println("Enter the values of operand of length of 2 character");
System.out.println();
                       System.out.println();
 		       System.out.println("Enter the value of operand1: ");
		       int operanm1=userInput.nextInt();
                       System.out.println("The value of operand1 is:"+operanm1);
System.out.println();
 		       System.out.println("Enter the value of operand2: ");
                       int operanm2=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operanm2);
System.out.println();
System.out.println("Enter the value of operand2: ");
                       int operanm3=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operanm3);
System.out.println();
                       int Subm=operanm1-operanm2-operanm3;
                       
                       System.out.println("What will be value of"+operanm1+ " - " +operanm2+ " - " +operanm3);
System.out.println();
                       System.out.println("Guess the value:");
                       int guesValuem=userInput.nextInt();
                       if(Subm==guesValuem)
                              {
                               System.out.println("YOU SEEM TO GOOD AT THIS");
System.out.println();
                               System.out.println("THE ANSWER IS ABSOLUTELY CORRECT WHICH IS: "+Subm);
                              }
                       else
                              {
System.out.println();
                                System.out.println("SEEMS YOU ARE BEGINNER");
System.out.println();
                                System.out.println("I WOULD BE HAPPY IF YOUR ANSWER WAS CORRECT");
System.out.println();
				System.out.println("THE ANSWER IS: "+Subm);
 			      }
                            break;

                      case "*":
                      System.out.println("Enter the values of operand of length of 1 or 2 or 3 or 4 character");
System.out.println();
                       System.out.println();
 		       System.out.println("Enter the value of operand1: ");
		       int operam1=userInput.nextInt();
                       System.out.println("The value of operand1 is:"+operam1);
System.out.println();
 		       System.out.println("Enter the value of operand2: ");
                       int operam2=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operam2);
System.out.println();
System.out.println("Enter the value of operand2: ");
                       int operam3=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operam3);
System.out.println();
                       int Mulm=operam1*operam2*operam3;
                       
                       System.out.println("What will be value of"+operam1+ " * " +operam2+ " * " +operam3);
System.out.println();
                       System.out.println("Guess the value:");
                       int gssValuem=userInput.nextInt();
                       if(Mulm==gssValuem)
                              {
                               System.out.println("YOU SEEM TO GOOD AT THIS");
System.out.println();
                               System.out.println("THE ANSWER IS ABSOLUTELY CORRECT WHICH IS: "+Mulm);
                              }
                       else
                              {
System.out.println();
                                System.out.println("SEEMS YOU ARE BEGINNER");
System.out.println();
                                System.out.println("I WOULD BE HAPPY IF YOUR ANSWER WAS CORRECT");
System.out.println();
				System.out.println("THE ANSWER IS: "+Mulm);
 			      }
                  	case  "-+":
  			System.out.println("Enter the values of operand of length of 1 or 2 or 3 or 4 character");
System.out.println();
                       System.out.println();
 		       System.out.println("Enter the value of operand1: ");
		       int operm1=userInput.nextInt();
                       System.out.println("The value of operand1 is:"+operm1);
System.out.println();
 		       System.out.println("Enter the value of operand2: ");
                       int operm2=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operm2);
System.out.println();
			System.out.println("Enter the value of operand2: ");
                       int operm3=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operm3);
System.out.println();
                       int SubAdd=operm1-operm2+operm3;
                       
                       System.out.println("What will be value of"+operm1+ " - " +operm2+ " + " +operm3);
System.out.println();
                       System.out.println("Guess the value:");
                       double gsValuem=userInput.nextDouble();
                       if(SubAdd==gsValuem)
                              {
                               System.out.println("YOU SEEM TO GOOD AT THIS");
System.out.println();
                               System.out.println("THE ANSWER IS ABSOLUTELY CORRECT WHICH IS: "+SubAdd);
                              }
                       else
                              {
System.out.println();
                                System.out.println("SEEMS YOU ARE BEGINNER");
System.out.println();
                                System.out.println("I WOULD BE HAPPY IF YOUR ANSWER WAS CORRECT");
System.out.println();
				System.out.println("THE ANSWER IS: "+SubAdd);
 			      }
                        break;
                        

                         case  "+*":
  			System.out.println("Enter the values of operand of length of 1 or 2 or 3 or 4 character");
System.out.println();
                       System.out.println();
 		       System.out.println("Enter the value of operand1: ");
		       int opem1=userInput.nextInt();
                       System.out.println("The value of operand1 is:"+opem1);
System.out.println();
 		       System.out.println("Enter the value of operand2: ");
                       int opem2=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+opem2);
System.out.println();
			System.out.println("Enter the value of operand2: ");
                       int opem3=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+opem3);
System.out.println();
                       double AddMul=opem1-opem2+opem3;
                       
                       System.out.println("What will be value of"+opem1+ " + " +opem2+ " * " +opem3);
System.out.println();
                       System.out.println("Guess the value:");
                       double gValuem=userInput.nextDouble();
                       if(AddMul==gValuem)
                              {
                               System.out.println("YOU SEEM TO GOOD AT THIS");
System.out.println();
                               System.out.println("THE ANSWER IS ABSOLUTELY CORRECT WHICH IS: "+AddMul);
                              }
                       else
                              {
System.out.println();
                                System.out.println("SEEMS YOU ARE BEGINNER");
System.out.println();
                                System.out.println("I WOULD BE HAPPY IF YOUR ANSWER WAS CORRECT");
System.out.println();
				System.out.println("THE ANSWER IS: "+AddMul);
 			      }
                        break;
                        

                         default:
                            System.out.println("No operation found!!!");
                         break;


                              
                             }

                       
		       break;
                   
                       case 'H':
                       System.out.println("Mode Hard");
System.out.println();
                       System.out.println("ARITHMETIC OPERATION CAN BE PERFORM || '-+*' || '-*+' || '+-*' ");
System.out.println();
                       System.out.println("Select the Arithmetic operation you want to perform:");
System.out.println();
                       String operation3=userInput.next();

                       switch(operation3)
                             {
                              case "-+*":
                      System.out.println("Enter the values of operand of length of <6> character");
System.out.println();
                       System.out.println();
 		       System.out.println("Enter the value of operand1: ");
		       int operandh1=userInput.nextInt();
                       System.out.println("The value of operand1 is:"+operandh1);
System.out.println();
 		       System.out.println("Enter the value of operand2: ");
                       int operandh2=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operandh2);
System.out.println();
                       System.out.println("Enter the value of operand3: ");
                       int operandh3=userInput.nextInt();
                       System.out.println("The value of operand3 is :"+operandh3);
System.out.println();
			System.out.println("Enter the value of operand3: ");
                       int operandh4=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operandh4);
System.out.println();
                       int SubAddMul=operandh1-operandh2+operandh3*operandh4;
                       
                       System.out.println("What will be value of"+operandh1+ " + " +operandh2 +" + " +operandh3+ " * "+operandh4);
System.out.println();
                       System.out.println("Guess the value:");
                       int guessValueh=userInput.nextInt();
                       if(SubAddMul==guessValueh)
                              {
                               System.out.println("YOU SEEM TO GOOD AT THIS");
System.out.println();
                               System.out.println("THE ANSWER IS ABSOLUTELY CORRECT WHICH IS "+SubAddMul);
                              }
                       else
                              {
System.out.println();
                                System.out.println("SEEMS YOU ARE BEGINNER");
System.out.println();
                                System.out.println("I WOULD BE HAPPY IF YOUR ANSWER WAS CORRECT");
System.out.println();
				System.out.println("THE ANSWER IS: "+SubAddMul);
 			      }
                             break;

                        case "-*+":
                      System.out.println("Enter the values of operand of length of <6> character");
System.out.println();
                       System.out.println();
 		       System.out.println("Enter the value of operand1: ");
		       int operanh1=userInput.nextInt();
                       System.out.println("The value of operand1 is:"+operanh1);
System.out.println();
 		       System.out.println("Enter the value of operand2: ");
                       int operanh2=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operanh2);
System.out.println();
 		       System.out.println("Enter the value of operand3: ");
                       int operanh3=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operanh3);
System.out.println();
                       System.out.println("Enter the value of operand4: ");
                       int operanh4=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operanh4);
System.out.println();
                       int SubMulAdd=operanh1-operanh2*operanh3+operanh4;
                       
                       System.out.println("What will be value of"+operanh1+ " - " +operanh2+ " * " +operanh3+ " + "+operanh4);
System.out.println();
                       System.out.println("Guess the value:");
                       int guesValueh=userInput.nextInt();
                       if(SubMulAdd==guesValueh)
                              {
                               System.out.println("YOU SEEM TO GOOD AT THIS");
System.out.println();
                               System.out.println("THE ANSWER IS ABSOLUTELY CORRECT WHICH IS: "+SubMulAdd);
                              }
                       else
                              {
System.out.println();
                                System.out.println("SEEMS YOU ARE BEGINNER");
System.out.println();
                                System.out.println("I WOULD BE HAPPY IF YOUR ANSWER WAS CORRECT");
System.out.println();
				System.out.println("THE ANSWER IS: "+SubMulAdd);
 			      }
                            break;

                      case "+-*":
                      System.out.println("Enter the values of operand of length of <6> character");
System.out.println();
                       System.out.println();
 		       System.out.println("Enter the value of operand1: ");
		       int operah1=userInput.nextInt();
                       System.out.println("The value of operand1 is:"+operah1);
System.out.println();
 		       System.out.println("Enter the value of operand2: ");
                       int operah2=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operah2);
System.out.println();
		       System.out.println("Enter the value of operand3: ");
                       int operah3=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operah3);
System.out.println();
		       System.out.println("Enter the value of operand4: ");
                       int operah4=userInput.nextInt();
                       System.out.println("The value of operand2 is :"+operah4);
System.out.println();
                       int AddSubMul=operah1+operah2-operah3*operah4;
                       
                       System.out.println("What will be value of"+operah1+ " + " +operah2+ " - " +operah3+ " * " +operah4);
System.out.println();
                       System.out.println("Guess the value:");
                       int gssValueh=userInput.nextInt();
                       if(AddSubMul==gssValueh)
                              {
                               System.out.println("YOU SEEM TO GOOD AT THIS");
System.out.println();
                               System.out.println("THE ANSWER IS ABSOLUTELY CORRECT WHICH IS: "+AddSubMul);
                              }
                       else
                              {
System.out.println();
                                System.out.println("SEEMS YOU ARE BEGINNER");
System.out.println();
                                System.out.println("I WOULD BE HAPPY IF YOUR ANSWER WAS CORRECT");
System.out.println();
				System.out.println("THE ANSWER IS: "+AddSubMul);
 			      }
                  	 break;
                        

                         default:
                            System.out.println("No operation found!!!");
                         break;

                       
                       
                    }
  }
	    } while(true);
	}
}