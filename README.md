# VCFAnalyzer

VCFAnalyzer reads multiple VCF files, and finds suspicious regions in the mapping. 
Suspicious regions are regions where the coverage is larger than mean_coverage + standand_deviation_coverage. This region has a much higher coverage compared to the other positions.

Usage: 
VCFAnalyzer -i `<path to input>` -t `<number of threads>`
    
  `<path to input>`       : single VCF file or path to directory with multiple VCF files <br />
  `<number of threads>`   : number of available threads

The tool finds these regions, and generates a set of output files for each VCF file:
  - the fasta sequence
  - the start and end positons of the suspicious regions
  - the extracted sequences of the suspicious regions
