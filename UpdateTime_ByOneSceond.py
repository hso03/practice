import os
import time

def get_time():
    while(True):
        curtime = time.strftime('%Y.%m.%d - %H:%M:%S')
        time.sleep(1)
        yield curtime


for x in get_time():
    os.system('cls||clear')
    print(x)