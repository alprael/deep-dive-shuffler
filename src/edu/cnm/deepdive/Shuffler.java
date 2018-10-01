package edu.cnm.deepdive;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.print.attribute.IntegerSyntax;

public class Shuffler {

  public static void main(String[] args) {
    int[] deck = new int[52];
    for (int x = 0; x < deck.length; x++) {
      deck[x] = x + 1;
    }
    System.out.println(Arrays.toString(deck));
    shuffle(deck);
    System.out.println(Arrays.toString(deck));

    String[] names = {"JR","Dina","Alex", "Sam", "Alex"};
    System.out.println(Arrays.toString(names));
    shuffle(names);
    System.out.println(Arrays.toString(names));
  }

  public static void shuffle(int[] deck) {

    shuffle(deck, new Random());

  }

  public static void shuffle(int[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      int temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(byte[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      byte temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(byte[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(char[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      char temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(char[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(double[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      double temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(double[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(float[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      float temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(float[] deck) {
    shuffle(deck, new Random());
  }

  public static void shuffle(long[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      long temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
  }

  public static void shuffle(long[] deck) {
    shuffle(deck, new Random());
  }


  public static <T> void shuffle(T[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      T temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }}
  public static <T> void shuffle(T[] deck){
    shuffle(deck, new Random());
  }
}

//    Random rnd = new Random();
//    Integer[] newDeck = new Integer[52];
//    ArrayList<Integer> decklist = new ArrayList<Integer>(Arrays.asList(deck));
//    for(int x = 0; x < deck.length;x++){
//     newDeck[x] = decklist.remove(rnd.nextInt(decklist.size()-x));
//
//    for (int i = deck.length - 1; i > 0; i--) {
//      int swap = rnd.nextInt(i + 1);
//      int temp = deck[swap];
//      deck[swap] = deck[i];
//      deck[i] = temp;
//    }

//    System.arraycopy(newDeck,0,deck,0,deck);}














