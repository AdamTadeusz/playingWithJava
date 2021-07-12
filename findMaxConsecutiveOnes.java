class findMaxConsecutiveOnes {
  public int findMaxConsecutiveOnes(int[] nums) {
    if (nums.length == 0){return 0;}

    int returnValue = 0, currentValue = 0;
    if (nums[0] == 1) {returnValue = currentValue = 1;}

    for (int i=1; i<nums.length; i++){
      if (nums[i] == 0){
        if (returnValue < currentValue) {returnValue = currentValue;}
        currentValue=0;
      }
      else if (nums[i] == 1){
        currentValue += 1;
      }
    }

    if (returnValue < currentValue) {return currentValue;}
    return returnValue;
  }

  public static void main(String args[]){
    int array1[] = new int[] {1,1,0,1,1,1};
    int array2[] = new int[] {0,1,0,1,1,1};
    int array3[] = new int[] {};
    int returnValue1, currentValue1 = (array1[0] == 1) ? 1 : 0;
    int returnValue2, currentValue2 = (array2[0] == 1) ? 1 : 0;
    //int returnValue3, currentValue3 = (array3[0] == 1) ? 1 : 0;
    System.out.println(" "+currentValue1);
    System.out.println(" "+currentValue2);
    // System.out.println(" "+currentValue3);

    //System.out.println(findMaxConsecutiveOnes.findMaxConsecutiveOnes(array));
  }
}