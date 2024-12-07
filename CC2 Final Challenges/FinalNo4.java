// Programmer: Marl Zandro T. Andaya
// Date: December 1st week, 2024
// Challenge: Final Challenge No. 4 - Linked Lists Application

class Song {
    String title; // The title of the song
    String artist; // The artist of the song
    Song next; // Reference to the next song
    Song prev; // Reference to the previous song
    // Constructor to create a song with title and artist
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
}
class Playlist {
    private Song head = null; // Start of the playlist
    private Song current = null; // Currently playing song
    // Add a song to the playlist
    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist); // Create a new song
        if (head == null) { // If playlist is empty
            head = newSong;
            head.next = head; // Circular link
            head.prev = head; // Circular link
            current = head; // Set current song
        } else { // If playlist is not empty
            Song tail = head.prev; // Last song in the list
            tail.next = newSong; // Link last song to new song
            newSong.prev = tail; // Set previous link for new song
            newSong.next = head; // Link new song back to head
            head.prev = newSong; // Update head's previous link
        }
    }
    // Play the current song
    public void playCurrent() {
        if (current != null) {
            System.out.println("Playing: " + current.title + " by " + current.artist);
        } else {
            System.out.println("Playlist is empty!"); // No songs in the playlist
        }
    }
    // Move to the next song
    public void next() {
        if (current != null) {
            current = current.next; // Go to the next song
            playCurrent();
        } else {
            System.out.println("Playlist is empty!");
        }
    }
    // Move to the previous song
    public void previous() {
        if (current != null) {
            current = current.prev; // Go to the previous song
            playCurrent();
        } else {
            System.out.println("Playlist is empty!");
        }
    }
    // Display all songs in the playlist
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist is empty!"); // No songs to display
            return;
        }
        Song temp = head; // Start from the head
        do {
            System.out.println(temp.title + " by " + temp.artist); // Print song details
            temp = temp.next; // Move to the next song
        } while (temp != head); // Stop when back at the head
    }
}
public class FinalNo4 {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(); // Create a new playlist

        // Add songs to the playlist
        playlist.addSong("Song 1", "Artist 1");
        playlist.addSong("Song 2", "Artist 2");
        playlist.addSong("Song 3", "Artist 3");

        // Display the playlist
        System.out.println("Playlist:");
        playlist.displayPlaylist();

        // Play songs
        System.out.println("\nStart playing:");
        playlist.playCurrent();

        System.out.println("\nNext song:");
        playlist.next();

        System.out.println("\nNext song:");
        playlist.next();

        System.out.println("\nPrevious song:");
        playlist.previous();
    }
}
