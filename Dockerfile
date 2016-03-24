FROM quay.io/redsift/sandbox-java:v1.8.0
MAINTAINER Deepak Prabhakara email: deepak@redsift.io version: 1.1.101

ARG version=1.8.0

ENV LEIN_ROOT=yes

COPY root /

RUN export DEBIAN_FRONTEND=noninteractive && \
    apt-get update && \
    apt-get install -y wget && \
    apt-get clean && rm -rf /var/lib/apt/lists/* /tmp/* /var/tmp/* && \
    cd /usr/bin/redsift && \
    wget http://repo1.maven.org/maven2/org/clojure/clojure/1.8.0/clojure-1.8.0.jar && \
    cd /usr/bin && \
    wget https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein && \
    chmod a+x /usr/bin/lein && \
    lein

VOLUME /run/dagger/sift

WORKDIR /run/dagger/sift

ENTRYPOINT ["/bin/bash"]
