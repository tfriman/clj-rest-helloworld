# Clojure demo app

App generated using Luminus version "3.22". Used for build demonstrations.

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

## Repl

Is running in port 7777.

# Container image:

## Prebuilt

[quay.io/tfriman/luminus-example](https://quay.io/repository/tfriman/luminus-example?tab=info)

## Building locally

     docker build -f src/dockerfile.jvm -t clojure/luminus .

### Running locally

     docker run -i --rm -p 8080:8080 -p 7777:7777 clojure/luminus
