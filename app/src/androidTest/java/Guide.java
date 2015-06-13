/**
 * Created by pratik on 6/13/15.
 */

public class Guide {
    private double overallRating;
    private int ratingsEntered = 0;
    String guideName;
    double distance;
    int rating;
    String description;

    public Guide(String newGuideName, double newDistance, int newRating, String newDescription) {
        guideName = newGuideName;
        distance = newDistance;
        rating = newRating;
        description = newDescription;
    }


    public String getGuideName() { return guideName; }

    public double returnDistance() {
        return distance;
    }

    public int returnRating() {
        return rating;
    }

    public String returnDescription() {
        return description;
    }

    public double calcUserRating() {
        int temp = returnRating();
        ratingsEntered++;
        overallRating += temp;

        return (overallRating) / (ratingsEntered);
    }











} // end of class Guide
