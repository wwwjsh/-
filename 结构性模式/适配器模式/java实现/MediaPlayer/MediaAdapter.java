public class MediaAdapter implements MediaPlayer {
      // 这是一个工厂
    // 实现更高级的播放器的接口 实现的更高级的类
    AdvancedMediaPlayer advancedMusicPlayer;
    // 这个方法提供两个可以使用的播放器原件 
    public MediaAdapter(String audioType){
       if(audioType.equalsIgnoreCase("vlc") ){
          advancedMusicPlayer = new VlcPlayer();       
       } else if (audioType.equalsIgnoreCase("mp4")){
          advancedMusicPlayer = new Mp4Player();
       }  
    }
    // 这个方法提供播放功能 
    @Override
    public void play(String audioType, String fileName) {
       if(audioType.equalsIgnoreCase("vlc")){
          advancedMusicPlayer.playVlc(fileName);
       }else if(audioType.equalsIgnoreCase("mp4")){
          advancedMusicPlayer.playMp4(fileName);
       }
    }
 }