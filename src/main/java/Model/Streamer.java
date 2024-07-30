package Model;

public class Streamer {
    private int id;
    private String nick;
    private String subscribers;
    private String Lox;

    public Streamer() {
    }

    public Streamer(int id, String nick, String subscribers, String lox) {
        this.id = id;
        this.nick = nick;
        this.subscribers = subscribers;
        Lox = lox;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(String subscribers) {
        this.subscribers = subscribers;
    }

    public String getLox() {
        return Lox;
    }

    public void setLox(String lox) {
        Lox = lox;
    }
}
