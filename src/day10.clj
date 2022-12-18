(ns day10
  (:require [clojure.string :as str]))

; Day 10 / #1 =====================================================================================================================

(def instructions (str/split-lines "addx 15\naddx -11\naddx 6\naddx -3\naddx 5\naddx -1\naddx -8\naddx 13\naddx 4\nnoop\naddx -1\naddx 5\naddx -1\naddx 5\naddx -1\naddx 5\naddx -1\naddx 5\naddx -1\naddx -35\naddx 1\naddx 24\naddx -19\naddx 1\naddx 16\naddx -11\nnoop\nnoop\naddx 21\naddx -15\nnoop\nnoop\naddx -3\naddx 9\naddx 1\naddx -3\naddx 8\naddx 1\naddx 5\nnoop\nnoop\nnoop\nnoop\nnoop\naddx -36\nnoop\naddx 1\naddx 7\nnoop\nnoop\nnoop\naddx 2\naddx 6\nnoop\nnoop\nnoop\nnoop\nnoop\naddx 1\nnoop\nnoop\naddx 7\naddx 1\nnoop\naddx -13\naddx 13\naddx 7\nnoop\naddx 1\naddx -33\nnoop\nnoop\nnoop\naddx 2\nnoop\nnoop\nnoop\naddx 8\nnoop\naddx -1\naddx 2\naddx 1\nnoop\naddx 17\naddx -9\naddx 1\naddx 1\naddx -3\naddx 11\nnoop\nnoop\naddx 1\nnoop\naddx 1\nnoop\nnoop\naddx -13\naddx -19\naddx 1\naddx 3\naddx 26\naddx -30\naddx 12\naddx -1\naddx 3\naddx 1\nnoop\nnoop\nnoop\naddx -9\naddx 18\naddx 1\naddx 2\nnoop\nnoop\naddx 9\nnoop\nnoop\nnoop\naddx -1\naddx 2\naddx -37\naddx 1\naddx 3\nnoop\naddx 15\naddx -21\naddx 22\naddx -6\naddx 1\nnoop\naddx 2\naddx 1\nnoop\naddx -10\nnoop\nnoop\naddx 20\naddx 1\naddx 2\naddx 2\naddx -6\naddx -11\nnoop\nnoop\nnoop"))

;; returns a vec of x at every cycle
(defn cycles [instructions]
  (loop [instructions instructions cycles [] x 1]
    (if (zero? (count instructions))
      cycles
      (let [instruction (first instructions)]
        (if (= instruction "noop")
          (recur
            (drop 1 instructions)
            (conj cycles x)
            x)
          (let [v (Integer/parseInt (get (str/split instruction #" ") 1))]
            (recur
              (drop 1 instructions)
              (conj (conj cycles x) (+ x v))
              (+ x v))))))))

;; returns the signal strength with the given vec of x at every cycle
(defn strength [cycles]
  (reduce +
    (for [i (range 19 220 40)]
      (* (get cycles (dec i)) (inc i)))))

(println (strength (cycles instructions)))

; Day 10 / #2 =====================================================================================================================

(defn states [cycles]
  (loop [cycles cycles states []]
    (if (zero? (count cycles))
      states
      (recur
        (drop 1 cycles)
        (conj states
          (let [x (first cycles)
                pixel (count states)]
            (println pixel x (range (dec x) (+ x 2)) (some #{pixel} (range (dec x) (+ x 2))))
            (if (some #(= pixel %) (range (dec x) (+ x 2)))
              "#"
              "."
              )))))))

(defn print-states [states]
  (doseq [p (partition 40 states)]
    (println (str/join p))
    )
  )

(println (print-states (states (cycles instructions))))