#!/bin/sh
javac $1
java ${1%.*}