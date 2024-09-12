The Sieve of Eratosthenes 
The Sieve of Eratosthenes is a technique for finding all prime numbers less than or equal to N. 
Start by creating an array of integers from 2 to 𝑁. Identify the smallest integer i that has not 
been marked, label i as a prime, and then eliminate all its multiples, such as 2𝑖,3𝑖,… (it's more efficient 
to start at i^2 and use increments of i^2+i, i^2+2i,…, until reaching N). The process ends when i exceeds N.
