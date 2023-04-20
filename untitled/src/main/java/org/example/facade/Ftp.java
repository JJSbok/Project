package org.example.facade;

public class Ftp {

    private String host;
    private int port;
    private String path;

    public Ftp(String host, int port, String path){
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public void connect(){
        System.out.println("FTP Host : " + host + " port : " + "연결");
    }

    public void moveDirectory(){
        System.out.println("FTP Path : " + path + "로 이동");
    }

    public void disConnect(){
        System.out.println("연결 종료");
    }
}
