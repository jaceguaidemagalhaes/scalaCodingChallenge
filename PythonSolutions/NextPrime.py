

def checkifprime(pnum, isprime=True):

    prime = isprime
    if pnum % 2 == 0:
        checkifprime(pnum+1)
    else:
        for i in range(3, pnum//2, 2):
            if pnum % i == 0:
                prime = False
                break
        if prime and number != pnum:
            print('next prime after {} = {}'.format(number, pnum))
        elif prime:
            print('{} is a prime number.'.format(number))
        else:
            checkifprime(pnum+1)


number = int(input('Insert the number to check> '))

if number <= 2:
    print('Next prime = 2')
else:
    checkifprime(number, True)
