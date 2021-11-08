# 달팽이는 올라가고 싶다
# Problem
There is a snail on the ground. It wants to climb to the top of a wooden pole with the height of V meters, measuring from the ground level. In one day it can climb A meters upwards, however during each night it sleeps, sliding B meters back down. Determine the number of days it needs to climb to the top.   

땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
## Input
The first and only line of input contains three integers separated by a single space: A, B, and V (1 ≤ B < A ≤ V ≤ 1 000 000 000), with meanings described above. 

첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
## Output
The first and only line of output must contain the number of days that the snail needs to reach the top. 

첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

---
# Example
### Ex1 Input
```text
2 1 5
```
### Ex2 Output
```text
4
```

### Ex2 Input
```text
5 1 6
```
### Ex2 Output
```text
2
```
### Ex3 Input
```text
100 99 1000000000
```
### Ex3 Output
```text
999999901
```
  
# Tag
`mathematics`

---
# Solution
- 처음엔 반복문으로 처리했으나(Snail1), 시간초과가 뜸. 수학 카테고리이기 떄문에, 반복문으로 처리하는 문제가 아닌가봄.
- 식으로 계산하여 출력해주는데, Scanner로 입력을 받으니 계속 시간초과가 됨.(Snail2) 
- Scanner BufferedReader 클래스 사용하여 입력 받는 게 훨씬 빠른가봄.
  - (BufferedReader로 받을 경우 String을 Int로 캐스팅해주어야 해서 그 과정이 더 오래 걸릴 것이라 생각했는데 아니었다.) 
- BufferedReader는 버퍼로 하나의 String을 받기 때문에 split을 이용하여 String배열로 만들어주었고, 이후 변수에 Int로 변환하여 넣어주었다. (Snail3)