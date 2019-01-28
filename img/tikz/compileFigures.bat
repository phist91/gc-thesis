@ECHO OFF
for /L %%x IN (1,1,2) do (
pdflatex.exe -shell-escape A-ulterior-example01.tex
pdflatex.exe -shell-escape A-ulterior-example02.tex
pdflatex.exe -shell-escape A-ulterior-example03.tex
pdflatex.exe -shell-escape A-ulterior-example04.tex
pdflatex.exe -shell-escape A-ulterior-example05.tex
pdflatex.exe -shell-escape A-ulterior-example06.tex
pdflatex.exe -shell-escape A-ulterior-example07.tex
pdflatex.exe -shell-escape A-ulterior-example08.tex

pdflatex.exe -shell-escape ch1-heap.tex
pdflatex.exe -shell-escape ch1-objgraph.tex

pdflatex.exe -shell-escape ch2-concurrent1.tex
pdflatex.exe -shell-escape ch2-concurrent2.tex
pdflatex.exe -shell-escape ch2-heap-region.tex
pdflatex.exe -shell-escape ch2-lisp.tex
pdflatex.exe -shell-escape ch2-mark1.tex
pdflatex.exe -shell-escape ch2-mark2.tex
pdflatex.exe -shell-escape ch2-mark3.tex
pdflatex.exe -shell-escape ch2-mark4.tex
pdflatex.exe -shell-escape ch2-mark5.tex
pdflatex.exe -shell-escape ch2-mark6.tex

pdflatex.exe -shell-escape ch3-cycle.tex
pdflatex.exe -shell-escape ch3-cyclic-ex1.tex
pdflatex.exe -shell-escape ch3-cyclic-ex2.tex
pdflatex.exe -shell-escape ch3-cyclic-ex3.tex
pdflatex.exe -shell-escape ch3-cyclic-ex4.tex
pdflatex.exe -shell-escape ch3-cyclic-ex5.tex
pdflatex.exe -shell-escape ch3-cyclic-ex6.tex
pdflatex.exe -shell-escape ch3-cyclic-ex11.tex
pdflatex.exe -shell-escape ch3-cyclic-ex12.tex
pdflatex.exe -shell-escape ch3-cyclic-ex13.tex
pdflatex.exe -shell-escape ch3-cyclic-ex14.tex
pdflatex.exe -shell-escape ch3-cyclic-ex15.tex
pdflatex.exe -shell-escape ch3-cyclic-ex16.tex
pdflatex.exe -shell-escape ch3-deferred.tex
pdflatex.exe -shell-escape ch3-refcount.tex
pdflatex.exe -shell-escape ch3-refcount2.tex
pdflatex.exe -shell-escape ch3-scc.tex

pdflatex.exe -shell-escape ch4-bitvector.tex
pdflatex.exe -shell-escape ch4-compressor-example.tex
pdflatex.exe -shell-escape ch4-fenichel01.tex
pdflatex.exe -shell-escape ch4-fenichel02.tex
pdflatex.exe -shell-escape ch4-fenichel03.tex
pdflatex.exe -shell-escape ch4-fenichel04.tex
pdflatex.exe -shell-escape ch4-fenichel05.tex
pdflatex.exe -shell-escape ch4-fenichel06.tex
pdflatex.exe -shell-escape ch4-fenichel07.tex
pdflatex.exe -shell-escape ch4-fragmentation.tex
pdflatex.exe -shell-escape ch4-handle.tex
pdflatex.exe -shell-escape ch4-handle2.tex
pdflatex.exe -shell-escape ch4-lisp2.tex

pdflatex.exe -shell-escape ch5-lieberman1.tex
pdflatex.exe -shell-escape ch5-lieberman2.tex
pdflatex.exe -shell-escape ch5-lieberman3.tex
pdflatex.exe -shell-escape ch5-lieberman4.tex
pdflatex.exe -shell-escape ch5-lieberman5.tex
pdflatex.exe -shell-escape ch5-lieberman6.tex
pdflatex.exe -shell-escape ch5-lieberman7.tex
pdflatex.exe -shell-escape ch5-ulterior-principle.tex
)
pause