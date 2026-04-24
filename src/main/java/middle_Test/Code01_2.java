package middle_Test;

public class Code01_2 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36-0700]" +
                " \"GET /apache_pb.gif HTTP/1.0\" 200";

        int start = log.indexOf(' ', log.indexOf('\"'))+1;
        int end = log.lastIndexOf(' ', log.lastIndexOf("\""));


        System.out.println(log.substring(start, end));
    }
}
