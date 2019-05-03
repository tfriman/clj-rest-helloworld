(ns user
  (:require
    [demoapp.config :refer [env]]
    [clojure.spec.alpha :as s]
    [expound.alpha :as expound]
    [mount.core :as mount]
    [demoapp.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'demoapp.core/repl-server))

(defn stop []
  (mount/stop-except #'demoapp.core/repl-server))

(defn restart []
  (stop)
  (start))


