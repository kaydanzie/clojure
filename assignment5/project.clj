(defproject assignment5 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main ^:skip-aot assignment5.core
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :ring {:handler app.core/handler
         :main app.core})
