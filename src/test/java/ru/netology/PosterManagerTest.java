package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosterManagerTest {
    /*PosterManager post = new PosterManager();*/
    MovieElement firstMovieInTopCHart = new MovieElement(1, "Movie 5", "comedy", "none", false);
    MovieElement secondMovieInTopCHart = new MovieElement(2, "Charlie", "Family", "none", false);
    MovieElement thirdMovieInTopCHart = new MovieElement(3, "Monty Python and the Holy Grail", "comedy", "none", true);
    MovieElement thithtMovieInTopCHart = new MovieElement(4, "Movie 5", "comedy", "none", false);
    MovieElement firthMovieInTopCHart = new MovieElement(5, "Charlie", "Family", "none", false);
    MovieElement sixthMovieInTopCHart = new MovieElement(6, "Monty Python and the Holy Grail", "comedy", "none", true);
    MovieElement seventhtMovieInTopCHart = new MovieElement(7, "Movie 5", "comedy", "none", false);
    MovieElement eightMovieInTopCHart = new MovieElement(8, "Charlie", "Family", "none", false);
    MovieElement ninthdMovieInTopCHart = new MovieElement(9, "Monty Python and the Holy Grail", "comedy", "none", true);
    MovieElement tenthMovieInTopCHart = new MovieElement(10, "Movie 5", "comedy", "none", false);
    MovieElement elevehtenthMovieInTopCHart = new MovieElement(11, "Charlie", "Family", "none", false);


    @Test
    void shouldAddAllOutElement() {
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[]{firstMovieInTopCHart, secondMovieInTopCHart, thirdMovieInTopCHart};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowAllElementsForwardWhenCountIsFive() {
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        post.add(thithtMovieInTopCHart);
        post.add(firthMovieInTopCHart);
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[]{firstMovieInTopCHart, secondMovieInTopCHart, thirdMovieInTopCHart, thithtMovieInTopCHart, firthMovieInTopCHart};
        assertArrayEquals(expected, actual);
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
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowAllElementsForwardWhenCountIsTen() {
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
        MovieElement[] expected = new MovieElement[]{firstMovieInTopCHart, secondMovieInTopCHart, thirdMovieInTopCHart, thithtMovieInTopCHart, firthMovieInTopCHart, sixthMovieInTopCHart, seventhtMovieInTopCHart, eightMovieInTopCHart, ninthdMovieInTopCHart, tenthMovieInTopCHart
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowAllElementsForwardWhenCountIsEleven() {
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
        MovieElement[] expected = new MovieElement[]{firstMovieInTopCHart, secondMovieInTopCHart, thirdMovieInTopCHart, thithtMovieInTopCHart, firthMovieInTopCHart, sixthMovieInTopCHart, seventhtMovieInTopCHart, eightMovieInTopCHart, ninthdMovieInTopCHart, tenthMovieInTopCHart, elevehtenthMovieInTopCHart
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowAllElementsForwardWhenCountIsTwo() {
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[]{firstMovieInTopCHart, secondMovieInTopCHart};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowAllElementsForwardWhenCountIsOne() {
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[]{firstMovieInTopCHart};
        assertArrayEquals(expected, actual);
    }

    //здеся будет падение
    @Test
    void shouldShowAllElementsForwardWhenCountIsZero() {
        PosterManager post = new PosterManager();
        MovieElement[] actual = post.getAllForward();
        MovieElement[] expected = new MovieElement[]{};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsTen() {
        PosterManager post = new PosterManager(10);
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
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{tenthMovieInTopCHart, ninthdMovieInTopCHart, eightMovieInTopCHart, seventhtMovieInTopCHart, sixthMovieInTopCHart, firthMovieInTopCHart, thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart, firstMovieInTopCHart
        };
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsNine() {
        PosterManager post = new PosterManager(9);
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        post.add(thithtMovieInTopCHart);
        post.add(firthMovieInTopCHart);
        post.add(sixthMovieInTopCHart);
        post.add(seventhtMovieInTopCHart);
        post.add(eightMovieInTopCHart);
        post.add(ninthdMovieInTopCHart);
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{ninthdMovieInTopCHart, eightMovieInTopCHart, seventhtMovieInTopCHart, sixthMovieInTopCHart, firthMovieInTopCHart, thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart, firstMovieInTopCHart
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsEleven() {
        PosterManager post = new PosterManager(11);
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
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{elevehtenthMovieInTopCHart, tenthMovieInTopCHart, ninthdMovieInTopCHart, eightMovieInTopCHart, seventhtMovieInTopCHart, sixthMovieInTopCHart, firthMovieInTopCHart, thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart, firstMovieInTopCHart
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsFive() {
        PosterManager post = new PosterManager(5);
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        post.add(thithtMovieInTopCHart);
        post.add(firthMovieInTopCHart);
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{firthMovieInTopCHart, thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart, firstMovieInTopCHart};
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsOne() {
        PosterManager post = new PosterManager(1);
        post.add(firstMovieInTopCHart);
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{firstMovieInTopCHart};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowAllElementsReverseWhenCountIsZero() {
        PosterManager post = new PosterManager(0);
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[0];
        assertArrayEquals(expected, actual);

    }

    @Test
    void shouldShowManualLimitElementsReverseWhenCountIsEleven() {
        PosterManager post = new PosterManager(5);
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
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{elevehtenthMovieInTopCHart, tenthMovieInTopCHart, ninthdMovieInTopCHart, eightMovieInTopCHart, seventhtMovieInTopCHart
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowManualLimitElementsReverseWhenLimitIsBiggerThanElement() {
        PosterManager post = new PosterManager(9);
        post.add(firstMovieInTopCHart);
        post.add(secondMovieInTopCHart);
        post.add(thirdMovieInTopCHart);
        post.add(thithtMovieInTopCHart);
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart, firstMovieInTopCHart
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLimitElementsReverseWhenCountIsTenItsDefault() {
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
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{tenthMovieInTopCHart, ninthdMovieInTopCHart, eightMovieInTopCHart, seventhtMovieInTopCHart, sixthMovieInTopCHart, firthMovieInTopCHart, thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart, firstMovieInTopCHart
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLimitByDefaultElementsReverseWhenCountIsEleven() {
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
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{elevehtenthMovieInTopCHart, tenthMovieInTopCHart, ninthdMovieInTopCHart, eightMovieInTopCHart, seventhtMovieInTopCHart, sixthMovieInTopCHart, firthMovieInTopCHart, thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLimitByDefaultElementsReverseWhenCountIsNine() {
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
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{ninthdMovieInTopCHart, eightMovieInTopCHart, seventhtMovieInTopCHart, sixthMovieInTopCHart, firthMovieInTopCHart, thithtMovieInTopCHart, thirdMovieInTopCHart, secondMovieInTopCHart, firstMovieInTopCHart
        };
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLimitByDefaultElementsReverseWhenCountIsOne() {
        PosterManager post = new PosterManager();
        post.add(firstMovieInTopCHart);
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{firstMovieInTopCHart};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldShowLimitByDefaultElementsReverseWhenCountIsZero() {
        PosterManager post = new PosterManager();
        MovieElement[] actual = post.getLimitReverse();
        MovieElement[] expected = new MovieElement[]{};
        assertArrayEquals(expected, actual);
    }
}