package com.example.webviewdestroydemo;

public class Constants {
    public final static String TAG = "WebViewDestroyDemo";
    public final static String HTML = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "\n" +
            "<head>\n" +
            "  <meta charset=\"UTF-8\">\n" +
            "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "  <title>Document</title>\n" +
            "</head>\n" +
            "\n" +
            "<body>\n" +
            "  <p>hello world</p>\n" +
            "  <script>\n" +
            "    setTimeout(() => {\n" +
            "      while (true) {\n" +
            "        if (__bridge__) {\n" +
            "          __bridge__.nativeCall(\"hello\");\n" +
            "        }\n" +
            "      }\n" +
            "    }, 100);\n" +
            "  </script>\n" +
            "</body>\n" +
            "\n" +
            "</html>\n";
}
