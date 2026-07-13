class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < 10; i++)
        {
            int num = i;
            int nextDigit = i + 1;
            while(nextDigit <= 9)
            {
                num = num * 10 + nextDigit;
                if(low <= num && num <= high)
                {
                    list.add(num);
                }
                nextDigit++;
            }
        }
        Collections.sort(list);
        return list;
    }
}