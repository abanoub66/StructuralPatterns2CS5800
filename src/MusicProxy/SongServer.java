package MusicProxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongServer implements SongService {
    private int id;
    private final Map<Integer, Song> database;
    private static SongServer instance;

    private SongServer() {
        id = 0;
        database = new HashMap<>();
    }

    public static SongServer getInstance() {
        if (instance == null) {
            instance = new SongServer();
        }
        return instance;
    }

    public void insert(Song song) {
        database.put(id, song);
        id++;
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        return database.get(songID);
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        List<Song> songList = new ArrayList<>();
        for (Song s : database.values()) {
            if (s.title().contains(title)) {
                songList.add(s);
            }
        }
        return songList;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        List<Song> songList = new ArrayList<>();
        for (Song s : database.values()) {
            if (s.album().contains(album)) {
                songList.add(s);
            }
        }
        return songList;
    }
}
