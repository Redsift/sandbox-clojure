(ns node2-alt.core
    (:import com.redsift.ComputeRequest
             com.redsift.ComputeResponse))

(defn compute
  "I get called by Redsift to perform computation."
  [^ComputeRequest req]
  (println "Compute Node2-alt" req))
