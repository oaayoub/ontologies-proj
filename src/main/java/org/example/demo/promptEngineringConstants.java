package org.example.demo;

public class promptEngineringConstants {
    String breaker = "                           ````````````````                      ";
    String queryHeader = "write sparql query and define the prefixes needed accordingly and return only the sparql query without any extra characters and make sure it's valid and will return answer from the defined ontology: ";
    String turtlePt1 = " this is the turtle I'm using :: @prefix:<http://localhost:3030/#/dataset/SportsOntology>.@prefixowl:<http://www.w3.org/2002/07/owl#>.@prefixrdf:<http://www.w3.org/1999/02/22-rdf-syntax-ns#>.@prefixxml:<http://www.w3.org/XML/1998/namespace>.@prefixxsd:<http://www.w3.org/2001/XMLSchema#>.@prefixrdfs:<http://www.w3.org/2000/01/rdf-schema#>.@base<http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology>.<http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology>rdf:typeowl:Ontology.#ObjectProperties#http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#belongs_to:belongs_tordf:typeowl:ObjectProperty;rdfs:subPropertyOfowl:topObjectProperty;rdfs:domain:Athletes;rdfs:range:Teams.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#coached_by:coached_byrdf:typeowl:ObjectProperty;rdfs:subPropertyOfowl:topObjectProperty;rdfs:domain:Teams;rdfs:range:Coach.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#defeated_by:defeated_byrdf:typeowl:ObjectProperty;rdfs:subPropertyOfowl:topObjectProperty;rdfs:domain:Teams;rdfs:range:Teams.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#has_home_venue:has_home_venuerdf:typeowl:ObjectProperty;rdfs:subPropertyOfowl:topObjectProperty;rdfs:domain:Teams;rdfs:range:Venues.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#participates_in:participates_inrdf:typeowl:ObjectProperty;rdfs:subPropertyOfowl:topObjectProperty;rdfs:domain:Teams;rdfs:range:Competitions.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#takes_place_at:takes_place_atrdf:typeowl:ObjectProperty;rdfs:subPropertyOfowl:topObjectProperty;rdfs:domain:Competitions;rdfs:range:Venues." ;
    String turtlePt2 = """
            #Dataproperties#http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Address:Addressrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Venues;rdfs:rangexsd:string.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Athlete_Age:Athlete_Agerdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Athletes,[rdf:typeowl:Restriction;owl:onProperty:Athlete_Age;owl:someValuesFrom[rdf:typerdfs:Datatype;owl:onDatatypexsd:integer;owl:withRestrictions([xsd:minExclusive15][xsd:maxInclusive100])]];rdfs:rangexsd:integer.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Athlete_Name:Athlete_Namerdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Athletes;rdfs:rangexsd:string.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Athlete_Nationality:Athlete_Nationalityrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Athletes;rdfs:rangexsd:string.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Athlete_Salary:Athlete_Salaryrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Athletes,[rdf:typeowl:Restriction;owl:onProperty:Athlete_Salary;owl:someValuesFrom[rdf:typerdfs:Datatype;owl:onDatatypexsd:float;owl:withRestrictions([xsd:minExclusive"10000.0"^^xsd:float][xsd:maxInclusive"5.0E8"^^xsd:float])]];rdfs:rangexsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Budget:Budgetrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Teams,[rdf:typeowl:Restriction;owl:onProperty:Budget;owl:someValuesFrom[rdf:typerdfs:Datatype;owl:onDatatypexsd:float;owl:withRestrictions([xsd:minExclusive"1000000.0"^^xsd:float][xsd:maxInclusive"2.0E9"^^xsd:float])]];rdfs:rangexsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Capacity:Capacityrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Venues,[rdf:typeowl:Restriction;owl:onProperty:Capacity;owl:someValuesFrom[rdf:typerdfs:Datatype;owl:onDatatypexsd:integer;owl:withRestrictions([xsd:minExclusive5000][xsd:maxInclusive150000])]];rdfs:rangexsd:integer.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Coach_Age:Coach_Agerdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Coach,[rdf:typeowl:Restriction;owl:onProperty:Coach_Age;owl:someValuesFrom[rdf:typerdfs:Datatype;owl:onDatatypexsd:integer;owl:withRestrictions([xsd:minExclusive15][xsd:maxInclusive100])]];rdfs:rangexsd:integer.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Coach_Name:Coach_Namerdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Coach;rdfs:rangexsd:string.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Coach_Nationality:Coach_Nationalityrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Coach;rdfs:rangexsd:string.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Coach_Salary:Coach_Salaryrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Coach,[rdf:typeowl:Restriction;owl:onProperty:Coach_Salary;owl:someValuesFrom[rdf:typerdfs:Datatype;owl:onDatatypexsd:float;owl:withRestrictions([xsd:minExclusive"10000.0"^^xsd:float][xsd:maxInclusive"5.0E8"^^xsd:float])]];rdfs:rangexsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Competition_Name:Competition_Namerdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Competitions;rdfs:rangexsd:string.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Governing_body:Governing_bodyrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Competitions,[rdf:typeowl:Class;owl:unionOf([rdf:typeowl:Restriction;owl:onProperty:Governing_body;owl:hasValue"AFC"][rdf:typeowl:Restriction;owl:onProperty:Governing_body;owl:hasValue"CAF"][rdf:typeowl:Restriction;owl:onProperty:Governing_body;owl:hasValue"CONMEBOL"][rdf:typeowl:Restriction;owl:onProperty:Governing_body;owl:hasValue"LIBERTADORES"][rdf:typeowl:Restriction;owl:onProperty:Governing_body;owl:hasValue"UEFA"])];rdfs:rangexsd:string.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Height:Heightrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Athletes;rdfs:rangexsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Number_of_participants:Number_of_participantsrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Competitions,[rdf:typeowl:Restriction;owl:onProperty:Number_of_participants;owl:someValuesFrom[rdf:typerdfs:Datatype;owl:onDatatypexsd:integer;owl:withRestrictions([xsd:minInclusive2][xsd:maxInclusive256])]];rdfs:rangexsd:integer.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Number_of_players:Number_of_playersrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Teams,[rdf:typeowl:Restriction;owl:onProperty:Number_of_players;owl:someValuesFrom[rdf:typerdfs:Datatype;owl:onDatatypexsd:integer;owl:withRestrictions([xsd:minInclusive1][xsd:maxInclusive100])]];rdfs:rangexsd:integer.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Prize_money:Prize_moneyrdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Competitions,[rdf:typeowl:Restriction;owl:onProperty:Prize_money;owl:someValuesFrom[rdf:typerdfs:Datatype;owl:onDatatypexsd:float;owl:withRestrictions([xsd:minExclusive"100000.0"^^xsd:float][xsd:maxInclusive"1.0E9"^^xsd:float])]];rdfs:rangexsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Team_Name:Team_Namerdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Teams;rdfs:rangexsd:string.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Venue_Name:Venue_Namerdf:typeowl:DatatypeProperty;rdfs:subPropertyOfowl:topDataProperty;rdfs:domain:Venues;rdfs:rangexsd:string.
            """;
    String turtlePt3 = "#Classes#http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Athletes:Athletesrdf:typeowl:Class;owl:equivalentClass[rdf:typeowl:Restriction;owl:onProperty:belongs_to;owl:qualifiedCardinality 1 ^^xsd:nonNegativeInteger;owl:onClass:Teams];rdfs:subClassOf:Sports.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Coach:Coachrdf:typeowl:Class;rdfs:subClassOf:Sports.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Competitions:Competitionsrdf:typeowl:Class;owl:equivalentClass[rdf:typeowl:Restriction;owl:onProperty:takes_place_at;owl:minQualifiedCardinality 1 ^^xsd:nonNegativeInteger;owl:onClass:Venues];rdfs:subClassOf:Sports.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Sports:Sportsrdf:typeowl:Class.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Teams:Teamsrdf:typeowl:Class;owl:equivalentClass[rdf:typeowl:Restriction;owl:onProperty:participates_in;owl:minQualifiedCardinality 1 ^^xsd:nonNegativeInteger;owl:onClass:Competitions],[rdf:typeowl:Restriction;owl:onProperty:coached_by;owl:qualifiedCardinality 1 ^^xsd:nonNegativeInteger;owl:onClass:Coach],[rdf:typeowl:Restriction;owl:onProperty:has_home_venue;owl:qualifiedCardinality 1 ^^xsd:nonNegativeInteger;owl:onClass:Venues],[rdf:typeowl:Restriction;owl:onProperty:defeated_by;owl:maxQualifiedCardinality 20 ^^xsd:nonNegativeInteger;owl:onClass:Teams],[rdf:typeowl:Restriction;owl:onProperty:participates_in;owl:maxQualifiedCardinality 7 ^^xsd:nonNegativeInteger;owl:onClass:Competitions];rdfs:subClassOf:Sports.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Venues:Venuesrdf:typeowl:Class;rdfs:subClassOf:Sports.##################################################################Individuals####################################################################http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Anfield:Anfieldrdf:typeowl:NamedIndividual,:Venues;:Address Liverpool ;:Capacity50000;:Venue_Name Anfield .###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Arsenal:Arsenalrdf:typeowl:NamedIndividual,:Teams;:coached_by:CoachArteta;:defeated_by:ManCity;:has_home_venue:Emirates;:participates_in:ChampionsLeague,:PremierLeague;:Budget 3.0E8 ^^xsd:float;:Number_of_players36;:Team_Name Arsenal .###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Azpilicueta:Azpilicuetardf:typeowl:NamedIndividual,:Athletes;:belongs_to:Chelsea;:Athlete_Age32;:Athlete_Name Azpilicueta ;:Athlete_Nationality Spanish ;:Athlete_Salary 1.2E7 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#ChampionsLeague:ChampionsLeaguerdf:typeowl:NamedIndividual,:Competitions;:takes_place_at:Anfield;:Competition_Name ChampionsLeague ;:Governing_body UEFA ;:Number_of_participants32;:Prize_money 1.0E9 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Chelsea:Chelseardf:typeowl:NamedIndividual,:Teams;:coached_by:CoachTuchel;:defeated_by:Arsenal,:Liverpool,:ManCity;:has_home_venue:StamfordBridge;:participates_in:ChampionsLeague,:PremierLeague;:Budget 6.0E8 ^^xsd:float;:Number_of_players55;:Team_Name Chelsea .###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#CoachArteta:CoachArtetardf:typeowl:NamedIndividual,:Coach;:Coach_Age45;:Coach_Name CoachArteta ;:Coach_Nationality Spanish ;:Coach_Salary 6000000.0 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#CoachGuardiola:CoachGuardiolardf:typeowl:NamedIndividual,:Coach;:Coach_Age55;:Coach_Name CoachGuardiola ;:Coach_Nationality Spanish ;:Coach_Salary 1.5E7 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#CoachKlopp:CoachKlopprdf:typeowl:NamedIndividual,:Coach;:Coach_Age53;:Coach_Name CoachKlopp ;:Coach_Nationality German ;:Coach_Salary 1.0E7 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#CoachMourinho:CoachMourinhordf:typeowl:NamedIndividual,:Coach;:Coach_Age60;:Coach_Name CoachMourinho ;:Coach_Nationality Portuguese ;:Coach_Salary 1.8E7 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#CoachTuchel:CoachTuchelrdf:typeowl:NamedIndividual,:Coach;:Coach_Age42;:Coach_Name CoachTuchel ;:Coach_Nationality German ;:Coach_Salary 1.6E7 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#DeBruyne:DeBruynerdf:typeowl:NamedIndividual,:Athletes;:belongs_to:ManCity;:Athlete_Age31;:Athlete_Name DeBruyne ;:Athlete_Nationality Belgian ;:Athlete_Salary 3.0E7 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Emirates:Emiratesrdf:typeowl:NamedIndividual,:Venues;:Address London ;:Capacity60000;:Venue_Name Emirates .###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Etihad:Etihadrdf:typeowl:NamedIndividual,:Venues;:Address Manchester ;:Capacity55000;:Venue_Name Etihad .###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Firmino:Firminordf:typeowl:NamedIndividual,:Athletes;:belongs_to:Liverpool;:Athlete_Age33;:Athlete_Name Firmino ;:Athlete_Nationality Brazilian ;:Athlete_Salary 1.5E7 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Haaland:Haalandrdf:typeowl:NamedIndividual,:Athletes;:belongs_to:ManCity;:Athlete_Age21;:Athlete_Name Haaland ;:Athlete_Nationality Norwegian ;:Athlete_Salary 4.0E7 ^^xsd:float;:Height 1.94 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Kante:Kanterdf:typeowl:NamedIndividual,:Athletes;:belongs_to:Chelsea;:Athlete_Age32;:Athlete_Name Kante ;:Athlete_Nationality French ;:Athlete_Salary 2.5E7 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Liverpool:Liverpoolrdf:typeowl:NamedIndividual,:Teams;:coached_by:CoachKlopp;:defeated_by:Arsenal,:ManUtd;:has_home_venue:Anfield;:participates_in:ChampionsLeague,:PremierLeague;:Budget 2.5E8 ^^xsd:float;:Number_of_players30;:Team_Name Liverpool .###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#ManCity:ManCityrdf:typeowl:NamedIndividual,:Teams;:coached_by:CoachGuardiola;:defeated_by:Liverpool;:has_home_venue:Etihad;:participates_in:ChampionsLeague,:PremierLeague;:Budget 7.0E8 ^^xsd:float;:Number_of_players40;:Team_Name ManCity .###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#ManUtd:ManUtdrdf:typeowl:NamedIndividual,:Teams;:coached_by:CoachMourinho;:defeated_by:Arsenal,:Liverpool,:ManCity;:has_home_venue:OldTrafford;:participates_in:PremierLeague;:Budget 4.6E8 ^^xsd:float;:Number_of_players46;:Team_Name ManUtd .###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Odegaard:Odegaardrdf:typeowl:NamedIndividual,:Athletes;:belongs_to:Arsenal;:Athlete_Age23;:Athlete_Name Odegaard ;:Athlete_Nationality Norwegian ;:Athlete_Salary 1.3E7 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#OldTrafford:OldTraffordrdf:typeowl:NamedIndividual,:Venues;:Address Manchester ;:Capacity65000;:Venue_Name OldTrafford .###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#PremierLeague:PremierLeaguerdf:typeowl:NamedIndividual,:Competitions;:takes_place_at:Anfield,:Emirates,:Etihad,:OldTrafford,:StamfordBridge;:Competition_Name PremierLeague ;:Governing_body UEFA ;:Number_of_participants20;:Prize_money 9.0E8 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Ramsdale:Ramsdalerdf:typeowl:NamedIndividual,:Athletes;:belongs_to:Arsenal;:Athlete_Age24;:Athlete_Name Ramsdale ;:Athlete_Nationality British ;:Athlete_Salary 5000000.0 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Ronaldo:Ronaldordf:typeowl:NamedIndividual,:Athletes;:belongs_to:ManUtd;:Athlete_Age38;:Athlete_Name Ronaldo ;:Athlete_Nationality Portuguese ;:Athlete_Salary 1.0E8 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Rooney:Rooneyrdf:typeowl:NamedIndividual,:Athletes;:belongs_to:ManUtd;:Athlete_Age40;:Athlete_Name Rooney ;:Athlete_Nationality British ;:Athlete_Salary 1.7E7 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#Salah:Salahrdf:typeowl:NamedIndividual,:Athletes;:belongs_to:Liverpool;:Athlete_Age31;:Athlete_Name Salah ;:Athlete_Nationality Egyptian ;:Athlete_Salary 3.1E7 ^^xsd:float;:Height 1.75 ^^xsd:float.###http://www.semanticweb.org/omar/ontologies/5/2024/sportsontology#StamfordBridge:StamfordBridgerdf:typeowl:NamedIndividual,:Venues;:Address London ;:Capacity45000;:Venue_Name StamfordBridge .###GeneratedbytheOWLAPI(version4.5.26.2023-07-17T20:34:13Z)https://github.com/owlcs/owlapi";
    String turtleOfOntology = turtlePt1 + " --- " + turtlePt3;
}