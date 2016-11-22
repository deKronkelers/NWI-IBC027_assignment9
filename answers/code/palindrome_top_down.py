# author: Hendrik Werner s4549775

def longest_palindrome(word: str, i: int, j: int) -> int:
    if i > j:
        return 0
    left = i
    right = j
    longest_palindromes = [1]
    while left < right:
        if word[left] == word[right]:
            longest_palindromes.append(
                    2 + longest_palindrome(word, left + 1, right - 1)
            )
        right -= 1
    right = j
    while left < right:
        if word[left] == word[right]:
            longest_palindromes.append(
                    2 + longest_palindrome(word, left + 1, right - 1)
            )
        left += 1
    return max(longest_palindromes)


if __name__ == "__main__":
    word = "character"
    print(longest_palindrome(word, 0, len(word) - 1))
