/*
 (Sort two-dimensional array) Write a method to sort a two-dimensional array using the following header: public static void sort(int m[][]) The method performs a primary sort on rows, and a secondary sort on columns. For example, the following array {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}} will be sorted to {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}. 
 */

public class CodePost_Assignment2_01 {

	public static void main(String[] args) {
		
		int[][] array = {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}};

		
		sort(array);

        System.out.print("{");
		for (int i = 0; i < array.length; i++) {
            
			for (int j = 0; j < array[i].length; j++) {
                if(j==0){
                    System.out.print("{");
				    System.out.print(array[i][j] + ",");
                }
                else{
                    System.out.print(array[i][j]);
                    System.out.print("}");
                }
			}
            System.out.print(",");
            
		}
		System.out.print("}");
	}


	public static void sort(int m[][]) {
		int[] minimum = new int[2];
		for (int row = 0; row < m.length - 1; row++) {
			minimum[0] = m[row][0]; 
			minimum[1] = m[row][1]; 
			int index = row;
			for (int i = row + 1; i < m.length; i++) {
				if (m[i][0] <= minimum[0] && (m[i][0] < minimum[1] || 
					 m[i][1] < minimum[0] || m[i][1] < minimum[1])) { 
                     minimum[0] = m[i][0];
                     minimum[1] = m[i][1];
					index = i;
				}
			}
			if (index != row){
				m[index][0] = m[row][0];
				m[index][1] = m[row][1];
				m[row][0] = minimum[0];
				m[row][1] = minimum[1]; 
			}
		}
    }
}
