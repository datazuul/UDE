#!/bin/bash

function main() {
    jar cvfm UFM.jar manifest.txt com/itdominator/ufm/*.class \
                                  com/itdominator/ufm/TabSystem \
                                  com/itdominator/ufm/ThumbnailSystem \
                                  com/itdominator/ufm/Utils \
                                  com/itdominator/ufm/resources
    chmod +x UFM.jar
}
main;
