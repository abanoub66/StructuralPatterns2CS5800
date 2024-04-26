import MusicProxy.Song;
import MusicProxy.SongProxy;
import MusicProxy.SongServer;

public class SongDriver {

    public static void main(String[] args) {
        SongServer server = SongServer.getInstance();

        server.insert(new Song("Clair de Lune", "Claude Debussy", "Clair de Lune", 291));
        server.insert(new Song("the Sound of Music", "Charmian Carr", "The Sound of Music", 133));
        server.insert(new Song("Sora", "Yoko Shimomura", "Kingdom Hearts II OST", 143));
        server.insert(new Song("I Hear a Symphony", "Cody Fry", "Flying", 185));
        server.insert(new Song("For the Dancing and the Dreaming", "Erutan", "For the Dancing and the Dreaming", 174));
        server.insert(new Song("Misty Mountains", "The Wellerman", "Misty Mountains", 254));
        server.insert(new Song("Epilogue", "Justin Hurwitz", "La La Land Soundtrack", 459));
        server.insert(new Song("Would You be So Kind", "Dodie", "You", 180));
        server.insert(new Song("小喋日和", "Fantastic Youth", "小喋日和", 180 + 48));
        server.insert(new Song("Gom Jabbar", "Hans Zimmer", "Dune Soundtrack", 180));

        SongProxy proxy = new SongProxy();

        System.out.println(proxy.searchById(7));
        System.out.println(proxy.searchById(7));
        System.out.println(proxy.searchByTitle("Clair de"));
        System.out.println(proxy.searchByTitle("the"));
        System.out.println(proxy.searchByTitle("the"));
        System.out.println(proxy.searchByAlbum("u"));
        System.out.println(proxy.searchByAlbum("Dune Soundtrack"));
    }
}
