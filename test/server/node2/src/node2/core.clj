(ns node2.core
    (:import com.redsift.ComputeRequest
             com.redsift.ComputeResponse))

(defn compute [^ComputeRequest req]
      (println "Compute Node2" req))
