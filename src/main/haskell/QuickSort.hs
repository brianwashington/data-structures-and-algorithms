-- Quick Sort
quicksort :: [Integer] -> [Integer]
quicksort [] = []
quicksort xs = 
  let pivot = last xs
      less = [x | x <- init xs, x <= pivot]
      greater = [x | x <- init xs, x > pivot]
  in quicksort less ++ [pivot] ++ quicksort greater
