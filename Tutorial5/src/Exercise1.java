	import java.util.Arrays;
	import java.util.Scanner;
	// Latest version 11/10/16

	import java.io.IOException;
	import java.util.logging.FileHandler;
	import java.util.logging.Formatter;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	import java.util.logging.SimpleFormatter;
	
public class Exercise1 {


		public final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		final static UseLogger tester = new UseLogger();
		
		public enum Chessmen {
			WHITE_KING, WHITE_QUEEN, WHITE_ROOK, WHITE_BISHOP, WHITE_KNIGHT, WHITE_PAWN, BLACK_KING, BLACK_QUEEN, BLACK_ROOK, BLACK_BISHOP, BLACK_KNIGHT, BLACK_PAWN, EMPTY
		}

		// [rows (1..8) cols (a..h); s.t a = 1, b = 2, c = 3, ...

		// public String[] columns = {"a", "b", "c", "d", "e", "f", "g", "h"};

		public static void main(String[] args) {
	
		    try {
	            MyLogger.setup();
		    } catch (IOException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Problems with creating the log files");
		    }
			
			
			final String[] columns = { "a", "b", "c", "d", "e", "f", "g", "h" };
			Chessmen[][] chessboard = new Chessmen[8][8];
			chessboard[0][0] = Chessmen.WHITE_ROOK;
			chessboard[0][1] = Chessmen.WHITE_KNIGHT;
			chessboard[0][2] = Chessmen.WHITE_BISHOP;
			chessboard[0][3] = Chessmen.WHITE_QUEEN;
			chessboard[0][4] = Chessmen.WHITE_KING;
			chessboard[0][5] = Chessmen.WHITE_BISHOP;
			chessboard[0][6] = Chessmen.WHITE_KNIGHT;
			chessboard[0][7] = Chessmen.WHITE_ROOK;
			
			tester.LogStatus(UseLogger.FINEST,"Creating chessboard");
				
			// For row 2, and for all columns, WHITE_PAWN.
			// for row 7, and for all columns BLACK_PAWN.
			for (int i = 0; i < 8; i++) {
				chessboard[1][i] = Chessmen.WHITE_PAWN;
				chessboard[6][i] = Chessmen.BLACK_PAWN;
			}

			// Black pieces
			chessboard[7][0] = Chessmen.BLACK_ROOK;
			chessboard[7][1] = Chessmen.BLACK_KNIGHT;
			chessboard[7][2] = Chessmen.BLACK_BISHOP;
			chessboard[7][3] = Chessmen.BLACK_QUEEN;
			chessboard[7][4] = Chessmen.BLACK_KING;
			chessboard[7][5] = Chessmen.BLACK_BISHOP;
			chessboard[7][6] = Chessmen.BLACK_KNIGHT;
			chessboard[7][7] = Chessmen.BLACK_ROOK;

			// Assign the empty spaces on the board the value EMPTY
			for (int i = 2; i < 6; i++) {
				for (int j = 0; j < 8; j++) {
					chessboard[i][j] = Chessmen.EMPTY;
				}
			}

			printBoard(chessboard);
			String UserIn = null;

			while (UserIn != "exit") {
				System.out.println("White to move:");
				Scanner scanner = new Scanner(System.in);
				UserIn = scanner.nextLine();
				// Move function insert here
				if (move(chessboard, UserIn)== false) {
					System.out.println("White - Please type a valid move.");
					
				};
				printBoard(chessboard);
				tester.LogStatus(UseLogger.INFO,"White has moved.");
				
				System.out.println("Black to move:");
				Scanner scanner2 = new Scanner(System.in);
				UserIn = scanner2.nextLine();
				// Move function insert here
				if (move(chessboard, UserIn)==false) {
					System.out.println("Black - Please type a valid move.");
				}
				printBoard(chessboard);
				tester.LogStatus(UseLogger.INFO,"Black has moved");
	 		}
			System.out.println("Quitting game");
			System.exit(0);
		}

		public static void printBoard(Chessmen[][] chessboard) {
			// Print out the column labels
			final String[] columns = { "a", "b", "c", "d", "e", "f", "g", "h" };
			System.out.print("\t");
			for (int i = 0; i < 8; i++) {
				System.out.print(columns[i] + "\t");
			}
			System.out.println("");

			for (int i = 8; i > 0; i--) {
				System.out.print(i);
				System.out.print("\t");
				for (int j = 0; j < 8; j++) {
					switch (chessboard[i - 1][j]) {
					case BLACK_ROOK:
						System.out.print("\u265C");
						break;
					case BLACK_KNIGHT:
						System.out.print("\u265E");
						break;
					case BLACK_BISHOP:
						System.out.print("\u265D");
						break;
					case BLACK_QUEEN:
						System.out.print("\u265B");
						break;
					case BLACK_KING:
						System.out.print("\u265A");
						break;
					case BLACK_PAWN:
						System.out.print("\u265F");
						break;
					case WHITE_ROOK:
						System.out.print("\u2656");
						break;
					case WHITE_KNIGHT:
						System.out.print("\u2658");
						break;
					case WHITE_BISHOP:
						System.out.print("\u2657");
						break;
					case WHITE_QUEEN:
						System.out.print("\u2655");
						break;
					case WHITE_KING:
						System.out.print("\u2654");
						break;
					case WHITE_PAWN:
						System.out.print("\u2659");
						break;
					default:
						System.out.print("");
					}
					System.out.print("\t");
				}
				System.out.print("\n\n");

			}

		}

