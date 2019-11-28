public class MainApplication {
    public static void main(String[] args) {
        try {
            // Just one line and you are done !
            // We have given a command to start cmd
            // /K : Carries out command specified by string
            String filename = "C:/Users/murilo_r/Downloads/server-2/build/libs/server-2-0.0.1-SNAPSHOT.jar";
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + filename + "\""});

        } catch (Exception e) {
            System.out.println("HEY Buddy ! U r Doing Something Wrong ");
            e.printStackTrace();
        }
    }
}

