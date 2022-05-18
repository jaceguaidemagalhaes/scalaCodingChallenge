from collections import deque

myStack = deque()
option = ""

def listStack():
    if len(myStack) == 0:
        print('Stack is empty!')
    else:
        lists = [value[0] for value in myStack]
        print(lists, sep = ',')

def pop():
    if len(myStack) == 0:
        print('Stack is empty')
    else:
        print('Number {} pop'.format(myStack[0][0]))
        myStack.popleft()

def push(a):
    myStack.appendleft((a,min(a)))

def min(a):
    if len(myStack) == 0:
        return a
    elif myStack[0][1] < a:
        return myStack[0][1]
    else:
        return a

while option != 'e':
    print('Select your option!')
    print('a => push a number')
    print('p => pop the last number inserted')
    print('m => recover the min value')
    print('l => list the stack')
    print('e => exit')
    option = input('Option>').lower()
    if option == 'm':
        print('Min value in stack is = {}'.format(myStack[0][1]))
        print('Stack:')
        listStack()
    elif option == 'a':
        number = int(input('Whats the number to push?'))
        push(number) 
        print('Stack:')
        listStack()
    elif option == 'p':
        print(pop())
        print('Stack:')
        listStack()
    elif option == 'e':
        print('Thank you!')
    elif option == 'l':
        listStack()
    else:
        print('Wrong option...')

