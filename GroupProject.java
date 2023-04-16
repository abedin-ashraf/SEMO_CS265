public class GroupProject {
    public static void main(String[] args) {
        int[][] matrix = { { 0, 1, 0, 3, 1, 6, 1 },
                { 0, 1, 6, 8, 6, 0, 1 },
                { 5, 6, 2, 1, 8, 2, 9 },
                { 6, 5, 6, 1, 1, 9, 1 },
                { 1, 3, 6, 1, 4, 0, 7 },
                { 3, 3, 3, 3, 4, 0, 7 }

        };
        System.out.println(isConsecutiveFour(matrix));
    }

    public static boolean isConsecutiveFour(int[][] values) {

        // find the match row-wise
        for (int i = 0; i < values.length; i++) {
            int presentValue = values[i][0];
            int numberOfCount = 0;
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j] == presentValue) {
                    numberOfCount++;
                    if (numberOfCount == 4)
                        return true;
                } else {
                    presentValue = values[i][j];
                    numberOfCount = 1;
                }

            }
        }
        
    

        //find the match column-wise
        for(int j=0; j<values[0].length; j++){
            int presentValue = values[0][j];
            int numberOfCount = 0;
            for(int i=0; i<values.length; i++){
                if(values[j][i]==presentValue){
                    numberOfCount++;
                    if(numberOfCount==4)
                        return true;
                }
                else{
                    presentValue = values[j][i];
                    numberOfCount = 1;
                }
            }
        }
        //finding the match bottomLeft to Up
        for(int j=values[0].length-1; j>0; j--){
            int x = j;
            int y = values.length-1;
            int presentValue = values[y][x];
            int numberOfCount = 0;
            while(x>=0 && y>=0){
                if(values[y][x]==presentValue){
                    numberOfCount++;
                    if(numberOfCount==4)
                        return true;
                }
                else{
                    numberOfCount=1;
                    presentValue = values[y][x];
                    x--;
                    y--;
                }
            }

        }
        //finding the match topLeft to down
        for(int j=0; j<values[0].length; j++){
            int x = j;
            int y = values.length-1;
            int presentValue = values[y][x];
            int numberOfCount = 0;
            while(x>=0 && y<=0){
                if(values[y][x]==presentValue){
                    numberOfCount++;
                    if(numberOfCount==4)
                        return true;
                }
                else{
                    numberOfCount=1;
                    presentValue = values[y][x];
                    x--;
                    y--;
                }
            }

        }
    }

}
