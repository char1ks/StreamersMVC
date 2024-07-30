package DAO;

import Model.Streamer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StreamersDAO {
    private int IDS;
    List<Streamer>streamers=new ArrayList<>();
    public List<Streamer> streamersList(){
        return streamers;
    }
    public Streamer concretStremer(int id){
        return streamers.stream().filter(streamer -> streamer.getId()==id).findAny().orElse(null);
    }
    public void save(Streamer streamer){
        streamer.setId(++IDS);
        streamers.add(streamer);
    }
    public void update(int id ,Streamer streamer){
        Streamer streamer1=concretStremer(id);
        streamer1.setLox(streamer.getLox());
        streamer1.setNick(streamer.getNick());
        streamer1.setSubscribers(streamer.getSubscribers());
    }
    public void delete(int id){
        streamers.removeIf(streamer -> streamer.getId()==id);
    }
}