		public static boolean move(Chessmen[][] chessboard, String user_move) {
		
			
			
		// parse move string into components
			String[] components = user_move.split(" to "); // here the split method
															// splits the array, s.t
															// each splitted item
															// straddles a string "
															// to "
			System.out.print(Arrays.toString(components));
			char oldJ = components[0].charAt(0); // This is the first character of
													// the first element, i.e, if
													// the array is e1, e5, the
													// first character of first
													// element is e
			char oldI = components[0].charAt(1);
			char newJ = components[1].charAt(0);
			char newI = components[1].charAt(1);
				
			System.out.println(String.valueOf(oldJ) + String.valueOf(oldI) + String.valueOf(newJ) + String.valueOf(newI)); // Output
																															// this
																															// to
																															// check
																															// it
			
			// Converts chess coordinates into array coordinates by calling convert
			// methods.
			int OldI = convert_i(oldI); // Calling the convert_i method to convert
										// the row user entries into indexes that
										// the computer understands for the
										// chessboard
			int NewI = convert_i(newI);
			int OldJ = convert_j(oldJ);
			int NewJ = convert_j(newJ);
			System.out.println(OldI + "" + NewI);
			System.out.println(OldJ + "" + NewJ);

			// test if oldI and newI between 0 and 8 and
					// oldJ and newJ between a and h
					// if false then error message and leave move()
			if (!((OldI * NewI < 64) && (OldJ * NewJ < 64))) {
				return false;
			}

	//========================================================================
			
			if (isValid(chessboard, OldI, OldJ, NewI, NewJ)) {
				// Moves piece
		
				chessboard[NewI][NewJ] = chessboard[OldI][OldJ];		
				chessboard[OldI][OldJ] = Chessmen.EMPTY;
			}
			else {			
					System.out.println("Error. Move not permitted.");
					tester.LogStatus(UseLogger.WARNING,"Invalid move.");
			}
	//========================================================================
			
			
			return true;
		}

		
		
