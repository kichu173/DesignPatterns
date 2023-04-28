package FactoryDesignPatterExample;

// creating objects of similar type
// Hides complexity of object creation
// client code has no idea about object creation

public class FactoryPatternDemo {

    private FactoryPatternDemo() {

    }

    private static OperatingSystem getInstance(String type, String version, String architecture) {
        switch (type) {
            case "WINDOWS":
                return new WindowsOperatingSystem(version, architecture);
            case "LINUX":
                return new LinuxOperatingSystem(version, architecture);
            default:
                throw new IllegalArgumentException("OS not supported: " + type);
        }
    }

    public static void main(String[] args) {
        OperatingSystem os1 = FactoryPatternDemo.getInstance("WINDOWS", "WIN7", "x64");
        OperatingSystem os2 = FactoryPatternDemo.getInstance("LINUX", "DEB", "x64");
    }
}
