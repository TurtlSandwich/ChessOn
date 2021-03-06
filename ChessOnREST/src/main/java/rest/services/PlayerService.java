package rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.models.Player;
import rest.repositories.IPlayerRepository;

@Service
public class PlayerService {

    @Autowired
    private IPlayerRepository playerRepository;

    public void savePlayer(Player player) {
        playerRepository.save(player);
    }

    public boolean login(Player player) {
        if(playerRepository.findPlayerByName(player.getName()) != null) {
            
        }
    }
}
