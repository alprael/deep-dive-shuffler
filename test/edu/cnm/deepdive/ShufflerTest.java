package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ShufflerTest {

  @Test
  void shuffleByte() {
    byte[] source = {1,2,3,4,5,6,7,8,9,10};
    byte[] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertEquals(source, destination);
  }

  @Test
  void shuffleChar() {
    char[] source = {1,2,3,4,5,6,7,8,9,10};
    char[] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertEquals(source, destination);
  }

  @Test
  void shuffleDouble() {
    double[] source = {1,2,3,4,5,6,7,8,9,10};
    double[] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertEquals(source, destination);
  }

  @Test
  void shuffleFloat() {
    float[] source = {1,2,3,4,5,6,7,8,9,10};
    float[] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertEquals(source, destination);
  }

  @Test
  void shuffleLong() {
    long[] source = {1,2,3,4,5,6,7,8,9,10};
    long[] destination = Arrays.copyOf(source, source.length);
    Shuffler.shuffle(destination);
    assertFalse(Arrays.equals(source, destination));
    Arrays.sort(source);
    Arrays.sort(destination);
    assertEquals(source, destination);
  }
}