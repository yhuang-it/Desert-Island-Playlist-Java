import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {

   ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

  desertIslandPlaylist.add("Memories");
  desertIslandPlaylist.add("Payphone");
  desertIslandPlaylist.add("Hello");
  desertIslandPlaylist.add("Eyes on Me");
  desertIslandPlaylist.add("Rolling in the Deep");
  desertIslandPlaylist.add("Beat it");
  desertIslandPlaylist.add("We Will Rock You");

  System.out.println(desertIslandPlaylist);

  // removing songs
  desertIslandPlaylist.remove("Payphone");
  desertIslandPlaylist.remove("Eyes on Me");

  // checking playlist size
  System.out.println(desertIslandPlaylist.size());

  //Swaping songs
  int indexA = desertIslandPlaylist.indexOf("Hello");
  System.out.println(indexA);

  int indexB = desertIslandPlaylist.indexOf("Beat it");
  System.out.println(indexB);

  String tempA = "Hello";

  desertIslandPlaylist.set(indexA, "Beat it");
  desertIslandPlaylist.set(indexB, tempA);

  System.out.println(desertIslandPlaylist);
  
  }
}
