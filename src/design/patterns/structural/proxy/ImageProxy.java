package design.patterns.structural.proxy;

/**
 * Proxy
 */
public class ImageProxy implements Image {

    /**
     * Private Proxy data
     */
    private String imageFilePath;

    /**
     * Reference to RealSubject
     */
    private Image proxifiedImage;


    public ImageProxy(String imageFilePath) {
        this.imageFilePath= imageFilePath;
        System.out.println("Proxy:" + imageFilePath);
    }

    @Override
    public void showImage() {

        // create the Image Object only when the image is required to be shown
        System.out.println("Creating HD Image : " + imageFilePath);
        proxifiedImage = new HighResolutionImage(imageFilePath);

        // now call showImage on realSubject
        proxifiedImage.showImage();

    }

}
