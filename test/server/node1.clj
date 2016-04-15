(ns server.node1
    (:import io.redsift.ComputeRequest
      io.redsift.ComputeResponse))

(defn compute [^ComputeRequest req]
      (println "Compute Node1" req))
