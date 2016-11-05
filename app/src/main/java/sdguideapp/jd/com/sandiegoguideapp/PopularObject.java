package sdguideapp.jd.com.sandiegoguideapp;


/**
 * This object represent a popular location or event in san diego
 */

public class PopularObject {

    /* picture resource id from drawable*/
    private int pictureSource;

    /* some information about the place */
    private String description;

    /* title to display on the screen sth short but catchy*/
    private String title;

    /* url link to open with browser to a website contain more details info*/
    private String urlLink;

    /**
     * constructor to construct a popular object
     *
     * @param description
     * @param pictureSource
     * @param title
     * @param urlLink
     */
    public PopularObject(String description, int pictureSource, String title, String urlLink) {
        this.description = description;
        this.pictureSource = pictureSource;
        this.title = title;
        this.urlLink = urlLink;
    }

    /* GETTERS AND SETTERS */
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPictureSource(int pictureSource) {
        this.pictureSource = pictureSource;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrlLink(String urlLink) {
        this.urlLink = urlLink;
    }

    public String getDescription() {

        return description;
    }

    public int getPictureSource() {
        return pictureSource;
    }

    public String getTitle() {
        return title;
    }

    public String getUrlLink() {
        return urlLink;
    }
}
