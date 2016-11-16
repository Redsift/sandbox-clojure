(defproject node2 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                           [wit/duckling "0.4.16"]
                           [io.redsift/compute, "1.0"]]
  :repositories {"project" "file:repo"}
  :profiles {:uberjar {:aot [node-2.core]}})
