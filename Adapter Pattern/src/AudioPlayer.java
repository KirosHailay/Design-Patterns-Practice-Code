public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        //inbuilt support to play mp3 music files
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + filename);
        }

        //mediaAdapter is providing support to play other files formats
        else if (audioType.equalsIgnoreCase("vlc") || (audioType.equalsIgnoreCase("mp4"))) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);

        }
    }
}
