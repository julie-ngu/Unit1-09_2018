/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Sept 2018
 * Created for: ICS4U
 * This program generates random marks of 6 assignment for 4 students. It has 
 * 		a function that accepts the array of marks and returns the class 
 * 		average. It then prints it in a table.
 * 
 ****************************************************************************/
import java.util.Random;

public class ClassMarksExtra {
	public static void main(String[] args) {
		int [][] classMarksArr = new int [4][6];
		Random randGen = new Random();
		
		for(int students = 0; students < classMarksArr.length; students ++) {
			for(int assignments = 0; assignments < classMarksArr[students].length; assignments++) {
				int randMark = randGen.nextInt(100 - 85) + 85;
				classMarksArr[students][assignments] = randMark;
			}
		}
		double classAverage = MarksAvgCal(classMarksArr);		
		
		System.out.print("\t\t\t\tASSIGNMENTS\n");
		PrintTable(classMarksArr);
		System.out.print("\n\nThe class average is " + classAverage + ".");
	}
	
	public static void PrintTable(int arrPrt[][]) {
		//prints array in table
		System.out.print("STUDENTS\t");
		for(int colNum = 0; colNum < 7; colNum ++) {
			System.out.print(colNum + "   |\t");
		}
		
		System.out.print("\n\t\t");
		for(int count = 0; count < 53; count ++) {
			System.out.print("—");
		}
		System.out.println("");
		
		int rowNum = 1;
		
		for(int arrRow = 0; arrRow < arrPrt.length; arrRow ++) {
			System.out.print("\t\t" + rowNum + "   |\t");
			rowNum++;
			for(int arrCol = 0; arrCol < arrPrt[arrRow].length; arrCol ++) {
				System.out.print(arrPrt[arrRow][arrCol] + "\t");
				
			}
			System.out.println();
		}
	}
	
	public static double MarksAvgCal(int array[][]) {
		//calculates average of array
		int arrSum = 0;
		int arrLen = 0;
		
		for(int row = 0; row < array.length; row ++) {
			for(int column = 0; column < array[row].length; column ++) {
				arrSum += array[row][column];
				arrLen ++;
			}
		}
		
		double arrAvg = arrSum / arrLen;
		
		return arrAvg;
	}
}
