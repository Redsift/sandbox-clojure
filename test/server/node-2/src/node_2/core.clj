(ns node-2.core
    (:import io.redsift.ComputeRequest
             io.redsift.ComputeResponse))

(defn compute2 []
  (println "Compute2"))

(defn compute [^ComputeRequest req]
      (compute2)
      (println "Compute Node2" req))
