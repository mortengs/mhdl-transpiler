grammar MHDL;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
INTEGER: '-'?[0-9]+;
WS        : [ \n\t\r]+ -> skip;

design: 'DEFINE' IDENTIFIER entity* components connections EOF;

entity: 'ENTITY LIST:' (IDENTIFIER ('WITH' | 'WITHOUT') 'CONTROL;')+;

components: 'COMPONENT LIST:'
    (IDENTIFIER 'OF' IDENTIFIER';' | IDENTIFIER ':')+
;

connections: 'CONNECTION LIST:' IDENTIFIER 'CONNECTS TO' connection_end ';' 'END LIST;';

connection_end: (IDENTIFIER | IDENTIFIER ',' connection_end);
