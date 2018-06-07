package facade;

import org.junit.Test;

public class VideoConverterTest {

    @Test
    public void testConvertVideo(){
        VideoConverter videoConverter = new VideoConverter();
        videoConverter.convert("testVideo.h264", "MP4");

    }



}