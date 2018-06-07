package facade;

public class VideoConverter {

    public void convert(String filename, String format){
        VideoFile videoFile = new VideoFile(filename);
        if(format.equals("MP4")){
            //logic to convert to this format
            MPEG4CompressionCodec codec = new MPEG4CompressionCodec(filename);
            System.out.println("Converting video to MP4");
        }else if (format.equals("H264")){
            //logic to convert to this format
            H264Video codec = new H264Video(filename);
            System.out.println("Converting video to H264");
        }
    }

}