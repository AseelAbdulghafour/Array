class Main {
    public static void main(String[] args) {
      double[] tempArray;
      tempArray = new double[5];
      tempArray[0] = 20.5;
      tempArray[1] = 56;
      tempArray[2] = 19;
      tempArray[3] = 30;
      tempArray[4] = 23;
  
      tempArray[2] = tempArray[2] + 15;;
      
      for (double temp : tempArray)
        System.err.println(temp);
    }
