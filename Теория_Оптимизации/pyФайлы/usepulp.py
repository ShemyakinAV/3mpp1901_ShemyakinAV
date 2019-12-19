#!/usr/bin/env python
# coding: utf-8

# In[2]:


get_ipython().system('pip install pulp')
from pulp import *
import time
start = time.time()


#Обозначение стоимостей перевозок между городами

c = [4, 11, 5, 17, 15, 6, 15, 16, 7, 1, 4, 9, 2, 4, 5, 11, 5, 21, 14, 10, 10, 1 , 7, 10, 6]


#Переменные для подготовления формирования проблемы оптимизации

x1 = pulp.LpVariable("x1", lowBound=0)
x2 = pulp.LpVariable("x2", lowBound=0)
x3 = pulp.LpVariable("x3", lowBound=0)
x4 = pulp.LpVariable("x4", lowBound=0)
x5 = pulp.LpVariable("x5", lowBound=0)
x6 = pulp.LpVariable("x6", lowBound=0)
x7 = pulp.LpVariable("x7", lowBound=0)
x8 = pulp.LpVariable("x8", lowBound=0)
x9 = pulp.LpVariable("x9", lowBound=0)
x10 = pulp.LpVariable("x10", lowBound=0)
x11 = pulp.LpVariable("x11", lowBound=0)
x12 = pulp.LpVariable("x12", lowBound=0)
x13 = pulp.LpVariable("x13", lowBound=0)
x14 = pulp.LpVariable("x14", lowBound=0)
x15 = pulp.LpVariable("x15", lowBound=0)
x16 = pulp.LpVariable("x16", lowBound=0)
x17 = pulp.LpVariable("x17", lowBound=0)
x18 = pulp.LpVariable("x18", lowBound=0)
x19 = pulp.LpVariable("x19", lowBound=0)
x20 = pulp.LpVariable("x20", lowBound=0)
x21 = pulp.LpVariable("x21", lowBound=0)
x22 = pulp.LpVariable("x22", lowBound=0)
x23 = pulp.LpVariable("x23", lowBound=0)
x24 = pulp.LpVariable("x24", lowBound=0)
x25 = pulp.LpVariable("x25", lowBound=0)

#Решение проблемы оптимизации

problem = pulp.LpProblem('0',pulp.LpMaximize)

problem += -C1*x1 - C2*x2 - C3* x3 - C4*x4 - C5*x5 -C6* x6-C7*x7- C8*x8 -C9* x9-C10*x10 - C11*x11 - C12* x12 - C13*x13 - C14*x14 -C15* x15-C16*x16- C17*x17-C18* x18-C19*x19 - C20*x20 - C21* x21 - C22*x22 - C23*x23 -C24* x24-C25*x25, "Функция цели"
problem +=x1 + x2 +x3+x4+x5<= 74,"1" 
problem +=x6 + x7 +x8+x9+x10 <= 40, "2"
problem +=x11 + x12+ x13+x14+x15 <= 36, "3"
problem +=x16 + x17+ x18+x19+x20 <= 9, "4"
problem +=x21 + x22+ x23 +x24+x25<= 34, "5"

problem +=x1+ x6+ x11+x16+x21 == 20, "6"
problem +=x2+x7+ x12+x17+x22 == 45, "7"
problem +=x3 + x8+x13+x18+x23 == 30, "8"     
problem +=x4 + x9+x14+x19+x24 == 14, "9"  
problem +=x5 + x10+x15+x20+x25 == 49, "10"   

#Метод решения проблемы
problem.solve()

#Вывод результатов
print ("Результат:")
for variable in problem.variables():
    print (variable.name, "=", variable.varValue)
print ("Стоимость доставки:")
print (abs(value(problem.objective))) #По модулю
stop = time.time()
print ("Время :")
print(stop - start)


# In[ ]:




