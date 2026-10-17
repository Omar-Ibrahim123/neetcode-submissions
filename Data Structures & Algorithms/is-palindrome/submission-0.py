class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = [c.lower() for c in s if c.isalnum()]

        n1 = 0
        n2 = len(s) - 1
        for i in range(len(s)//2):
            if s[n1] != s[n2]:
                return False
            else:
                n1 +=1
                n2 -=1
        return True

        