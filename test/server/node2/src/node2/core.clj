(ns node2.core
    (:import io.redsift.ComputeRequest
             io.redsift.ComputeResponse))

(defn compute [^ComputeRequest req]
      (println "Compute Node2" req))
