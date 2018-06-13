package com.ssh.bean.resp;

/**
 * 
* @Description: 音乐消息
* @author: 熊超
* @date: 2018年6月7日 上午11:02:06
 */
public class MusicMessage extends BaseMessage {  
    // 音乐  
    private Music Music;  
  
    public Music getMusic() {  
        return Music;  
    }  
  
    public void setMusic(Music music) {  
        Music = music;  
    }  
}