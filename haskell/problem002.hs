-- fib :: Integer -> Integer
-- fib 0 = 0
-- fib 1 = 1
-- fib n = fib (n - 1) + fib (n - 2)

fibs :: [Integer]
fibs = 0 : 1 : zipWith (+) fibs (tail fibs)

solution = sum (takeWhile (<= 4000000) (filter even fibs))

main = print solution
