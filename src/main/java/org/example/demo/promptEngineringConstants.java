package org.example.demo;

public class promptEngineringConstants {
    String breaker = "                           ````````````````                      ";
    String queryHeader = "write sparql query and assume that prefixes are defined and return only the sparql query without any extra characters and make sure it's valid and will return answer from dbpedia: ";
    String querySamples = "Common prefixes:\n" +
            "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\n" +
            "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\n" +
            "PREFIX owl: <http://www.w3.org/2002/07/owl#>\n" +
            "PREFIX uri:<http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#>\n" +
            "\n" +
            "\n" +
            "Query 1:\n" +
            "---------------------\n" +
            "SELECT  (str(?x) as ?label0) (str(?y) as ?label1) (str(?z) as ?label2)\n" +
            "where { \n" +
            "?athlete a uri:Athletes. \n" +
            "?team a uri:Teams. \n" +
            "?coach a uri:Coach. \n" +
            "?athlete uri:belongs_to ?team. \n" +
            "?athlete uri:Athlete_Name ?x. \n" +
            "?athlete uri:Athlete_Age ?z. \n" +
            "?team uri:coached_by ?coach. \n" +
            "?coach uri:Coach_Name ?y.\n" +
            "}\n" +
            "Order BY ?z\n" +
            "\n" +
            "\n" +
            "Query 2:\n" +
            "--------------------\n" +
            "SELECT  (str(?x) as ?label0) (str(?y) as ?label1) (str(?z) as ?label2)\n" +
            "where { \n" +
            "?athlete a uri:Athletes. \n" +
            "?team a uri:Teams.\n" +
            "?athlete uri:belongs_to ?team.\n" +
            "{?team uri:Team_Name \"Arsenal\".}\n" +
            "UNION\n" +
            "{?team uri:Team_Name \"Liverpool\".}\n" +
            "UNION\n" +
            "{?team uri:Team_Name \"ManCity\".}\n" +
            "?athlete uri:Athlete_Name ?x.\n" +
            "?team uri:Team_Name ?y.\n" +
            "OPTIONAL {?athlete uri:Height ?z.}\n" +
            "}\n" +
            "Order BY ?x\n" +
            "\n" +
            "Query3:\n" +
            "-------------------------\n" +
            "SELECT  (str(?x) as ?label0) (str(?y) as ?label1) (str(?z) as ?label2)\n" +
            "where {\n" +
            "?athlete a uri:Athletes. \n" +
            "?team a uri:Teams.\n" +
            "?coach a uri:Coach.\n" +
            "?competition a uri:Competitions.\n" +
            "OPTIONAL {?team uri:participates_in ?competition.\n" +
            "?competition_name uri:Competition_Name \"ChampionsLeague\".}\n" +
            "FILTER (!BOUND(?competition_name))\n" +
            "?athlete uri:belongs_to ?team.\n" +
            "?team uri:coached_by ?coach. \n" +
            "?team uri:Team_Name ?x.\n" +
            "?athlete uri:Athlete_Name ?y.\n" +
            "?coach uri:Coach_Name ?z.\n" +
            "}\n" +
            "Order BY ?x\n" +
            "\n" +
            "Query 4:\n" +
            "---------------------\n" +
            "SELECT ?label0 (AVG(?athlete_salary) as ?label1)\n" +
            "where {\n" +
            "?athlete a uri:Athletes. \n" +
            "?athlete uri:Athlete_Salary ?athlete_salary.\n" +
            "?athlete uri:Athlete_Nationality ?label0.\n" +
            "}\n" +
            "GROUP BY ?label0\n" +
            "ORDER BY ?label1\n" +
            "\n" +
            "Query 5:\n" +
            "--------------------------------\n" +
            "SELECT (MAX(?capacity) as ?label0) (MAX(?budget) as ?label1)\n" +
            "where {\n" +
            "?venue a uri:Venues. \n" +
            "?team a uri:Teams.\n" +
            "?venue uri:Address ?address.\n" +
            "FILTER (?address = \"London\" || ?address = \"Liverpool\")\n" +
            "?venue uri:Capacity ?capacity.\n" +
            "?team uri:has_home_venue ?venue.\n" +
            "?team uri:Budget ?budget.\n" +
            "}\n" +
            "\n" +
            "Query 6:\n" +
            "----------------------------------\n" +
            "SELECT ?team ?name ?budget ?competition\n" +
            "WHERE {\n" +
            "  {\n" +
            "    ?team a uri:Teams ;\n" +
            "          uri:Team_Name ?name ;\n" +
            "          uri:Budget ?budget .\n" +
            "    FILTER(?budget > 1.0E8)\n" +
            "  }\n" +
            "  UNION\n" +
            "  {\n" +
            "    ?team a uri:Teams ;\n" +
            "          uri:Team_Name ?name .\n" +
            "    ?team uri:participates_in ?competition .\n" +
            "    ?competition a uri:Competitions ;\n" +
            "                 uri:Competition_Name ?compName .\n" +
            "    FILTER(?compName = \"PremierLeague\")\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "Query 7:\n" +
            "---------------------------------\n" +
            "SELECT ?athlete ?name ?age ?team ?teamName\n" +
            "WHERE {\n" +
            "  ?athlete a uri:Athletes ;\n" +
            "           uri:Athlete_Name ?name ;\n" +
            "           uri:Athlete_Age ?age .\n" +
            "  \n" +
            "  OPTIONAL {\n" +
            "    ?athlete uri:belongs_to ?team .\n" +
            "    ?team uri:Team_Name ?teamName .\n" +
            "  }\n" +
            "  \n" +
            "  OPTIONAL {\n" +
            "    ?athlete uri:participates_in ?competition .\n" +
            "    ?team uri:participates_in ?competition ;\n" +
            "          uri:Team_Name ?teamName .\n" +
            "  }\n" +
            "}\n" +
            "\n" +
            "\n" +
            "Query 8:\n" +
            "---------------------------------\n" +
            "CONSTRUCT {\n" +
            "  ?team uri:Team_Name ?teamName ;\n" +
            "        uri:has_home_venue ?venue .\n" +
            "  ?venue uri:Venue_Name ?venueName ;\n" +
            "         uri:Address ?address .\n" +
            "}\n" +
            "WHERE {\n" +
            "  ?team a uri:Teams ;\n" +
            "        uri:Team_Name ?teamName ;\n" +
            "        uri:has_home_venue ?venue .\n" +
            "  \n" +
            "  ?venue uri:Venue_Name ?venueName ;\n" +
            "         uri:Address ?address .\n" +
            "}\n" +
            "\n" +
            "\n" +
            "Query 9:\n" +
            "------------------------------\n" +
            "DESCRIBE ?athlete ?team\n" +
            "WHERE {\n" +
            "  ?athlete a uri:Athletes .\n" +
            "  ?team a uri:Teams .\n" +
            "}\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n";

