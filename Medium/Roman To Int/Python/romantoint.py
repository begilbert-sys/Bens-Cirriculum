def roman_to_integer(roman):
  numerals = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50, 
    'C': 100,
    'D': 500,
    'M': 1000
  }
  total = 0
  for i in range(len(roman)):
    numeral = roman[i]
    if i != 0:
      prev_numeral = roman[i - 1]
      if numerals[numeral] > numerals[prev_numeral]:
        total -= numerals[prev_numeral] * 2
    total += numerals[roman[i]]
  return total

print(roman_to_integer("MMCDXCIV"))
    