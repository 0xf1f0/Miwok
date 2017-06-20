package com.example.android.miwok;

/**
 * Created by Lenovo on 6/13/2017.
 */

import android.graphics.drawable.Drawable;
import android.media.Image;

/**
 * {@link Word} represents a vocabulary word that user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word
{
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Image resourceId for the word
     */

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourceId;


    private static final int NO_IMAGE_PROVIDED = -1;

    /***
     * @param defaultTranslation
     * @param miwokTranslation
     * @param audioResourceId
     */

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }


    /***
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId
     * @param audioResourceId
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     *
     * @return the default translation of the word.
     */
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    /**
     *
     * @return the Miwok translation of the word.
     */
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    /**
     *
     * @return the Image resourceId for the word.
     */
    public int getImage()
    {
        return mImageResourceId;
    }

    @Override
    public String toString()
    {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }

    /**
     *
     * @return whether or not there is an image for this word.
     */
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     *
     * @return the audio resourceId for the word.
     */
    public int getAudioResourceId () {return mAudioResourceId; }


}
