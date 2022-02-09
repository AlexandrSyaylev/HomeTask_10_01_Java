package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    /*PosterManager post = new PosterManager();*/
    MovieElement firstMovieInTopCHart = new MovieElement(1, "Movie 5", "comedy","none", false);
    MovieElement secondMovieInTopCHart = new MovieElement(2, "Charlie", "Family","none", false);
    MovieElement thirdMovieInTopCHart = new MovieElement(3, "Monty Python and the Holy Grail", "comedy","none", true);
    MovieElement thithtMovieInTopCHart = new MovieElement(1, "Movie 5", "comedy","none", false);
    MovieElement firthMovieInTopCHart = new MovieElement(2, "Charlie", "Family","none", false);
    MovieElement sixthMovieInTopCHart = new MovieElement(3, "Monty Python and the Holy Grail", "comedy","none", true);
    MovieElement seventhtMovieInTopCHart = new MovieElement(1, "Movie 5", "comedy","none", false);
    MovieElement eightMovieInTopCHart = new MovieElement(2, "Charlie", "Family","none", false);
    MovieElement ninthdMovieInTopCHart = new MovieElement(3, "Monty Python and the Holy Grail", "comedy","none", true);
    MovieElement tenthMovieInTopCHart = new MovieElement(1, "Movie 5", "comedy","none", false);
    MovieElement elevehtenthMovieInTopCHart = new MovieElement(2, "Charlie", "Family","none", false);
    MovieElement TwelvethMovieInTopCHart = new MovieElement(3, "Monty Python and the Holy Grail", "comedy","none", true);
    @Test
    void shouldAddAllOurElement() {
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[] {firstMovieInTopCHart, secondMovieInTopCHart, thirdMovieInTopCHart};
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldShowAllElementsForwardWhenCountIsFive(){
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        post.add(thithtMovieInTopCHart);
        post.add(firthMovieInTopCHart);
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[] {firstMovieInTopCHart, secondMovieInTopCHart, thirdMovieInTopCHart, thithtMovieInTopCHart, firthMovieInTopCHart};
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldShowAllElementsForwardWhenCountIsNine() {

        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        post.add(thithtMovieInTopCHart);
        post.add(firthMovieInTopCHart);
        post.add(sixthMovieInTopCHart);
        post.add(seventhtMovieInTopCHart);
        post.add(eightMovieInTopCHart);
        post.add(ninthdMovieInTopCHart);
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[]{firstMovieInTopCHart, secondMovieInTopCHart, thirdMovieInTopCHart, thithtMovieInTopCHart, firthMovieInTopCHart, sixthMovieInTopCHart, seventhtMovieInTopCHart, eightMovieInTopCHart, ninthdMovieInTopCHart
        };
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldShowAllElementsForwardWhenCountIsTen(){
            PosterManager post = new PosterManager();
            post.add(firstMovieInTopCHart);
            post.add(secondMovieInTopCHart);
            post.add(thirdMovieInTopCHart);
            post.add(thithtMovieInTopCHart);
            post.add(firthMovieInTopCHart);
            post.add(sixthMovieInTopCHart);
            post.add(seventhtMovieInTopCHart);
            post.add(eightMovieInTopCHart);
            post.add(ninthdMovieInTopCHart);
            post.add(tenthMovieInTopCHart);
            MovieElement[] actual = post.getAllForward();
            MovieElement[] expected = new MovieElement[] {firstMovieInTopCHart, secondMovieInTopCHart, thirdMovieInTopCHart, thithtMovieInTopCHart, firthMovieInTopCHart, sixthMovieInTopCHart, seventhtMovieInTopCHart, eightMovieInTopCHart, ninthdMovieInTopCHart, tenthMovieInTopCHart
    };
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldShowAllElementsForwardWhenCountIsEleven(){
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        post.add(thithtMovieInTopCHart);
        post.add(firthMovieInTopCHart);
        post.add(sixthMovieInTopCHart);
        post.add(seventhtMovieInTopCHart);
        post.add(eightMovieInTopCHart);
        post.add(ninthdMovieInTopCHart);
        post.add(tenthMovieInTopCHart);
        post.add(elevehtenthMovieInTopCHart);
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[] {firstMovieInTopCHart, secondMovieInTopCHart, thirdMovieInTopCHart, thithtMovieInTopCHart, firthMovieInTopCHart, sixthMovieInTopCHart, seventhtMovieInTopCHart, eightMovieInTopCHart, ninthdMovieInTopCHart, tenthMovieInTopCHart, elevehtenthMovieInTopCHart
        };
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldShowAllElementsForwardWhenCountIsTwo(){
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[] {firstMovieInTopCHart, secondMovieInTopCHart};
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldShowAllElementsForwardWhenCountIsOne(){
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[] {firstMovieInTopCHart};
        assertArrayEquals(expected,actual);
    }

//здеся будет падение
    @Test
    void shouldShowAllElementsForwardWhenCountIsZero(){
        PosterManager post = new PosterManager();
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[] {};
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsTenItsDefault(){
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        post.add(thithtMovieInTopCHart);
        post.add(firthMovieInTopCHart);
        post.add(sixthMovieInTopCHart);
        post.add(seventhtMovieInTopCHart);
        post.add(eightMovieInTopCHart);
        post.add(ninthdMovieInTopCHart);
        post.add(tenthMovieInTopCHart);
        MovieElement[] actual = post.getLimitReverse(10);
        MovieElement[] expected = new MovieElement[] {tenthMovieInTopCHart, ninthdMovieInTopCHart, eightMovieInTopCHart, seventhtMovieInTopCHart, sixthMovieInTopCHart, firthMovieInTopCHart, thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart, firstMovieInTopCHart
        };
        assertArrayEquals(expected,actual);

    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsNine(){
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        post.add(thithtMovieInTopCHart);
        post.add(firthMovieInTopCHart);
        post.add(sixthMovieInTopCHart);
        post.add(seventhtMovieInTopCHart);
        post.add(eightMovieInTopCHart);
        post.add(ninthdMovieInTopCHart);
        MovieElement[] actual = post.getLimitReverse(9);
        MovieElement[] expected = new MovieElement[]{ninthdMovieInTopCHart, eightMovieInTopCHart, seventhtMovieInTopCHart, sixthMovieInTopCHart, firthMovieInTopCHart, thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart, firstMovieInTopCHart
        };
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsEleven(){
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        post.add(thithtMovieInTopCHart);
        post.add(firthMovieInTopCHart);
        post.add(sixthMovieInTopCHart);
        post.add(seventhtMovieInTopCHart);
        post.add(eightMovieInTopCHart);
        post.add(ninthdMovieInTopCHart);
        post.add(tenthMovieInTopCHart);
        post.add(elevehtenthMovieInTopCHart);
        MovieElement[] actual = post.getLimitReverse(11);
        MovieElement[] expected = new MovieElement[] {elevehtenthMovieInTopCHart, tenthMovieInTopCHart, ninthdMovieInTopCHart, eightMovieInTopCHart, seventhtMovieInTopCHart, sixthMovieInTopCHart, firthMovieInTopCHart, thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart, firstMovieInTopCHart
        };
        assertArrayEquals(expected,actual);

    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsFive(){
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        post.add(thithtMovieInTopCHart);
        post.add(firthMovieInTopCHart);
        MovieElement[] actual = post.getLimitReverse(5);
        MovieElement[] expected = new MovieElement[] {firthMovieInTopCHart, thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart, firstMovieInTopCHart};
        assertArrayEquals(expected,actual);

    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsOne(){
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        MovieElement[] actual = post.getLimitReverse(1);
        MovieElement[] expected = new MovieElement[] {secondMovieInTopCHart, firstMovieInTopCHart};
        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsZero(){
        PosterManager post = new PosterManager();
        MovieElement[] actual = post.getLimitReverse(0);
        MovieElement[] expected = new MovieElement[0];
        assertArrayEquals(expected,actual);

    }
}