(ns isla.utils)

(defn take-input []
  (print "$ ")
  (flush)
  (read-line))

(defn output [given-output]
  (println " " given-output))
