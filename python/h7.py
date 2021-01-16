from __future__ import print_function

if __name__ == '__main__':
    n = int(raw_input())
res = ""
for i in range(n):
    res = "{x}{y}".format(x=res,y=i+1)
print(res)
