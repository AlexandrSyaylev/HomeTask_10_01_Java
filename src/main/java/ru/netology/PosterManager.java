package ru.netology;

public class PosterManager {

    private int limitOnPage = 10;
    private MovieElement[] poster = new MovieElement[0];

    public void add(MovieElement movie) {
        MovieElement[] tmp = new MovieElement[poster.length + 1];
        /*for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];
        }*/
        System.arraycopy(poster, 0, tmp, 0, poster.length);
        tmp[tmp.length - 1] = movie;
        poster = tmp;
    }

    public MovieElement[] getAllForward() {
        /*MovieElement[] result = new MovieElement[poster.length];
        return result;*/
        return poster;
    }

    public MovieElement[] getLimitReverse(int countOnPage) {
        int resultLength = 0;
        if (countOnPage <= limitOnPage) {
            resultLength = countOnPage;
        } else {
            resultLength = limitOnPage;
        }
        if (resultLength < poster.length) {
            resultLength = poster.length;
        }
        MovieElement[] result = new MovieElement[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = poster[poster.length - i - 1];
        }
        return result;
    }

    public PosterManager() {
    }

    ;

    public PosterManager(int limitOnPage) {
        this.limitOnPage = limitOnPage;
    }
}

