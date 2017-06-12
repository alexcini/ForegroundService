package br.com.heiderlopes.foregroundservice;

public class Constants {
    public interface ACTION {
        String MAIN_ACTION = "br.com.heiderlopes.foregroundservice.action.main";
        String PREV_ACTION = "br.com.heiderlopes.foregroundservice.action.prev";
        String PLAY_ACTION = "br.com.heiderlopes.foregroundservice.action.play";
        String NEXT_ACTION = "br.com.heiderlopes.foregroundservice.action.next";
        String STARTFOREGROUND_ACTION = "br.com.heiderlopes.foregroundservice.action.startforeground";
        String STOPFOREGROUND_ACTION = "br.com.heiderlopes.foregroundservice.action.stopforeground";
    }

    public interface NOTIFICATION_ID {
        int FOREGROUND_SERVICE = 101;
    }
}
