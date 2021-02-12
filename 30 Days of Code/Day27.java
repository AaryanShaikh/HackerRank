static class TestDataEmptyArray {
        public static int[] get_array() {
            int arr[] = {};
            return arr;
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            int arr[] = {1,2,3};
            return arr;
        }

        public static int get_expected_result() {
            return 0;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            int arr[] = {1,2,1};
            return arr;
        }

        public static int get_expected_result() {
            return 0;
        }
    }