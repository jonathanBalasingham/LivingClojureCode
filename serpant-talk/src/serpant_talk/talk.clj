(ns serpant-talk.talk
  (:require [camel-snake-kebab.core :as csk]))

(defn serpent-talk [input]
  (str "Serpent! You said: " (csk/->snake_case input)))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn -main [& args]
  (println (serpent-talk (first args))))
