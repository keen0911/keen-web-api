package com.example.keen.web.service;

import java.util.ArrayList;
import java.util.HashMap;

public interface MeetingRoomService {
    public ArrayList<HashMap> searchAllMeetingRoom();

    public HashMap searchById(int id);

    public ArrayList<String> searchFreeMeetingRoom(HashMap param);
}
