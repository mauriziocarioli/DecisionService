#!/bin/bash
echo "%s/@Csv/\/\/@Csv/ge
%s/import com.opencsv/\/\/import com.opencsv/ge
w
q
" | ex src/main/java/com/toyota/tfs/AccountHolder.java
#ex -s +%s/@Csv/\/\/@Csv/ge -cwq src/main/java/com/toyota/tfs/AccountHolder.java