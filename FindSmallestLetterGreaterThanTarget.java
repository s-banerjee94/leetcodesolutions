public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] == target) {
                left = mid + 1;
            } else if (target < letters[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left < letters.length ? letters[left] : letters[0];
    }

    public static void main(String[] args) {
        FindSmallestLetterGreaterThanTarget solution = new FindSmallestLetterGreaterThanTarget();

        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'a';
        System.out.println("Test case 1: " + solution.nextGreatestLetter(letters1, target1));

        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'c';
        System.out.println("Test case 2: " + solution.nextGreatestLetter(letters2, target2));

        char[] letters3 = {'x', 'x', 'y', 'y'};
        char target3 = 'z';
        System.out.println("Test case 3: " + solution.nextGreatestLetter(letters3, target3));
    }

}

