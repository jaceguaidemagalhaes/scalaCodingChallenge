import re

# hexCode = input("Type the Hexcode")

pattern = '^#[0-9a-fA-F]{6}$'
txt = input('Inert Hex Code> ')
x = bool(re.match(pattern, txt))
if x:
    print(x)
else:
    print('{} is not a hex code'.format(txt))