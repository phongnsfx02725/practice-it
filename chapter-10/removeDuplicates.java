/*
* Write a method removeDuplicates that takes as a parameter a sorted 
* ArrayList of Strings and that eliminates any duplicates from the list. 
*/

public static void removeDuplicates(ArrayList<String> array) {
    
    int arraySize = array.size();
    for (int i = 0; i < arraySize - 1; i++) {
        if (array.get(i).equals(array.get(i + 1))) {
            array.remove(i + 1);
            i--;
            arraySize--;
        }
    }
    
}
