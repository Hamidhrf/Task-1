public class WordSorter {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question;"
                + "Whether `tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        // Remove punctuation and convert to lowercase
        String cleanedText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the text into an array of words
        String[] words = cleanedText.split("\\s+");

        // Sort the array using bubble sort
        bubbleSort(words);

        // Print the sorted words
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    // Swap arr[i-1] and arr[i]
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }
}
