(ns demoapp.routes.home
  (:require
   [demoapp.layout :as layout]
   [clojure.java.io :as io]
   [demoapp.middleware :as middleware]
   [ring.util.http-response :as response]))

(def counter (atom 0))

(defn home-page [request]
  (swap! counter inc)
  (prn "home-page called now foo bar")
  (layout/render request "home.html" {:docs (-> "docs/docs.md" io/resource slurp)}))

(defn about-page [request]
  (layout/render request "about.html"))

(defn home-routes []
  [""
   {:middleware [middleware/wrap-csrf

 middleware/wrap-formats]}
   ["/" {:get (fn [r] (home-page r))}]
   ["/about" {:get about-page}]])
