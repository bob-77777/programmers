class Solution {
    public int[] solution(int[] numbers) {
        // numbers 배열과 동일한 길이의 새로운 배열 생성
        int[] answer = new int[numbers.length];         
        // 각 원소에 두 배 값을 새로운 배열에 저장
        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2; 
        }
        
        return answer; 
    }
}