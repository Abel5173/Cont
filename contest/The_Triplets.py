from difflib import SequenceMatcher
try:
    while 1:
        f = input()
        s = input()
        m = SequenceMatcher(None, f, s).find_longest_match(
            0, len(f), 0, len(s))
        a = m.size
        if a == 1:
            print('letter')
        elif a > 1:
            print(a, 'letters')
        else:
            print('impossible')
except:
    pass
