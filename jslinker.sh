#!/bin/bash
rm -d webapp/js
ln -sf -T ../target/scala-3.2.0/bookman-view-fastopt webapp/js
# ln -sf -T ../target/scala-3.2.0/bookman-view-test-fastopt webapp/js
# ln -sf -T ../target/scala-3.2.0/bookman-view-opt webapp/js
