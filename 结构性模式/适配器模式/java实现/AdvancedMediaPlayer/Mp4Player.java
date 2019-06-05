public class Mp4Player implements AdvancedMediaPlayer{
    // 实现这个接口播放mp4的方法
    @Override
    public void playVlc(String fileName) {
       //什么也不做
    }
  
    @Override
    public void playMp4(String fileName) {
       System.out.println("Playing mp4 file. Name: "+ fileName);      
    }
 }