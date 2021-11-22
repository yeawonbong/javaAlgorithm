# 좌표압축
# Problem
수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.

Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.

X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.
제한시간 : 2초

## Input
첫째 줄에 N이 주어진다.

둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.


## Output
첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.

---
# Example
### Input1
```text
5
2 4 -10 4 -9
```
### Output1
```text
2 3 0 3 1
```
### Input2
```text
6
1000 999 1000 999 1000 999
```
### Output2
```text
1 0 1 0 1 0
```

# Tag
`sorting` `Value / Coordinate Compression`

---
# Solution
- Xi > Xj를 만족하는 숫자를 이차원배열로 함께 저장후 arr[][1] 을 기준으로 정렬 X
- ArrayList<Integer>로 리스트 만들고 Collections.sort로 정렬 X
- map으로 hash key-value 해서 추적해주기 X 
- 
