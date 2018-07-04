#!/usr/bin/env bash
javac -d outdir --module-source-path module-project $(find module-project -name "*.java")