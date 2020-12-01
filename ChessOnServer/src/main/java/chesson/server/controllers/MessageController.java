package chesson.server.controllers;

import chesson.server.logic.ServerLogic;
import chesson.server.messages.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    private final SimpMessagingTemplate simpMessagingTemplate;
    private final ServerLogic serverLogic;

    @Autowired
    public MessageController(SimpMessagingTemplate simpMessagingTemplate, ServerLogic serverLogic) {
        this.simpMessagingTemplate = simpMessagingTemplate;
        this.serverLogic = serverLogic;
    }

    @MessageMapping("/joinLobby")
    public void JoinLobby(Message messageIn) {
    }

    @MessageMapping("/createLobby")
    public void CreateLobby(Message messageIn) {

    }
}