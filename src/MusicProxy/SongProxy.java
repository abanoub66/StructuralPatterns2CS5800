package MusicProxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SongProxy implements SongService {

    Map<Integer, Song> cache = new HashMap<>();

    @Override
    public Song searchById(Integer songID) {
        Song song = cache.get(songID);
        if (song == null) {
            SongServer sdb = SongServer.getInstance();
            song = sdb.searchById(songID);
            cache.put(songID, song);
        }
        return song;
    }

    @Override
    public List<Song> searchByTitle(String title) {
        List<Song> songList = new ArrayList<>();
        for (Song s : cache.values()) {
            if (s.title().contains(title)) {
                songList.add(s);
            }
        }
        songList.addAll(SongServer.getInstance().searchByTitle(title));
        return songList;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        List<Song> songList = new ArrayList<>();
        for (Song s : cache.values()) {
            if (s.album().contains(album)) {
                songList.add(s);
            }
        }
        songList.addAll(SongServer.getInstance().searchByAlbum(album));
        return songList;
    }
}
