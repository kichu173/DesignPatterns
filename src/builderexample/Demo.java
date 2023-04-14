package builderexample;

public class Demo {
    public static void main(String[] args) {// sudoCode
        URLBuilder.Builder builder = new URLBuilder.Builder();
        builder.protocol("http://").hostname("newwebsite:").port("443");
        URLBuilder urlBuilder = builder.build();

        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.println(urlBuilder.port);

        URLBuilder.Builder builderTwo = new URLBuilder.Builder();
        builderTwo.protocol("http://").hostname("newwebsiteTwo").pathParam("/abc");
        URLBuilder urlBuilderTwo = builderTwo.build();

        System.out.print(urlBuilderTwo.protocol);
        System.out.print(urlBuilderTwo.hostname);
        System.out.println(urlBuilderTwo.pathParam);
    }
}