		// Ensures validity of move
		public static Boolean isValid(Chessmen[][] chessboard, int oldI, int oldJ, int newI, int newJ) {
			Boolean validity = false;
			int coordDifferenceNumber = Math.abs(oldI - newI); // Gets the
																// difference
																// between the old
																// row location and
																// new row location.
			int coordDifferenceLetter = Math.abs(oldJ - newJ); // Gets the
																// difference
																// between the old
																// column location
																// and the new
																// column location.

				// Don't need to import Math. 
			// a = oldI, b = oldJ, c = newI, d = newJ
			switch (chessboard[oldI][oldJ]) {
			case WHITE_PAWN:
				if (oldI == 2) {
					if (newI == 3 || newI == 4) {
						if (chessboard[newI][newJ] == Chessmen.EMPTY) {
							validity = true;
						}
						if (newI == 3 && (newJ == (oldJ - 1) || (newJ == (oldJ + 1)))) {
							if (colour_of_piece(chessboard[newI][newJ]) == "Black") {
								validity = true;
							}
						}
					}
			
				}
				else {
					if (newI == (oldI + 1)) {
						if (chessboard[newI][newJ] == Chessmen.EMPTY && newJ == oldJ) {
							validity = true;
						} else {
							if ((newJ == (oldJ - 1) || (newJ == (oldJ + 1)))) {
								if (colour_of_piece(chessboard[newI][newJ]) == "Black") {
									validity = true;
								}
							}
						}
					}
				}
				break;
			case WHITE_BISHOP:
				// Only moves diagonally. Can't take white pieces. When you are
				// going diagonally, the rows and columns move as one.
				if (coordDifferenceNumber == coordDifferenceLetter && ((colour_of_piece(chessboard[newI][newJ]) == "Black")
						|| chessboard[newI][newJ] == Chessmen.EMPTY)) {
					validity = true;
				}
				break;
			case WHITE_ROOK:
				// Moves non-diagonally
				if ((oldI == newI || oldJ == newJ) && ((colour_of_piece(chessboard[newI][newJ]) == "Black")
						|| chessboard[newI][newJ] == Chessmen.EMPTY)) {
					validity = true;
				}
				break;
			case WHITE_QUEEN:
				if ((colour_of_piece(chessboard[newI][newJ]) == "Black") || chessboard[newI][newJ] == Chessmen.EMPTY) {
					if ((oldI == newI || oldJ == newJ) || coordDifferenceNumber == coordDifferenceLetter) {
						validity = true;
					}
				}
				break;
			case WHITE_KNIGHT:
				// Moves either two up one across, or two across one up.
				if ((coordDifferenceNumber == 2 && coordDifferenceLetter == 1)
						|| (coordDifferenceLetter == 2 && coordDifferenceNumber == 1)) {
					if ((colour_of_piece(chessboard[newI][newJ]) == "Black") || chessboard[newI][newJ] == Chessmen.EMPTY) {
						validity = true;

					}
				}
				break;

			case BLACK_PAWN:
				if (oldI == 7) {
					if (newI == 6 || newI == 5) {
						if (chessboard[newI][newJ] == Chessmen.EMPTY) {
							validity = true;
						}
						if (newI == 6 && (newJ == (oldJ - 1) || (newJ == (oldJ + 1)))) {
							if (colour_of_piece(chessboard[newI][newJ]) == "White") {
								validity = true;
							}
						}
					}
				}

				else {
					if (newI == (oldI - 1)) {
						if (chessboard[newI][newJ] == Chessmen.EMPTY && newJ == oldJ) {
							validity = true;
						} else {
							if ((newJ == (oldJ - 1) || (newJ == (oldJ + 1)))) {
								if (colour_of_piece(chessboard[newI][newJ]) == "White") {
									validity = true;
								}
							}
						}
					}
				}
				break;

			case BLACK_BISHOP:
				// Only moves diagonally. Can't take white pieces. When you are
				// going diagonally, the rows and columns move as one.
				if (coordDifferenceNumber == coordDifferenceLetter && ((colour_of_piece(chessboard[newI][newJ]) == "White")
						|| chessboard[newI][newJ] == Chessmen.EMPTY)) {
					validity = true;
				}
				break;
			case BLACK_ROOK:
				// Moves non-diagonally
				if ((oldI == newI || oldJ == newJ) && ((colour_of_piece(chessboard[newI][newJ]) == "White")
						|| chessboard[newI][newJ] == Chessmen.EMPTY)) {
					validity = true;
				}
				break;
			case BLACK_QUEEN:
				if ((colour_of_piece(chessboard[newI][newJ]) == "White") || chessboard[newI][newJ] == Chessmen.EMPTY) {
					if ((oldI == newI || oldJ == newJ) || coordDifferenceNumber == coordDifferenceLetter) {
						validity = true;
					}
				}
				break;
			case BLACK_KNIGHT:
				// Moves either two up one across, or two across one up.
				if ((coordDifferenceNumber == 2 && coordDifferenceLetter == 1)
						|| (coordDifferenceLetter == 2 && coordDifferenceNumber == 1)) {
					if ((colour_of_piece(chessboard[newI][newJ]) == "White") || chessboard[newI][newJ] == Chessmen.EMPTY) {
						validity = true;

					}
				}
				break;

			}

					
			return validity;
		}

		
		
		public static int convert_i(char chesscoord) {
			// Convert the row coordinates to array coordinates; doing the numbers
			// (rows) first
			int iChesscoord = Character.getNumericValue(chesscoord); // converting
																		// the
																		// character
																		// chesscoord
																		// into an
																		// integer
			int i = 0; // Initialise outside the loop, so that it's not a local
						// variable.
			if (iChesscoord == 8) {
				i = 7;
			} else if (iChesscoord == 7) {
				i = 6;
			} else if (iChesscoord == 6) {
				i = 5;
			} else if (iChesscoord == 5) {
				i = 4;
			} else if (iChesscoord == 4) {
				i = 3;
			} else if (iChesscoord == 3) {
				i = 2;
			} else if (iChesscoord == 2) {
				i = 1;
			} else if (iChesscoord == 1) {
				i = 0;
			}
			return i;
		}

		public static int convert_j(char chesscoord) {
			// Convert the column coordinates to array coordinates
			int j = 0;
			if (chesscoord == 'a') {
				j = 0;
			} else if (chesscoord == 'b') {
				j = 1;
			} else if (chesscoord == 'c') {
				j = 2;
			} else if (chesscoord == 'd') {
				j = 3;
			} else if (chesscoord == 'e') {
				j = 4;
			} else if (chesscoord == 'f') {
				j = 5;
			} else if (chesscoord == 'g') {
				j = 6;
			} else if (chesscoord == 'h') {
				j = 7;

			}
			return j;
		}

		public static String colour_of_piece(Chessmen testme) {

			String colour = "None";

			if (testme == Chessmen.BLACK_ROOK || testme == Chessmen.BLACK_BISHOP || testme == Chessmen.BLACK_PAWN
					|| testme == Chessmen.BLACK_KING || testme == Chessmen.BLACK_KNIGHT) {
				colour = "Black";
			} else if (testme == Chessmen.WHITE_ROOK || testme == Chessmen.WHITE_BISHOP || testme == Chessmen.WHITE_PAWN
					|| testme == Chessmen.WHITE_KING || testme == Chessmen.WHITE_KNIGHT) {
				colour = "White";
			}

			return colour;

		}

	}


	

	