    String turtleOfOntology = "@prefix : <http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology> .\n" +
            "@prefix owl: <http://www.w3.org/2002/07/owl#> .\n" +
            "@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .\n" +
            "@prefix xml: <http://www.w3.org/XML/1998/namespace> .\n" +
            "@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .\n" +
            "@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .\n" +
            "@base <http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology> .\n" +
            "\n" +
            "<http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology> rdf:type owl:Ontology .\n" +
            "\n" +
            "#################################################################\n" +
            "#    Object Properties\n" +
            "#################################################################\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#belongs_to\n" +
            ":belongs_to rdf:type owl:ObjectProperty ;\n" +
            "            rdfs:subPropertyOf owl:topObjectProperty ;\n" +
            "            rdfs:domain :Athletes ;\n" +
            "            rdfs:range :Teams .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#coached_by\n" +
            ":coached_by rdf:type owl:ObjectProperty ;\n" +
            "            rdfs:subPropertyOf owl:topObjectProperty ;\n" +
            "            rdfs:domain :Teams ;\n" +
            "            rdfs:range :Coach .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#defeated_by\n" +
            ":defeated_by rdf:type owl:ObjectProperty ;\n" +
            "             rdfs:subPropertyOf owl:topObjectProperty ;\n" +
            "             rdfs:domain :Teams ;\n" +
            "             rdfs:range :Teams .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#has_home_venue\n" +
            ":has_home_venue rdf:type owl:ObjectProperty ;\n" +
            "                rdfs:subPropertyOf owl:topObjectProperty ;\n" +
            "                rdfs:domain :Teams ;\n" +
            "                rdfs:range :Venues .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#participates_in\n" +
            ":participates_in rdf:type owl:ObjectProperty ;\n" +
            "                 rdfs:subPropertyOf owl:topObjectProperty ;\n" +
            "                 rdfs:domain :Teams ;\n" +
            "                 rdfs:range :Competitions .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#takes_place_at\n" +
            ":takes_place_at rdf:type owl:ObjectProperty ;\n" +
            "                rdfs:subPropertyOf owl:topObjectProperty ;\n" +
            "                rdfs:domain :Competitions ;\n" +
            "                rdfs:range :Venues .\n" +
            "\n" +
            "\n" +
            "#################################################################\n" +
            "#    Data properties\n" +
            "#################################################################\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Address\n" +
            ":Address rdf:type owl:DatatypeProperty ;\n" +
            "         rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "         rdfs:domain :Venues ;\n" +
            "         rdfs:range xsd:string .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Athlete_Age\n" +
            ":Athlete_Age rdf:type owl:DatatypeProperty ;\n" +
            "             rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "             rdfs:domain :Athletes ,\n" +
            "                         [ rdf:type owl:Restriction ;\n" +
            "                           owl:onProperty :Athlete_Age ;\n" +
            "                           owl:someValuesFrom [ rdf:type rdfs:Datatype ;\n" +
            "                                                owl:onDatatype xsd:integer ;\n" +
            "                                                owl:withRestrictions ( [ xsd:minExclusive 15\n" +
            "                                                                       ]\n" +
            "                                                                       [ xsd:maxInclusive 100\n" +
            "                                                                       ]\n" +
            "                                                                     )\n" +
            "                                              ]\n" +
            "                         ] ;\n" +
            "             rdfs:range xsd:integer .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Athlete_Name\n" +
            ":Athlete_Name rdf:type owl:DatatypeProperty ;\n" +
            "              rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "              rdfs:domain :Athletes ;\n" +
            "              rdfs:range xsd:string .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Athlete_Nationality\n" +
            ":Athlete_Nationality rdf:type owl:DatatypeProperty ;\n" +
            "                     rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "                     rdfs:domain :Athletes ;\n" +
            "                     rdfs:range xsd:string .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Athlete_Salary\n" +
            ":Athlete_Salary rdf:type owl:DatatypeProperty ;\n" +
            "                rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "                rdfs:domain :Athletes ,\n" +
            "                            [ rdf:type owl:Restriction ;\n" +
            "                              owl:onProperty :Athlete_Salary ;\n" +
            "                              owl:someValuesFrom [ rdf:type rdfs:Datatype ;\n" +
            "                                                   owl:onDatatype xsd:float ;\n" +
            "                                                   owl:withRestrictions ( [ xsd:minExclusive \"10000.0\"^^xsd:float\n" +
            "                                                                          ]\n" +
            "                                                                          [ xsd:maxInclusive \"5.0E8\"^^xsd:float\n" +
            "                                                                          ]\n" +
            "                                                                        )\n" +
            "                                                 ]\n" +
            "                            ] ;\n" +
            "                rdfs:range xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Budget\n" +
            ":Budget rdf:type owl:DatatypeProperty ;\n" +
            "        rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "        rdfs:domain :Teams ,\n" +
            "                    [ rdf:type owl:Restriction ;\n" +
            "                      owl:onProperty :Budget ;\n" +
            "                      owl:someValuesFrom [ rdf:type rdfs:Datatype ;\n" +
            "                                           owl:onDatatype xsd:float ;\n" +
            "                                           owl:withRestrictions ( [ xsd:minExclusive \"1000000.0\"^^xsd:float\n" +
            "                                                                  ]\n" +
            "                                                                  [ xsd:maxInclusive \"2.0E9\"^^xsd:float\n" +
            "                                                                  ]\n" +
            "                                                                )\n" +
            "                                         ]\n" +
            "                    ] ;\n" +
            "        rdfs:range xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Capacity\n" +
            ":Capacity rdf:type owl:DatatypeProperty ;\n" +
            "          rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "          rdfs:domain :Venues ,\n" +
            "                      [ rdf:type owl:Restriction ;\n" +
            "                        owl:onProperty :Capacity ;\n" +
            "                        owl:someValuesFrom [ rdf:type rdfs:Datatype ;\n" +
            "                                             owl:onDatatype xsd:integer ;\n" +
            "                                             owl:withRestrictions ( [ xsd:minExclusive 5000\n" +
            "                                                                    ]\n" +
            "                                                                    [ xsd:maxInclusive 150000\n" +
            "                                                                    ]\n" +
            "                                                                  )\n" +
            "                                           ]\n" +
            "                      ] ;\n" +
            "          rdfs:range xsd:integer .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Coach_Age\n" +
            ":Coach_Age rdf:type owl:DatatypeProperty ;\n" +
            "           rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "           rdfs:domain :Coach ,\n" +
            "                       [ rdf:type owl:Restriction ;\n" +
            "                         owl:onProperty :Coach_Age ;\n" +
            "                         owl:someValuesFrom [ rdf:type rdfs:Datatype ;\n" +
            "                                              owl:onDatatype xsd:integer ;\n" +
            "                                              owl:withRestrictions ( [ xsd:minExclusive 15\n" +
            "                                                                     ]\n" +
            "                                                                     [ xsd:maxInclusive 100\n" +
            "                                                                     ]\n" +
            "                                                                   )\n" +
            "                                            ]\n" +
            "                       ] ;\n" +
            "           rdfs:range xsd:integer .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Coach_Name\n" +
            ":Coach_Name rdf:type owl:DatatypeProperty ;\n" +
            "            rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "            rdfs:domain :Coach ;\n" +
            "            rdfs:range xsd:string .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Coach_Nationality\n" +
            ":Coach_Nationality rdf:type owl:DatatypeProperty ;\n" +
            "                   rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "                   rdfs:domain :Coach ;\n" +
            "                   rdfs:range xsd:string .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Coach_Salary\n" +
            ":Coach_Salary rdf:type owl:DatatypeProperty ;\n" +
            "              rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "              rdfs:domain :Coach ,\n" +
            "                          [ rdf:type owl:Restriction ;\n" +
            "                            owl:onProperty :Coach_Salary ;\n" +
            "                            owl:someValuesFrom [ rdf:type rdfs:Datatype ;\n" +
            "                                                 owl:onDatatype xsd:float ;\n" +
            "                                                 owl:withRestrictions ( [ xsd:minExclusive \"10000.0\"^^xsd:float\n" +
            "                                                                        ]\n" +
            "                                                                        [ xsd:maxInclusive \"5.0E8\"^^xsd:float\n" +
            "                                                                        ]\n" +
            "                                                                      )\n" +
            "                                               ]\n" +
            "                          ] ;\n" +
            "              rdfs:range xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Competition_Name\n" +
            ":Competition_Name rdf:type owl:DatatypeProperty ;\n" +
            "                  rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "                  rdfs:domain :Competitions ;\n" +
            "                  rdfs:range xsd:string .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Governing_body\n" +
            ":Governing_body rdf:type owl:DatatypeProperty ;\n" +
            "                rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "                rdfs:domain :Competitions ,\n" +
            "                            [ rdf:type owl:Class ;\n" +
            "                              owl:unionOf ( [ rdf:type owl:Restriction ;\n" +
            "                                              owl:onProperty :Governing_body ;\n" +
            "                                              owl:hasValue \"AFC\"\n" +
            "                                            ]\n" +
            "                                            [ rdf:type owl:Restriction ;\n" +
            "                                              owl:onProperty :Governing_body ;\n" +
            "                                              owl:hasValue \"CAF\"\n" +
            "                                            ]\n" +
            "                                            [ rdf:type owl:Restriction ;\n" +
            "                                              owl:onProperty :Governing_body ;\n" +
            "                                              owl:hasValue \"CONMEBOL\"\n" +
            "                                            ]\n" +
            "                                            [ rdf:type owl:Restriction ;\n" +
            "                                              owl:onProperty :Governing_body ;\n" +
            "                                              owl:hasValue \"LIBERTADORES\"\n" +
            "                                            ]\n" +
            "                                            [ rdf:type owl:Restriction ;\n" +
            "                                              owl:onProperty :Governing_body ;\n" +
            "                                              owl:hasValue \"UEFA\"\n" +
            "                                            ]\n" +
            "                                          )\n" +
            "                            ] ;\n" +
            "                rdfs:range xsd:string .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Height\n" +
            ":Height rdf:type owl:DatatypeProperty ;\n" +
            "        rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "        rdfs:domain :Athletes ;\n" +
            "        rdfs:range xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Number_of_participants\n" +
            ":Number_of_participants rdf:type owl:DatatypeProperty ;\n" +
            "                        rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "                        rdfs:domain :Competitions ,\n" +
            "                                    [ rdf:type owl:Restriction ;\n" +
            "                                      owl:onProperty :Number_of_participants ;\n" +
            "                                      owl:someValuesFrom [ rdf:type rdfs:Datatype ;\n" +
            "                                                           owl:onDatatype xsd:integer ;\n" +
            "                                                           owl:withRestrictions ( [ xsd:minInclusive 2\n" +
            "                                                                                  ]\n" +
            "                                                                                  [ xsd:maxInclusive 256\n" +
            "                                                                                  ]\n" +
            "                                                                                )\n" +
            "                                                         ]\n" +
            "                                    ] ;\n" +
            "                        rdfs:range xsd:integer .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Number_of_players\n" +
            ":Number_of_players rdf:type owl:DatatypeProperty ;\n" +
            "                   rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "                   rdfs:domain :Teams ,\n" +
            "                               [ rdf:type owl:Restriction ;\n" +
            "                                 owl:onProperty :Number_of_players ;\n" +
            "                                 owl:someValuesFrom [ rdf:type rdfs:Datatype ;\n" +
            "                                                      owl:onDatatype xsd:integer ;\n" +
            "                                                      owl:withRestrictions ( [ xsd:minInclusive 1\n" +
            "                                                                             ]\n" +
            "                                                                             [ xsd:maxInclusive 100\n" +
            "                                                                             ]\n" +
            "                                                                           )\n" +
            "                                                    ]\n" +
            "                               ] ;\n" +
            "                   rdfs:range xsd:integer .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Prize_money\n" +
            ":Prize_money rdf:type owl:DatatypeProperty ;\n" +
            "             rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "             rdfs:domain :Competitions ,\n" +
            "                         [ rdf:type owl:Restriction ;\n" +
            "                           owl:onProperty :Prize_money ;\n" +
            "                           owl:someValuesFrom [ rdf:type rdfs:Datatype ;\n" +
            "                                                owl:onDatatype xsd:float ;\n" +
            "                                                owl:withRestrictions ( [ xsd:minExclusive \"100000.0\"^^xsd:float\n" +
            "                                                                       ]\n" +
            "                                                                       [ xsd:maxInclusive \"1.0E9\"^^xsd:float\n" +
            "                                                                       ]\n" +
            "                                                                     )\n" +
            "                                              ]\n" +
            "                         ] ;\n" +
            "             rdfs:range xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Team_Name\n" +
            ":Team_Name rdf:type owl:DatatypeProperty ;\n" +
            "           rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "           rdfs:domain :Teams ;\n" +
            "           rdfs:range xsd:string .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Venue_Name\n" +
            ":Venue_Name rdf:type owl:DatatypeProperty ;\n" +
            "            rdfs:subPropertyOf owl:topDataProperty ;\n" +
            "            rdfs:domain :Venues ;\n" +
            "            rdfs:range xsd:string .\n" +
            "\n" +
            "\n" +
            "#################################################################\n" +
            "#    Classes\n" +
            "#################################################################\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Athletes\n" +
            ":Athletes rdf:type owl:Class ;\n" +
            "          owl:equivalentClass [ rdf:type owl:Restriction ;\n" +
            "                                owl:onProperty :belongs_to ;\n" +
            "                                owl:qualifiedCardinality \"1\"^^xsd:nonNegativeInteger ;\n" +
            "                                owl:onClass :Teams\n" +
            "                              ] ;\n" +
            "          rdfs:subClassOf :Sports .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Coach\n" +
            ":Coach rdf:type owl:Class ;\n" +
            "       rdfs:subClassOf :Sports .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Competitions\n" +
            ":Competitions rdf:type owl:Class ;\n" +
            "              owl:equivalentClass [ rdf:type owl:Restriction ;\n" +
            "                                    owl:onProperty :takes_place_at ;\n" +
            "                                    owl:minQualifiedCardinality \"1\"^^xsd:nonNegativeInteger ;\n" +
            "                                    owl:onClass :Venues\n" +
            "                                  ] ;\n" +
            "              rdfs:subClassOf :Sports .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Sports\n" +
            ":Sports rdf:type owl:Class .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Teams\n" +
            ":Teams rdf:type owl:Class ;\n" +
            "       owl:equivalentClass [ rdf:type owl:Restriction ;\n" +
            "                             owl:onProperty :participates_in ;\n" +
            "                             owl:minQualifiedCardinality \"1\"^^xsd:nonNegativeInteger ;\n" +
            "                             owl:onClass :Competitions\n" +
            "                           ] ,\n" +
            "                           [ rdf:type owl:Restriction ;\n" +
            "                             owl:onProperty :coached_by ;\n" +
            "                             owl:qualifiedCardinality \"1\"^^xsd:nonNegativeInteger ;\n" +
            "                             owl:onClass :Coach\n" +
            "                           ] ,\n" +
            "                           [ rdf:type owl:Restriction ;\n" +
            "                             owl:onProperty :has_home_venue ;\n" +
            "                             owl:qualifiedCardinality \"1\"^^xsd:nonNegativeInteger ;\n" +
            "                             owl:onClass :Venues\n" +
            "                           ] ,\n" +
            "                           [ rdf:type owl:Restriction ;\n" +
            "                             owl:onProperty :defeated_by ;\n" +
            "                             owl:maxQualifiedCardinality \"20\"^^xsd:nonNegativeInteger ;\n" +
            "                             owl:onClass :Teams\n" +
            "                           ] ,\n" +
            "                           [ rdf:type owl:Restriction ;\n" +
            "                             owl:onProperty :participates_in ;\n" +
            "                             owl:maxQualifiedCardinality \"7\"^^xsd:nonNegativeInteger ;\n" +
            "                             owl:onClass :Competitions\n" +
            "                           ] ;\n" +
            "       rdfs:subClassOf :Sports .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Venues\n" +
            ":Venues rdf:type owl:Class ;\n" +
            "        rdfs:subClassOf :Sports .\n" +
            "\n" +
            "\n" +
            "#################################################################\n" +
            "#    Individuals\n" +
            "#################################################################\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Anfield\n" +
            ":Anfield rdf:type owl:NamedIndividual ,\n" +
            "                  :Venues ;\n" +
            "         :Address \"Liverpool\" ;\n" +
            "         :Capacity 50000 ;\n" +
            "         :Venue_Name \"Anfield\" .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Arsenal\n" +
            ":Arsenal rdf:type owl:NamedIndividual ,\n" +
            "                  :Teams ;\n" +
            "         :coached_by :CoachArteta ;\n" +
            "         :defeated_by :ManCity ;\n" +
            "         :has_home_venue :Emirates ;\n" +
            "         :participates_in :ChampionsLeague ,\n" +
            "                          :PremierLeague ;\n" +
            "         :Budget \"3.0E8\"^^xsd:float ;\n" +
            "         :Number_of_players 36 ;\n" +
            "         :Team_Name \"Arsenal\" .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Azpilicueta\n" +
            ":Azpilicueta rdf:type owl:NamedIndividual ,\n" +
            "                      :Athletes ;\n" +
            "             :belongs_to :Chelsea ;\n" +
            "             :Athlete_Age 32 ;\n" +
            "             :Athlete_Name \"Azpilicueta\" ;\n" +
            "             :Athlete_Nationality \"Spanish\" ;\n" +
            "             :Athlete_Salary \"1.2E7\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#ChampionsLeague\n" +
            ":ChampionsLeague rdf:type owl:NamedIndividual ,\n" +
            "                          :Competitions ;\n" +
            "                 :takes_place_at :Anfield ;\n" +
            "                 :Competition_Name \"ChampionsLeague\" ;\n" +
            "                 :Governing_body \"UEFA\" ;\n" +
            "                 :Number_of_participants 32 ;\n" +
            "                 :Prize_money \"1.0E9\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Chelsea\n" +
            ":Chelsea rdf:type owl:NamedIndividual ,\n" +
            "                  :Teams ;\n" +
            "         :coached_by :CoachTuchel ;\n" +
            "         :defeated_by :Arsenal ,\n" +
            "                      :Liverpool ,\n" +
            "                      :ManCity ;\n" +
            "         :has_home_venue :StamfordBridge ;\n" +
            "         :participates_in :ChampionsLeague ,\n" +
            "                          :PremierLeague ;\n" +
            "         :Budget \"6.0E8\"^^xsd:float ;\n" +
            "         :Number_of_players 55 ;\n" +
            "         :Team_Name \"Chelsea\" .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#CoachArteta\n" +
            ":CoachArteta rdf:type owl:NamedIndividual ,\n" +
            "                      :Coach ;\n" +
            "             :Coach_Age 45 ;\n" +
            "             :Coach_Name \"CoachArteta\" ;\n" +
            "             :Coach_Nationality \"Spanish\" ;\n" +
            "             :Coach_Salary \"6000000.0\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#CoachGuardiola\n" +
            ":CoachGuardiola rdf:type owl:NamedIndividual ,\n" +
            "                         :Coach ;\n" +
            "                :Coach_Age 55 ;\n" +
            "                :Coach_Name \"CoachGuardiola\" ;\n" +
            "                :Coach_Nationality \"Spanish\" ;\n" +
            "                :Coach_Salary \"1.5E7\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#CoachKlopp\n" +
            ":CoachKlopp rdf:type owl:NamedIndividual ,\n" +
            "                     :Coach ;\n" +
            "            :Coach_Age 53 ;\n" +
            "            :Coach_Name \"CoachKlopp\" ;\n" +
            "            :Coach_Nationality \"German\" ;\n" +
            "            :Coach_Salary \"1.0E7\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#CoachMourinho\n" +
            ":CoachMourinho rdf:type owl:NamedIndividual ,\n" +
            "                        :Coach ;\n" +
            "               :Coach_Age 60 ;\n" +
            "               :Coach_Name \"CoachMourinho\" ;\n" +
            "               :Coach_Nationality \"Portuguese\" ;\n" +
            "               :Coach_Salary \"1.8E7\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#CoachTuchel\n" +
            ":CoachTuchel rdf:type owl:NamedIndividual ,\n" +
            "                      :Coach ;\n" +
            "             :Coach_Age 42 ;\n" +
            "             :Coach_Name \"CoachTuchel\" ;\n" +
            "             :Coach_Nationality \"German\" ;\n" +
            "             :Coach_Salary \"1.6E7\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#DeBruyne\n" +
            ":DeBruyne rdf:type owl:NamedIndividual ,\n" +
            "                   :Athletes ;\n" +
            "          :belongs_to :ManCity ;\n" +
            "          :Athlete_Age 31 ;\n" +
            "          :Athlete_Name \"DeBruyne\" ;\n" +
            "          :Athlete_Nationality \"Belgian\" ;\n" +
            "          :Athlete_Salary \"3.0E7\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Emirates\n" +
            ":Emirates rdf:type owl:NamedIndividual ,\n" +
            "                   :Venues ;\n" +
            "          :Address \"London\" ;\n" +
            "          :Capacity 60000 ;\n" +
            "          :Venue_Name \"Emirates\" .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Etihad\n" +
            ":Etihad rdf:type owl:NamedIndividual ,\n" +
            "                 :Venues ;\n" +
            "        :Address \"Manchester\" ;\n" +
            "        :Capacity 55000 ;\n" +
            "        :Venue_Name \"Etihad\" .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Firmino\n" +
            ":Firmino rdf:type owl:NamedIndividual ,\n" +
            "                  :Athletes ;\n" +
            "         :belongs_to :Liverpool ;\n" +
            "         :Athlete_Age 33 ;\n" +
            "         :Athlete_Name \"Firmino\" ;\n" +
            "         :Athlete_Nationality \"Brazilian\" ;\n" +
            "         :Athlete_Salary \"1.5E7\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Haaland\n" +
            ":Haaland rdf:type owl:NamedIndividual ,\n" +
            "                  :Athletes ;\n" +
            "         :belongs_to :ManCity ;\n" +
            "         :Athlete_Age 21 ;\n" +
            "         :Athlete_Name \"Haaland\" ;\n" +
            "         :Athlete_Nationality \"Norwegian\" ;\n" +
            "         :Athlete_Salary \"4.0E7\"^^xsd:float ;\n" +
            "         :Height \"1.94\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Kante\n" +
            ":Kante rdf:type owl:NamedIndividual ,\n" +
            "                :Athletes ;\n" +
            "       :belongs_to :Chelsea ;\n" +
            "       :Athlete_Age 32 ;\n" +
            "       :Athlete_Name \"Kante\" ;\n" +
            "       :Athlete_Nationality \"French\" ;\n" +
            "       :Athlete_Salary \"2.5E7\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Liverpool\n" +
            ":Liverpool rdf:type owl:NamedIndividual ,\n" +
            "                    :Teams ;\n" +
            "           :coached_by :CoachKlopp ;\n" +
            "           :defeated_by :Arsenal ,\n" +
            "                        :ManUtd ;\n" +
            "           :has_home_venue :Anfield ;\n" +
            "           :participates_in :ChampionsLeague ,\n" +
            "                            :PremierLeague ;\n" +
            "           :Budget \"2.5E8\"^^xsd:float ;\n" +
            "           :Number_of_players 30 ;\n" +
            "           :Team_Name \"Liverpool\" .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#ManCity\n" +
            ":ManCity rdf:type owl:NamedIndividual ,\n" +
            "                  :Teams ;\n" +
            "         :coached_by :CoachGuardiola ;\n" +
            "         :defeated_by :Liverpool ;\n" +
            "         :has_home_venue :Etihad ;\n" +
            "         :participates_in :ChampionsLeague ,\n" +
            "                          :PremierLeague ;\n" +
            "         :Budget \"7.0E8\"^^xsd:float ;\n" +
            "         :Number_of_players 40 ;\n" +
            "         :Team_Name \"ManCity\" .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#ManUtd\n" +
            ":ManUtd rdf:type owl:NamedIndividual ,\n" +
            "                 :Teams ;\n" +
            "        :coached_by :CoachMourinho ;\n" +
            "        :defeated_by :Arsenal ,\n" +
            "                     :Liverpool ,\n" +
            "                     :ManCity ;\n" +
            "        :has_home_venue :OldTrafford ;\n" +
            "        :participates_in :PremierLeague ;\n" +
            "        :Budget \"4.6E8\"^^xsd:float ;\n" +
            "        :Number_of_players 46 ;\n" +
            "        :Team_Name \"ManUtd\" .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Odegaard\n" +
            ":Odegaard rdf:type owl:NamedIndividual ,\n" +
            "                   :Athletes ;\n" +
            "          :belongs_to :Arsenal ;\n" +
            "          :Athlete_Age 23 ;\n" +
            "          :Athlete_Name \"Odegaard\" ;\n" +
            "          :Athlete_Nationality \"Norwegian\" ;\n" +
            "          :Athlete_Salary \"1.3E7\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#OldTrafford\n" +
            ":OldTrafford rdf:type owl:NamedIndividual ,\n" +
            "                      :Venues ;\n" +
            "             :Address \"Manchester\" ;\n" +
            "             :Capacity 65000 ;\n" +
            "             :Venue_Name \"OldTrafford\" .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#PremierLeague\n" +
            ":PremierLeague rdf:type owl:NamedIndividual ,\n" +
            "                        :Competitions ;\n" +
            "               :takes_place_at :Anfield ,\n" +
            "                               :Emirates ,\n" +
            "                               :Etihad ,\n" +
            "                               :OldTrafford ,\n" +
            "                               :StamfordBridge ;\n" +
            "               :Competition_Name \"PremierLeague\" ;\n" +
            "               :Governing_body \"UEFA\" ;\n" +
            "               :Number_of_participants 20 ;\n" +
            "               :Prize_money \"9.0E8\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Ramsdale\n" +
            ":Ramsdale rdf:type owl:NamedIndividual ,\n" +
            "                   :Athletes ;\n" +
            "          :belongs_to :Arsenal ;\n" +
            "          :Athlete_Age 24 ;\n" +
            "          :Athlete_Name \"Ramsdale\" ;\n" +
            "          :Athlete_Nationality \"British\" ;\n" +
            "          :Athlete_Salary \"5000000.0\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Ronaldo\n" +
            ":Ronaldo rdf:type owl:NamedIndividual ,\n" +
            "                  :Athletes ;\n" +
            "         :belongs_to :ManUtd ;\n" +
            "         :Athlete_Age 38 ;\n" +
            "         :Athlete_Name \"Ronaldo\" ;\n" +
            "         :Athlete_Nationality \"Portuguese\" ;\n" +
            "         :Athlete_Salary \"1.0E8\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Rooney\n" +
            ":Rooney rdf:type owl:NamedIndividual ,\n" +
            "                 :Athletes ;\n" +
            "        :belongs_to :ManUtd ;\n" +
            "        :Athlete_Age 40 ;\n" +
            "        :Athlete_Name \"Rooney\" ;\n" +
            "        :Athlete_Nationality \"British\" ;\n" +
            "        :Athlete_Salary \"1.7E7\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Salah\n" +
            ":Salah rdf:type owl:NamedIndividual ,\n" +
            "                :Athletes ;\n" +
            "       :belongs_to :Liverpool ;\n" +
            "       :Athlete_Age 31 ;\n" +
            "       :Athlete_Name \"Salah\" ;\n" +
            "       :Athlete_Nationality \"Egyptian\" ;\n" +
            "       :Athlete_Salary \"3.1E7\"^^xsd:float ;\n" +
            "       :Height \"1.75\"^^xsd:float .\n" +
            "\n" +
            "\n" +
            "###  http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#StamfordBridge\n" +
            ":StamfordBridge rdf:type owl:NamedIndividual ,\n" +
            "                         :Venues ;\n" +
            "                :Address \"London\" ;\n" +
            "                :Capacity 45000 ;\n" +
            "                :Venue_Name \"StamfordBridge\" .\n" +
            "\n" +
            "\n" +
            "###  Generated by the OWL API (version 4.5.26.2023-07-17T20:34:13Z) https://github.com/owlcs/owlapi\n";


}
