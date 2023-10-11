class Solution {
    public int distanceTraveled(int mainTank, int additionalTank)
    {
      int d=0;
      int mt,at;
      mt=mainTank;
      at=additionalTank;
      int i;
      while (mt>0)
      {
          d++;
          mt--;
          if(d!=0 && d%5==0 && at>0)
          {
              at--;
              mt++;
          }
      }
      return (d*10);
    }
}
