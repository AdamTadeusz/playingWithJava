import adamTadeusz.DVD;

public class playingWithArrays {
  public static void main(String args[]) {
    DVD[] dvdCollection = new DVD[15];
    DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
    DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
    DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

    dvdCollection[3] = incrediblesDVD;
    dvdCollection[9] = findingDoryDVD;
    dvdCollection[2] = lionKingDVD;

    for (int i=0;i<dvdCollection.length;i++) {
      if (dvdCollection[i] != null){
      System.out.println("["+i+"] "+dvdCollection[i]);}
    }
    System.out.println();
  }
}