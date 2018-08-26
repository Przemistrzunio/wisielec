package com.sda.hangman.domain.model;

import org.assertj.core.api.Assertions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


@RunWith(Enclosed.class)
public class GameStatusTest {
    public static class GameStatusHelperTest {

        @Test
        public void should_return_array_with_null_values_for_one_word_phrase() {
            //given
            GameStatus.GameStatusHelper gameStatusHelper = new GameStatus.GameStatusHelper();
            //when
            Character[] phraseState = gameStatusHelper.preparePhraseState("Wielkopolska");
            //then
            Assertions.assertThat(phraseState).allMatch((e) -> e == null);
        }

        @Test
        public void should_return_array_with_null_and_special_chars_values_for_multi_words_phrase() {
            //given
            GameStatus.GameStatusHelper gameStatusHelper = new GameStatus.GameStatusHelper();
            //when
            Character[] phraseState = gameStatusHelper.preparePhraseState("Ala ma-kota");
            //then
            Assertions.assertThat(phraseState).containsOnly(null, ' ', '-');
            Assert.assertEquals((Character) ' ', phraseState[3]);
            Assert.assertEquals((Character) '-', phraseState[6]);
        }
    }
}