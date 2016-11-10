(ns assignment4.core
  (:gen-class))

(defn subSeqs [^String input]  
	(loop [allPart []
		counter 4]
		(if (> counter (count input))
			allPart ;if counter is out of index range, return vector
			;partition input by groups of 4, add to allPart, and increment counter by 4
			;map is for turning return value of partition into strings from chars
			(recur (concat allPart (map (partial apply str) (partition counter 1 input)))(+ counter 4)))))

(defn checkString [^String in]
	;if count of all letters are equal
	(if (= (count (re-seq #"A" in))
		(count (re-seq #"T" in)) 
		(count (re-seq #"G" in)) 
		(count (re-seq #"C" in)))
		1
		0)
)


(defn -main
  [& args]
  ;first read user input to string
  ;second get substrings and put in map
  ;third call checkString function on all substrings
  ;fourth add the results of calling checkString together (reduce +)
  (println (reduce + (map checkString (subSeqs (str (read-line))))))
)
