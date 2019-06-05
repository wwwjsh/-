public class VlcPlayer implements AdvancedMediaPlayer{
    // 实现了播放父类一个格式的东西
    @Override
    public void playVlc(String fileName) {
       System.out.println("Playing vlc file. Name: "+ fileName);      
    }
    
    @Override
    public void playMp4(String fileName) {
       //什么也不做
    }
 }