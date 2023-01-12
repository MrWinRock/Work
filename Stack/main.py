import numpy as np

X, Y = np.meshgrid(np.arange(-3, 2), np.arange(-5, -1))

A = np.array([[X], [Y]])

print(A)