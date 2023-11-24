package com.hosle.array;

//

public class RotationMatrix {
    private enum DIRECTION{
        RIGHT,DOWN,LEFT,UP
    }
    public void solution(int n){
        int[][]result = new int[n][n];
        int xIndex = 0;
        int yIndex = 0;
        int count = 1;
        DIRECTION currentDirection = DIRECTION.RIGHT;

        while (count <= n * n ){
            result[xIndex][yIndex] = count;

            if (currentDirection == DIRECTION.RIGHT){
                yIndex++;

                try{
                    if (result[xIndex][yIndex] != 0){
                        currentDirection = DIRECTION.DOWN;
                        yIndex--;
                        xIndex++;
                    }
                }catch (IndexOutOfBoundsException e){
                    currentDirection = DIRECTION.DOWN;
                    yIndex--;
                    xIndex++;
                }

            } else if (currentDirection == DIRECTION.DOWN){
                xIndex++;

                try{
                    if (result[xIndex][yIndex]!=0){
                        currentDirection = DIRECTION.LEFT;
                        xIndex--;
                        yIndex--;
                    }
                }catch (IndexOutOfBoundsException e){
                    currentDirection = DIRECTION.LEFT;
                    xIndex--;
                    yIndex--;
                }

            } else if (currentDirection == DIRECTION.LEFT){
                yIndex--;

                try{
                    if (result[xIndex][yIndex]!=0){
                        currentDirection = DIRECTION.UP;
                        yIndex++;
                        xIndex--;
                    }
                }catch (IndexOutOfBoundsException e){
                    currentDirection = DIRECTION.UP;
                    yIndex++;
                    xIndex--;
                }
            } else {
                xIndex--;

                try{
                    if (result[xIndex][yIndex]!=0){
                        currentDirection = DIRECTION.RIGHT;
                        xIndex++;
                        yIndex++;
                    }
                }catch (IndexOutOfBoundsException e){
                    currentDirection = DIRECTION.RIGHT;
                    xIndex++;
                    yIndex++;
                }
            }

            count++;
        }

        print(result);
    }

    private void print(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
