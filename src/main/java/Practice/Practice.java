package Practice;

public class Practice {

    public static void main(String[] args) {

        String log1 = "127.0.0.1 - - [31/Mar/2026:10:00:01 +0900] \"GET /index.html HTTP/1.1\" 200 1043 \"-\" \"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36\"";
        String log2 = "192.168.1.50 - - [31/Mar/2026:10:00:05 +0900] \"POST /login.php HTTP/1.1\" 302 20 \"-\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 17_0 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/17.0 Mobile/15E148 Safari/604.1\"";

        int space = log1.indexOf(" ", log1.indexOf("\""));

        System.out.println(space);
        String res = log1.substring(space, log1.indexOf(" ", space + 1));
        String dex = log2.substring(space, log1.indexOf(" ", space + 1));

        System.out.println("접속한 페이지 : " + res);
        System.out.println("접속한 페이지 : " + dex);
    }
}
