# Clojure demo app

App generated using Luminus version "3.22".

## Prerequisites

You will need [Leiningen][1] 2.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

Create uberjar:

    lein uberjar

and then run:
    java -Dport=8080 -jar target/uberjar/demoapp.jar

Open your browser [http://localhost:8080](http://localhost:8080). 8080
is the default port but for completeness sake -Dport is shown.
