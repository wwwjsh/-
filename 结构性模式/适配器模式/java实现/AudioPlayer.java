public class AudioPlayer implements MediaPlayer {
    // 实现一个高级的播放器 能播放所有的文件格式的流媒体
    // 这个工厂将两个不相关的类组合起来了
    MediaAdapter mediaAdapter; 
    // 实现播放mp3
    @Override
    public void play(String audioType, String fileName) {    
       //播放 mp3 音乐文件的内置支持
       if(audioType.equalsIgnoreCase("mp3")){
          System.out.println("Playing mp3 file. Name: "+ fileName);         
       } 
       //mediaAdapter 提供了播放其他文件格式的支持
       else if(audioType.equalsIgnoreCase("vlc") 
          || audioType.equalsIgnoreCase("mp4")){
          mediaAdapter = new MediaAdapter(audioType);
          mediaAdapter.play(audioType, fileName);
       }
       else{
          System.out.println("Invalid media. "+
             audioType + " format not supported");
       }
    }   
 }