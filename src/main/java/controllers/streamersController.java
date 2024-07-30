package controllers;

import DAO.StreamersDAO;
import Model.Streamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.Random;

@Controller
@RequestMapping("/streamers")
public class streamersController {
    private final StreamersDAO streamers;
    @Autowired
    public streamersController(StreamersDAO streamers) {
        this.streamers = streamers;
    }

    @GetMapping()//Основная страничка со всеми стримерами
    public String pageWithAllStreamers(Model model){
        model.addAttribute("AllStreamers",streamers.streamersList());
        if(!streamers.streamersList().isEmpty()){
            Random rand = new Random();
            int randomIndex = rand.nextInt(streamers.streamersList().size());
            model.addAttribute("randomNickname",streamers.streamersList().get(randomIndex));
        }
        return "MainPageWithEverybody";
    }

    @GetMapping("/{id}")//Страничка определенного стримера
    public String concretStreamer(@PathVariable("id") int id, Model model){
        model.addAttribute("concretStreamer",streamers.concretStremer(id));
        return "ConcretStreamerPage";
    }
    @GetMapping("/new")
    public String newStreamer(@ModelAttribute("newStreamer") Streamer streamer){
        return "newStreamer";
    }
    @PostMapping()
    public String addNewStreamer(@ModelAttribute("newStreamer")Streamer streamer){
        streamers.save(streamer);
        return "redirect:/streamers";
    }
    @GetMapping("/{id}/edit")
    public String editPage(@PathVariable("id") int id,Model model){
        model.addAttribute("concretStreamer",streamers.concretStremer(id));
        return "edit";
    }
    @PatchMapping("/{id}")
    public String TotalEdit(@ModelAttribute("newStreamer")Streamer streamer,@PathVariable("id") int id){
        streamers.update(id,streamer);
        return "redirect:/streamers";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        streamers.delete(id);
        return "redirect:/streamers";
    }
}
