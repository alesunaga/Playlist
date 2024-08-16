import java.util.Arrays; // Importing Arrays class for array manipulation
import java.util.ArrayList; // Importing ArrayList class for dynamic array-like structure

class Playlist {
    public static void main(String[] args) {
        // An array 'favoriteSongs' is declared to store 10 favorite song titles
        String[] favoriteSongs = {
            "Queen - Bohemian Rhapsody",
            "Billie Ellish - Birds of a feather",
            "Jimin - Who",
            "Imagine Dragons - On Top of the World",
            "The Weekend - Blinding Lights",
            "Tate McRae - Greedy",
            "Mimin - Rebirth",
            "Alan Walker - Faded",
            "Eva Cassidy - Fields of Gold",
            "NSH - Used to believe"
        };

        // Printing the first three songs in the 'favoriteSongs' array
        System.out.println(favoriteSongs[0]); // Prints: Queen - Bohemian Rhapsody
        System.out.println(favoriteSongs[1]); // Prints: Billie Ellish - Birds of a feather
        System.out.println(favoriteSongs[2]); // Prints: Jimin - Who

        // Creating an ArrayList called 'desertIslandPlaylist' to hold String values
        ArrayList<String> desertIslandPlaylist = new ArrayList<>();

        // Adding 5 songs to the 'desertIslandPlaylist'
        desertIslandPlaylist.add("Billie Ellish - Blue");
        desertIslandPlaylist.add("Alessia Cara - I'm like a bird");
        desertIslandPlaylist.add("Billy Joel - Vianna");
        desertIslandPlaylist.add("Ray LaMontagne - Such a simple");
        desertIslandPlaylist.add("Little Quirks - Crumbled");

        // Adding all songs from 'favoriteSongs' array to 'desertIslandPlaylist'
        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

        // Printing the total number of songs in the 'desertIslandPlaylist'
        System.out.println(desertIslandPlaylist.size()); // Outputs the size of the playlist

        // Removing least favorite songs from the playlist by their indices
        // The indices refer to the position of each song in the playlist
        desertIslandPlaylist.remove(4); // Removes "Little Quirks - Crumbled"
        desertIslandPlaylist.remove(5); // Removes "Tate McRae - Greedy"
        desertIslandPlaylist.remove(2); // Removes "Billy Joel - Vianna"
        desertIslandPlaylist.remove(7); // Removes "Eva Cassidy - Fields of Gold"
        desertIslandPlaylist.remove(8); // Removes "NSH - Used to believe"

        // Printing the list as it currently stands
        System.out.println(desertIslandPlaylist); // Prints the modified playlist

        // Finding the indices of the two songs that need to be swapped
        int SongA = desertIslandPlaylist.indexOf("Alessia Cara - I'm like a bird");
        int SongB = desertIslandPlaylist.indexOf("Mimin - Rebirth");

        // Temporary variables to hold the values of the songs to be swapped
        String tempA = "Alessia Cara - I'm like a bird";
        String tempB = "Mimin - Rebirth";

        // Swapping the positions of SongA and SongB in the playlist
        desertIslandPlaylist.set(SongB, tempA);
        desertIslandPlaylist.set(SongA, tempB);

        // Printing the list after the songs have been swapped
        System.out.println("List after the change");
        System.out.println(desertIslandPlaylist); // Outputs the final playlist after swapping
    }
}
