(ns assignment5.core)


(defn completeSequence [in]
	;second line of each condition is return value of completeSequence
	;an integer representing the next number in the sequence
	(cond 
		;pseudo-fibonacci
		;print= sum of 4th and 3rd
		(and (= (nth in 2) (+ (nth in 0) (nth in 1))) (= (nth in 3) (+ (nth in 2) (nth in 1))))
			(+ (nth in 3) (nth in 2))
		
		;geometric progression, consistent ratio
		;print= multiply 4th term by ratio of 1st to 2nd
		(and (= (mod (nth in 1) (nth in 0)) 0) (= (mod (nth in 2) (nth in 1)) 0))
			(* (nth in 3) (/ (nth in 1) (nth in 0)))
		
		;arithmetic progression, consistent difference
		;print= add difference between 2nd and 3rd to 4th
		(= (- (nth in 2) (nth in 1)) (- (nth in 1) (nth in 0)))
			(+ (nth in 3) (- (nth in 2) (nth in 1)))

		:else (println 0)))

;all 8 test cases from https://codefights.com/challenge/QLdW6grw8hEr75tLu
(def allTests (to-array-2d [[4,6,10,16][5,10,20,40][2,4,6,8][1,2,3,5][24,40,56,72][6,12,24,48][44,55,99,154][49201,50420,51639,52858]]))

(defn -main
  [& args]

  ;loop through 8 test cases
  (loop [counter 0]
		(if-not (> counter 7)
			;do lets you perform more than one operation in if statement
			(do
				;(inc counter) method doesn't modify counter value
				(println (format "Test %s: %s" (inc counter) (completeSequence (aget allTests counter))))
				;recur= rebinds binding of counter to counter+1
				(recur (inc counter)))
			)
		)
  )
