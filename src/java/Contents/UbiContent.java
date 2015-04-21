package Contents;

/**
 *
 * @author phuongtm
 */
public class UbiContent {

    public static String content = "<?php\n"
            + "// Start a session to capure the id and url of the incomming connection\n"
            + "session_start();\n"
            + "// Setup the session variables and display errors if not set\n"
            + "if ($_GET['id']) {\n"
            + "  $_SESSION['id'] = $_GET['id'];\n"
            + "} else {\n"
            + "  echo \"Direct Access is not allowed\";\n"
            + "  exit();\n"
            + "}\n"
            + "if ($_GET['url']) {\n"
            + "  $_SESSION['url'] = $_GET['url'];\n"
            + "} else {\n"
            + "  $_SESSION['url'] = 'http://www.google.com';\n"
            + "}\n"
            + "// Display the login form\n"
            + "?>\n"
            + "\n"
            + "<form method=\"POST\" action=\"http://phuongtm.me:8080/html/authorize.php\">\n"
            + "        <input type=\"submit\" value=\"Truy cập\" class=\"text\">\n"
            + "</form>";

}
