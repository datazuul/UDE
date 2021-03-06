#!/bin/bash
# -Xlint:unchecked
function main() {
    find -name "*.java" > sources.txt
    javac -Xlint:unchecked @sources.txt

    cleanFiles;
    moveFiles;
}

function cleanFiles() {
    rm ../com/itdominator/ufm/*.class
    rm ../com/itdominator/ufm/TabSystem/*.class
    rm ../com/itdominator/ufm/ThumbnailSystem/*.class
    rm ../com/itdominator/ufm/ThumbnailSystem/Utils/ *.class
}

function moveFiles() {
    mv *.class ../com/itdominator/ufm/
    mv TabSystem/*.class ../com/itdominator/ufm/TabSystem/
    mv ThumbnailSystem/*.class ../com/itdominator/ufm/ThumbnailSystem/
    mv Utils/*.class ../com/itdominator/ufm/Utils/
}
main;
