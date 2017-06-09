(defproject org.clojars.stw/ib-re-actor "0.1.2-SNAPSHOT"
  :description "Clojure friendly wrapper for InteractiveBrokers java API"
  :url "https://github.com/stw/ib-re-actor"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories [["clojars" {:url "https://clojars.org/repo"
                             :creds :gpg}]]  
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [clj-time "0.4.4"]
                 [org.clojars.stw/twsapi "9.72.18"]
                 [com.ib/jtsclient "9.68"]
;;                 [org.clojure/tools.logging "0.2.3"]
                 [clj-logging-config "1.9.10"]]
  :plugins [[lein-midje "2.0.1"]]
  :profiles {:dev {:dependencies [[midje "1.4.0"]
                                  [com.stuartsierra/lazytest "1.2.3"]]}})
