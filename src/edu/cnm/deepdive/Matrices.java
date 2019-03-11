package edu.cnm.deepdive;


public class Matrices {


  public static int[][] rotateClock(int[][]input) {

    int[][]Rotated = new int[input.length][input.length];

    for (int i = 0; i < input.length; i++) {
      for (int j = 0; j < input.length; j++) {
        Rotated[i][j] = input[input.length - 1 - j][i];
      }

    }
    return Rotated;
  }
}