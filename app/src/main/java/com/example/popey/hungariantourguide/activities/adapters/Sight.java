package com.example.popey.hungariantourguide.activities.adapters;

public class Sight {

    /**
     * String resource ID for the title of the Sight
     */
    private int mTitleSight;

    /**
     * String resource ID for the description of the Sight
     */
    private int mDescriptionSight;

    /**
     * Image resource ID for the Sight
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this Sight
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Sight object.
     *
     * @param titleSight       is the string resource ID for the title of the Sight
     * @param descriptionSight is the string resource Id for the description of the Sight
     * @param imageResourceId  is the drawable resource ID for the image associated with the word
     */
    public Sight(int titleSight, int descriptionSight, int imageResourceId) {
        mTitleSight = titleSight;
        mDescriptionSight = descriptionSight;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the string resource ID for the title of the Sight.
     */
    public int getTitleSight() {
        return mTitleSight;
    }

    /**
     * Get the string resource ID for the description of the Sight.
     */
    public int getDescriptionSight() {
        return mDescriptionSight;
    }

    /**
     * Return the image resource ID of the Sight.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this Sight;
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

