package design.patterns.structural.proxy;

/**
 * RealSubject
 */
public class HighResolutionImage implements Image {

    public HighResolutionImage(String imageFilePath) {

        loadImage(imageFilePath);
    }

    private void loadImage(String imageFilePath) {

        // load Image from disk into memory
        // this is heavy and costly operation
        System.out.println("Loading from storage: " + imageFilePath);
    }

    @Override
    public void showImage() {

        // Actual Image rendering logic
        System.out.println("Actual Image rendering logic");
    }

}
