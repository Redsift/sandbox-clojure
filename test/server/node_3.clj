(ns server.node-3
    (:import io.redsift.ComputeRequest
      io.redsift.ComputeResponse))

(defn compute [^ComputeRequest req]
      (println "Compute Node1" req))
