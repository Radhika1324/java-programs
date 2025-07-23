class singleno {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}

// Why XOR?
// a ^ a = 0
// a ^ 0 = a
// XOR is commutative and associative, so all duplicate numbers cancel out, and
// only the unique one remains.
