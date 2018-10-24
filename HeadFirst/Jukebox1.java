package HeadFirst;

import java.util.*;
import java.io.*;

public class Jukebox1 {
    ArrayList<Song> songList = new ArrayList<Song>();
    ArrayList<String> songList2 = new ArrayList<String>();
    ArrayList songList3 = new ArrayList();
    HashSet<Song> songSet= new HashSet<Song>();

    public static void main (String[] args){
        new Jukebox1().go(); // make object to reference non-static method
    }

    class ArtistCompare implements Comparator<Song>{
        public int compare(Song one, Song two){
            return one.getArtist().compareTo(two.getArtist());
        }
    }

    public void go(){
        getSongs();
        System.out.println(songList);
        //Collections.sort(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);

        System.out.println("sorted list : " + songList);

        songSet.addAll(songList);
        System.out.println("HashSet List : " + songSet);

        TreeSet<Song> TreeSetSong = new TreeSet<Song>();
        TreeSetSong.addAll(songList);
        System.out.println("TreeSet : " + TreeSetSong);

    }

    void getSongs(){
        try{
            File file = new File("/Users/1003969/SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line=reader.readLine()) != null) {
                addSong(line);
            }

        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        //songList.add(tokens[0]);
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);

        songList.add(nextSong);
    }

}

class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;

    public boolean equals(Object aSong){
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
    }

    public int hashCode(){
        return title.hashCode();
    }

    public int compareTo (Song s){
        return title.compareTo(s.getTitle());
    }

    Song(String t, String a, String r, String b){
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString(){
        return title;
    }
}
