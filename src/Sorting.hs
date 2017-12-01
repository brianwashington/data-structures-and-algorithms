-- Quick Sort
quicksort :: [Integer] -> [Integer]
quicksort [] = []
quicksort xs = 
  let pivot = last xs
      less = [x | x <- init xs, x <= pivot]
      greater = [x | x <- init xs, x > pivot]
  in quicksort less ++ [pivot] ++ quicksort greater


-- Merge Sort
fsthalf :: [a] -> [a]
fsthalf xs = take (length xs `div` 2) xs

sndhalf :: [a] -> [a]
sndhalf xs = drop (length xs `div` 2) xs

mergesort :: Ord a => [a] -> [a]
mergesort [] = []
mergesort [x] = [x]
mergesort xs = merge (mergesort (fsthalf xs)) (mergesort (sndhalf xs))

merge :: (Ord a) => [a] -> [a] -> [a]
merge [] y = y
merge x [] = x
merge (x:xs) (y:ys) 
    | (x <= y) = x:(merge xs (y:ys))
    | otherwise = y:(merge (x:xs) ys)
