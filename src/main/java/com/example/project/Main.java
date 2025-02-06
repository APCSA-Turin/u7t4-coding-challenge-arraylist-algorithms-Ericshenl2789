package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    
    
    /** Inserts toInsert after each String in stringList
    *  that contains the letter "i"
    *
    *  DOES mutate (modify) elements of stringList.
    *  PRECONDITION: stringList.size() > 0, toInsert.length() > 0
    *
    *  @param stringList  original arraylist of Strings
    *  @param str String to insert
    */
    public static ArrayList<String> insertAfterI(ArrayList<String> stringList, String str){
        int index = 0;
        for(int i = 0; i < stringList.size(); i++){
            if(stringList.get(i).contains("i")){
                index = i +1;
                stringList.add(index, str);
            }
        }
        return stringList;
    }



    /** Removes all Strings from stringList that have a length of 3
   *
   *  DOES mutate (modify) elements of stringList.
   *  PRECONDITION: stringList.size() > 0
   *
   *  @param stringList  original arraylist of Strings
   */
    public static ArrayList<String> removeThree(ArrayList<String> stringList){
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < stringList.size(); i++){
            if(stringList.get(i).length() != 3){
                result.add(stringList.get(i));
            }
        }
        return result;
    }



    /** Returns an ArrayList with all elements of arr reversed
   *
   *  Does NOT mutate (modify) elements in intList.
   *  PRECONDITION: intList.size() > 0
   *
   *  @param intList  original array of integers
   */
    public static ArrayList<Integer> reverseArray(int[] intList){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = intList.length - 1; i >= 0; i--){
            result.add(intList[i]);
        }
        return result;
    }



    /** Appends an uppercase version of each string to the end of wordList;
     *  the uppercase versions appear in the same order as the lowercase versions
     *  for example, if wordList is ["hello", "my", "best", "friend"]
     *  this this method modifies wordList to be:
     *  ["hello", "my", "best", "friend", "HELLO", "MY", "BEST", "FRIEND"]
     *
     *  DOES mutate (modify) elements in wordList
     *  PRECONDITIONS: wordList.size() > 0,
     *                 all words in wordList are initially lowercase
     *
     *  @param wordList  arraylist of Strings
     */
    public static ArrayList<String> duplicateUpperEnd(ArrayList<String> wordList){
        for(int i = 0; i<wordList.size(); i++){
            String word = wordList.get(i).toUpperCase();
            if(!word.equals(wordList.get(i))){
                wordList.add(word);
            }
        }
        return wordList;
    }



    /** Returns an arraylist of Strings that represents the input sentence parsed
   *  into separate words, using a single space (" ") as the delimiter
   *
   *  For example, if sentence = "This is my sentence!"
   *  this method return the arraylist: [This, is, my, sentence!]
   *
   *  PRECONDITION: sentence does not end with a space and each word is
   *                separated by exactly one space
   *
   *  @param sentence  the input String
   *  @return  new arraylist of Strings containing the words of sentence
   */

    public static ArrayList<String> parseSentence(String sentence){
        ArrayList<String> result = new ArrayList<>();
        while(sentence.contains(" ")){
            int index = sentence.indexOf(" ");
            result.add(sentence.substring(0, index));
            sentence = sentence.substring(index+1);
        }
        result.add(sentence);
        return result;
    }



    /** Moves all words in wordList that begin with "b" to the front of
   *  wordList; all "b" words that are moved should appear in the same order
   *  in the modified arrayList as they did before being moved
   *
   *  For example, this method will take a wordList:
   *  ["apple", "banana", "cherry", "donut", "Bagel", "danish", "berry", "baguette", "soda"]
   *  and modify it to
   *  ["banana", "Bagel", "berry", "baguette", "apple", "cherry", "donut", "danish", "soda"]
   *
   *  DOES mutate (modify) elements in wordList
   *  PRECONDITIONS: - wordList.size() > 0
   *                 - all strings in wordList have length >= 1
   *
   *  @param wordList  arraylist of words
   */
    public static ArrayList<String> moveBWords(ArrayList<String> wordList){
        ArrayList<String> temp = new ArrayList<String>();
        for(int i = 0; i < wordList.size(); i++){
            if(!wordList.get(i).substring(0, 1).toLowerCase().equals("b")){
                String word = wordList.get(i);
                temp.add(word);
                wordList.remove(i);
                i--;
            }
        }
        for(int i =0; i<temp.size();i++){
            wordList.add(temp.get(i));
        }
        return wordList;
    }



    /** Removes all duplicate values from an intList, leaving only the first
     *  occurrence in the arrayList; for example, this method will modify
     *  [1, 2, 5, 4, 2, 2, 1, 6, 4, 4, 8, 1, 7, 4, 2] --> [1, 2, 5, 4, 6, 8, 7]
     *
     *  DOES mutate (modify) elements in intList
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  intList of Integers
     */
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> intList){
        for(int i = 0; i < intList.size(); i++){
            for(int j = 0; j < i; j++){
                if(intList.get(j) == intList.get(i)){
                    intList.remove(i);
                    i--; 
                }
            }
        }
        return intList;
    }

    // Given an array of ints, 
    // return true if the array is length 1 or more, 
    // and the first element and the last element are equal.
    // sameFirstLast([1, 2, 3]) → false
    // sameFirstLast([1, 2, 3, 1]) → true
    // sameFirstLast([1, 2, 1]) → true
    //sameFirstLast([]) -> false
    public static boolean sameFirstLast(ArrayList<Integer> list){
        return list.size() >= 1 && list.get(0) == list.get(list.size()-1) ? true : false;
    }



    // Given an array of ints, swap the first and last elements in the array. 
    // Return the modified array. The array length will be at least 1.
    // swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
    // swapEnds([1, 2, 3]) → [3, 2, 1]
    // swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
    // swapEnds([]->[])
    public static ArrayList<Integer> swapEnds(ArrayList<Integer> list){
        if(list.size() >= 1){
            int first = list.get(0);
            int last = list.get(list.size()-1);
            list.remove(0);
            list.add(0, last);
            list.remove(list.size() -1);
            list.add(first);
        }
        return list;
    }



    // Return an array that contains the exact same numbers as the given array, 
    // but rearranged so that all the zeros are grouped at the start of the array. 
    // The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. 
    // You may modify and return the given array or make a new array.
    // zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
    // zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
    // zeroFront([1, 0]) → [0, 1]
    public static ArrayList<Integer> zeroFront(ArrayList<Integer> list){
        int count = 0;
        for(int i = 0; i <list.size(); i++){
            if(list.get(i) == 0){
                count++;
                list.remove(i);
                i--;
            }
        }
        while(count > 0){
            list.add(0,0);
            count--;
        }
        return list;
    }



    // We'll say that an element in an array is "alone" if there are values before and after it, 
    // and those values are different from it. If the value is at the end compare to the left and if its at the beginning compare to the right
    //Return a version of the given array where every instance 
    // of the given value which is alone is replaced by whichever value to its left or right is larger.
    // notAlone([1, 2, 3], 2) → [1, 3, 3]
    // notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 5]
    // notAlone([3, 4], 3) → [3, 3]
    public static ArrayList<Integer> notAlone(ArrayList<Integer> list, int val){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == val){
                if(i == 0){
                    if(val != list.get(i+1) && list.get(i+1)>=val){
                        list.set(i, list.get(i+1));
                    }
                }else if (i ==list.size() - 1){
                    if(val != list.get(i-1)){
                        list.set(i, list.get(i-1));
                    }
                }else{
                    int smaller = list.get(i-1);
                    int bigger = list.get(i+1);
                    if(val != bigger && val != smaller){
                        list.set(i, smaller >= bigger ? smaller : bigger);
                    }
                }
            }
        }
        return list;
    }



    // Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. 
    // You may modify and return the given array;
    // shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
    // shiftLeft([1, 2]) → [2, 1]
    // shiftLeft([1]) → [1]

    public static ArrayList<Integer> shiftLeft(ArrayList<Integer> list){
        int first = list.get(0);
        for(int i = 1; i < list.size(); i++){
            list.set(i-1, list.get(i));
        }
        list.set(list.size() - 1, first);
        return list;
    }
    


    // Return an array that contains exactly the same numbers as the given array, 
    // but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, 
    // but every other number may move. The array contains the same number of 3's and 4's, 
    // every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
    // fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
    // fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
    // fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

    public static ArrayList<Integer> fix34(ArrayList<Integer> list){
        int a = -1;
        int fourlocation = -1;
        for(int i = 0; i < list.size() - 1; i++){
            int threeLocation = a;
            for(int k = i; k<list.size(); k++){
                if(list.get(k) == 3){
                    threeLocation = k;
                    break;
                }
            }
            if(list.get(threeLocation+1) != 4){
                for(int j = fourlocation + 1; j< list.size(); j++){
                    if(list.get(j) == 4){
                        fourlocation = j;
                        break;
                    }
                }
                int nextNum = list.get(threeLocation+1);
                list.set(threeLocation + 1, 4);
                list.set(fourlocation, nextNum);
                a = threeLocation;
            }
        }
        return list;
    }



    /** Returns an arraylist of Integers that contain all mode(s) of the array numList.
   *  The mode of a list is the value that appears the greatest number of times.
   *  A list can have one mode, multiple mode, or no mode.
   *
   *  If all elements in the list appear the exact same number of times, there is no
   *  mode and this method should return an empty arraylist.
   *
   *  For example, if numList is: [1, 2, 6, 2, 3, 4, 6, 5, 5, 6, 7],
   *  then numList contains one mode: 6
   *  and this method returns an arrayList containing 6
   *
   *  If numList is: [1, 2, 3, 2, 4, 5, 5, 6],
   *  then numList contains two modes: 2, 5
   *  and this method returns an arraylist containing 2 and 5 (in any order)
   *
   *  If numList is: [1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6],
   *  then numList contains no mode because all values appear the same number of times
   *  and this method returns an empty arrayList: []
   *
   *  Does NOT mutate (modify) elements in numList
   *  PRECONDITIONS: numList.length > 0
   *
   *  @param numList  numList of ints
   */
    public static ArrayList<Integer> modes(int[] numList){
        ArrayList<ArrayList<Integer>> bigArray = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int max = 0;

        for(int j = 0; j < numList.length; j++){
            temp.add(numList[j]);
        }
        temp = removeDuplicates(temp);
        for(int i = 0; i < temp.size(); i++){
            bigArray.add(new ArrayList<Integer>(Arrays.asList(temp.get(i), 1)));
        }
        for(int i = 0; i < numList.length; i++){
            for(int k = 0; k <bigArray.size(); k ++){
                if(numList[i] == bigArray.get(k).get(0)){
                    bigArray.get(k).set(1, bigArray.get(k).get(1) + 1);
                    if(bigArray.get(k).get(1) > max){
                        max = bigArray.get(k).get(1);
                    }
                }
            }
        }
        System.out.println(bigArray);
        int x = 0;
        for(int i = 0; i < bigArray.size(); i++){
            if(bigArray.get(i).get(1) < max){
                bigArray.remove(i);
                i--;
                x++;
            }
        }
        System.out.println(bigArray);
        for(int i = 0; i < bigArray.size(); i++){
            result.add(bigArray.get(i).get(0));
        }
        return x == 0 ? new ArrayList<>() : result;
    }
}