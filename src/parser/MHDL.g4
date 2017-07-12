grammar MHDL;

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
INTEGER: '-'?[0-9]+;
WS        : [ \n\t\r]+ -> skip;

design: 'DEFINE' IDENTIFIER ':' entity* components connections 'END DEFINE;' EOF;

entity: 'ENTITY LIST:' (IDENTIFIER 'OF TYPE' IDENTIFIER ';')+ 'END LIST;';

components: 'COMPONENT LIST:'
    (IDENTIFIER 'OF' IDENTIFIER';' | IDENTIFIER ':')+
    'END LIST;'
;

connections: 'CONNECTION LIST:' (IDENTIFIER 'CONNECTS TO' connection_end ';')+ 'END LIST;';

connection_end: (IDENTIFIER | IDENTIFIER ',')+;
