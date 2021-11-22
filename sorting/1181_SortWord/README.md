# 단어 정렬하기
# Problem
알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
1. 길이가 짧은 것부터
2. 길이가 같으면 사전 순으로
제한시간 : 2초

## Input
첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 주어지는 문자열의 길이는 50을 넘지 않는다.
## Output
조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.

---
# Example
### Input
```text
13
but
i
wont
hesitate
no
more
no
more
it
cannot
wait
im
yours
```
### Output
```text
i
im
it
no
but
more
wait
wont
yours
cannot
hesitate
```
  
# Tag
`sorting`

---
# Solution
1. string.length() 로 문자열 길이 비교
2. String.charAt 함수 사용으로 char 얻어와서 비교하기
3. 중복의 경울 string.equals()로 비교하여 중복되지 않는 것만 출력해준다. 