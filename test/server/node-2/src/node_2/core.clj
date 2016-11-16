(ns node-2.core
    (:import io.redsift.ComputeRequest io.redsift.ComputeResponse)
    (:require clojure.string)
    (:require [duckling.core :as p]))

(defn compute2 []
  (println "Compute2"))

(defn compute [^ComputeRequest req]
      (clojure.string/starts-with? "Hello" "Hell")
      (p/load! {:languages ["en"]})
      (compute2)
      (println "Compute Node2" req))
