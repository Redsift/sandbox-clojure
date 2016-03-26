(ns server.node1
    (:import com.redsift.ComputeRequest
      com.redsift.ComputeResponse))

(defn compute [^ComputeRequest req]
      (println "Compute Node1" req))
