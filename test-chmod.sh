#!/bin/bash

export CLASSPATH=.
javac *.java

for i in {0..7..1}; do
  for j in {0..7..1}; do
    for k in {0..7..1}; do
      java chmod $i$j$k /usr
    done
  done
 done

