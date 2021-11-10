# Problem
어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.

자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.
  
시간제한 : 2

# Input
첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

# Output
첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.

# Example
input
```text
216
```
output
```text
198
```
# Tag
`bruteforcing`

# Solution
- [ref1](https://junghn.tistory.com/entry/JAVA-int%ED%98%95-%EC%88%AB%EC%9E%90%EC%9D%98-%EC%9E%90%EB%A6%BF%EC%88%98-%EA%B5%AC%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95-int-%EA%B8%B8%EC%9D%B4-%EA%B5%AC%ED%95%98%EB%8A%94-%EB%B0%A9%EB%B2%95) (int 자릿수)
- [ref2](https://hellocc.tistory.com/66) (String 인덱스 접근)